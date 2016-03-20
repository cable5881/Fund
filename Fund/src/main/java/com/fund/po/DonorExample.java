package com.fund.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DonorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DonorExample() {
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

        public Criteria andDNameIsNull() {
            addCriterion("D_Name is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("D_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("D_Name =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("D_Name <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("D_Name >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("D_Name >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("D_Name <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("D_Name <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("D_Name like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("D_Name not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("D_Name in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("D_Name not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("D_Name between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("D_Name not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDSexIsNull() {
            addCriterion("D_Sex is null");
            return (Criteria) this;
        }

        public Criteria andDSexIsNotNull() {
            addCriterion("D_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andDSexEqualTo(String value) {
            addCriterion("D_Sex =", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexNotEqualTo(String value) {
            addCriterion("D_Sex <>", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexGreaterThan(String value) {
            addCriterion("D_Sex >", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexGreaterThanOrEqualTo(String value) {
            addCriterion("D_Sex >=", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexLessThan(String value) {
            addCriterion("D_Sex <", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexLessThanOrEqualTo(String value) {
            addCriterion("D_Sex <=", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexLike(String value) {
            addCriterion("D_Sex like", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexNotLike(String value) {
            addCriterion("D_Sex not like", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexIn(List<String> values) {
            addCriterion("D_Sex in", values, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexNotIn(List<String> values) {
            addCriterion("D_Sex not in", values, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexBetween(String value1, String value2) {
            addCriterion("D_Sex between", value1, value2, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexNotBetween(String value1, String value2) {
            addCriterion("D_Sex not between", value1, value2, "dSex");
            return (Criteria) this;
        }

        public Criteria andDBirthdayIsNull() {
            addCriterion("D_Birthday is null");
            return (Criteria) this;
        }

        public Criteria andDBirthdayIsNotNull() {
            addCriterion("D_Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andDBirthdayEqualTo(Date value) {
            addCriterion("D_Birthday =", value, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayNotEqualTo(Date value) {
            addCriterion("D_Birthday <>", value, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayGreaterThan(Date value) {
            addCriterion("D_Birthday >", value, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("D_Birthday >=", value, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayLessThan(Date value) {
            addCriterion("D_Birthday <", value, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("D_Birthday <=", value, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayIn(List<Date> values) {
            addCriterion("D_Birthday in", values, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayNotIn(List<Date> values) {
            addCriterion("D_Birthday not in", values, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayBetween(Date value1, Date value2) {
            addCriterion("D_Birthday between", value1, value2, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("D_Birthday not between", value1, value2, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDUnitIsNull() {
            addCriterion("D_Unit is null");
            return (Criteria) this;
        }

        public Criteria andDUnitIsNotNull() {
            addCriterion("D_Unit is not null");
            return (Criteria) this;
        }

        public Criteria andDUnitEqualTo(String value) {
            addCriterion("D_Unit =", value, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitNotEqualTo(String value) {
            addCriterion("D_Unit <>", value, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitGreaterThan(String value) {
            addCriterion("D_Unit >", value, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitGreaterThanOrEqualTo(String value) {
            addCriterion("D_Unit >=", value, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitLessThan(String value) {
            addCriterion("D_Unit <", value, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitLessThanOrEqualTo(String value) {
            addCriterion("D_Unit <=", value, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitLike(String value) {
            addCriterion("D_Unit like", value, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitNotLike(String value) {
            addCriterion("D_Unit not like", value, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitIn(List<String> values) {
            addCriterion("D_Unit in", values, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitNotIn(List<String> values) {
            addCriterion("D_Unit not in", values, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitBetween(String value1, String value2) {
            addCriterion("D_Unit between", value1, value2, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitNotBetween(String value1, String value2) {
            addCriterion("D_Unit not between", value1, value2, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDJobIsNull() {
            addCriterion("D_Job is null");
            return (Criteria) this;
        }

        public Criteria andDJobIsNotNull() {
            addCriterion("D_Job is not null");
            return (Criteria) this;
        }

        public Criteria andDJobEqualTo(String value) {
            addCriterion("D_Job =", value, "dJob");
            return (Criteria) this;
        }

        public Criteria andDJobNotEqualTo(String value) {
            addCriterion("D_Job <>", value, "dJob");
            return (Criteria) this;
        }

        public Criteria andDJobGreaterThan(String value) {
            addCriterion("D_Job >", value, "dJob");
            return (Criteria) this;
        }

        public Criteria andDJobGreaterThanOrEqualTo(String value) {
            addCriterion("D_Job >=", value, "dJob");
            return (Criteria) this;
        }

        public Criteria andDJobLessThan(String value) {
            addCriterion("D_Job <", value, "dJob");
            return (Criteria) this;
        }

        public Criteria andDJobLessThanOrEqualTo(String value) {
            addCriterion("D_Job <=", value, "dJob");
            return (Criteria) this;
        }

        public Criteria andDJobLike(String value) {
            addCriterion("D_Job like", value, "dJob");
            return (Criteria) this;
        }

        public Criteria andDJobNotLike(String value) {
            addCriterion("D_Job not like", value, "dJob");
            return (Criteria) this;
        }

        public Criteria andDJobIn(List<String> values) {
            addCriterion("D_Job in", values, "dJob");
            return (Criteria) this;
        }

        public Criteria andDJobNotIn(List<String> values) {
            addCriterion("D_Job not in", values, "dJob");
            return (Criteria) this;
        }

        public Criteria andDJobBetween(String value1, String value2) {
            addCriterion("D_Job between", value1, value2, "dJob");
            return (Criteria) this;
        }

        public Criteria andDJobNotBetween(String value1, String value2) {
            addCriterion("D_Job not between", value1, value2, "dJob");
            return (Criteria) this;
        }

        public Criteria andHobbitsIsNull() {
            addCriterion("Hobbits is null");
            return (Criteria) this;
        }

        public Criteria andHobbitsIsNotNull() {
            addCriterion("Hobbits is not null");
            return (Criteria) this;
        }

        public Criteria andHobbitsEqualTo(String value) {
            addCriterion("Hobbits =", value, "hobbits");
            return (Criteria) this;
        }

        public Criteria andHobbitsNotEqualTo(String value) {
            addCriterion("Hobbits <>", value, "hobbits");
            return (Criteria) this;
        }

        public Criteria andHobbitsGreaterThan(String value) {
            addCriterion("Hobbits >", value, "hobbits");
            return (Criteria) this;
        }

        public Criteria andHobbitsGreaterThanOrEqualTo(String value) {
            addCriterion("Hobbits >=", value, "hobbits");
            return (Criteria) this;
        }

        public Criteria andHobbitsLessThan(String value) {
            addCriterion("Hobbits <", value, "hobbits");
            return (Criteria) this;
        }

        public Criteria andHobbitsLessThanOrEqualTo(String value) {
            addCriterion("Hobbits <=", value, "hobbits");
            return (Criteria) this;
        }

        public Criteria andHobbitsLike(String value) {
            addCriterion("Hobbits like", value, "hobbits");
            return (Criteria) this;
        }

        public Criteria andHobbitsNotLike(String value) {
            addCriterion("Hobbits not like", value, "hobbits");
            return (Criteria) this;
        }

        public Criteria andHobbitsIn(List<String> values) {
            addCriterion("Hobbits in", values, "hobbits");
            return (Criteria) this;
        }

        public Criteria andHobbitsNotIn(List<String> values) {
            addCriterion("Hobbits not in", values, "hobbits");
            return (Criteria) this;
        }

        public Criteria andHobbitsBetween(String value1, String value2) {
            addCriterion("Hobbits between", value1, value2, "hobbits");
            return (Criteria) this;
        }

        public Criteria andHobbitsNotBetween(String value1, String value2) {
            addCriterion("Hobbits not between", value1, value2, "hobbits");
            return (Criteria) this;
        }

        public Criteria andDegreeinfoIsNull() {
            addCriterion("DegreeInfo is null");
            return (Criteria) this;
        }

        public Criteria andDegreeinfoIsNotNull() {
            addCriterion("DegreeInfo is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeinfoEqualTo(String value) {
            addCriterion("DegreeInfo =", value, "degreeinfo");
            return (Criteria) this;
        }

        public Criteria andDegreeinfoNotEqualTo(String value) {
            addCriterion("DegreeInfo <>", value, "degreeinfo");
            return (Criteria) this;
        }

        public Criteria andDegreeinfoGreaterThan(String value) {
            addCriterion("DegreeInfo >", value, "degreeinfo");
            return (Criteria) this;
        }

        public Criteria andDegreeinfoGreaterThanOrEqualTo(String value) {
            addCriterion("DegreeInfo >=", value, "degreeinfo");
            return (Criteria) this;
        }

        public Criteria andDegreeinfoLessThan(String value) {
            addCriterion("DegreeInfo <", value, "degreeinfo");
            return (Criteria) this;
        }

        public Criteria andDegreeinfoLessThanOrEqualTo(String value) {
            addCriterion("DegreeInfo <=", value, "degreeinfo");
            return (Criteria) this;
        }

        public Criteria andDegreeinfoLike(String value) {
            addCriterion("DegreeInfo like", value, "degreeinfo");
            return (Criteria) this;
        }

        public Criteria andDegreeinfoNotLike(String value) {
            addCriterion("DegreeInfo not like", value, "degreeinfo");
            return (Criteria) this;
        }

        public Criteria andDegreeinfoIn(List<String> values) {
            addCriterion("DegreeInfo in", values, "degreeinfo");
            return (Criteria) this;
        }

        public Criteria andDegreeinfoNotIn(List<String> values) {
            addCriterion("DegreeInfo not in", values, "degreeinfo");
            return (Criteria) this;
        }

        public Criteria andDegreeinfoBetween(String value1, String value2) {
            addCriterion("DegreeInfo between", value1, value2, "degreeinfo");
            return (Criteria) this;
        }

        public Criteria andDegreeinfoNotBetween(String value1, String value2) {
            addCriterion("DegreeInfo not between", value1, value2, "degreeinfo");
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

        public Criteria andDEmailIsNull() {
            addCriterion("D_Email is null");
            return (Criteria) this;
        }

        public Criteria andDEmailIsNotNull() {
            addCriterion("D_Email is not null");
            return (Criteria) this;
        }

        public Criteria andDEmailEqualTo(String value) {
            addCriterion("D_Email =", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailNotEqualTo(String value) {
            addCriterion("D_Email <>", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailGreaterThan(String value) {
            addCriterion("D_Email >", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailGreaterThanOrEqualTo(String value) {
            addCriterion("D_Email >=", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailLessThan(String value) {
            addCriterion("D_Email <", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailLessThanOrEqualTo(String value) {
            addCriterion("D_Email <=", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailLike(String value) {
            addCriterion("D_Email like", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailNotLike(String value) {
            addCriterion("D_Email not like", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailIn(List<String> values) {
            addCriterion("D_Email in", values, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailNotIn(List<String> values) {
            addCriterion("D_Email not in", values, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailBetween(String value1, String value2) {
            addCriterion("D_Email between", value1, value2, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailNotBetween(String value1, String value2) {
            addCriterion("D_Email not between", value1, value2, "dEmail");
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