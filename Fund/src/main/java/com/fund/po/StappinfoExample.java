package com.fund.po;

import java.util.ArrayList;
import java.util.List;

public class StappinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StappinfoExample() {
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

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andStCaseIsNull() {
            addCriterion("St_Case is null");
            return (Criteria) this;
        }

        public Criteria andStCaseIsNotNull() {
            addCriterion("St_Case is not null");
            return (Criteria) this;
        }

        public Criteria andStCaseEqualTo(String value) {
            addCriterion("St_Case =", value, "stCase");
            return (Criteria) this;
        }

        public Criteria andStCaseNotEqualTo(String value) {
            addCriterion("St_Case <>", value, "stCase");
            return (Criteria) this;
        }

        public Criteria andStCaseGreaterThan(String value) {
            addCriterion("St_Case >", value, "stCase");
            return (Criteria) this;
        }

        public Criteria andStCaseGreaterThanOrEqualTo(String value) {
            addCriterion("St_Case >=", value, "stCase");
            return (Criteria) this;
        }

        public Criteria andStCaseLessThan(String value) {
            addCriterion("St_Case <", value, "stCase");
            return (Criteria) this;
        }

        public Criteria andStCaseLessThanOrEqualTo(String value) {
            addCriterion("St_Case <=", value, "stCase");
            return (Criteria) this;
        }

        public Criteria andStCaseLike(String value) {
            addCriterion("St_Case like", value, "stCase");
            return (Criteria) this;
        }

        public Criteria andStCaseNotLike(String value) {
            addCriterion("St_Case not like", value, "stCase");
            return (Criteria) this;
        }

        public Criteria andStCaseIn(List<String> values) {
            addCriterion("St_Case in", values, "stCase");
            return (Criteria) this;
        }

        public Criteria andStCaseNotIn(List<String> values) {
            addCriterion("St_Case not in", values, "stCase");
            return (Criteria) this;
        }

        public Criteria andStCaseBetween(String value1, String value2) {
            addCriterion("St_Case between", value1, value2, "stCase");
            return (Criteria) this;
        }

        public Criteria andStCaseNotBetween(String value1, String value2) {
            addCriterion("St_Case not between", value1, value2, "stCase");
            return (Criteria) this;
        }

        public Criteria andViewClassIsNull() {
            addCriterion("View_Class is null");
            return (Criteria) this;
        }

        public Criteria andViewClassIsNotNull() {
            addCriterion("View_Class is not null");
            return (Criteria) this;
        }

        public Criteria andViewClassEqualTo(String value) {
            addCriterion("View_Class =", value, "viewClass");
            return (Criteria) this;
        }

        public Criteria andViewClassNotEqualTo(String value) {
            addCriterion("View_Class <>", value, "viewClass");
            return (Criteria) this;
        }

        public Criteria andViewClassGreaterThan(String value) {
            addCriterion("View_Class >", value, "viewClass");
            return (Criteria) this;
        }

        public Criteria andViewClassGreaterThanOrEqualTo(String value) {
            addCriterion("View_Class >=", value, "viewClass");
            return (Criteria) this;
        }

        public Criteria andViewClassLessThan(String value) {
            addCriterion("View_Class <", value, "viewClass");
            return (Criteria) this;
        }

        public Criteria andViewClassLessThanOrEqualTo(String value) {
            addCriterion("View_Class <=", value, "viewClass");
            return (Criteria) this;
        }

        public Criteria andViewClassLike(String value) {
            addCriterion("View_Class like", value, "viewClass");
            return (Criteria) this;
        }

        public Criteria andViewClassNotLike(String value) {
            addCriterion("View_Class not like", value, "viewClass");
            return (Criteria) this;
        }

        public Criteria andViewClassIn(List<String> values) {
            addCriterion("View_Class in", values, "viewClass");
            return (Criteria) this;
        }

        public Criteria andViewClassNotIn(List<String> values) {
            addCriterion("View_Class not in", values, "viewClass");
            return (Criteria) this;
        }

        public Criteria andViewClassBetween(String value1, String value2) {
            addCriterion("View_Class between", value1, value2, "viewClass");
            return (Criteria) this;
        }

        public Criteria andViewClassNotBetween(String value1, String value2) {
            addCriterion("View_Class not between", value1, value2, "viewClass");
            return (Criteria) this;
        }

