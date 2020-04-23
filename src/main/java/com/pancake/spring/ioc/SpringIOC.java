package com.pancake.spring.ioc;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhibingze on 2020/3/24.
 */
public class SpringIOC {

    private Map<String, Object> beanMap = new HashMap<>();

    public SpringIOC(String location) throws Exception{
        loadBeans(location);
    }

    public Object getBean(String name) {
        Object bean = beanMap.get(name);

        if (bean == null) {
            throw new IllegalArgumentException("there is no bean with name " + name);
        }
        return bean;
    }

    private void loadBeans(String location) throws Exception {

        // 加载xml 配置文件
        InputStream inputStream = new FileInputStream(location);

//        org.dom4j.Document doc = new SAXReader().read(location);
//
//        org.dom4j.Element root = doc.getRootElement();
//        List list = root.elements("bean");
//        System.out.println(list.size());
//        for (Object o : list) {
//            org.dom4j.Element node = ( org.dom4j.Element) o;
//            List<Attribute> ll = node.attributes();
//            for (Attribute oo : ll) {
//                System.out.println(oo.getName());
//                System.out.println(oo.getValue());
//
//
//            }
//            System.out.println(node.elements("property").size());
//        }

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(inputStream);
        Element element = doc.getDocumentElement();

        NodeList nodeList = element.getChildNodes();

        // 遍历<bean>标签
        for(int i=0;i<nodeList.getLength();i++) {
            Node node = nodeList.item(i);
            if (node instanceof Element) {
                Element idClass = (Element) node;

                String idValue = idClass.getAttribute("id");
                String classValue = idClass.getAttribute("class");


                // 加载beanCLass
                Class clazz = null;
                try {
                    clazz = Class.forName(classValue);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    return;
                }

                // 创建bean
                Object bean = clazz.newInstance();

                // 遍历 <property>标签
                NodeList propertyNodes = idClass.getElementsByTagName("property");
                for(int j=0;j<propertyNodes.getLength();j++) {
                    Node propertyNode = propertyNodes.item(j);

                    if (propertyNode instanceof Element) {
                        Element nameValue = (Element) propertyNode;

                        String name = nameValue.getAttribute("name");
                        String value = nameValue.getAttribute("value");

                        // 利用反射将bean相关的字段访问权限设置为可访问
                        Field field = bean.getClass().getDeclaredField(name);
                        field.setAccessible(true);

                        if (value != null && value.length() > 0) {
                            field.set(bean, value);
                        }else{
                            String ref = nameValue.getAttribute("ref");
                            if (ref == null || ref.length() == 0) {
                                throw new IllegalArgumentException("ref config error");
                            }
                            field.set(bean, getBean(ref));
                        }

                    }
                }
                // 将bean 注入到 bean容器
                registerBean(idValue,bean);

            }
        }

    }

    private void registerBean(String id, Object bean) {
        beanMap.put(id, bean);
    }
}
