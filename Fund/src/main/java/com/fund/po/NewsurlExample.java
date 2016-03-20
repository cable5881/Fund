package com.fund.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsurlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsurlExample() {
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

        public Criteria andNewsurlIdIsNull() {
            addCriterion("NewsURL_Id is null");
            return (Criteria) this;
        }

        public Criteria andNewsurlIdIsNotNull() {
            addCriterion("NewsURL_Id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsurlIdEqualTo(Integer value) {
            addCriterion("NewsURL_Id =", value, "newsurlId");
            return (Criteria) this;
        }

        public Criteria andNewsurlIdNotEqualTo(Integer value) {
            addCriterion("NewsURL_Id <>", value, "newsurlId");
            return (Criteria) this;
        }

        public Criteria andNewsurlIdGreaterThan(Integer value) {
            addCriterion("NewsURL_Id >", value, "newsurlId");
            return (Criteria) this;
        }

        public Criteria andNewsurlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewsURL_Id >=", value, "newsurlId");
            return (Criteria) this;
        }

        public Criteria andNewsurlIdLessThan(Integer value) {
            addCriterion("NewsURL_Id <", value, "newsurlId");
            return (Criteria) this;
        }

        public Criteria andNewsurlIdLessThanOrEqualTo(Integer value) {
            addCriterion("NewsURL_Id <=", value, "newsurlId");
            return (Criteria) this;
        }

        public Criteria andNewsurlIdIn(List<Integer> values) {
            addCriterion("NewsURL_Id in", values, "newsurlId");
            return (Criteria) this;
        }

        public Criteria andNewsurlIdNotIn(List<Integer> values) {
            addCriterion("NewsURL_Id not in", values, "newsurlId");
            return (Criteria) this;
        }

        public Criteria andNewsurlIdBetween(Integer value1, Integer value2) {
            addCriterion("NewsURL_Id between", value1, value2, "newsurlId");
            return (Criteria) this;
        }

        public Criteria andNewsurlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NewsURL_Id not between", value1, value2, "newsurlId");
            return (Criteria) this;
        }

        public Criteria andNewstypeIdIsNull() {
            addCriterion("NewsType_Id is null");
            return (Criteria) this;
        }

        public Criteria andNewstypeIdIsNotNull() {
            addCriterion("NewsType_Id is not null");
            return (Criteria) this;
        }

        public Criteria andNewstypeIdEqualTo(Integer value) {
            addCriterion("NewsType_Id =", value, "newstypeId");
            return (Criteria) this;
        }

        public Criteria andNewstypeIdNotEqualTo(Integer value) {
            addCriterion("NewsType_Id <>", value, "newstypeId");
            return (Criteria) this;
        }

        public Criteria andNewstypeIdGreaterThan(Integer value) {
            addCriterion("NewsType_Id >", value, "newstypeId");
            return (Criteria) this;
        }

        public Criteria andNewstypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewsType_Id >=", value, "newstypeId");
            return (Criteria) this;
        }

        public Criteria andNewstypeIdLessThan(Integer value) {
            addCriterion("NewsType_Id <", value, "newstypeId");
            return (Criteria) this;
        }

        public Criteria andNewstypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("NewsType_Id <=", value, "newstypeId");
            return (Criteria) this;
        }

        public Criteria andNewstypeIdIn(List<Integer> values) {
            addCriterion("NewsType_Id in", values, "newstypeId");
            return (Criteria) this;
        }

        public Criteria andNewstypeIdNotIn(List<Integer> values) {
            addCriterion("NewsType_Id not in", values, "newstypeId");
            return (Criteria) this;
        }

        public Criteria andNewstypeIdBetween(Integer value1, Integer value2) {
            addCriterion("NewsType_Id between", value1, value2, "newstypeId");
            return (Criteria) this;
        }

        public Criteria andNewstypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NewsType_Id not between", value1, value2, "newstypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNull() {
            addCriterion("News_Title is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("News_Title is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("News_Title =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("News_Title <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("News_Title >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("News_Title >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("News_Title <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("News_Title <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("News_Title like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("News_Title not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("News_Title in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("News_Title not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("News_Title between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("News_Title not between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andLaunchUrlIsNull() {
            addCriterion("Launch_URL is null");
            return (Criteria) this;
        }

        public Criteria andLaunchUrlIsNotNull() {
            addCriterion("Launch_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLaunchUrlEqualTo(String value) {
            addCriterion("Launch_URL =", value, "launchUrl");
            return (Criteria) this;
        }

        public Criteria andLaunchUrlNotEqualTo(String value) {
            addCriterion("Launch_URL <>", value, "launchUrl");
            return (Criteria) this;
        }

        public Criteria andLaunchUrlGreaterThan(String value) {
            addCriterion("Launch_URL >", value, "launchUrl");
            return (Criteria) this;
        }

        public Criteria andLaunchUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Launch_URL >=", value, "launchUrl");
            return (Criteria) this;
        }

        public Criteria andLaunchUrlLessThan(String value) {
            addCriterion("Launch_URL <", value, "launchUrl");
            return (Criteria) this;
        }

        public Criteria andLaunchUrlLessThanOrEqualTo(String value) {
            addCriterion("Launch_URL <=", value, "launchUrl");
            return (Criteria) this;
        }

        public Criteria andLaunchUrlLike(String value) {
            addCriterion("Launch_URL like", value, "launchUrl");
            return (Criteria) this;
        }

        public Criteria andLaunchUrlNotLike(String value) {
            addCriterion("Launch_URL not like", value, "launchUrl");
            return (Criteria) this;
        }

        public Criteria andLaunchUrlIn(List<String> values) {
            addCriterion("Launch_URL in", values, "launchUrl");
            return (Criteria) this;
        }

        public Criteria andLaunchUrlNotIn(List<String> values) {
            addCriterion("Launch_URL not in", values, "launchUrl");
            return (Criteria) this;
        }

        public Criteria andLaunchUrlBetween(String value1, String value2) {
            addCriterion("Launch_URL between", value1, value2, "launchUrl");
            return (Criteria) this;
        }

        public Criteria andLaunchUrlNotBetween(String value1, String value2) {
            addCriterion("Launch_URL not between", value1, value2, "launchUrl");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("Upload_Time is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("Upload_Time is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(Date value) {
            addCriterion("Upload_Time =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(Date value) {
            addCriterion("Upload_Time <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(Date value) {
            addCriterion("Upload_Time >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Upload_Time >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(Date value) {
            addCriterion("Upload_Time <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("Upload_Time <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<Date> values) {
            addCriterion("Upload_Time in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<Date> values) {
            addCriterion("Upload_Time not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(Date value1, Date value2) {
            addCriterion("Upload_Time between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("Upload_Time not between", value1, value2, "uploadTime");
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