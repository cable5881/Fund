package com.fund.po;

import java.util.ArrayList;
import java.util.List;

public class DonationcontactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DonationcontactExample() {
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

        public Criteria andDonationcontactIdIsNull() {
            addCriterion("DonationContact_Id is null");
            return (Criteria) this;
        }

        public Criteria andDonationcontactIdIsNotNull() {
            addCriterion("DonationContact_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDonationcontactIdEqualTo(Integer value) {
            addCriterion("DonationContact_Id =", value, "donationcontactId");
            return (Criteria) this;
        }

        public Criteria andDonationcontactIdNotEqualTo(Integer value) {
            addCriterion("DonationContact_Id <>", value, "donationcontactId");
            return (Criteria) this;
        }

        public Criteria andDonationcontactIdGreaterThan(Integer value) {
            addCriterion("DonationContact_Id >", value, "donationcontactId");
            return (Criteria) this;
        }

        public Criteria andDonationcontactIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DonationContact_Id >=", value, "donationcontactId");
            return (Criteria) this;
        }

        public Criteria andDonationcontactIdLessThan(Integer value) {
            addCriterion("DonationContact_Id <", value, "donationcontactId");
            return (Criteria) this;
        }

        public Criteria andDonationcontactIdLessThanOrEqualTo(Integer value) {
            addCriterion("DonationContact_Id <=", value, "donationcontactId");
            return (Criteria) this;
        }

        public Criteria andDonationcontactIdIn(List<Integer> values) {
            addCriterion("DonationContact_Id in", values, "donationcontactId");
            return (Criteria) this;
        }

        public Criteria andDonationcontactIdNotIn(List<Integer> values) {
            addCriterion("DonationContact_Id not in", values, "donationcontactId");
            return (Criteria) this;
        }

        public Criteria andDonationcontactIdBetween(Integer value1, Integer value2) {
            addCriterion("DonationContact_Id between", value1, value2, "donationcontactId");
            return (Criteria) this;
        }

