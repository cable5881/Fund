package com.fund.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BonusnoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BonusnoticeExample() {
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

        public Criteria andBonusnoticeIdIsNull() {
            addCriterion("BonusNotice_Id is null");
            return (Criteria) this;
        }

        public Criteria andBonusnoticeIdIsNotNull() {
            addCriterion("BonusNotice_Id is not null");
            return (Criteria) this;
        }

        public Criteria andBonusnoticeIdEqualTo(Integer value) {
            addCriterion("BonusNotice_Id =", value, "bonusnoticeId");
            return (Criteria) this;
        }

        public Criteria andBonusnoticeIdNotEqualTo(Integer value) {
            addCriterion("BonusNotice_Id <>", value, "bonusnoticeId");
            return (Criteria) this;
        }

        public Criteria andBonusnoticeIdGreaterThan(Integer value) {
            addCriterion("BonusNotice_Id >", value, "bonusnoticeId");
            return (Criteria) this;
        }

        public Criteria andBonusnoticeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BonusNotice_Id >=", value, "bonusnoticeId");
            return (Criteria) this;
        }

        public Criteria andBonusnoticeIdLessThan(Integer value) {
            addCriterion("BonusNotice_Id <", value, "bonusnoticeId");
            return (Criteria) this;
        }

        public Criteria andBonusnoticeIdLessThanOrEqualTo(Integer value) {
            addCriterion("BonusNotice_Id <=", value, "bonusnoticeId");
            return (Criteria) this;
        }

        public Criteria andBonusnoticeIdIn(List<Integer> values) {
            addCriterion("BonusNotice_Id in", values, "bonusnoticeId");
            return (Criteria) this;
        }

        public Criteria andBonusnoticeIdNotIn(List<Integer> values) {
            addCriterion("BonusNotice_Id not in", values, "bonusnoticeId");
            return (Criteria) this;
        }

        public Criteria andBonusnoticeIdBetween(Integer value1, Integer value2) {
            addCriterion("BonusNotice_Id between", value1, value2, "bonusnoticeId");
            return (Criteria) this;
        }

        public Criteria andBonusnoticeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BonusNotice_Id not between", value1, value2, "bonusnoticeId");
            return (Criteria) this;
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

        public Criteria andStartDateIsNull() {
            addCriterion("Start_Date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("Start_Date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("Start_Date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("Start_Date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("Start_Date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Start_Date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("Start_Date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("Start_Date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("Start_Date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("Start_Date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("Start_Date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("Start_Date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("End_Date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("End_Date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("End_Date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("End_Date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("End_Date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("End_Date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("End_Date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("End_Date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("End_Date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("End_Date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("End_Date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("End_Date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andJudgeWayIsNull() {
            addCriterion("Judge_Way is null");
            return (Criteria) this;
        }

        public Criteria andJudgeWayIsNotNull() {
            addCriterion("Judge_Way is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeWayEqualTo(Byte value) {
            addCriterion("Judge_Way =", value, "judgeWay");
            return (Criteria) this;
        }

        public Criteria andJudgeWayNotEqualTo(Byte value) {
            addCriterion("Judge_Way <>", value, "judgeWay");
            return (Criteria) this;
        }

        public Criteria andJudgeWayGreaterThan(Byte value) {
            addCriterion("Judge_Way >", value, "judgeWay");
            return (Criteria) this;
        }

        public Criteria andJudgeWayGreaterThanOrEqualTo(Byte value) {
            addCriterion("Judge_Way >=", value, "judgeWay");
            return (Criteria) this;
        }

        public Criteria andJudgeWayLessThan(Byte value) {
            addCriterion("Judge_Way <", value, "judgeWay");
            return (Criteria) this;
        }

        public Criteria andJudgeWayLessThanOrEqualTo(Byte value) {
            addCriterion("Judge_Way <=", value, "judgeWay");
            return (Criteria) this;
        }

        public Criteria andJudgeWayIn(List<Byte> values) {
            addCriterion("Judge_Way in", values, "judgeWay");
            return (Criteria) this;
        }

        public Criteria andJudgeWayNotIn(List<Byte> values) {
            addCriterion("Judge_Way not in", values, "judgeWay");
            return (Criteria) this;
        }

        public Criteria andJudgeWayBetween(Byte value1, Byte value2) {
            addCriterion("Judge_Way between", value1, value2, "judgeWay");
            return (Criteria) this;
        }

        public Criteria andJudgeWayNotBetween(Byte value1, Byte value2) {
            addCriterion("Judge_Way not between", value1, value2, "judgeWay");
            return (Criteria) this;
        }

        public Criteria andJudgeStateIsNull() {
            addCriterion("Judge_State is null");
            return (Criteria) this;
        }

        public Criteria andJudgeStateIsNotNull() {
            addCriterion("Judge_State is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeStateEqualTo(Byte value) {
            addCriterion("Judge_State =", value, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateNotEqualTo(Byte value) {
            addCriterion("Judge_State <>", value, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateGreaterThan(Byte value) {
            addCriterion("Judge_State >", value, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("Judge_State >=", value, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateLessThan(Byte value) {
            addCriterion("Judge_State <", value, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateLessThanOrEqualTo(Byte value) {
            addCriterion("Judge_State <=", value, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateIn(List<Byte> values) {
            addCriterion("Judge_State in", values, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateNotIn(List<Byte> values) {
            addCriterion("Judge_State not in", values, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateBetween(Byte value1, Byte value2) {
            addCriterion("Judge_State between", value1, value2, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateNotBetween(Byte value1, Byte value2) {
            addCriterion("Judge_State not between", value1, value2, "judgeState");
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