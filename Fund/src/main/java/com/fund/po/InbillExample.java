package com.fund.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InbillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InbillExample() {
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

        public Criteria andInbillIdIsNull() {
            addCriterion("InBill_Id is null");
            return (Criteria) this;
        }

        public Criteria andInbillIdIsNotNull() {
            addCriterion("InBill_Id is not null");
            return (Criteria) this;
        }

        public Criteria andInbillIdEqualTo(Integer value) {
            addCriterion("InBill_Id =", value, "inbillId");
            return (Criteria) this;
        }

        public Criteria andInbillIdNotEqualTo(Integer value) {
            addCriterion("InBill_Id <>", value, "inbillId");
            return (Criteria) this;
        }

        public Criteria andInbillIdGreaterThan(Integer value) {
            addCriterion("InBill_Id >", value, "inbillId");
            return (Criteria) this;
        }

        public Criteria andInbillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("InBill_Id >=", value, "inbillId");
            return (Criteria) this;
        }

        public Criteria andInbillIdLessThan(Integer value) {
            addCriterion("InBill_Id <", value, "inbillId");
            return (Criteria) this;
        }

        public Criteria andInbillIdLessThanOrEqualTo(Integer value) {
            addCriterion("InBill_Id <=", value, "inbillId");
            return (Criteria) this;
        }

        public Criteria andInbillIdIn(List<Integer> values) {
            addCriterion("InBill_Id in", values, "inbillId");
            return (Criteria) this;
        }

        public Criteria andInbillIdNotIn(List<Integer> values) {
            addCriterion("InBill_Id not in", values, "inbillId");
            return (Criteria) this;
        }

        public Criteria andInbillIdBetween(Integer value1, Integer value2) {
            addCriterion("InBill_Id between", value1, value2, "inbillId");
            return (Criteria) this;
        }

        public Criteria andInbillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("InBill_Id not between", value1, value2, "inbillId");
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

        public Criteria andMoneyNumIsNull() {
            addCriterion("Money_Num is null");
            return (Criteria) this;
        }

        public Criteria andMoneyNumIsNotNull() {
            addCriterion("Money_Num is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyNumEqualTo(String value) {
            addCriterion("Money_Num =", value, "moneyNum");
            return (Criteria) this;
        }

        public Criteria andMoneyNumNotEqualTo(String value) {
            addCriterion("Money_Num <>", value, "moneyNum");
            return (Criteria) this;
        }

        public Criteria andMoneyNumGreaterThan(String value) {
            addCriterion("Money_Num >", value, "moneyNum");
            return (Criteria) this;
        }

        public Criteria andMoneyNumGreaterThanOrEqualTo(String value) {
            addCriterion("Money_Num >=", value, "moneyNum");
            return (Criteria) this;
        }

        public Criteria andMoneyNumLessThan(String value) {
            addCriterion("Money_Num <", value, "moneyNum");
            return (Criteria) this;
        }

        public Criteria andMoneyNumLessThanOrEqualTo(String value) {
            addCriterion("Money_Num <=", value, "moneyNum");
            return (Criteria) this;
        }

        public Criteria andMoneyNumLike(String value) {
            addCriterion("Money_Num like", value, "moneyNum");
            return (Criteria) this;
        }

        public Criteria andMoneyNumNotLike(String value) {
            addCriterion("Money_Num not like", value, "moneyNum");
            return (Criteria) this;
        }

        public Criteria andMoneyNumIn(List<String> values) {
            addCriterion("Money_Num in", values, "moneyNum");
            return (Criteria) this;
        }

        public Criteria andMoneyNumNotIn(List<String> values) {
            addCriterion("Money_Num not in", values, "moneyNum");
            return (Criteria) this;
        }

        public Criteria andMoneyNumBetween(String value1, String value2) {
            addCriterion("Money_Num between", value1, value2, "moneyNum");
            return (Criteria) this;
        }

        public Criteria andMoneyNumNotBetween(String value1, String value2) {
            addCriterion("Money_Num not between", value1, value2, "moneyNum");
            return (Criteria) this;
        }

        public Criteria andPayerIsNull() {
            addCriterion("Payer is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("Payer is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("Payer =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("Payer <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("Payer >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("Payer >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("Payer <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("Payer <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("Payer like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("Payer not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("Payer in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("Payer not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("Payer between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("Payer not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andMoneyInIsNull() {
            addCriterion("Money_In is null");
            return (Criteria) this;
        }

        public Criteria andMoneyInIsNotNull() {
            addCriterion("Money_In is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyInEqualTo(Double value) {
            addCriterion("Money_In =", value, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInNotEqualTo(Double value) {
            addCriterion("Money_In <>", value, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInGreaterThan(Double value) {
            addCriterion("Money_In >", value, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInGreaterThanOrEqualTo(Double value) {
            addCriterion("Money_In >=", value, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInLessThan(Double value) {
            addCriterion("Money_In <", value, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInLessThanOrEqualTo(Double value) {
            addCriterion("Money_In <=", value, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInIn(List<Double> values) {
            addCriterion("Money_In in", values, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInNotIn(List<Double> values) {
            addCriterion("Money_In not in", values, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInBetween(Double value1, Double value2) {
            addCriterion("Money_In between", value1, value2, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInNotBetween(Double value1, Double value2) {
            addCriterion("Money_In not between", value1, value2, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andTimeInIsNull() {
            addCriterion("Time_In is null");
            return (Criteria) this;
        }

        public Criteria andTimeInIsNotNull() {
            addCriterion("Time_In is not null");
            return (Criteria) this;
        }

        public Criteria andTimeInEqualTo(Date value) {
            addCriterion("Time_In =", value, "timeIn");
            return (Criteria) this;
        }

        public Criteria andTimeInNotEqualTo(Date value) {
            addCriterion("Time_In <>", value, "timeIn");
            return (Criteria) this;
        }

        public Criteria andTimeInGreaterThan(Date value) {
            addCriterion("Time_In >", value, "timeIn");
            return (Criteria) this;
        }

        public Criteria andTimeInGreaterThanOrEqualTo(Date value) {
            addCriterion("Time_In >=", value, "timeIn");
            return (Criteria) this;
        }

        public Criteria andTimeInLessThan(Date value) {
            addCriterion("Time_In <", value, "timeIn");
            return (Criteria) this;
        }

        public Criteria andTimeInLessThanOrEqualTo(Date value) {
            addCriterion("Time_In <=", value, "timeIn");
            return (Criteria) this;
        }

        public Criteria andTimeInIn(List<Date> values) {
            addCriterion("Time_In in", values, "timeIn");
            return (Criteria) this;
        }

        public Criteria andTimeInNotIn(List<Date> values) {
            addCriterion("Time_In not in", values, "timeIn");
            return (Criteria) this;
        }

        public Criteria andTimeInBetween(Date value1, Date value2) {
            addCriterion("Time_In between", value1, value2, "timeIn");
            return (Criteria) this;
        }

        public Criteria andTimeInNotBetween(Date value1, Date value2) {
            addCriterion("Time_In not between", value1, value2, "timeIn");
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