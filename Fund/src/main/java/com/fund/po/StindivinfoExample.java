package com.fund.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StindivinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StindivinfoExample() {
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

        public Criteria andStindivinfoIdIsNull() {
            addCriterion("StIndivInfo_Id is null");
            return (Criteria) this;
        }

        public Criteria andStindivinfoIdIsNotNull() {
            addCriterion("StIndivInfo_Id is not null");
            return (Criteria) this;
        }

        public Criteria andStindivinfoIdEqualTo(Integer value) {
            addCriterion("StIndivInfo_Id =", value, "stindivinfoId");
            return (Criteria) this;
        }

        public Criteria andStindivinfoIdNotEqualTo(Integer value) {
            addCriterion("StIndivInfo_Id <>", value, "stindivinfoId");
            return (Criteria) this;
        }

        public Criteria andStindivinfoIdGreaterThan(Integer value) {
            addCriterion("StIndivInfo_Id >", value, "stindivinfoId");
            return (Criteria) this;
        }

        public Criteria andStindivinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("StIndivInfo_Id >=", value, "stindivinfoId");
            return (Criteria) this;
        }

        public Criteria andStindivinfoIdLessThan(Integer value) {
            addCriterion("StIndivInfo_Id <", value, "stindivinfoId");
            return (Criteria) this;
        }

        public Criteria andStindivinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("StIndivInfo_Id <=", value, "stindivinfoId");
            return (Criteria) this;
        }

        public Criteria andStindivinfoIdIn(List<Integer> values) {
            addCriterion("StIndivInfo_Id in", values, "stindivinfoId");
            return (Criteria) this;
        }

        public Criteria andStindivinfoIdNotIn(List<Integer> values) {
            addCriterion("StIndivInfo_Id not in", values, "stindivinfoId");
            return (Criteria) this;
        }

        public Criteria andStindivinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("StIndivInfo_Id between", value1, value2, "stindivinfoId");
            return (Criteria) this;
        }

        public Criteria andStindivinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("StIndivInfo_Id not between", value1, value2, "stindivinfoId");
            return (Criteria) this;
        }

        public Criteria andStNameIsNull() {
            addCriterion("St_Name is null");
            return (Criteria) this;
        }

        public Criteria andStNameIsNotNull() {
            addCriterion("St_Name is not null");
            return (Criteria) this;
        }

        public Criteria andStNameEqualTo(String value) {
            addCriterion("St_Name =", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotEqualTo(String value) {
            addCriterion("St_Name <>", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThan(String value) {
            addCriterion("St_Name >", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThanOrEqualTo(String value) {
            addCriterion("St_Name >=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThan(String value) {
            addCriterion("St_Name <", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThanOrEqualTo(String value) {
            addCriterion("St_Name <=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLike(String value) {
            addCriterion("St_Name like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotLike(String value) {
            addCriterion("St_Name not like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameIn(List<String> values) {
            addCriterion("St_Name in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotIn(List<String> values) {
            addCriterion("St_Name not in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameBetween(String value1, String value2) {
            addCriterion("St_Name between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotBetween(String value1, String value2) {
            addCriterion("St_Name not between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStSexIsNull() {
            addCriterion("St_Sex is null");
            return (Criteria) this;
        }

        public Criteria andStSexIsNotNull() {
            addCriterion("St_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andStSexEqualTo(Byte value) {
            addCriterion("St_Sex =", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexNotEqualTo(Byte value) {
            addCriterion("St_Sex <>", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexGreaterThan(Byte value) {
            addCriterion("St_Sex >", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("St_Sex >=", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexLessThan(Byte value) {
            addCriterion("St_Sex <", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexLessThanOrEqualTo(Byte value) {
            addCriterion("St_Sex <=", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexIn(List<Byte> values) {
            addCriterion("St_Sex in", values, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexNotIn(List<Byte> values) {
            addCriterion("St_Sex not in", values, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexBetween(Byte value1, Byte value2) {
            addCriterion("St_Sex between", value1, value2, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexNotBetween(Byte value1, Byte value2) {
            addCriterion("St_Sex not between", value1, value2, "stSex");
            return (Criteria) this;
        }

        public Criteria andStBirthdayIsNull() {
            addCriterion("St_Birthday is null");
            return (Criteria) this;
        }

        public Criteria andStBirthdayIsNotNull() {
            addCriterion("St_Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andStBirthdayEqualTo(Date value) {
            addCriterion("St_Birthday =", value, "stBirthday");
            return (Criteria) this;
        }

        public Criteria andStBirthdayNotEqualTo(Date value) {
            addCriterion("St_Birthday <>", value, "stBirthday");
            return (Criteria) this;
        }

        public Criteria andStBirthdayGreaterThan(Date value) {
            addCriterion("St_Birthday >", value, "stBirthday");
            return (Criteria) this;
        }

        public Criteria andStBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("St_Birthday >=", value, "stBirthday");
            return (Criteria) this;
        }

        public Criteria andStBirthdayLessThan(Date value) {
            addCriterion("St_Birthday <", value, "stBirthday");
            return (Criteria) this;
        }

        public Criteria andStBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("St_Birthday <=", value, "stBirthday");
            return (Criteria) this;
        }

        public Criteria andStBirthdayIn(List<Date> values) {
            addCriterion("St_Birthday in", values, "stBirthday");
            return (Criteria) this;
        }

        public Criteria andStBirthdayNotIn(List<Date> values) {
            addCriterion("St_Birthday not in", values, "stBirthday");
            return (Criteria) this;
        }

        public Criteria andStBirthdayBetween(Date value1, Date value2) {
            addCriterion("St_Birthday between", value1, value2, "stBirthday");
            return (Criteria) this;
        }

        public Criteria andStBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("St_Birthday not between", value1, value2, "stBirthday");
            return (Criteria) this;
        }

        public Criteria andStStuidIsNull() {
            addCriterion("St_StuId is null");
            return (Criteria) this;
        }

        public Criteria andStStuidIsNotNull() {
            addCriterion("St_StuId is not null");
            return (Criteria) this;
        }

        public Criteria andStStuidEqualTo(String value) {
            addCriterion("St_StuId =", value, "stStuid");
            return (Criteria) this;
        }

        public Criteria andStStuidNotEqualTo(String value) {
            addCriterion("St_StuId <>", value, "stStuid");
            return (Criteria) this;
        }

        public Criteria andStStuidGreaterThan(String value) {
            addCriterion("St_StuId >", value, "stStuid");
            return (Criteria) this;
        }

        public Criteria andStStuidGreaterThanOrEqualTo(String value) {
            addCriterion("St_StuId >=", value, "stStuid");
            return (Criteria) this;
        }

        public Criteria andStStuidLessThan(String value) {
            addCriterion("St_StuId <", value, "stStuid");
            return (Criteria) this;
        }

        public Criteria andStStuidLessThanOrEqualTo(String value) {
            addCriterion("St_StuId <=", value, "stStuid");
            return (Criteria) this;
        }

        public Criteria andStStuidLike(String value) {
            addCriterion("St_StuId like", value, "stStuid");
            return (Criteria) this;
        }

        public Criteria andStStuidNotLike(String value) {
            addCriterion("St_StuId not like", value, "stStuid");
            return (Criteria) this;
        }

        public Criteria andStStuidIn(List<String> values) {
            addCriterion("St_StuId in", values, "stStuid");
            return (Criteria) this;
        }

        public Criteria andStStuidNotIn(List<String> values) {
            addCriterion("St_StuId not in", values, "stStuid");
            return (Criteria) this;
        }

        public Criteria andStStuidBetween(String value1, String value2) {
            addCriterion("St_StuId between", value1, value2, "stStuid");
            return (Criteria) this;
        }

        public Criteria andStStuidNotBetween(String value1, String value2) {
            addCriterion("St_StuId not between", value1, value2, "stStuid");
            return (Criteria) this;
        }

        public Criteria andInstituteIsNull() {
            addCriterion("Institute is null");
            return (Criteria) this;
        }

        public Criteria andInstituteIsNotNull() {
            addCriterion("Institute is not null");
            return (Criteria) this;
        }

        public Criteria andInstituteEqualTo(String value) {
            addCriterion("Institute =", value, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteNotEqualTo(String value) {
            addCriterion("Institute <>", value, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteGreaterThan(String value) {
            addCriterion("Institute >", value, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteGreaterThanOrEqualTo(String value) {
            addCriterion("Institute >=", value, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteLessThan(String value) {
            addCriterion("Institute <", value, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteLessThanOrEqualTo(String value) {
            addCriterion("Institute <=", value, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteLike(String value) {
            addCriterion("Institute like", value, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteNotLike(String value) {
            addCriterion("Institute not like", value, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteIn(List<String> values) {
            addCriterion("Institute in", values, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteNotIn(List<String> values) {
            addCriterion("Institute not in", values, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteBetween(String value1, String value2) {
            addCriterion("Institute between", value1, value2, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteNotBetween(String value1, String value2) {
            addCriterion("Institute not between", value1, value2, "institute");
            return (Criteria) this;
        }

        public Criteria andDegreesIsNull() {
            addCriterion("Degrees is null");
            return (Criteria) this;
        }

        public Criteria andDegreesIsNotNull() {
            addCriterion("Degrees is not null");
            return (Criteria) this;
        }

        public Criteria andDegreesEqualTo(String value) {
            addCriterion("Degrees =", value, "degrees");
            return (Criteria) this;
        }

        public Criteria andDegreesNotEqualTo(String value) {
            addCriterion("Degrees <>", value, "degrees");
            return (Criteria) this;
        }

        public Criteria andDegreesGreaterThan(String value) {
            addCriterion("Degrees >", value, "degrees");
            return (Criteria) this;
        }

        public Criteria andDegreesGreaterThanOrEqualTo(String value) {
            addCriterion("Degrees >=", value, "degrees");
            return (Criteria) this;
        }

        public Criteria andDegreesLessThan(String value) {
            addCriterion("Degrees <", value, "degrees");
            return (Criteria) this;
        }

        public Criteria andDegreesLessThanOrEqualTo(String value) {
            addCriterion("Degrees <=", value, "degrees");
            return (Criteria) this;
        }

        public Criteria andDegreesLike(String value) {
            addCriterion("Degrees like", value, "degrees");
            return (Criteria) this;
        }

        public Criteria andDegreesNotLike(String value) {
            addCriterion("Degrees not like", value, "degrees");
            return (Criteria) this;
        }

        public Criteria andDegreesIn(List<String> values) {
            addCriterion("Degrees in", values, "degrees");
            return (Criteria) this;
        }

        public Criteria andDegreesNotIn(List<String> values) {
            addCriterion("Degrees not in", values, "degrees");
            return (Criteria) this;
        }

        public Criteria andDegreesBetween(String value1, String value2) {
            addCriterion("Degrees between", value1, value2, "degrees");
            return (Criteria) this;
        }

        public Criteria andDegreesNotBetween(String value1, String value2) {
            addCriterion("Degrees not between", value1, value2, "degrees");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("Major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("Major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("Major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("Major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("Major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("Major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("Major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("Major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("Major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("Major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("Major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("Major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("Major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("Major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andClassesIsNull() {
            addCriterion("Classes is null");
            return (Criteria) this;
        }

        public Criteria andClassesIsNotNull() {
            addCriterion("Classes is not null");
            return (Criteria) this;
        }

        public Criteria andClassesEqualTo(String value) {
            addCriterion("Classes =", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotEqualTo(String value) {
            addCriterion("Classes <>", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThan(String value) {
            addCriterion("Classes >", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThanOrEqualTo(String value) {
            addCriterion("Classes >=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThan(String value) {
            addCriterion("Classes <", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThanOrEqualTo(String value) {
            addCriterion("Classes <=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLike(String value) {
            addCriterion("Classes like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotLike(String value) {
            addCriterion("Classes not like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesIn(List<String> values) {
            addCriterion("Classes in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotIn(List<String> values) {
            addCriterion("Classes not in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesBetween(String value1, String value2) {
            addCriterion("Classes between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotBetween(String value1, String value2) {
            addCriterion("Classes not between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("Nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("Nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("Nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("Nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("Nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("Nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("Nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("Nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("Nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("Nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("Nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("Nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("Nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("Nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andEnrolledTimeIsNull() {
            addCriterion("Enrolled_Time is null");
            return (Criteria) this;
        }

        public Criteria andEnrolledTimeIsNotNull() {
            addCriterion("Enrolled_Time is not null");
            return (Criteria) this;
        }

        public Criteria andEnrolledTimeEqualTo(Date value) {
            addCriterion("Enrolled_Time =", value, "enrolledTime");
            return (Criteria) this;
        }

        public Criteria andEnrolledTimeNotEqualTo(Date value) {
            addCriterion("Enrolled_Time <>", value, "enrolledTime");
            return (Criteria) this;
        }

        public Criteria andEnrolledTimeGreaterThan(Date value) {
            addCriterion("Enrolled_Time >", value, "enrolledTime");
            return (Criteria) this;
        }

        public Criteria andEnrolledTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Enrolled_Time >=", value, "enrolledTime");
            return (Criteria) this;
        }

        public Criteria andEnrolledTimeLessThan(Date value) {
            addCriterion("Enrolled_Time <", value, "enrolledTime");
            return (Criteria) this;
        }

        public Criteria andEnrolledTimeLessThanOrEqualTo(Date value) {
            addCriterion("Enrolled_Time <=", value, "enrolledTime");
            return (Criteria) this;
        }

        public Criteria andEnrolledTimeIn(List<Date> values) {
            addCriterion("Enrolled_Time in", values, "enrolledTime");
            return (Criteria) this;
        }

        public Criteria andEnrolledTimeNotIn(List<Date> values) {
            addCriterion("Enrolled_Time not in", values, "enrolledTime");
            return (Criteria) this;
        }

        public Criteria andEnrolledTimeBetween(Date value1, Date value2) {
            addCriterion("Enrolled_Time between", value1, value2, "enrolledTime");
            return (Criteria) this;
        }

        public Criteria andEnrolledTimeNotBetween(Date value1, Date value2) {
            addCriterion("Enrolled_Time not between", value1, value2, "enrolledTime");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNull() {
            addCriterion("Political_Status is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNotNull() {
            addCriterion("Political_Status is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusEqualTo(String value) {
            addCriterion("Political_Status =", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotEqualTo(String value) {
            addCriterion("Political_Status <>", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThan(String value) {
            addCriterion("Political_Status >", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Political_Status >=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThan(String value) {
            addCriterion("Political_Status <", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThanOrEqualTo(String value) {
            addCriterion("Political_Status <=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLike(String value) {
            addCriterion("Political_Status like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotLike(String value) {
            addCriterion("Political_Status not like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIn(List<String> values) {
            addCriterion("Political_Status in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotIn(List<String> values) {
            addCriterion("Political_Status not in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusBetween(String value1, String value2) {
            addCriterion("Political_Status between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotBetween(String value1, String value2) {
            addCriterion("Political_Status not between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andStEmailIsNull() {
            addCriterion("St_Email is null");
            return (Criteria) this;
        }

        public Criteria andStEmailIsNotNull() {
            addCriterion("St_Email is not null");
            return (Criteria) this;
        }

        public Criteria andStEmailEqualTo(String value) {
            addCriterion("St_Email =", value, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailNotEqualTo(String value) {
            addCriterion("St_Email <>", value, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailGreaterThan(String value) {
            addCriterion("St_Email >", value, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailGreaterThanOrEqualTo(String value) {
            addCriterion("St_Email >=", value, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailLessThan(String value) {
            addCriterion("St_Email <", value, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailLessThanOrEqualTo(String value) {
            addCriterion("St_Email <=", value, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailLike(String value) {
            addCriterion("St_Email like", value, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailNotLike(String value) {
            addCriterion("St_Email not like", value, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailIn(List<String> values) {
            addCriterion("St_Email in", values, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailNotIn(List<String> values) {
            addCriterion("St_Email not in", values, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailBetween(String value1, String value2) {
            addCriterion("St_Email between", value1, value2, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailNotBetween(String value1, String value2) {
            addCriterion("St_Email not between", value1, value2, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStAddressIsNull() {
            addCriterion("St_Address is null");
            return (Criteria) this;
        }

        public Criteria andStAddressIsNotNull() {
            addCriterion("St_Address is not null");
            return (Criteria) this;
        }

        public Criteria andStAddressEqualTo(String value) {
            addCriterion("St_Address =", value, "stAddress");
            return (Criteria) this;
        }

        public Criteria andStAddressNotEqualTo(String value) {
            addCriterion("St_Address <>", value, "stAddress");
            return (Criteria) this;
        }

        public Criteria andStAddressGreaterThan(String value) {
            addCriterion("St_Address >", value, "stAddress");
            return (Criteria) this;
        }

        public Criteria andStAddressGreaterThanOrEqualTo(String value) {
            addCriterion("St_Address >=", value, "stAddress");
            return (Criteria) this;
        }

        public Criteria andStAddressLessThan(String value) {
            addCriterion("St_Address <", value, "stAddress");
            return (Criteria) this;
        }

        public Criteria andStAddressLessThanOrEqualTo(String value) {
            addCriterion("St_Address <=", value, "stAddress");
            return (Criteria) this;
        }

        public Criteria andStAddressLike(String value) {
            addCriterion("St_Address like", value, "stAddress");
            return (Criteria) this;
        }

        public Criteria andStAddressNotLike(String value) {
            addCriterion("St_Address not like", value, "stAddress");
            return (Criteria) this;
        }

        public Criteria andStAddressIn(List<String> values) {
            addCriterion("St_Address in", values, "stAddress");
            return (Criteria) this;
        }

        public Criteria andStAddressNotIn(List<String> values) {
            addCriterion("St_Address not in", values, "stAddress");
            return (Criteria) this;
        }

        public Criteria andStAddressBetween(String value1, String value2) {
            addCriterion("St_Address between", value1, value2, "stAddress");
            return (Criteria) this;
        }

        public Criteria andStAddressNotBetween(String value1, String value2) {
            addCriterion("St_Address not between", value1, value2, "stAddress");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNull() {
            addCriterion("Photo_Url is null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNotNull() {
            addCriterion("Photo_Url is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlEqualTo(String value) {
            addCriterion("Photo_Url =", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotEqualTo(String value) {
            addCriterion("Photo_Url <>", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThan(String value) {
            addCriterion("Photo_Url >", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Photo_Url >=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThan(String value) {
            addCriterion("Photo_Url <", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("Photo_Url <=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLike(String value) {
            addCriterion("Photo_Url like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotLike(String value) {
            addCriterion("Photo_Url not like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIn(List<String> values) {
            addCriterion("Photo_Url in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotIn(List<String> values) {
            addCriterion("Photo_Url not in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlBetween(String value1, String value2) {
            addCriterion("Photo_Url between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("Photo_Url not between", value1, value2, "photoUrl");
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