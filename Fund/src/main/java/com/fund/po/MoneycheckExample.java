package com.fund.po;

import java.util.ArrayList;
import java.util.List;

public class MoneycheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoneycheckExample() {
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

        public Criteria andMoneyInCountIsNull() {
            addCriterion("Money_In_Count is null");
            return (Criteria) this;
        }

        public Criteria andMoneyInCountIsNotNull() {
            addCriterion("Money_In_Count is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyInCountEqualTo(Double value) {
            addCriterion("Money_In_Count =", value, "moneyInCount");
            return (Criteria) this;
        }

        public Criteria andMoneyInCountNotEqualTo(Double value) {
            addCriterion("Money_In_Count <>", value, "moneyInCount");
            return (Criteria) this;
        }

        public Criteria andMoneyInCountGreaterThan(Double value) {
            addCriterion("Money_In_Count >", value, "moneyInCount");
            return (Criteria) this;
        }

        public Criteria andMoneyInCountGreaterThanOrEqualTo(Double value) {
            addCriterion("Money_In_Count >=", value, "moneyInCount");
            return (Criteria) this;
        }

        public Criteria andMoneyInCountLessThan(Double value) {
            addCriterion("Money_In_Count <", value, "moneyInCount");
            return (Criteria) this;
        }

        public Criteria andMoneyInCountLessThanOrEqualTo(Double value) {
            addCriterion("Money_In_Count <=", value, "moneyInCount");
            return (Criteria) this;
        }

        public Criteria andMoneyInCountIn(List<Double> values) {
            addCriterion("Money_In_Count in", values, "moneyInCount");
            return (Criteria) this;
        }

        public Criteria andMoneyInCountNotIn(List<Double> values) {
            addCriterion("Money_In_Count not in", values, "moneyInCount");
            return (Criteria) this;
        }

        public Criteria andMoneyInCountBetween(Double value1, Double value2) {
            addCriterion("Money_In_Count between", value1, value2, "moneyInCount");
            return (Criteria) this;
        }

        public Criteria andMoneyInCountNotBetween(Double value1, Double value2) {
            addCriterion("Money_In_Count not between", value1, value2, "moneyInCount");
            return (Criteria) this;
        }

        public Criteria andMoneyOutCountIsNull() {
            addCriterion("Money_Out_Count is null");
            return (Criteria) this;
        }

        public Criteria andMoneyOutCountIsNotNull() {
            addCriterion("Money_Out_Count is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyOutCountEqualTo(Double value) {
            addCriterion("Money_Out_Count =", value, "moneyOutCount");
            return (Criteria) this;
        }

        public Criteria andMoneyOutCountNotEqualTo(Double value) {
            addCriterion("Money_Out_Count <>", value, "moneyOutCount");
            return (Criteria) this;
        }

        public Criteria andMoneyOutCountGreaterThan(Double value) {
            addCriterion("Money_Out_Count >", value, "moneyOutCount");
            return (Criteria) this;
        }

        public Criteria andMoneyOutCountGreaterThanOrEqualTo(Double value) {
            addCriterion("Money_Out_Count >=", value, "moneyOutCount");
            return (Criteria) this;
        }

        public Criteria andMoneyOutCountLessThan(Double value) {
            addCriterion("Money_Out_Count <", value, "moneyOutCount");
            return (Criteria) this;
        }

        public Criteria andMoneyOutCountLessThanOrEqualTo(Double value) {
            addCriterion("Money_Out_Count <=", value, "moneyOutCount");
            return (Criteria) this;
        }

        public Criteria andMoneyOutCountIn(List<Double> values) {
            addCriterion("Money_Out_Count in", values, "moneyOutCount");
            return (Criteria) this;
        }

        public Criteria andMoneyOutCountNotIn(List<Double> values) {
            addCriterion("Money_Out_Count not in", values, "moneyOutCount");
            return (Criteria) this;
        }

        public Criteria andMoneyOutCountBetween(Double value1, Double value2) {
            addCriterion("Money_Out_Count between", value1, value2, "moneyOutCount");
            return (Criteria) this;
        }

        public Criteria andMoneyOutCountNotBetween(Double value1, Double value2) {
            addCriterion("Money_Out_Count not between", value1, value2, "moneyOutCount");
            return (Criteria) this;
        }

        public Criteria andMoneystateIsNull() {
            addCriterion("MoneyState is null");
            return (Criteria) this;
        }

        public Criteria andMoneystateIsNotNull() {
            addCriterion("MoneyState is not null");
            return (Criteria) this;
        }

        public Criteria andMoneystateEqualTo(Byte value) {
            addCriterion("MoneyState =", value, "moneystate");
            return (Criteria) this;
        }

        public Criteria andMoneystateNotEqualTo(Byte value) {
            addCriterion("MoneyState <>", value, "moneystate");
            return (Criteria) this;
        }

        public Criteria andMoneystateGreaterThan(Byte value) {
            addCriterion("MoneyState >", value, "moneystate");
            return (Criteria) this;
        }

        public Criteria andMoneystateGreaterThanOrEqualTo(Byte value) {
            addCriterion("MoneyState >=", value, "moneystate");
            return (Criteria) this;
        }

        public Criteria andMoneystateLessThan(Byte value) {
            addCriterion("MoneyState <", value, "moneystate");
            return (Criteria) this;
        }

        public Criteria andMoneystateLessThanOrEqualTo(Byte value) {
            addCriterion("MoneyState <=", value, "moneystate");
            return (Criteria) this;
        }

        public Criteria andMoneystateIn(List<Byte> values) {
            addCriterion("MoneyState in", values, "moneystate");
            return (Criteria) this;
        }

        public Criteria andMoneystateNotIn(List<Byte> values) {
            addCriterion("MoneyState not in", values, "moneystate");
            return (Criteria) this;
        }

        public Criteria andMoneystateBetween(Byte value1, Byte value2) {
            addCriterion("MoneyState between", value1, value2, "moneystate");
            return (Criteria) this;
        }

        public Criteria andMoneystateNotBetween(Byte value1, Byte value2) {
            addCriterion("MoneyState not between", value1, value2, "moneystate");
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