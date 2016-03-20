package com.fund.po;

import java.util.ArrayList;
import java.util.List;

public class FundtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FundtypeExample() {
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

        public Criteria andFundtypeIdIsNull() {
            addCriterion("FundType_Id is null");
            return (Criteria) this;
        }

        public Criteria andFundtypeIdIsNotNull() {
            addCriterion("FundType_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFundtypeIdEqualTo(Integer value) {
            addCriterion("FundType_Id =", value, "fundtypeId");
            return (Criteria) this;
        }

        public Criteria andFundtypeIdNotEqualTo(Integer value) {
            addCriterion("FundType_Id <>", value, "fundtypeId");
            return (Criteria) this;
        }

        public Criteria andFundtypeIdGreaterThan(Integer value) {
            addCriterion("FundType_Id >", value, "fundtypeId");
            return (Criteria) this;
        }

        public Criteria andFundtypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FundType_Id >=", value, "fundtypeId");
            return (Criteria) this;
        }

        public Criteria andFundtypeIdLessThan(Integer value) {
            addCriterion("FundType_Id <", value, "fundtypeId");
            return (Criteria) this;
        }

        public Criteria andFundtypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("FundType_Id <=", value, "fundtypeId");
            return (Criteria) this;
        }

        public Criteria andFundtypeIdIn(List<Integer> values) {
            addCriterion("FundType_Id in", values, "fundtypeId");
            return (Criteria) this;
        }

        public Criteria andFundtypeIdNotIn(List<Integer> values) {
            addCriterion("FundType_Id not in", values, "fundtypeId");
            return (Criteria) this;
        }

        public Criteria andFundtypeIdBetween(Integer value1, Integer value2) {
            addCriterion("FundType_Id between", value1, value2, "fundtypeId");
            return (Criteria) this;
        }

        public Criteria andFundtypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FundType_Id not between", value1, value2, "fundtypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdIsNull() {
            addCriterion("ProjectType_Id is null");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdIsNotNull() {
            addCriterion("ProjectType_Id is not null");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdEqualTo(Integer value) {
            addCriterion("ProjectType_Id =", value, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdNotEqualTo(Integer value) {
            addCriterion("ProjectType_Id <>", value, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdGreaterThan(Integer value) {
            addCriterion("ProjectType_Id >", value, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProjectType_Id >=", value, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdLessThan(Integer value) {
            addCriterion("ProjectType_Id <", value, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("ProjectType_Id <=", value, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdIn(List<Integer> values) {
            addCriterion("ProjectType_Id in", values, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdNotIn(List<Integer> values) {
            addCriterion("ProjectType_Id not in", values, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdBetween(Integer value1, Integer value2) {
            addCriterion("ProjectType_Id between", value1, value2, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ProjectType_Id not between", value1, value2, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andFundNameIsNull() {
            addCriterion("Fund_Name is null");
            return (Criteria) this;
        }

        public Criteria andFundNameIsNotNull() {
            addCriterion("Fund_Name is not null");
            return (Criteria) this;
        }

        public Criteria andFundNameEqualTo(String value) {
            addCriterion("Fund_Name =", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotEqualTo(String value) {
            addCriterion("Fund_Name <>", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameGreaterThan(String value) {
            addCriterion("Fund_Name >", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameGreaterThanOrEqualTo(String value) {
            addCriterion("Fund_Name >=", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLessThan(String value) {
            addCriterion("Fund_Name <", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLessThanOrEqualTo(String value) {
            addCriterion("Fund_Name <=", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLike(String value) {
            addCriterion("Fund_Name like", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotLike(String value) {
            addCriterion("Fund_Name not like", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameIn(List<String> values) {
            addCriterion("Fund_Name in", values, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotIn(List<String> values) {
            addCriterion("Fund_Name not in", values, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameBetween(String value1, String value2) {
            addCriterion("Fund_Name between", value1, value2, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotBetween(String value1, String value2) {
            addCriterion("Fund_Name not between", value1, value2, "fundName");
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