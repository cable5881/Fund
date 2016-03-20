package com.fund.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutbillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutbillExample() {
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

        public Criteria andOutbillIdIsNull() {
            addCriterion("OutBill_Id is null");
            return (Criteria) this;
        }

        public Criteria andOutbillIdIsNotNull() {
            addCriterion("OutBill_Id is not null");
            return (Criteria) this;
        }

        public Criteria andOutbillIdEqualTo(Integer value) {
            addCriterion("OutBill_Id =", value, "outbillId");
            return (Criteria) this;
        }

        public Criteria andOutbillIdNotEqualTo(Integer value) {
            addCriterion("OutBill_Id <>", value, "outbillId");
            return (Criteria) this;
        }

        public Criteria andOutbillIdGreaterThan(Integer value) {
            addCriterion("OutBill_Id >", value, "outbillId");
            return (Criteria) this;
        }

        public Criteria andOutbillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OutBill_Id >=", value, "outbillId");
            return (Criteria) this;
        }

        public Criteria andOutbillIdLessThan(Integer value) {
            addCriterion("OutBill_Id <", value, "outbillId");
            return (Criteria) this;
        }

        public Criteria andOutbillIdLessThanOrEqualTo(Integer value) {
            addCriterion("OutBill_Id <=", value, "outbillId");
            return (Criteria) this;
        }

        public Criteria andOutbillIdIn(List<Integer> values) {
            addCriterion("OutBill_Id in", values, "outbillId");
            return (Criteria) this;
        }

        public Criteria andOutbillIdNotIn(List<Integer> values) {
            addCriterion("OutBill_Id not in", values, "outbillId");
            return (Criteria) this;
        }

        public Criteria andOutbillIdBetween(Integer value1, Integer value2) {
            addCriterion("OutBill_Id between", value1, value2, "outbillId");
            return (Criteria) this;
        }

        public Criteria andOutbillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OutBill_Id not between", value1, value2, "outbillId");
            return (Criteria) this;
        }

        public Criteria andMoneycheckIdIsNull() {
            addCriterion("MoneyCheck_Id is null");
            return (Criteria) this;
        }

        public Criteria andMoneycheckIdIsNotNull() {
            addCriterion("MoneyCheck_Id is not null");
            return (Criteria) this;
        }

        public Criteria andMoneycheckIdEqualTo(Integer value) {
            addCriterion("MoneyCheck_Id =", value, "moneycheckId");
            return (Criteria) this;
        }

        public Criteria andMoneycheckIdNotEqualTo(Integer value) {
            addCriterion("MoneyCheck_Id <>", value, "moneycheckId");
            return (Criteria) this;
        }

        public Criteria andMoneycheckIdGreaterThan(Integer value) {
            addCriterion("MoneyCheck_Id >", value, "moneycheckId");
            return (Criteria) this;
        }

        public Criteria andMoneycheckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MoneyCheck_Id >=", value, "moneycheckId");
            return (Criteria) this;
        }

        public Criteria andMoneycheckIdLessThan(Integer value) {
            addCriterion("MoneyCheck_Id <", value, "moneycheckId");
            return (Criteria) this;
        }

        public Criteria andMoneycheckIdLessThanOrEqualTo(Integer value) {
            addCriterion("MoneyCheck_Id <=", value, "moneycheckId");
            return (Criteria) this;
        }

        public Criteria andMoneycheckIdIn(List<Integer> values) {
            addCriterion("MoneyCheck_Id in", values, "moneycheckId");
            return (Criteria) this;
        }

        public Criteria andMoneycheckIdNotIn(List<Integer> values) {
            addCriterion("MoneyCheck_Id not in", values, "moneycheckId");
            return (Criteria) this;
        }

        public Criteria andMoneycheckIdBetween(Integer value1, Integer value2) {
            addCriterion("MoneyCheck_Id between", value1, value2, "moneycheckId");
            return (Criteria) this;
        }

        public Criteria andMoneycheckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MoneyCheck_Id not between", value1, value2, "moneycheckId");
            return (Criteria) this;
        }

        public Criteria andMoneyOutIsNull() {
            addCriterion("Money_Out is null");
            return (Criteria) this;
        }

        public Criteria andMoneyOutIsNotNull() {
            addCriterion("Money_Out is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyOutEqualTo(Double value) {
            addCriterion("Money_Out =", value, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutNotEqualTo(Double value) {
            addCriterion("Money_Out <>", value, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutGreaterThan(Double value) {
            addCriterion("Money_Out >", value, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutGreaterThanOrEqualTo(Double value) {
            addCriterion("Money_Out >=", value, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutLessThan(Double value) {
            addCriterion("Money_Out <", value, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutLessThanOrEqualTo(Double value) {
            addCriterion("Money_Out <=", value, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutIn(List<Double> values) {
            addCriterion("Money_Out in", values, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutNotIn(List<Double> values) {
            addCriterion("Money_Out not in", values, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutBetween(Double value1, Double value2) {
            addCriterion("Money_Out between", value1, value2, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutNotBetween(Double value1, Double value2) {
            addCriterion("Money_Out not between", value1, value2, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutIsNull() {
            addCriterion("Time_Out is null");
            return (Criteria) this;
        }

        public Criteria andTimeOutIsNotNull() {
            addCriterion("Time_Out is not null");
            return (Criteria) this;
        }

        public Criteria andTimeOutEqualTo(Date value) {
            addCriterion("Time_Out =", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotEqualTo(Date value) {
            addCriterion("Time_Out <>", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutGreaterThan(Date value) {
            addCriterion("Time_Out >", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutGreaterThanOrEqualTo(Date value) {
            addCriterion("Time_Out >=", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutLessThan(Date value) {
            addCriterion("Time_Out <", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutLessThanOrEqualTo(Date value) {
            addCriterion("Time_Out <=", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutIn(List<Date> values) {
            addCriterion("Time_Out in", values, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotIn(List<Date> values) {
            addCriterion("Time_Out not in", values, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutBetween(Date value1, Date value2) {
            addCriterion("Time_Out between", value1, value2, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotBetween(Date value1, Date value2) {
            addCriterion("Time_Out not between", value1, value2, "timeOut");
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