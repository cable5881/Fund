package com.fund.po;

import java.util.ArrayList;
import java.util.List;

public class DonationunitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DonationunitExample() {
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

        public Criteria andDonationunitIdIsNull() {
            addCriterion("DonationUnit_Id is null");
            return (Criteria) this;
        }

        public Criteria andDonationunitIdIsNotNull() {
            addCriterion("DonationUnit_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDonationunitIdEqualTo(Integer value) {
            addCriterion("DonationUnit_Id =", value, "donationunitId");
            return (Criteria) this;
        }

        public Criteria andDonationunitIdNotEqualTo(Integer value) {
            addCriterion("DonationUnit_Id <>", value, "donationunitId");
            return (Criteria) this;
        }

        public Criteria andDonationunitIdGreaterThan(Integer value) {
            addCriterion("DonationUnit_Id >", value, "donationunitId");
            return (Criteria) this;
        }

        public Criteria andDonationunitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DonationUnit_Id >=", value, "donationunitId");
            return (Criteria) this;
        }

        public Criteria andDonationunitIdLessThan(Integer value) {
            addCriterion("DonationUnit_Id <", value, "donationunitId");
            return (Criteria) this;
        }

        public Criteria andDonationunitIdLessThanOrEqualTo(Integer value) {
            addCriterion("DonationUnit_Id <=", value, "donationunitId");
            return (Criteria) this;
        }

        public Criteria andDonationunitIdIn(List<Integer> values) {
            addCriterion("DonationUnit_Id in", values, "donationunitId");
            return (Criteria) this;
        }

        public Criteria andDonationunitIdNotIn(List<Integer> values) {
            addCriterion("DonationUnit_Id not in", values, "donationunitId");
            return (Criteria) this;
        }

        public Criteria andDonationunitIdBetween(Integer value1, Integer value2) {
            addCriterion("DonationUnit_Id between", value1, value2, "donationunitId");
            return (Criteria) this;
        }

