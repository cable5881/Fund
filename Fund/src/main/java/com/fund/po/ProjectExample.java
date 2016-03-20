package com.fund.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("Project_Id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("Project_Id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("Project_Id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("Project_Id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("Project_Id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Project_Id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("Project_Id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("Project_Id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("Project_Id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("Project_Id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("Project_Id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Project_Id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectNumIsNull() {
            addCriterion("Project_Num is null");
            return (Criteria) this;
        }

        public Criteria andProjectNumIsNotNull() {
            addCriterion("Project_Num is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNumEqualTo(String value) {
            addCriterion("Project_Num =", value, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumNotEqualTo(String value) {
            addCriterion("Project_Num <>", value, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumGreaterThan(String value) {
            addCriterion("Project_Num >", value, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumGreaterThanOrEqualTo(String value) {
            addCriterion("Project_Num >=", value, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumLessThan(String value) {
            addCriterion("Project_Num <", value, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumLessThanOrEqualTo(String value) {
            addCriterion("Project_Num <=", value, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumLike(String value) {
            addCriterion("Project_Num like", value, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumNotLike(String value) {
            addCriterion("Project_Num not like", value, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumIn(List<String> values) {
            addCriterion("Project_Num in", values, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumNotIn(List<String> values) {
            addCriterion("Project_Num not in", values, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumBetween(String value1, String value2) {
            addCriterion("Project_Num between", value1, value2, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumNotBetween(String value1, String value2) {
            addCriterion("Project_Num not between", value1, value2, "projectNum");
            return (Criteria) this;
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

        public Criteria andProjectNameIsNull() {
            addCriterion("Project_Name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("Project_Name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("Project_Name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("Project_Name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("Project_Name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("Project_Name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("Project_Name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("Project_Name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("Project_Name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("Project_Name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("Project_Name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("Project_Name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("Project_Name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("Project_Name not between", value1, value2, "projectName");
            return (Criteria) this;
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

        public Criteria andUserIdIsNull() {
            addCriterion("User_Id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("User_Id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("User_Id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("User_Id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("User_Id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("User_Id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("User_Id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("User_Id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("User_Id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("Leader is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("Leader is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("Leader =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("Leader <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("Leader >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("Leader >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("Leader <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("Leader <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("Leader like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("Leader not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("Leader in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("Leader not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("Leader between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("Leader not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andSetupTimeIsNull() {
            addCriterion("SetUp_Time is null");
            return (Criteria) this;
        }

        public Criteria andSetupTimeIsNotNull() {
            addCriterion("SetUp_Time is not null");
            return (Criteria) this;
        }

        public Criteria andSetupTimeEqualTo(Date value) {
            addCriterion("SetUp_Time =", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeNotEqualTo(Date value) {
            addCriterion("SetUp_Time <>", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeGreaterThan(Date value) {
            addCriterion("SetUp_Time >", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SetUp_Time >=", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeLessThan(Date value) {
            addCriterion("SetUp_Time <", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeLessThanOrEqualTo(Date value) {
            addCriterion("SetUp_Time <=", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeIn(List<Date> values) {
            addCriterion("SetUp_Time in", values, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeNotIn(List<Date> values) {
            addCriterion("SetUp_Time not in", values, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeBetween(Date value1, Date value2) {
            addCriterion("SetUp_Time between", value1, value2, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeNotBetween(Date value1, Date value2) {
            addCriterion("SetUp_Time not between", value1, value2, "setupTime");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("Purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("Purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("Purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("Purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("Purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("Purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("Purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("Purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("Purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("Purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("Purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("Purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("Purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("Purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andIsUnitIsNull() {
            addCriterion("Is_Unit is null");
            return (Criteria) this;
        }

        public Criteria andIsUnitIsNotNull() {
            addCriterion("Is_Unit is not null");
            return (Criteria) this;
        }

        public Criteria andIsUnitEqualTo(Byte value) {
            addCriterion("Is_Unit =", value, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitNotEqualTo(Byte value) {
            addCriterion("Is_Unit <>", value, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitGreaterThan(Byte value) {
            addCriterion("Is_Unit >", value, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitGreaterThanOrEqualTo(Byte value) {
            addCriterion("Is_Unit >=", value, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitLessThan(Byte value) {
            addCriterion("Is_Unit <", value, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitLessThanOrEqualTo(Byte value) {
            addCriterion("Is_Unit <=", value, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitIn(List<Byte> values) {
            addCriterion("Is_Unit in", values, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitNotIn(List<Byte> values) {
            addCriterion("Is_Unit not in", values, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitBetween(Byte value1, Byte value2) {
            addCriterion("Is_Unit between", value1, value2, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitNotBetween(Byte value1, Byte value2) {
            addCriterion("Is_Unit not between", value1, value2, "isUnit");
            return (Criteria) this;
        }

        public Criteria andBenificiaryunitIdIsNull() {
            addCriterion("BenificiaryUnit_Id is null");
            return (Criteria) this;
        }

        public Criteria andBenificiaryunitIdIsNotNull() {
            addCriterion("BenificiaryUnit_Id is not null");
            return (Criteria) this;
        }

        public Criteria andBenificiaryunitIdEqualTo(Integer value) {
            addCriterion("BenificiaryUnit_Id =", value, "benificiaryunitId");
            return (Criteria) this;
        }

        public Criteria andBenificiaryunitIdNotEqualTo(Integer value) {
            addCriterion("BenificiaryUnit_Id <>", value, "benificiaryunitId");
            return (Criteria) this;
        }

        public Criteria andBenificiaryunitIdGreaterThan(Integer value) {
            addCriterion("BenificiaryUnit_Id >", value, "benificiaryunitId");
            return (Criteria) this;
        }

        public Criteria andBenificiaryunitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BenificiaryUnit_Id >=", value, "benificiaryunitId");
            return (Criteria) this;
        }

        public Criteria andBenificiaryunitIdLessThan(Integer value) {
            addCriterion("BenificiaryUnit_Id <", value, "benificiaryunitId");
            return (Criteria) this;
        }

        public Criteria andBenificiaryunitIdLessThanOrEqualTo(Integer value) {
            addCriterion("BenificiaryUnit_Id <=", value, "benificiaryunitId");
            return (Criteria) this;
        }

        public Criteria andBenificiaryunitIdIn(List<Integer> values) {
            addCriterion("BenificiaryUnit_Id in", values, "benificiaryunitId");
            return (Criteria) this;
        }

        public Criteria andBenificiaryunitIdNotIn(List<Integer> values) {
            addCriterion("BenificiaryUnit_Id not in", values, "benificiaryunitId");
            return (Criteria) this;
        }

        public Criteria andBenificiaryunitIdBetween(Integer value1, Integer value2) {
            addCriterion("BenificiaryUnit_Id between", value1, value2, "benificiaryunitId");
            return (Criteria) this;
        }

        public Criteria andBenificiaryunitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BenificiaryUnit_Id not between", value1, value2, "benificiaryunitId");
            return (Criteria) this;
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

        public Criteria andDonorIdIsNull() {
            addCriterion("Donor_Id is null");
            return (Criteria) this;
        }

        public Criteria andDonorIdIsNotNull() {
            addCriterion("Donor_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDonorIdEqualTo(Integer value) {
            addCriterion("Donor_Id =", value, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdNotEqualTo(Integer value) {
            addCriterion("Donor_Id <>", value, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdGreaterThan(Integer value) {
            addCriterion("Donor_Id >", value, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Donor_Id >=", value, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdLessThan(Integer value) {
            addCriterion("Donor_Id <", value, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdLessThanOrEqualTo(Integer value) {
            addCriterion("Donor_Id <=", value, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdIn(List<Integer> values) {
            addCriterion("Donor_Id in", values, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdNotIn(List<Integer> values) {
            addCriterion("Donor_Id not in", values, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdBetween(Integer value1, Integer value2) {
            addCriterion("Donor_Id between", value1, value2, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Donor_Id not between", value1, value2, "donorId");
            return (Criteria) this;
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

        public Criteria andDonationuserIdIsNull() {
            addCriterion("DonationUser_Id is null");
            return (Criteria) this;
        }

        public Criteria andDonationuserIdIsNotNull() {
            addCriterion("DonationUser_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDonationuserIdEqualTo(Integer value) {
            addCriterion("DonationUser_Id =", value, "donationuserId");
            return (Criteria) this;
        }

        public Criteria andDonationuserIdNotEqualTo(Integer value) {
            addCriterion("DonationUser_Id <>", value, "donationuserId");
            return (Criteria) this;
        }

        public Criteria andDonationuserIdGreaterThan(Integer value) {
            addCriterion("DonationUser_Id >", value, "donationuserId");
            return (Criteria) this;
        }

        public Criteria andDonationuserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DonationUser_Id >=", value, "donationuserId");
            return (Criteria) this;
        }

        public Criteria andDonationuserIdLessThan(Integer value) {
            addCriterion("DonationUser_Id <", value, "donationuserId");
            return (Criteria) this;
        }

        public Criteria andDonationuserIdLessThanOrEqualTo(Integer value) {
            addCriterion("DonationUser_Id <=", value, "donationuserId");
            return (Criteria) this;
        }

        public Criteria andDonationuserIdIn(List<Integer> values) {
            addCriterion("DonationUser_Id in", values, "donationuserId");
            return (Criteria) this;
        }

        public Criteria andDonationuserIdNotIn(List<Integer> values) {
            addCriterion("DonationUser_Id not in", values, "donationuserId");
            return (Criteria) this;
        }

        public Criteria andDonationuserIdBetween(Integer value1, Integer value2) {
            addCriterion("DonationUser_Id between", value1, value2, "donationuserId");
            return (Criteria) this;
        }

        public Criteria andDonationuserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DonationUser_Id not between", value1, value2, "donationuserId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdIsNull() {
            addCriterion("Protocol_Id is null");
            return (Criteria) this;
        }

        public Criteria andProtocolIdIsNotNull() {
            addCriterion("Protocol_Id is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolIdEqualTo(Integer value) {
            addCriterion("Protocol_Id =", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdNotEqualTo(Integer value) {
            addCriterion("Protocol_Id <>", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdGreaterThan(Integer value) {
            addCriterion("Protocol_Id >", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Protocol_Id >=", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdLessThan(Integer value) {
            addCriterion("Protocol_Id <", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdLessThanOrEqualTo(Integer value) {
            addCriterion("Protocol_Id <=", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdIn(List<Integer> values) {
            addCriterion("Protocol_Id in", values, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdNotIn(List<Integer> values) {
            addCriterion("Protocol_Id not in", values, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdBetween(Integer value1, Integer value2) {
            addCriterion("Protocol_Id between", value1, value2, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Protocol_Id not between", value1, value2, "protocolId");
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

        public Criteria andPublicationStateIsNull() {
            addCriterion("Publication_State is null");
            return (Criteria) this;
        }

        public Criteria andPublicationStateIsNotNull() {
            addCriterion("Publication_State is not null");
            return (Criteria) this;
        }

        public Criteria andPublicationStateEqualTo(Byte value) {
            addCriterion("Publication_State =", value, "publicationState");
            return (Criteria) this;
        }

        public Criteria andPublicationStateNotEqualTo(Byte value) {
            addCriterion("Publication_State <>", value, "publicationState");
            return (Criteria) this;
        }

        public Criteria andPublicationStateGreaterThan(Byte value) {
            addCriterion("Publication_State >", value, "publicationState");
            return (Criteria) this;
        }

        public Criteria andPublicationStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("Publication_State >=", value, "publicationState");
            return (Criteria) this;
        }

        public Criteria andPublicationStateLessThan(Byte value) {
            addCriterion("Publication_State <", value, "publicationState");
            return (Criteria) this;
        }

        public Criteria andPublicationStateLessThanOrEqualTo(Byte value) {
            addCriterion("Publication_State <=", value, "publicationState");
            return (Criteria) this;
        }

        public Criteria andPublicationStateIn(List<Byte> values) {
            addCriterion("Publication_State in", values, "publicationState");
            return (Criteria) this;
        }

        public Criteria andPublicationStateNotIn(List<Byte> values) {
            addCriterion("Publication_State not in", values, "publicationState");
            return (Criteria) this;
        }

        public Criteria andPublicationStateBetween(Byte value1, Byte value2) {
            addCriterion("Publication_State between", value1, value2, "publicationState");
            return (Criteria) this;
        }

        public Criteria andPublicationStateNotBetween(Byte value1, Byte value2) {
            addCriterion("Publication_State not between", value1, value2, "publicationState");
            return (Criteria) this;
        }

        public Criteria andAppformIdIsNull() {
            addCriterion("AppForm_Id is null");
            return (Criteria) this;
        }

        public Criteria andAppformIdIsNotNull() {
            addCriterion("AppForm_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAppformIdEqualTo(Integer value) {
            addCriterion("AppForm_Id =", value, "appformId");
            return (Criteria) this;
        }

        public Criteria andAppformIdNotEqualTo(Integer value) {
            addCriterion("AppForm_Id <>", value, "appformId");
            return (Criteria) this;
        }

        public Criteria andAppformIdGreaterThan(Integer value) {
            addCriterion("AppForm_Id >", value, "appformId");
            return (Criteria) this;
        }

        public Criteria andAppformIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AppForm_Id >=", value, "appformId");
            return (Criteria) this;
        }

        public Criteria andAppformIdLessThan(Integer value) {
            addCriterion("AppForm_Id <", value, "appformId");
            return (Criteria) this;
        }

        public Criteria andAppformIdLessThanOrEqualTo(Integer value) {
            addCriterion("AppForm_Id <=", value, "appformId");
            return (Criteria) this;
        }

        public Criteria andAppformIdIn(List<Integer> values) {
            addCriterion("AppForm_Id in", values, "appformId");
            return (Criteria) this;
        }

        public Criteria andAppformIdNotIn(List<Integer> values) {
            addCriterion("AppForm_Id not in", values, "appformId");
            return (Criteria) this;
        }

        public Criteria andAppformIdBetween(Integer value1, Integer value2) {
            addCriterion("AppForm_Id between", value1, value2, "appformId");
            return (Criteria) this;
        }

        public Criteria andAppformIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AppForm_Id not between", value1, value2, "appformId");
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

        public Criteria andIsPassedIsNull() {
            addCriterion("Is_Passed is null");
            return (Criteria) this;
        }

        public Criteria andIsPassedIsNotNull() {
            addCriterion("Is_Passed is not null");
            return (Criteria) this;
        }

        public Criteria andIsPassedEqualTo(Byte value) {
            addCriterion("Is_Passed =", value, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedNotEqualTo(Byte value) {
            addCriterion("Is_Passed <>", value, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedGreaterThan(Byte value) {
            addCriterion("Is_Passed >", value, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedGreaterThanOrEqualTo(Byte value) {
            addCriterion("Is_Passed >=", value, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedLessThan(Byte value) {
            addCriterion("Is_Passed <", value, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedLessThanOrEqualTo(Byte value) {
            addCriterion("Is_Passed <=", value, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedIn(List<Byte> values) {
            addCriterion("Is_Passed in", values, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedNotIn(List<Byte> values) {
            addCriterion("Is_Passed not in", values, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedBetween(Byte value1, Byte value2) {
            addCriterion("Is_Passed between", value1, value2, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedNotBetween(Byte value1, Byte value2) {
            addCriterion("Is_Passed not between", value1, value2, "isPassed");
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