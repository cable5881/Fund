package com.fund.po;

import java.util.ArrayList;
import java.util.List;

public class BenificiarycontactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BenificiarycontactExample() {
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

        public Criteria andBenificiarycontactIdIsNull() {
            addCriterion("BenificiaryContact_Id is null");
            return (Criteria) this;
        }

        public Criteria andBenificiarycontactIdIsNotNull() {
            addCriterion("BenificiaryContact_Id is not null");
            return (Criteria) this;
        }

        public Criteria andBenificiarycontactIdEqualTo(Integer value) {
            addCriterion("BenificiaryContact_Id =", value, "benificiarycontactId");
            return (Criteria) this;
        }

        public Criteria andBenificiarycontactIdNotEqualTo(Integer value) {
            addCriterion("BenificiaryContact_Id <>", value, "benificiarycontactId");
            return (Criteria) this;
        }

        public Criteria andBenificiarycontactIdGreaterThan(Integer value) {
            addCriterion("BenificiaryContact_Id >", value, "benificiarycontactId");
            return (Criteria) this;
        }

        public Criteria andBenificiarycontactIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BenificiaryContact_Id >=", value, "benificiarycontactId");
            return (Criteria) this;
        }

        public Criteria andBenificiarycontactIdLessThan(Integer value) {
            addCriterion("BenificiaryContact_Id <", value, "benificiarycontactId");
            return (Criteria) this;
        }

        public Criteria andBenificiarycontactIdLessThanOrEqualTo(Integer value) {
            addCriterion("BenificiaryContact_Id <=", value, "benificiarycontactId");
            return (Criteria) this;
        }

        public Criteria andBenificiarycontactIdIn(List<Integer> values) {
            addCriterion("BenificiaryContact_Id in", values, "benificiarycontactId");
            return (Criteria) this;
        }

        public Criteria andBenificiarycontactIdNotIn(List<Integer> values) {
            addCriterion("BenificiaryContact_Id not in", values, "benificiarycontactId");
            return (Criteria) this;
        }

        public Criteria andBenificiarycontactIdBetween(Integer value1, Integer value2) {
            addCriterion("BenificiaryContact_Id between", value1, value2, "benificiarycontactId");
            return (Criteria) this;
        }

        public Criteria andBenificiarycontactIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BenificiaryContact_Id not between", value1, value2, "benificiarycontactId");
            return (Criteria) this;
        }

        public Criteria andBcNameIsNull() {
            addCriterion("BC_Name is null");
            return (Criteria) this;
        }

        public Criteria andBcNameIsNotNull() {
            addCriterion("BC_Name is not null");
            return (Criteria) this;
        }

        public Criteria andBcNameEqualTo(String value) {
            addCriterion("BC_Name =", value, "bcName");
            return (Criteria) this;
        }

        public Criteria andBcNameNotEqualTo(String value) {
            addCriterion("BC_Name <>", value, "bcName");
            return (Criteria) this;
        }

        public Criteria andBcNameGreaterThan(String value) {
            addCriterion("BC_Name >", value, "bcName");
            return (Criteria) this;
        }

        public Criteria andBcNameGreaterThanOrEqualTo(String value) {
            addCriterion("BC_Name >=", value, "bcName");
            return (Criteria) this;
        }

        public Criteria andBcNameLessThan(String value) {
            addCriterion("BC_Name <", value, "bcName");
            return (Criteria) this;
        }

        public Criteria andBcNameLessThanOrEqualTo(String value) {
            addCriterion("BC_Name <=", value, "bcName");
            return (Criteria) this;
        }

        public Criteria andBcNameLike(String value) {
            addCriterion("BC_Name like", value, "bcName");
            return (Criteria) this;
        }

        public Criteria andBcNameNotLike(String value) {
            addCriterion("BC_Name not like", value, "bcName");
            return (Criteria) this;
        }

        public Criteria andBcNameIn(List<String> values) {
            addCriterion("BC_Name in", values, "bcName");
            return (Criteria) this;
        }

        public Criteria andBcNameNotIn(List<String> values) {
            addCriterion("BC_Name not in", values, "bcName");
            return (Criteria) this;
        }

        public Criteria andBcNameBetween(String value1, String value2) {
            addCriterion("BC_Name between", value1, value2, "bcName");
            return (Criteria) this;
        }

        public Criteria andBcNameNotBetween(String value1, String value2) {
            addCriterion("BC_Name not between", value1, value2, "bcName");
            return (Criteria) this;
        }

        public Criteria andOfficephoneIsNull() {
            addCriterion("OfficePhone is null");
            return (Criteria) this;
        }

        public Criteria andOfficephoneIsNotNull() {
            addCriterion("OfficePhone is not null");
            return (Criteria) this;
        }

        public Criteria andOfficephoneEqualTo(String value) {
            addCriterion("OfficePhone =", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotEqualTo(String value) {
            addCriterion("OfficePhone <>", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneGreaterThan(String value) {
            addCriterion("OfficePhone >", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneGreaterThanOrEqualTo(String value) {
            addCriterion("OfficePhone >=", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneLessThan(String value) {
            addCriterion("OfficePhone <", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneLessThanOrEqualTo(String value) {
            addCriterion("OfficePhone <=", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneLike(String value) {
            addCriterion("OfficePhone like", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotLike(String value) {
            addCriterion("OfficePhone not like", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneIn(List<String> values) {
            addCriterion("OfficePhone in", values, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotIn(List<String> values) {
            addCriterion("OfficePhone not in", values, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneBetween(String value1, String value2) {
            addCriterion("OfficePhone between", value1, value2, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotBetween(String value1, String value2) {
            addCriterion("OfficePhone not between", value1, value2, "officephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("MobilePhone is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("MobilePhone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("MobilePhone =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("MobilePhone <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("MobilePhone >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("MobilePhone >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("MobilePhone <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("MobilePhone <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("MobilePhone like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("MobilePhone not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("MobilePhone in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("MobilePhone not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("MobilePhone between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("MobilePhone not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("Fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("Fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("Fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("Fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("Fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("Fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("Fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("Fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("Fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("Fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("Fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("Fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("Fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("Fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andBcEmailIsNull() {
            addCriterion("BC_Email is null");
            return (Criteria) this;
        }

        public Criteria andBcEmailIsNotNull() {
            addCriterion("BC_Email is not null");
            return (Criteria) this;
        }

        public Criteria andBcEmailEqualTo(String value) {
            addCriterion("BC_Email =", value, "bcEmail");
            return (Criteria) this;
        }

        public Criteria andBcEmailNotEqualTo(String value) {
            addCriterion("BC_Email <>", value, "bcEmail");
            return (Criteria) this;
        }

        public Criteria andBcEmailGreaterThan(String value) {
            addCriterion("BC_Email >", value, "bcEmail");
            return (Criteria) this;
        }

        public Criteria andBcEmailGreaterThanOrEqualTo(String value) {
            addCriterion("BC_Email >=", value, "bcEmail");
            return (Criteria) this;
        }

        public Criteria andBcEmailLessThan(String value) {
            addCriterion("BC_Email <", value, "bcEmail");
            return (Criteria) this;
        }

        public Criteria andBcEmailLessThanOrEqualTo(String value) {
            addCriterion("BC_Email <=", value, "bcEmail");
            return (Criteria) this;
        }

        public Criteria andBcEmailLike(String value) {
            addCriterion("BC_Email like", value, "bcEmail");
            return (Criteria) this;
        }

        public Criteria andBcEmailNotLike(String value) {
            addCriterion("BC_Email not like", value, "bcEmail");
            return (Criteria) this;
        }

        public Criteria andBcEmailIn(List<String> values) {
            addCriterion("BC_Email in", values, "bcEmail");
            return (Criteria) this;
        }

        public Criteria andBcEmailNotIn(List<String> values) {
            addCriterion("BC_Email not in", values, "bcEmail");
            return (Criteria) this;
        }

        public Criteria andBcEmailBetween(String value1, String value2) {
            addCriterion("BC_Email between", value1, value2, "bcEmail");
            return (Criteria) this;
        }

        public Criteria andBcEmailNotBetween(String value1, String value2) {
            addCriterion("BC_Email not between", value1, value2, "bcEmail");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("Notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("Notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("Notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("Notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("Notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("Notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("Notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("Notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("Notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("Notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("Notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("Notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("Notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("Notes not between", value1, value2, "notes");
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