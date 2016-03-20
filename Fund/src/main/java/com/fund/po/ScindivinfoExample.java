package com.fund.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScindivinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScindivinfoExample() {
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

        public Criteria andScindivinfoIdIsNull() {
            addCriterion("ScIndivInfo_Id is null");
            return (Criteria) this;
        }

        public Criteria andScindivinfoIdIsNotNull() {
            addCriterion("ScIndivInfo_Id is not null");
            return (Criteria) this;
        }

        public Criteria andScindivinfoIdEqualTo(Integer value) {
            addCriterion("ScIndivInfo_Id =", value, "scindivinfoId");
            return (Criteria) this;
        }

        public Criteria andScindivinfoIdNotEqualTo(Integer value) {
            addCriterion("ScIndivInfo_Id <>", value, "scindivinfoId");
            return (Criteria) this;
        }

        public Criteria andScindivinfoIdGreaterThan(Integer value) {
            addCriterion("ScIndivInfo_Id >", value, "scindivinfoId");
            return (Criteria) this;
        }

        public Criteria andScindivinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ScIndivInfo_Id >=", value, "scindivinfoId");
            return (Criteria) this;
        }

        public Criteria andScindivinfoIdLessThan(Integer value) {
            addCriterion("ScIndivInfo_Id <", value, "scindivinfoId");
            return (Criteria) this;
        }

        public Criteria andScindivinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("ScIndivInfo_Id <=", value, "scindivinfoId");
            return (Criteria) this;
        }

        public Criteria andScindivinfoIdIn(List<Integer> values) {
            addCriterion("ScIndivInfo_Id in", values, "scindivinfoId");
            return (Criteria) this;
        }

        public Criteria andScindivinfoIdNotIn(List<Integer> values) {
            addCriterion("ScIndivInfo_Id not in", values, "scindivinfoId");
            return (Criteria) this;
        }

        public Criteria andScindivinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("ScIndivInfo_Id between", value1, value2, "scindivinfoId");
            return (Criteria) this;
        }

        public Criteria andScindivinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ScIndivInfo_Id not between", value1, value2, "scindivinfoId");
            return (Criteria) this;
        }

        public Criteria andScNameIsNull() {
            addCriterion("Sc_Name is null");
            return (Criteria) this;
        }

        public Criteria andScNameIsNotNull() {
            addCriterion("Sc_Name is not null");
            return (Criteria) this;
        }

        public Criteria andScNameEqualTo(String value) {
            addCriterion("Sc_Name =", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotEqualTo(String value) {
            addCriterion("Sc_Name <>", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThan(String value) {
            addCriterion("Sc_Name >", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThanOrEqualTo(String value) {
            addCriterion("Sc_Name >=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThan(String value) {
            addCriterion("Sc_Name <", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThanOrEqualTo(String value) {
            addCriterion("Sc_Name <=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLike(String value) {
            addCriterion("Sc_Name like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotLike(String value) {
            addCriterion("Sc_Name not like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameIn(List<String> values) {
            addCriterion("Sc_Name in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotIn(List<String> values) {
            addCriterion("Sc_Name not in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameBetween(String value1, String value2) {
            addCriterion("Sc_Name between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotBetween(String value1, String value2) {
            addCriterion("Sc_Name not between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andScSexIsNull() {
            addCriterion("Sc_Sex is null");
            return (Criteria) this;
        }

        public Criteria andScSexIsNotNull() {
            addCriterion("Sc_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andScSexEqualTo(Byte value) {
            addCriterion("Sc_Sex =", value, "scSex");
            return (Criteria) this;
        }

        public Criteria andScSexNotEqualTo(Byte value) {
            addCriterion("Sc_Sex <>", value, "scSex");
            return (Criteria) this;
        }

        public Criteria andScSexGreaterThan(Byte value) {
            addCriterion("Sc_Sex >", value, "scSex");
            return (Criteria) this;
        }

        public Criteria andScSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("Sc_Sex >=", value, "scSex");
            return (Criteria) this;
        }

        public Criteria andScSexLessThan(Byte value) {
            addCriterion("Sc_Sex <", value, "scSex");
            return (Criteria) this;
        }

        public Criteria andScSexLessThanOrEqualTo(Byte value) {
            addCriterion("Sc_Sex <=", value, "scSex");
            return (Criteria) this;
        }

        public Criteria andScSexIn(List<Byte> values) {
            addCriterion("Sc_Sex in", values, "scSex");
            return (Criteria) this;
        }

        public Criteria andScSexNotIn(List<Byte> values) {
            addCriterion("Sc_Sex not in", values, "scSex");
            return (Criteria) this;
        }

        public Criteria andScSexBetween(Byte value1, Byte value2) {
            addCriterion("Sc_Sex between", value1, value2, "scSex");
            return (Criteria) this;
        }

        public Criteria andScSexNotBetween(Byte value1, Byte value2) {
            addCriterion("Sc_Sex not between", value1, value2, "scSex");
            return (Criteria) this;
        }

        public Criteria andScBirthdayIsNull() {
            addCriterion("Sc_Birthday is null");
            return (Criteria) this;
        }

        public Criteria andScBirthdayIsNotNull() {
            addCriterion("Sc_Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andScBirthdayEqualTo(Date value) {
            addCriterion("Sc_Birthday =", value, "scBirthday");
            return (Criteria) this;
        }

        public Criteria andScBirthdayNotEqualTo(Date value) {
            addCriterion("Sc_Birthday <>", value, "scBirthday");
            return (Criteria) this;
        }

        public Criteria andScBirthdayGreaterThan(Date value) {
            addCriterion("Sc_Birthday >", value, "scBirthday");
            return (Criteria) this;
        }

        public Criteria andScBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("Sc_Birthday >=", value, "scBirthday");
            return (Criteria) this;
        }

        public Criteria andScBirthdayLessThan(Date value) {
            addCriterion("Sc_Birthday <", value, "scBirthday");
            return (Criteria) this;
        }

        public Criteria andScBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("Sc_Birthday <=", value, "scBirthday");
            return (Criteria) this;
        }

        public Criteria andScBirthdayIn(List<Date> values) {
            addCriterion("Sc_Birthday in", values, "scBirthday");
            return (Criteria) this;
        }

        public Criteria andScBirthdayNotIn(List<Date> values) {
            addCriterion("Sc_Birthday not in", values, "scBirthday");
            return (Criteria) this;
        }

        public Criteria andScBirthdayBetween(Date value1, Date value2) {
            addCriterion("Sc_Birthday between", value1, value2, "scBirthday");
            return (Criteria) this;
        }

        public Criteria andScBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("Sc_Birthday not between", value1, value2, "scBirthday");
            return (Criteria) this;
        }

        public Criteria andScStuidIsNull() {
            addCriterion("Sc_StuId is null");
            return (Criteria) this;
        }

        public Criteria andScStuidIsNotNull() {
            addCriterion("Sc_StuId is not null");
            return (Criteria) this;
        }

        public Criteria andScStuidEqualTo(String value) {
            addCriterion("Sc_StuId =", value, "scStuid");
            return (Criteria) this;
        }

        public Criteria andScStuidNotEqualTo(String value) {
            addCriterion("Sc_StuId <>", value, "scStuid");
            return (Criteria) this;
        }

        public Criteria andScStuidGreaterThan(String value) {
            addCriterion("Sc_StuId >", value, "scStuid");
            return (Criteria) this;
        }

        public Criteria andScStuidGreaterThanOrEqualTo(String value) {
            addCriterion("Sc_StuId >=", value, "scStuid");
            return (Criteria) this;
        }

        public Criteria andScStuidLessThan(String value) {
            addCriterion("Sc_StuId <", value, "scStuid");
            return (Criteria) this;
        }

        public Criteria andScStuidLessThanOrEqualTo(String value) {
            addCriterion("Sc_StuId <=", value, "scStuid");
            return (Criteria) this;
        }

        public Criteria andScStuidLike(String value) {
            addCriterion("Sc_StuId like", value, "scStuid");
            return (Criteria) this;
        }

        public Criteria andScStuidNotLike(String value) {
            addCriterion("Sc_StuId not like", value, "scStuid");
            return (Criteria) this;
        }

        public Criteria andScStuidIn(List<String> values) {
            addCriterion("Sc_StuId in", values, "scStuid");
            return (Criteria) this;
        }

        public Criteria andScStuidNotIn(List<String> values) {
            addCriterion("Sc_StuId not in", values, "scStuid");
            return (Criteria) this;
        }

        public Criteria andScStuidBetween(String value1, String value2) {
            addCriterion("Sc_StuId between", value1, value2, "scStuid");
            return (Criteria) this;
        }

        public Criteria andScStuidNotBetween(String value1, String value2) {
            addCriterion("Sc_StuId not between", value1, value2, "scStuid");
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

        public Criteria andAcaScoreIsNull() {
            addCriterion("Aca_Score is null");
            return (Criteria) this;
        }

        public Criteria andAcaScoreIsNotNull() {
            addCriterion("Aca_Score is not null");
            return (Criteria) this;
        }

        public Criteria andAcaScoreEqualTo(String value) {
            addCriterion("Aca_Score =", value, "acaScore");
            return (Criteria) this;
        }

        public Criteria andAcaScoreNotEqualTo(String value) {
            addCriterion("Aca_Score <>", value, "acaScore");
            return (Criteria) this;
        }

        public Criteria andAcaScoreGreaterThan(String value) {
            addCriterion("Aca_Score >", value, "acaScore");
            return (Criteria) this;
        }

        public Criteria andAcaScoreGreaterThanOrEqualTo(String value) {
            addCriterion("Aca_Score >=", value, "acaScore");
            return (Criteria) this;
        }

        public Criteria andAcaScoreLessThan(String value) {
            addCriterion("Aca_Score <", value, "acaScore");
            return (Criteria) this;
        }

        public Criteria andAcaScoreLessThanOrEqualTo(String value) {
            addCriterion("Aca_Score <=", value, "acaScore");
            return (Criteria) this;
        }

        public Criteria andAcaScoreLike(String value) {
            addCriterion("Aca_Score like", value, "acaScore");
            return (Criteria) this;
        }

        public Criteria andAcaScoreNotLike(String value) {
            addCriterion("Aca_Score not like", value, "acaScore");
            return (Criteria) this;
        }

        public Criteria andAcaScoreIn(List<String> values) {
            addCriterion("Aca_Score in", values, "acaScore");
            return (Criteria) this;
        }

        public Criteria andAcaScoreNotIn(List<String> values) {
            addCriterion("Aca_Score not in", values, "acaScore");
            return (Criteria) this;
        }

        public Criteria andAcaScoreBetween(String value1, String value2) {
            addCriterion("Aca_Score between", value1, value2, "acaScore");
            return (Criteria) this;
        }

        public Criteria andAcaScoreNotBetween(String value1, String value2) {
            addCriterion("Aca_Score not between", value1, value2, "acaScore");
            return (Criteria) this;
        }

        public Criteria andAlltestLevelIsNull() {
            addCriterion("AllTest_Level is null");
            return (Criteria) this;
        }

        public Criteria andAlltestLevelIsNotNull() {
            addCriterion("AllTest_Level is not null");
            return (Criteria) this;
        }

        public Criteria andAlltestLevelEqualTo(String value) {
            addCriterion("AllTest_Level =", value, "alltestLevel");
            return (Criteria) this;
        }

        public Criteria andAlltestLevelNotEqualTo(String value) {
            addCriterion("AllTest_Level <>", value, "alltestLevel");
            return (Criteria) this;
        }

        public Criteria andAlltestLevelGreaterThan(String value) {
            addCriterion("AllTest_Level >", value, "alltestLevel");
            return (Criteria) this;
        }

        public Criteria andAlltestLevelGreaterThanOrEqualTo(String value) {
            addCriterion("AllTest_Level >=", value, "alltestLevel");
            return (Criteria) this;
        }

        public Criteria andAlltestLevelLessThan(String value) {
            addCriterion("AllTest_Level <", value, "alltestLevel");
            return (Criteria) this;
        }

        public Criteria andAlltestLevelLessThanOrEqualTo(String value) {
            addCriterion("AllTest_Level <=", value, "alltestLevel");
            return (Criteria) this;
        }

        public Criteria andAlltestLevelLike(String value) {
            addCriterion("AllTest_Level like", value, "alltestLevel");
            return (Criteria) this;
        }

        public Criteria andAlltestLevelNotLike(String value) {
            addCriterion("AllTest_Level not like", value, "alltestLevel");
            return (Criteria) this;
        }

        public Criteria andAlltestLevelIn(List<String> values) {
            addCriterion("AllTest_Level in", values, "alltestLevel");
            return (Criteria) this;
        }

        public Criteria andAlltestLevelNotIn(List<String> values) {
            addCriterion("AllTest_Level not in", values, "alltestLevel");
            return (Criteria) this;
        }

        public Criteria andAlltestLevelBetween(String value1, String value2) {
            addCriterion("AllTest_Level between", value1, value2, "alltestLevel");
            return (Criteria) this;
        }

        public Criteria andAlltestLevelNotBetween(String value1, String value2) {
            addCriterion("AllTest_Level not between", value1, value2, "alltestLevel");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("Phone_Number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("Phone_Number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("Phone_Number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("Phone_Number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("Phone_Number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Phone_Number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("Phone_Number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("Phone_Number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("Phone_Number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("Phone_Number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("Phone_Number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("Phone_Number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("Phone_Number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("Phone_Number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andScEmailIsNull() {
            addCriterion("Sc_Email is null");
            return (Criteria) this;
        }

        public Criteria andScEmailIsNotNull() {
            addCriterion("Sc_Email is not null");
            return (Criteria) this;
        }

        public Criteria andScEmailEqualTo(String value) {
            addCriterion("Sc_Email =", value, "scEmail");
            return (Criteria) this;
        }

        public Criteria andScEmailNotEqualTo(String value) {
            addCriterion("Sc_Email <>", value, "scEmail");
            return (Criteria) this;
        }

        public Criteria andScEmailGreaterThan(String value) {
            addCriterion("Sc_Email >", value, "scEmail");
            return (Criteria) this;
        }

        public Criteria andScEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Sc_Email >=", value, "scEmail");
            return (Criteria) this;
        }

        public Criteria andScEmailLessThan(String value) {
            addCriterion("Sc_Email <", value, "scEmail");
            return (Criteria) this;
        }

        public Criteria andScEmailLessThanOrEqualTo(String value) {
            addCriterion("Sc_Email <=", value, "scEmail");
            return (Criteria) this;
        }

        public Criteria andScEmailLike(String value) {
            addCriterion("Sc_Email like", value, "scEmail");
            return (Criteria) this;
        }

        public Criteria andScEmailNotLike(String value) {
            addCriterion("Sc_Email not like", value, "scEmail");
            return (Criteria) this;
        }

        public Criteria andScEmailIn(List<String> values) {
            addCriterion("Sc_Email in", values, "scEmail");
            return (Criteria) this;
        }

        public Criteria andScEmailNotIn(List<String> values) {
            addCriterion("Sc_Email not in", values, "scEmail");
            return (Criteria) this;
        }

        public Criteria andScEmailBetween(String value1, String value2) {
            addCriterion("Sc_Email between", value1, value2, "scEmail");
            return (Criteria) this;
        }

        public Criteria andScEmailNotBetween(String value1, String value2) {
            addCriterion("Sc_Email not between", value1, value2, "scEmail");
            return (Criteria) this;
        }

        public Criteria andScAddressIsNull() {
            addCriterion("Sc_Address is null");
            return (Criteria) this;
        }

        public Criteria andScAddressIsNotNull() {
            addCriterion("Sc_Address is not null");
            return (Criteria) this;
        }

        public Criteria andScAddressEqualTo(String value) {
            addCriterion("Sc_Address =", value, "scAddress");
            return (Criteria) this;
        }

        public Criteria andScAddressNotEqualTo(String value) {
            addCriterion("Sc_Address <>", value, "scAddress");
            return (Criteria) this;
        }

        public Criteria andScAddressGreaterThan(String value) {
            addCriterion("Sc_Address >", value, "scAddress");
            return (Criteria) this;
        }

        public Criteria andScAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Sc_Address >=", value, "scAddress");
            return (Criteria) this;
        }

        public Criteria andScAddressLessThan(String value) {
            addCriterion("Sc_Address <", value, "scAddress");
            return (Criteria) this;
        }

        public Criteria andScAddressLessThanOrEqualTo(String value) {
            addCriterion("Sc_Address <=", value, "scAddress");
            return (Criteria) this;
        }

        public Criteria andScAddressLike(String value) {
            addCriterion("Sc_Address like", value, "scAddress");
            return (Criteria) this;
        }

        public Criteria andScAddressNotLike(String value) {
            addCriterion("Sc_Address not like", value, "scAddress");
            return (Criteria) this;
        }

        public Criteria andScAddressIn(List<String> values) {
            addCriterion("Sc_Address in", values, "scAddress");
            return (Criteria) this;
        }

        public Criteria andScAddressNotIn(List<String> values) {
            addCriterion("Sc_Address not in", values, "scAddress");
            return (Criteria) this;
        }

        public Criteria andScAddressBetween(String value1, String value2) {
            addCriterion("Sc_Address between", value1, value2, "scAddress");
            return (Criteria) this;
        }

        public Criteria andScAddressNotBetween(String value1, String value2) {
            addCriterion("Sc_Address not between", value1, value2, "scAddress");
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