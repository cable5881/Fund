package com.fund.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DonationmodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DonationmodeExample() {
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

        public Criteria andDonationmodeIdIsNull() {
            addCriterion("DonationMode_Id is null");
            return (Criteria) this;
        }

        public Criteria andDonationmodeIdIsNotNull() {
            addCriterion("DonationMode_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDonationmodeIdEqualTo(Integer value) {
            addCriterion("DonationMode_Id =", value, "donationmodeId");
            return (Criteria) this;
        }

        public Criteria andDonationmodeIdNotEqualTo(Integer value) {
            addCriterion("DonationMode_Id <>", value, "donationmodeId");
            return (Criteria) this;
        }

        public Criteria andDonationmodeIdGreaterThan(Integer value) {
            addCriterion("DonationMode_Id >", value, "donationmodeId");
            return (Criteria) this;
        }

        public Criteria andDonationmodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DonationMode_Id >=", value, "donationmodeId");
            return (Criteria) this;
        }

        public Criteria andDonationmodeIdLessThan(Integer value) {
            addCriterion("DonationMode_Id <", value, "donationmodeId");
            return (Criteria) this;
        }

        public Criteria andDonationmodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("DonationMode_Id <=", value, "donationmodeId");
            return (Criteria) this;
        }

        public Criteria andDonationmodeIdIn(List<Integer> values) {
            addCriterion("DonationMode_Id in", values, "donationmodeId");
            return (Criteria) this;
        }

        public Criteria andDonationmodeIdNotIn(List<Integer> values) {
            addCriterion("DonationMode_Id not in", values, "donationmodeId");
            return (Criteria) this;
        }

        public Criteria andDonationmodeIdBetween(Integer value1, Integer value2) {
            addCriterion("DonationMode_Id between", value1, value2, "donationmodeId");
            return (Criteria) this;
        }

        public Criteria andDonationmodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DonationMode_Id not between", value1, value2, "donationmodeId");
            return (Criteria) this;
        }

        public Criteria andRealEstateIsNull() {
            addCriterion("Real_Estate is null");
            return (Criteria) this;
        }

        public Criteria andRealEstateIsNotNull() {
            addCriterion("Real_Estate is not null");
            return (Criteria) this;
        }

        public Criteria andRealEstateEqualTo(Byte value) {
            addCriterion("Real_Estate =", value, "realEstate");
            return (Criteria) this;
        }

        public Criteria andRealEstateNotEqualTo(Byte value) {
            addCriterion("Real_Estate <>", value, "realEstate");
            return (Criteria) this;
        }

        public Criteria andRealEstateGreaterThan(Byte value) {
            addCriterion("Real_Estate >", value, "realEstate");
            return (Criteria) this;
        }

        public Criteria andRealEstateGreaterThanOrEqualTo(Byte value) {
            addCriterion("Real_Estate >=", value, "realEstate");
            return (Criteria) this;
        }

        public Criteria andRealEstateLessThan(Byte value) {
            addCriterion("Real_Estate <", value, "realEstate");
            return (Criteria) this;
        }

        public Criteria andRealEstateLessThanOrEqualTo(Byte value) {
            addCriterion("Real_Estate <=", value, "realEstate");
            return (Criteria) this;
        }

        public Criteria andRealEstateIn(List<Byte> values) {
            addCriterion("Real_Estate in", values, "realEstate");
            return (Criteria) this;
        }

        public Criteria andRealEstateNotIn(List<Byte> values) {
            addCriterion("Real_Estate not in", values, "realEstate");
            return (Criteria) this;
        }

        public Criteria andRealEstateBetween(Byte value1, Byte value2) {
            addCriterion("Real_Estate between", value1, value2, "realEstate");
            return (Criteria) this;
        }

        public Criteria andRealEstateNotBetween(Byte value1, Byte value2) {
            addCriterion("Real_Estate not between", value1, value2, "realEstate");
            return (Criteria) this;
        }

        public Criteria andIsOnetimeIsNull() {
            addCriterion("Is_OneTime is null");
            return (Criteria) this;
        }

        public Criteria andIsOnetimeIsNotNull() {
            addCriterion("Is_OneTime is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnetimeEqualTo(Byte value) {
            addCriterion("Is_OneTime =", value, "isOnetime");
            return (Criteria) this;
        }

        public Criteria andIsOnetimeNotEqualTo(Byte value) {
            addCriterion("Is_OneTime <>", value, "isOnetime");
            return (Criteria) this;
        }

        public Criteria andIsOnetimeGreaterThan(Byte value) {
            addCriterion("Is_OneTime >", value, "isOnetime");
            return (Criteria) this;
        }

        public Criteria andIsOnetimeGreaterThanOrEqualTo(Byte value) {
            addCriterion("Is_OneTime >=", value, "isOnetime");
            return (Criteria) this;
        }

        public Criteria andIsOnetimeLessThan(Byte value) {
            addCriterion("Is_OneTime <", value, "isOnetime");
            return (Criteria) this;
        }

        public Criteria andIsOnetimeLessThanOrEqualTo(Byte value) {
            addCriterion("Is_OneTime <=", value, "isOnetime");
            return (Criteria) this;
        }

        public Criteria andIsOnetimeIn(List<Byte> values) {
            addCriterion("Is_OneTime in", values, "isOnetime");
            return (Criteria) this;
        }

        public Criteria andIsOnetimeNotIn(List<Byte> values) {
            addCriterion("Is_OneTime not in", values, "isOnetime");
            return (Criteria) this;
        }

        public Criteria andIsOnetimeBetween(Byte value1, Byte value2) {
            addCriterion("Is_OneTime between", value1, value2, "isOnetime");
            return (Criteria) this;
        }

        public Criteria andIsOnetimeNotBetween(Byte value1, Byte value2) {
            addCriterion("Is_OneTime not between", value1, value2, "isOnetime");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("Amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("Amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("Amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("Amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("Amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("Amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("Amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("Amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("Amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("Amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("Amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("Amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIdIsNull() {
            addCriterion("CurrencyType_Id is null");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIdIsNotNull() {
            addCriterion("CurrencyType_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIdEqualTo(Integer value) {
            addCriterion("CurrencyType_Id =", value, "currencytypeId");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIdNotEqualTo(Integer value) {
            addCriterion("CurrencyType_Id <>", value, "currencytypeId");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIdGreaterThan(Integer value) {
            addCriterion("CurrencyType_Id >", value, "currencytypeId");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CurrencyType_Id >=", value, "currencytypeId");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIdLessThan(Integer value) {
            addCriterion("CurrencyType_Id <", value, "currencytypeId");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("CurrencyType_Id <=", value, "currencytypeId");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIdIn(List<Integer> values) {
            addCriterion("CurrencyType_Id in", values, "currencytypeId");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIdNotIn(List<Integer> values) {
            addCriterion("CurrencyType_Id not in", values, "currencytypeId");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIdBetween(Integer value1, Integer value2) {
            addCriterion("CurrencyType_Id between", value1, value2, "currencytypeId");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CurrencyType_Id not between", value1, value2, "currencytypeId");
            return (Criteria) this;
        }

        public Criteria andFormIsNull() {
            addCriterion("Form is null");
            return (Criteria) this;
        }

        public Criteria andFormIsNotNull() {
            addCriterion("Form is not null");
            return (Criteria) this;
        }

        public Criteria andFormEqualTo(Byte value) {
            addCriterion("Form =", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotEqualTo(Byte value) {
            addCriterion("Form <>", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormGreaterThan(Byte value) {
            addCriterion("Form >", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormGreaterThanOrEqualTo(Byte value) {
            addCriterion("Form >=", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormLessThan(Byte value) {
            addCriterion("Form <", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormLessThanOrEqualTo(Byte value) {
            addCriterion("Form <=", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormIn(List<Byte> values) {
            addCriterion("Form in", values, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotIn(List<Byte> values) {
            addCriterion("Form not in", values, "form");
            return (Criteria) this;
        }

        public Criteria andFormBetween(Byte value1, Byte value2) {
            addCriterion("Form between", value1, value2, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotBetween(Byte value1, Byte value2) {
            addCriterion("Form not between", value1, value2, "form");
            return (Criteria) this;
        }

        public Criteria andFundPrincipalIsNull() {
            addCriterion("Fund_Principal is null");
            return (Criteria) this;
        }

        public Criteria andFundPrincipalIsNotNull() {
            addCriterion("Fund_Principal is not null");
            return (Criteria) this;
        }

        public Criteria andFundPrincipalEqualTo(String value) {
            addCriterion("Fund_Principal =", value, "fundPrincipal");
            return (Criteria) this;
        }

        public Criteria andFundPrincipalNotEqualTo(String value) {
            addCriterion("Fund_Principal <>", value, "fundPrincipal");
            return (Criteria) this;
        }

        public Criteria andFundPrincipalGreaterThan(String value) {
            addCriterion("Fund_Principal >", value, "fundPrincipal");
            return (Criteria) this;
        }

        public Criteria andFundPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("Fund_Principal >=", value, "fundPrincipal");
            return (Criteria) this;
        }

        public Criteria andFundPrincipalLessThan(String value) {
            addCriterion("Fund_Principal <", value, "fundPrincipal");
            return (Criteria) this;
        }

        public Criteria andFundPrincipalLessThanOrEqualTo(String value) {
            addCriterion("Fund_Principal <=", value, "fundPrincipal");
            return (Criteria) this;
        }

        public Criteria andFundPrincipalLike(String value) {
            addCriterion("Fund_Principal like", value, "fundPrincipal");
            return (Criteria) this;
        }

        public Criteria andFundPrincipalNotLike(String value) {
            addCriterion("Fund_Principal not like", value, "fundPrincipal");
            return (Criteria) this;
        }

        public Criteria andFundPrincipalIn(List<String> values) {
            addCriterion("Fund_Principal in", values, "fundPrincipal");
            return (Criteria) this;
        }

        public Criteria andFundPrincipalNotIn(List<String> values) {
            addCriterion("Fund_Principal not in", values, "fundPrincipal");
            return (Criteria) this;
        }

        public Criteria andFundPrincipalBetween(String value1, String value2) {
            addCriterion("Fund_Principal between", value1, value2, "fundPrincipal");
            return (Criteria) this;
        }

        public Criteria andFundPrincipalNotBetween(String value1, String value2) {
            addCriterion("Fund_Principal not between", value1, value2, "fundPrincipal");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeIsNull() {
            addCriterion("Execute_Time is null");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeIsNotNull() {
            addCriterion("Execute_Time is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeEqualTo(Date value) {
            addCriterion("Execute_Time =", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotEqualTo(Date value) {
            addCriterion("Execute_Time <>", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeGreaterThan(Date value) {
            addCriterion("Execute_Time >", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Execute_Time >=", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeLessThan(Date value) {
            addCriterion("Execute_Time <", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeLessThanOrEqualTo(Date value) {
            addCriterion("Execute_Time <=", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeIn(List<Date> values) {
            addCriterion("Execute_Time in", values, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotIn(List<Date> values) {
            addCriterion("Execute_Time not in", values, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeBetween(Date value1, Date value2) {
            addCriterion("Execute_Time between", value1, value2, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotBetween(Date value1, Date value2) {
            addCriterion("Execute_Time not between", value1, value2, "executeTime");
            return (Criteria) this;
        }

        public Criteria andSpanIsNull() {
            addCriterion("Span is null");
            return (Criteria) this;
        }

        public Criteria andSpanIsNotNull() {
            addCriterion("Span is not null");
            return (Criteria) this;
        }

        public Criteria andSpanEqualTo(Integer value) {
            addCriterion("Span =", value, "span");
            return (Criteria) this;
        }

        public Criteria andSpanNotEqualTo(Integer value) {
            addCriterion("Span <>", value, "span");
            return (Criteria) this;
        }

        public Criteria andSpanGreaterThan(Integer value) {
            addCriterion("Span >", value, "span");
            return (Criteria) this;
        }

        public Criteria andSpanGreaterThanOrEqualTo(Integer value) {
            addCriterion("Span >=", value, "span");
            return (Criteria) this;
        }

        public Criteria andSpanLessThan(Integer value) {
            addCriterion("Span <", value, "span");
            return (Criteria) this;
        }

        public Criteria andSpanLessThanOrEqualTo(Integer value) {
            addCriterion("Span <=", value, "span");
            return (Criteria) this;
        }

        public Criteria andSpanIn(List<Integer> values) {
            addCriterion("Span in", values, "span");
            return (Criteria) this;
        }

        public Criteria andSpanNotIn(List<Integer> values) {
            addCriterion("Span not in", values, "span");
            return (Criteria) this;
        }

        public Criteria andSpanBetween(Integer value1, Integer value2) {
            addCriterion("Span between", value1, value2, "span");
            return (Criteria) this;
        }

        public Criteria andSpanNotBetween(Integer value1, Integer value2) {
            addCriterion("Span not between", value1, value2, "span");
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