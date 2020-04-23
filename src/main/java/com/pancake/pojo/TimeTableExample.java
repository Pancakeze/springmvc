package com.pancake.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TimeTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimeTableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFirstIsNull() {
            addCriterion("first is null");
            return (Criteria) this;
        }

        public Criteria andFirstIsNotNull() {
            addCriterion("first is not null");
            return (Criteria) this;
        }

        public Criteria andFirstEqualTo(Date value) {
            addCriterion("first =", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotEqualTo(Date value) {
            addCriterion("first <>", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstGreaterThan(Date value) {
            addCriterion("first >", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstGreaterThanOrEqualTo(Date value) {
            addCriterion("first >=", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstLessThan(Date value) {
            addCriterion("first <", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstLessThanOrEqualTo(Date value) {
            addCriterion("first <=", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstIn(List<Date> values) {
            addCriterion("first in", values, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotIn(List<Date> values) {
            addCriterion("first not in", values, "first");
            return (Criteria) this;
        }

        public Criteria andFirstBetween(Date value1, Date value2) {
            addCriterion("first between", value1, value2, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotBetween(Date value1, Date value2) {
            addCriterion("first not between", value1, value2, "first");
            return (Criteria) this;
        }

        public Criteria andSecondIsNull() {
            addCriterion("second is null");
            return (Criteria) this;
        }

        public Criteria andSecondIsNotNull() {
            addCriterion("second is not null");
            return (Criteria) this;
        }

        public Criteria andSecondEqualTo(Date value) {
            addCriterionForJDBCDate("second =", value, "second");
            return (Criteria) this;
        }

        public Criteria andSecondNotEqualTo(Date value) {
            addCriterionForJDBCDate("second <>", value, "second");
            return (Criteria) this;
        }

        public Criteria andSecondGreaterThan(Date value) {
            addCriterionForJDBCDate("second >", value, "second");
            return (Criteria) this;
        }

        public Criteria andSecondGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("second >=", value, "second");
            return (Criteria) this;
        }

        public Criteria andSecondLessThan(Date value) {
            addCriterionForJDBCDate("second <", value, "second");
            return (Criteria) this;
        }

        public Criteria andSecondLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("second <=", value, "second");
            return (Criteria) this;
        }

        public Criteria andSecondIn(List<Date> values) {
            addCriterionForJDBCDate("second in", values, "second");
            return (Criteria) this;
        }

        public Criteria andSecondNotIn(List<Date> values) {
            addCriterionForJDBCDate("second not in", values, "second");
            return (Criteria) this;
        }

        public Criteria andSecondBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("second between", value1, value2, "second");
            return (Criteria) this;
        }

        public Criteria andSecondNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("second not between", value1, value2, "second");
            return (Criteria) this;
        }

        public Criteria andThirdIsNull() {
            addCriterion("third is null");
            return (Criteria) this;
        }

        public Criteria andThirdIsNotNull() {
            addCriterion("third is not null");
            return (Criteria) this;
        }

        public Criteria andThirdEqualTo(Date value) {
            addCriterion("third =", value, "third");
            return (Criteria) this;
        }

        public Criteria andThirdNotEqualTo(Date value) {
            addCriterion("third <>", value, "third");
            return (Criteria) this;
        }

        public Criteria andThirdGreaterThan(Date value) {
            addCriterion("third >", value, "third");
            return (Criteria) this;
        }

        public Criteria andThirdGreaterThanOrEqualTo(Date value) {
            addCriterion("third >=", value, "third");
            return (Criteria) this;
        }

        public Criteria andThirdLessThan(Date value) {
            addCriterion("third <", value, "third");
            return (Criteria) this;
        }

        public Criteria andThirdLessThanOrEqualTo(Date value) {
            addCriterion("third <=", value, "third");
            return (Criteria) this;
        }

        public Criteria andThirdIn(List<Date> values) {
            addCriterion("third in", values, "third");
            return (Criteria) this;
        }

        public Criteria andThirdNotIn(List<Date> values) {
            addCriterion("third not in", values, "third");
            return (Criteria) this;
        }

        public Criteria andThirdBetween(Date value1, Date value2) {
            addCriterion("third between", value1, value2, "third");
            return (Criteria) this;
        }

        public Criteria andThirdNotBetween(Date value1, Date value2) {
            addCriterion("third not between", value1, value2, "third");
            return (Criteria) this;
        }

        public Criteria andFourthIsNull() {
            addCriterion("fourth is null");
            return (Criteria) this;
        }

        public Criteria andFourthIsNotNull() {
            addCriterion("fourth is not null");
            return (Criteria) this;
        }

        public Criteria andFourthEqualTo(Date value) {
            addCriterionForJDBCDate("fourth =", value, "fourth");
            return (Criteria) this;
        }

        public Criteria andFourthNotEqualTo(Date value) {
            addCriterionForJDBCDate("fourth <>", value, "fourth");
            return (Criteria) this;
        }

        public Criteria andFourthGreaterThan(Date value) {
            addCriterionForJDBCDate("fourth >", value, "fourth");
            return (Criteria) this;
        }

        public Criteria andFourthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fourth >=", value, "fourth");
            return (Criteria) this;
        }

        public Criteria andFourthLessThan(Date value) {
            addCriterionForJDBCDate("fourth <", value, "fourth");
            return (Criteria) this;
        }

        public Criteria andFourthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fourth <=", value, "fourth");
            return (Criteria) this;
        }

        public Criteria andFourthIn(List<Date> values) {
            addCriterionForJDBCDate("fourth in", values, "fourth");
            return (Criteria) this;
        }

        public Criteria andFourthNotIn(List<Date> values) {
            addCriterionForJDBCDate("fourth not in", values, "fourth");
            return (Criteria) this;
        }

        public Criteria andFourthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fourth between", value1, value2, "fourth");
            return (Criteria) this;
        }

        public Criteria andFourthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fourth not between", value1, value2, "fourth");
            return (Criteria) this;
        }

        public Criteria andFifthIsNull() {
            addCriterion("fifth is null");
            return (Criteria) this;
        }

        public Criteria andFifthIsNotNull() {
            addCriterion("fifth is not null");
            return (Criteria) this;
        }

        public Criteria andFifthEqualTo(Date value) {
            addCriterionForJDBCTime("fifth =", value, "fifth");
            return (Criteria) this;
        }

        public Criteria andFifthNotEqualTo(Date value) {
            addCriterionForJDBCTime("fifth <>", value, "fifth");
            return (Criteria) this;
        }

        public Criteria andFifthGreaterThan(Date value) {
            addCriterionForJDBCTime("fifth >", value, "fifth");
            return (Criteria) this;
        }

        public Criteria andFifthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("fifth >=", value, "fifth");
            return (Criteria) this;
        }

        public Criteria andFifthLessThan(Date value) {
            addCriterionForJDBCTime("fifth <", value, "fifth");
            return (Criteria) this;
        }

        public Criteria andFifthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("fifth <=", value, "fifth");
            return (Criteria) this;
        }

        public Criteria andFifthIn(List<Date> values) {
            addCriterionForJDBCTime("fifth in", values, "fifth");
            return (Criteria) this;
        }

        public Criteria andFifthNotIn(List<Date> values) {
            addCriterionForJDBCTime("fifth not in", values, "fifth");
            return (Criteria) this;
        }

        public Criteria andFifthBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("fifth between", value1, value2, "fifth");
            return (Criteria) this;
        }

        public Criteria andFifthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("fifth not between", value1, value2, "fifth");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}