        public Criteria andViewInstituteIsNull() {
            addCriterion("View_Institute is null");
            return (Criteria) this;
        }

        public Criteria andViewInstituteIsNotNull() {
            addCriterion("View_Institute is not null");
            return (Criteria) this;
        }

        public Criteria andViewInstituteEqualTo(String value) {
            addCriterion("View_Institute =", value, "viewInstitute");
            return (Criteria) this;
        }

        public Criteria andViewInstituteNotEqualTo(String value) {
            addCriterion("View_Institute <>", value, "viewInstitute");
            return (Criteria) this;
        }

        public Criteria andViewInstituteGreaterThan(String value) {
            addCriterion("View_Institute >", value, "viewInstitute");
            return (Criteria) this;
        }

        public Criteria andViewInstituteGreaterThanOrEqualTo(String value) {
            addCriterion("View_Institute >=", value, "viewInstitute");
            return (Criteria) this;
        }

        public Criteria andViewInstituteLessThan(String value) {
            addCriterion("View_Institute <", value, "viewInstitute");
            return (Criteria) this;
        }

        public Criteria andViewInstituteLessThanOrEqualTo(String value) {
            addCriterion("View_Institute <=", value, "viewInstitute");
            return (Criteria) this;
        }

        public Criteria andViewInstituteLike(String value) {
            addCriterion("View_Institute like", value, "viewInstitute");
            return (Criteria) this;
        }

        public Criteria andViewInstituteNotLike(String value) {
            addCriterion("View_Institute not like", value, "viewInstitute");
            return (Criteria) this;
        }

        public Criteria andViewInstituteIn(List<String> values) {
            addCriterion("View_Institute in", values, "viewInstitute");
            return (Criteria) this;
        }

        public Criteria andViewInstituteNotIn(List<String> values) {
            addCriterion("View_Institute not in", values, "viewInstitute");
            return (Criteria) this;
        }

        public Criteria andViewInstituteBetween(String value1, String value2) {
            addCriterion("View_Institute between", value1, value2, "viewInstitute");
            return (Criteria) this;
        }

        public Criteria andViewInstituteNotBetween(String value1, String value2) {
            addCriterion("View_Institute not between", value1, value2, "viewInstitute");
            return (Criteria) this;
        }

        public Criteria andViewJudgeIsNull() {
            addCriterion("View_Judge is null");
            return (Criteria) this;
        }

        public Criteria andViewJudgeIsNotNull() {
            addCriterion("View_Judge is not null");
            return (Criteria) this;
        }

        public Criteria andViewJudgeEqualTo(String value) {
            addCriterion("View_Judge =", value, "viewJudge");
            return (Criteria) this;
        }

        public Criteria andViewJudgeNotEqualTo(String value) {
            addCriterion("View_Judge <>", value, "viewJudge");
            return (Criteria) this;
        }

        public Criteria andViewJudgeGreaterThan(String value) {
            addCriterion("View_Judge >", value, "viewJudge");
            return (Criteria) this;
        }

        public Criteria andViewJudgeGreaterThanOrEqualTo(String value) {
            addCriterion("View_Judge >=", value, "viewJudge");
            return (Criteria) this;
        }

        public Criteria andViewJudgeLessThan(String value) {
            addCriterion("View_Judge <", value, "viewJudge");
            return (Criteria) this;
        }

        public Criteria andViewJudgeLessThanOrEqualTo(String value) {
            addCriterion("View_Judge <=", value, "viewJudge");
            return (Criteria) this;
        }

        public Criteria andViewJudgeLike(String value) {
            addCriterion("View_Judge like", value, "viewJudge");
            return (Criteria) this;
        }

        public Criteria andViewJudgeNotLike(String value) {
            addCriterion("View_Judge not like", value, "viewJudge");
            return (Criteria) this;
        }

        public Criteria andViewJudgeIn(List<String> values) {
            addCriterion("View_Judge in", values, "viewJudge");
            return (Criteria) this;
        }

        public Criteria andViewJudgeNotIn(List<String> values) {
            addCriterion("View_Judge not in", values, "viewJudge");
            return (Criteria) this;
        }

        public Criteria andViewJudgeBetween(String value1, String value2) {
            addCriterion("View_Judge between", value1, value2, "viewJudge");
            return (Criteria) this;
        }

        public Criteria andViewJudgeNotBetween(String value1, String value2) {
            addCriterion("View_Judge not between", value1, value2, "viewJudge");
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