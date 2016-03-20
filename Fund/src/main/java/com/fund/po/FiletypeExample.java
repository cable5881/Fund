package com.fund.po;

import java.util.ArrayList;
import java.util.List;

public class FiletypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FiletypeExample() {
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

        public Criteria andFiletypeIdIsNull() {
            addCriterion("FileType_Id is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeIdIsNotNull() {
            addCriterion("FileType_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeIdEqualTo(Integer value) {
            addCriterion("FileType_Id =", value, "filetypeId");
            return (Criteria) this;
        }

        public Criteria andFiletypeIdNotEqualTo(Integer value) {
            addCriterion("FileType_Id <>", value, "filetypeId");
            return (Criteria) this;
        }

        public Criteria andFiletypeIdGreaterThan(Integer value) {
            addCriterion("FileType_Id >", value, "filetypeId");
            return (Criteria) this;
        }

        public Criteria andFiletypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FileType_Id >=", value, "filetypeId");
            return (Criteria) this;
        }

        public Criteria andFiletypeIdLessThan(Integer value) {
            addCriterion("FileType_Id <", value, "filetypeId");
            return (Criteria) this;
        }

        public Criteria andFiletypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("FileType_Id <=", value, "filetypeId");
            return (Criteria) this;
        }

        public Criteria andFiletypeIdIn(List<Integer> values) {
            addCriterion("FileType_Id in", values, "filetypeId");
            return (Criteria) this;
        }

        public Criteria andFiletypeIdNotIn(List<Integer> values) {
            addCriterion("FileType_Id not in", values, "filetypeId");
            return (Criteria) this;
        }

        public Criteria andFiletypeIdBetween(Integer value1, Integer value2) {
            addCriterion("FileType_Id between", value1, value2, "filetypeId");
            return (Criteria) this;
        }

        public Criteria andFiletypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FileType_Id not between", value1, value2, "filetypeId");
            return (Criteria) this;
        }

        public Criteria andFiletypeNameIsNull() {
            addCriterion("FileType_Name is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeNameIsNotNull() {
            addCriterion("FileType_Name is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeNameEqualTo(String value) {
            addCriterion("FileType_Name =", value, "filetypeName");
            return (Criteria) this;
        }

        public Criteria andFiletypeNameNotEqualTo(String value) {
            addCriterion("FileType_Name <>", value, "filetypeName");
            return (Criteria) this;
        }

        public Criteria andFiletypeNameGreaterThan(String value) {
            addCriterion("FileType_Name >", value, "filetypeName");
            return (Criteria) this;
        }

        public Criteria andFiletypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("FileType_Name >=", value, "filetypeName");
            return (Criteria) this;
        }

        public Criteria andFiletypeNameLessThan(String value) {
            addCriterion("FileType_Name <", value, "filetypeName");
            return (Criteria) this;
        }

        public Criteria andFiletypeNameLessThanOrEqualTo(String value) {
            addCriterion("FileType_Name <=", value, "filetypeName");
            return (Criteria) this;
        }

        public Criteria andFiletypeNameLike(String value) {
            addCriterion("FileType_Name like", value, "filetypeName");
            return (Criteria) this;
        }

        public Criteria andFiletypeNameNotLike(String value) {
            addCriterion("FileType_Name not like", value, "filetypeName");
            return (Criteria) this;
        }

        public Criteria andFiletypeNameIn(List<String> values) {
            addCriterion("FileType_Name in", values, "filetypeName");
            return (Criteria) this;
        }

        public Criteria andFiletypeNameNotIn(List<String> values) {
            addCriterion("FileType_Name not in", values, "filetypeName");
            return (Criteria) this;
        }

        public Criteria andFiletypeNameBetween(String value1, String value2) {
            addCriterion("FileType_Name between", value1, value2, "filetypeName");
            return (Criteria) this;
        }

        public Criteria andFiletypeNameNotBetween(String value1, String value2) {
            addCriterion("FileType_Name not between", value1, value2, "filetypeName");
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