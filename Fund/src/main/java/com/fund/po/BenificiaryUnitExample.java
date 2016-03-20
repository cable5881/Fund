package com.fund.po;

import java.util.ArrayList;
import java.util.List;

public class BenificiaryUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BenificiaryUnitExample() {
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

        public Criteria andBunitIdIsNull() {
            addCriterion("BUnit_Id is null");
            return (Criteria) this;
        }

        public Criteria andBunitIdIsNotNull() {
            addCriterion("BUnit_Id is not null");
            return (Criteria) this;
        }

        public Criteria andBunitIdEqualTo(Integer value) {
            addCriterion("BUnit_Id =", value, "bunitId");
            return (Criteria) this;
        }

        public Criteria andBunitIdNotEqualTo(Integer value) {
            addCriterion("BUnit_Id <>", value, "bunitId");
            return (Criteria) this;
        }

        public Criteria andBunitIdGreaterThan(Integer value) {
            addCriterion("BUnit_Id >", value, "bunitId");
            return (Criteria) this;
        }

        public Criteria andBunitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUnit_Id >=", value, "bunitId");
            return (Criteria) this;
        }

        public Criteria andBunitIdLessThan(Integer value) {
            addCriterion("BUnit_Id <", value, "bunitId");
            return (Criteria) this;
        }

        public Criteria andBunitIdLessThanOrEqualTo(Integer value) {
            addCriterion("BUnit_Id <=", value, "bunitId");
            return (Criteria) this;
        }

        public Criteria andBunitIdIn(List<Integer> values) {
            addCriterion("BUnit_Id in", values, "bunitId");
            return (Criteria) this;
        }

        public Criteria andBunitIdNotIn(List<Integer> values) {
            addCriterion("BUnit_Id not in", values, "bunitId");
            return (Criteria) this;
        }

        public Criteria andBunitIdBetween(Integer value1, Integer value2) {
            addCriterion("BUnit_Id between", value1, value2, "bunitId");
            return (Criteria) this;
        }

        public Criteria andBunitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BUnit_Id not between", value1, value2, "bunitId");
            return (Criteria) this;
        }

        public Criteria andBunitNameIsNull() {
            addCriterion("BUnit_Name is null");
            return (Criteria) this;
        }

        public Criteria andBunitNameIsNotNull() {
            addCriterion("BUnit_Name is not null");
            return (Criteria) this;
        }

        public Criteria andBunitNameEqualTo(String value) {
            addCriterion("BUnit_Name =", value, "bunitName");
            return (Criteria) this;
        }

        public Criteria andBunitNameNotEqualTo(String value) {
            addCriterion("BUnit_Name <>", value, "bunitName");
            return (Criteria) this;
        }

        public Criteria andBunitNameGreaterThan(String value) {
            addCriterion("BUnit_Name >", value, "bunitName");
            return (Criteria) this;
        }

        public Criteria andBunitNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUnit_Name >=", value, "bunitName");
            return (Criteria) this;
        }

        public Criteria andBunitNameLessThan(String value) {
            addCriterion("BUnit_Name <", value, "bunitName");
            return (Criteria) this;
        }

        public Criteria andBunitNameLessThanOrEqualTo(String value) {
            addCriterion("BUnit_Name <=", value, "bunitName");
            return (Criteria) this;
        }

        public Criteria andBunitNameLike(String value) {
            addCriterion("BUnit_Name like", value, "bunitName");
            return (Criteria) this;
        }

        public Criteria andBunitNameNotLike(String value) {
            addCriterion("BUnit_Name not like", value, "bunitName");
            return (Criteria) this;
        }

        public Criteria andBunitNameIn(List<String> values) {
            addCriterion("BUnit_Name in", values, "bunitName");
            return (Criteria) this;
        }

        public Criteria andBunitNameNotIn(List<String> values) {
            addCriterion("BUnit_Name not in", values, "bunitName");
            return (Criteria) this;
        }

        public Criteria andBunitNameBetween(String value1, String value2) {
            addCriterion("BUnit_Name between", value1, value2, "bunitName");
            return (Criteria) this;
        }

        public Criteria andBunitNameNotBetween(String value1, String value2) {
            addCriterion("BUnit_Name not between", value1, value2, "bunitName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("State not between", value1, value2, "state");
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