        public Criteria andDonationunitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DonationUnit_Id not between", value1, value2, "donationunitId");
            return (Criteria) this;
        }

        public Criteria andDuNameIsNull() {
            addCriterion("DU_Name is null");
            return (Criteria) this;
        }

        public Criteria andDuNameIsNotNull() {
            addCriterion("DU_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDuNameEqualTo(String value) {
            addCriterion("DU_Name =", value, "duName");
            return (Criteria) this;
        }

        public Criteria andDuNameNotEqualTo(String value) {
            addCriterion("DU_Name <>", value, "duName");
            return (Criteria) this;
        }

        public Criteria andDuNameGreaterThan(String value) {
            addCriterion("DU_Name >", value, "duName");
            return (Criteria) this;
        }

        public Criteria andDuNameGreaterThanOrEqualTo(String value) {
            addCriterion("DU_Name >=", value, "duName");
            return (Criteria) this;
        }

        public Criteria andDuNameLessThan(String value) {
            addCriterion("DU_Name <", value, "duName");
            return (Criteria) this;
        }

        public Criteria andDuNameLessThanOrEqualTo(String value) {
            addCriterion("DU_Name <=", value, "duName");
            return (Criteria) this;
        }

        public Criteria andDuNameLike(String value) {
            addCriterion("DU_Name like", value, "duName");
            return (Criteria) this;
        }

        public Criteria andDuNameNotLike(String value) {
            addCriterion("DU_Name not like", value, "duName");
            return (Criteria) this;
        }

        public Criteria andDuNameIn(List<String> values) {
            addCriterion("DU_Name in", values, "duName");
            return (Criteria) this;
        }

        public Criteria andDuNameNotIn(List<String> values) {
            addCriterion("DU_Name not in", values, "duName");
            return (Criteria) this;
        }

        public Criteria andDuNameBetween(String value1, String value2) {
            addCriterion("DU_Name between", value1, value2, "duName");
            return (Criteria) this;
        }

        public Criteria andDuNameNotBetween(String value1, String value2) {
            addCriterion("DU_Name not between", value1, value2, "duName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("Zip_Code is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("Zip_Code is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("Zip_Code =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("Zip_Code <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("Zip_Code >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Zip_Code >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("Zip_Code <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("Zip_Code <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("Zip_Code like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("Zip_Code not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("Zip_Code in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("Zip_Code not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("Zip_Code between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("Zip_Code not between", value1, value2, "zipCode");
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

        public Criteria andWebsiteurlIsNull() {
            addCriterion("WebsiteURL is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteurlIsNotNull() {
            addCriterion("WebsiteURL is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteurlEqualTo(String value) {
            addCriterion("WebsiteURL =", value, "websiteurl");
            return (Criteria) this;
        }

        public Criteria andWebsiteurlNotEqualTo(String value) {
            addCriterion("WebsiteURL <>", value, "websiteurl");
            return (Criteria) this;
        }

        public Criteria andWebsiteurlGreaterThan(String value) {
            addCriterion("WebsiteURL >", value, "websiteurl");
            return (Criteria) this;
        }

        public Criteria andWebsiteurlGreaterThanOrEqualTo(String value) {
            addCriterion("WebsiteURL >=", value, "websiteurl");
            return (Criteria) this;
        }

        public Criteria andWebsiteurlLessThan(String value) {
            addCriterion("WebsiteURL <", value, "websiteurl");
            return (Criteria) this;
        }

        public Criteria andWebsiteurlLessThanOrEqualTo(String value) {
            addCriterion("WebsiteURL <=", value, "websiteurl");
            return (Criteria) this;
        }

        public Criteria andWebsiteurlLike(String value) {
            addCriterion("WebsiteURL like", value, "websiteurl");
            return (Criteria) this;
        }

        public Criteria andWebsiteurlNotLike(String value) {
            addCriterion("WebsiteURL not like", value, "websiteurl");
            return (Criteria) this;
        }

        public Criteria andWebsiteurlIn(List<String> values) {
            addCriterion("WebsiteURL in", values, "websiteurl");
            return (Criteria) this;
        }

        public Criteria andWebsiteurlNotIn(List<String> values) {
            addCriterion("WebsiteURL not in", values, "websiteurl");
            return (Criteria) this;
        }

        public Criteria andWebsiteurlBetween(String value1, String value2) {
            addCriterion("WebsiteURL between", value1, value2, "websiteurl");
            return (Criteria) this;
        }

        public Criteria andWebsiteurlNotBetween(String value1, String value2) {
            addCriterion("WebsiteURL not between", value1, value2, "websiteurl");
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

        public Criteria andDuEmailIsNull() {
            addCriterion("DU_Email is null");
            return (Criteria) this;
        }

        public Criteria andDuEmailIsNotNull() {
            addCriterion("DU_Email is not null");
            return (Criteria) this;
        }

        public Criteria andDuEmailEqualTo(String value) {
            addCriterion("DU_Email =", value, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailNotEqualTo(String value) {
            addCriterion("DU_Email <>", value, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailGreaterThan(String value) {
            addCriterion("DU_Email >", value, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailGreaterThanOrEqualTo(String value) {
            addCriterion("DU_Email >=", value, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailLessThan(String value) {
            addCriterion("DU_Email <", value, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailLessThanOrEqualTo(String value) {
            addCriterion("DU_Email <=", value, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailLike(String value) {
            addCriterion("DU_Email like", value, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailNotLike(String value) {
            addCriterion("DU_Email not like", value, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailIn(List<String> values) {
            addCriterion("DU_Email in", values, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailNotIn(List<String> values) {
            addCriterion("DU_Email not in", values, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailBetween(String value1, String value2) {
            addCriterion("DU_Email between", value1, value2, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailNotBetween(String value1, String value2) {
            addCriterion("DU_Email not between", value1, value2, "duEmail");
            return (Criteria) this;
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