        public Criteria andDonationcontactIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DonationContact_Id not between", value1, value2, "donationcontactId");
            return (Criteria) this;
        }

        public Criteria andDcNameIsNull() {
            addCriterion("DC_Name is null");
            return (Criteria) this;
        }

        public Criteria andDcNameIsNotNull() {
            addCriterion("DC_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDcNameEqualTo(String value) {
            addCriterion("DC_Name =", value, "dcName");
            return (Criteria) this;
        }

        public Criteria andDcNameNotEqualTo(String value) {
            addCriterion("DC_Name <>", value, "dcName");
            return (Criteria) this;
        }

        public Criteria andDcNameGreaterThan(String value) {
            addCriterion("DC_Name >", value, "dcName");
            return (Criteria) this;
        }

        public Criteria andDcNameGreaterThanOrEqualTo(String value) {
            addCriterion("DC_Name >=", value, "dcName");
            return (Criteria) this;
        }

        public Criteria andDcNameLessThan(String value) {
            addCriterion("DC_Name <", value, "dcName");
            return (Criteria) this;
        }

        public Criteria andDcNameLessThanOrEqualTo(String value) {
            addCriterion("DC_Name <=", value, "dcName");
            return (Criteria) this;
        }

        public Criteria andDcNameLike(String value) {
            addCriterion("DC_Name like", value, "dcName");
            return (Criteria) this;
        }

        public Criteria andDcNameNotLike(String value) {
            addCriterion("DC_Name not like", value, "dcName");
            return (Criteria) this;
        }

        public Criteria andDcNameIn(List<String> values) {
            addCriterion("DC_Name in", values, "dcName");
            return (Criteria) this;
        }

        public Criteria andDcNameNotIn(List<String> values) {
            addCriterion("DC_Name not in", values, "dcName");
            return (Criteria) this;
        }

        public Criteria andDcNameBetween(String value1, String value2) {
            addCriterion("DC_Name between", value1, value2, "dcName");
            return (Criteria) this;
        }

        public Criteria andDcNameNotBetween(String value1, String value2) {
            addCriterion("DC_Name not between", value1, value2, "dcName");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("Job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("Job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("Job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("Job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("Job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("Job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("Job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("Job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("Job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("Job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("Job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("Job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("Job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("Job not between", value1, value2, "job");
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

        public Criteria andDcEmailIsNull() {
            addCriterion("DC_Email is null");
            return (Criteria) this;
        }

        public Criteria andDcEmailIsNotNull() {
            addCriterion("DC_Email is not null");
            return (Criteria) this;
        }

        public Criteria andDcEmailEqualTo(String value) {
            addCriterion("DC_Email =", value, "dcEmail");
            return (Criteria) this;
        }

        public Criteria andDcEmailNotEqualTo(String value) {
            addCriterion("DC_Email <>", value, "dcEmail");
            return (Criteria) this;
        }

        public Criteria andDcEmailGreaterThan(String value) {
            addCriterion("DC_Email >", value, "dcEmail");
            return (Criteria) this;
        }

        public Criteria andDcEmailGreaterThanOrEqualTo(String value) {
            addCriterion("DC_Email >=", value, "dcEmail");
            return (Criteria) this;
        }

        public Criteria andDcEmailLessThan(String value) {
            addCriterion("DC_Email <", value, "dcEmail");
            return (Criteria) this;
        }

        public Criteria andDcEmailLessThanOrEqualTo(String value) {
            addCriterion("DC_Email <=", value, "dcEmail");
            return (Criteria) this;
        }

        public Criteria andDcEmailLike(String value) {
            addCriterion("DC_Email like", value, "dcEmail");
            return (Criteria) this;
        }

        public Criteria andDcEmailNotLike(String value) {
            addCriterion("DC_Email not like", value, "dcEmail");
            return (Criteria) this;
        }

        public Criteria andDcEmailIn(List<String> values) {
            addCriterion("DC_Email in", values, "dcEmail");
            return (Criteria) this;
        }

        public Criteria andDcEmailNotIn(List<String> values) {
            addCriterion("DC_Email not in", values, "dcEmail");
            return (Criteria) this;
        }

        public Criteria andDcEmailBetween(String value1, String value2) {
            addCriterion("DC_Email between", value1, value2, "dcEmail");
            return (Criteria) this;
        }

        public Criteria andDcEmailNotBetween(String value1, String value2) {
            addCriterion("DC_Email not between", value1, value2, "dcEmail");
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

        public Criteria andIsAlumniIsNull() {
            addCriterion("Is_Alumni is null");
            return (Criteria) this;
        }

        public Criteria andIsAlumniIsNotNull() {
            addCriterion("Is_Alumni is not null");
            return (Criteria) this;
        }

        public Criteria andIsAlumniEqualTo(Byte value) {
            addCriterion("Is_Alumni =", value, "isAlumni");
            return (Criteria) this;
        }

        public Criteria andIsAlumniNotEqualTo(Byte value) {
            addCriterion("Is_Alumni <>", value, "isAlumni");
            return (Criteria) this;
        }

        public Criteria andIsAlumniGreaterThan(Byte value) {
            addCriterion("Is_Alumni >", value, "isAlumni");
            return (Criteria) this;
        }

        public Criteria andIsAlumniGreaterThanOrEqualTo(Byte value) {
            addCriterion("Is_Alumni >=", value, "isAlumni");
            return (Criteria) this;
        }

        public Criteria andIsAlumniLessThan(Byte value) {
            addCriterion("Is_Alumni <", value, "isAlumni");
            return (Criteria) this;
        }

        public Criteria andIsAlumniLessThanOrEqualTo(Byte value) {
            addCriterion("Is_Alumni <=", value, "isAlumni");
            return (Criteria) this;
        }

        public Criteria andIsAlumniIn(List<Byte> values) {
            addCriterion("Is_Alumni in", values, "isAlumni");
            return (Criteria) this;
        }

        public Criteria andIsAlumniNotIn(List<Byte> values) {
            addCriterion("Is_Alumni not in", values, "isAlumni");
            return (Criteria) this;
        }

        public Criteria andIsAlumniBetween(Byte value1, Byte value2) {
            addCriterion("Is_Alumni between", value1, value2, "isAlumni");
            return (Criteria) this;
        }

        public Criteria andIsAlumniNotBetween(Byte value1, Byte value2) {
            addCriterion("Is_Alumni not between", value1, value2, "isAlumni");
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