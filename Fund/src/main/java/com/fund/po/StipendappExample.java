package com.fund.po;

import java.util.ArrayList;
import java.util.List;

public class StipendappExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StipendappExample() {
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

        public Criteria andStipendappIdIsNull() {
            addCriterion("StipendApp_Id is null");
            return (Criteria) this;
        }

        public Criteria andStipendappIdIsNotNull() {
            addCriterion("StipendApp_Id is not null");
            return (Criteria) this;
        }

        public Criteria andStipendappIdEqualTo(Integer value) {
            addCriterion("StipendApp_Id =", value, "stipendappId");
            return (Criteria) this;
        }

        public Criteria andStipendappIdNotEqualTo(Integer value) {
            addCriterion("StipendApp_Id <>", value, "stipendappId");
            return (Criteria) this;
        }

        public Criteria andStipendappIdGreaterThan(Integer value) {
            addCriterion("StipendApp_Id >", value, "stipendappId");
            return (Criteria) this;
        }

        public Criteria andStipendappIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("StipendApp_Id >=", value, "stipendappId");
            return (Criteria) this;
        }

        public Criteria andStipendappIdLessThan(Integer value) {
            addCriterion("StipendApp_Id <", value, "stipendappId");
            return (Criteria) this;
        }

        public Criteria andStipendappIdLessThanOrEqualTo(Integer value) {
            addCriterion("StipendApp_Id <=", value, "stipendappId");
            return (Criteria) this;
        }

        public Criteria andStipendappIdIn(List<Integer> values) {
            addCriterion("StipendApp_Id in", values, "stipendappId");
            return (Criteria) this;
        }

        public Criteria andStipendappIdNotIn(List<Integer> values) {
            addCriterion("StipendApp_Id not in", values, "stipendappId");
            return (Criteria) this;
        }

        public Criteria andStipendappIdBetween(Integer value1, Integer value2) {
            addCriterion("StipendApp_Id between", value1, value2, "stipendappId");
            return (Criteria) this;
        }

        public Criteria andStipendappIdNotBetween(Integer value1, Integer value2) {
            addCriterion("StipendApp_Id not between", value1, value2, "stipendappId");
            return (Criteria) this;
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

        public Criteria andStuNumIsNull() {
            addCriterion("Stu_Num is null");
            return (Criteria) this;
        }

        public Criteria andStuNumIsNotNull() {
            addCriterion("Stu_Num is not null");
            return (Criteria) this;
        }

        public Criteria andStuNumEqualTo(String value) {
            addCriterion("Stu_Num =", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotEqualTo(String value) {
            addCriterion("Stu_Num <>", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumGreaterThan(String value) {
            addCriterion("Stu_Num >", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumGreaterThanOrEqualTo(String value) {
            addCriterion("Stu_Num >=", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumLessThan(String value) {
            addCriterion("Stu_Num <", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumLessThanOrEqualTo(String value) {
            addCriterion("Stu_Num <=", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumLike(String value) {
            addCriterion("Stu_Num like", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotLike(String value) {
            addCriterion("Stu_Num not like", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumIn(List<String> values) {
            addCriterion("Stu_Num in", values, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotIn(List<String> values) {
            addCriterion("Stu_Num not in", values, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumBetween(String value1, String value2) {
            addCriterion("Stu_Num between", value1, value2, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotBetween(String value1, String value2) {
            addCriterion("Stu_Num not between", value1, value2, "stuNum");
            return (Criteria) this;
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

        public Criteria andStappinfoIdIsNull() {
            addCriterion("StAppInfo_Id is null");
            return (Criteria) this;
        }

        public Criteria andStappinfoIdIsNotNull() {
            addCriterion("StAppInfo_Id is not null");
            return (Criteria) this;
        }

        public Criteria andStappinfoIdEqualTo(Integer value) {
            addCriterion("StAppInfo_Id =", value, "stappinfoId");
            return (Criteria) this;
        }

        public Criteria andStappinfoIdNotEqualTo(Integer value) {
            addCriterion("StAppInfo_Id <>", value, "stappinfoId");
            return (Criteria) this;
        }

        public Criteria andStappinfoIdGreaterThan(Integer value) {
            addCriterion("StAppInfo_Id >", value, "stappinfoId");
            return (Criteria) this;
        }

        public Criteria andStappinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("StAppInfo_Id >=", value, "stappinfoId");
            return (Criteria) this;
        }

        public Criteria andStappinfoIdLessThan(Integer value) {
            addCriterion("StAppInfo_Id <", value, "stappinfoId");
            return (Criteria) this;
        }

        public Criteria andStappinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("StAppInfo_Id <=", value, "stappinfoId");
            return (Criteria) this;
        }

        public Criteria andStappinfoIdIn(List<Integer> values) {
            addCriterion("StAppInfo_Id in", values, "stappinfoId");
            return (Criteria) this;
        }

        public Criteria andStappinfoIdNotIn(List<Integer> values) {
            addCriterion("StAppInfo_Id not in", values, "stappinfoId");
            return (Criteria) this;
        }

        public Criteria andStappinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("StAppInfo_Id between", value1, value2, "stappinfoId");
            return (Criteria) this;
        }

        public Criteria andStappinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("StAppInfo_Id not between", value1, value2, "stappinfoId");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("File_Id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("File_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Integer value) {
            addCriterion("File_Id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Integer value) {
            addCriterion("File_Id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Integer value) {
            addCriterion("File_Id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("File_Id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Integer value) {
            addCriterion("File_Id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("File_Id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Integer> values) {
            addCriterion("File_Id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Integer> values) {
            addCriterion("File_Id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Integer value1, Integer value2) {
            addCriterion("File_Id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("File_Id not between", value1, value2, "fileId");
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