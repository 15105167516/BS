package com.suke.communitymanage.bean;

import java.util.ArrayList;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActivityThemeIsNull() {
            addCriterion("activity_theme is null");
            return (Criteria) this;
        }

        public Criteria andActivityThemeIsNotNull() {
            addCriterion("activity_theme is not null");
            return (Criteria) this;
        }

        public Criteria andActivityThemeEqualTo(String value) {
            addCriterion("activity_theme =", value, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeNotEqualTo(String value) {
            addCriterion("activity_theme <>", value, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeGreaterThan(String value) {
            addCriterion("activity_theme >", value, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_theme >=", value, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeLessThan(String value) {
            addCriterion("activity_theme <", value, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeLessThanOrEqualTo(String value) {
            addCriterion("activity_theme <=", value, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeLike(String value) {
            addCriterion("activity_theme like", value, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeNotLike(String value) {
            addCriterion("activity_theme not like", value, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeIn(List<String> values) {
            addCriterion("activity_theme in", values, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeNotIn(List<String> values) {
            addCriterion("activity_theme not in", values, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeBetween(String value1, String value2) {
            addCriterion("activity_theme between", value1, value2, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeNotBetween(String value1, String value2) {
            addCriterion("activity_theme not between", value1, value2, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionIsNull() {
            addCriterion("activity_introduction is null");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionIsNotNull() {
            addCriterion("activity_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionEqualTo(String value) {
            addCriterion("activity_introduction =", value, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionNotEqualTo(String value) {
            addCriterion("activity_introduction <>", value, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionGreaterThan(String value) {
            addCriterion("activity_introduction >", value, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("activity_introduction >=", value, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionLessThan(String value) {
            addCriterion("activity_introduction <", value, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionLessThanOrEqualTo(String value) {
            addCriterion("activity_introduction <=", value, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionLike(String value) {
            addCriterion("activity_introduction like", value, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionNotLike(String value) {
            addCriterion("activity_introduction not like", value, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionIn(List<String> values) {
            addCriterion("activity_introduction in", values, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionNotIn(List<String> values) {
            addCriterion("activity_introduction not in", values, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionBetween(String value1, String value2) {
            addCriterion("activity_introduction between", value1, value2, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionNotBetween(String value1, String value2) {
            addCriterion("activity_introduction not between", value1, value2, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActPeopleCountIsNull() {
            addCriterion("act_people_count is null");
            return (Criteria) this;
        }

        public Criteria andActPeopleCountIsNotNull() {
            addCriterion("act_people_count is not null");
            return (Criteria) this;
        }

        public Criteria andActPeopleCountEqualTo(Integer value) {
            addCriterion("act_people_count =", value, "actPeopleCount");
            return (Criteria) this;
        }

        public Criteria andActPeopleCountNotEqualTo(Integer value) {
            addCriterion("act_people_count <>", value, "actPeopleCount");
            return (Criteria) this;
        }

        public Criteria andActPeopleCountGreaterThan(Integer value) {
            addCriterion("act_people_count >", value, "actPeopleCount");
            return (Criteria) this;
        }

        public Criteria andActPeopleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_people_count >=", value, "actPeopleCount");
            return (Criteria) this;
        }

        public Criteria andActPeopleCountLessThan(Integer value) {
            addCriterion("act_people_count <", value, "actPeopleCount");
            return (Criteria) this;
        }

        public Criteria andActPeopleCountLessThanOrEqualTo(Integer value) {
            addCriterion("act_people_count <=", value, "actPeopleCount");
            return (Criteria) this;
        }

        public Criteria andActPeopleCountIn(List<Integer> values) {
            addCriterion("act_people_count in", values, "actPeopleCount");
            return (Criteria) this;
        }

        public Criteria andActPeopleCountNotIn(List<Integer> values) {
            addCriterion("act_people_count not in", values, "actPeopleCount");
            return (Criteria) this;
        }

        public Criteria andActPeopleCountBetween(Integer value1, Integer value2) {
            addCriterion("act_people_count between", value1, value2, "actPeopleCount");
            return (Criteria) this;
        }

        public Criteria andActPeopleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("act_people_count not between", value1, value2, "actPeopleCount");
            return (Criteria) this;
        }

        public Criteria andActivityAddressIsNull() {
            addCriterion("activity_address is null");
            return (Criteria) this;
        }

        public Criteria andActivityAddressIsNotNull() {
            addCriterion("activity_address is not null");
            return (Criteria) this;
        }

        public Criteria andActivityAddressEqualTo(String value) {
            addCriterion("activity_address =", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotEqualTo(String value) {
            addCriterion("activity_address <>", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressGreaterThan(String value) {
            addCriterion("activity_address >", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressGreaterThanOrEqualTo(String value) {
            addCriterion("activity_address >=", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressLessThan(String value) {
            addCriterion("activity_address <", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressLessThanOrEqualTo(String value) {
            addCriterion("activity_address <=", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressLike(String value) {
            addCriterion("activity_address like", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotLike(String value) {
            addCriterion("activity_address not like", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressIn(List<String> values) {
            addCriterion("activity_address in", values, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotIn(List<String> values) {
            addCriterion("activity_address not in", values, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressBetween(String value1, String value2) {
            addCriterion("activity_address between", value1, value2, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotBetween(String value1, String value2) {
            addCriterion("activity_address not between", value1, value2, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityStartOverTimeIsNull() {
            addCriterion("activity_start_over_time is null");
            return (Criteria) this;
        }

        public Criteria andActivityStartOverTimeIsNotNull() {
            addCriterion("activity_start_over_time is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStartOverTimeEqualTo(String value) {
            addCriterion("activity_start_over_time =", value, "activityStartOverTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartOverTimeNotEqualTo(String value) {
            addCriterion("activity_start_over_time <>", value, "activityStartOverTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartOverTimeGreaterThan(String value) {
            addCriterion("activity_start_over_time >", value, "activityStartOverTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartOverTimeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_start_over_time >=", value, "activityStartOverTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartOverTimeLessThan(String value) {
            addCriterion("activity_start_over_time <", value, "activityStartOverTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartOverTimeLessThanOrEqualTo(String value) {
            addCriterion("activity_start_over_time <=", value, "activityStartOverTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartOverTimeLike(String value) {
            addCriterion("activity_start_over_time like", value, "activityStartOverTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartOverTimeNotLike(String value) {
            addCriterion("activity_start_over_time not like", value, "activityStartOverTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartOverTimeIn(List<String> values) {
            addCriterion("activity_start_over_time in", values, "activityStartOverTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartOverTimeNotIn(List<String> values) {
            addCriterion("activity_start_over_time not in", values, "activityStartOverTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartOverTimeBetween(String value1, String value2) {
            addCriterion("activity_start_over_time between", value1, value2, "activityStartOverTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartOverTimeNotBetween(String value1, String value2) {
            addCriterion("activity_start_over_time not between", value1, value2, "activityStartOverTime");
            return (Criteria) this;
        }

        public Criteria andActivityImgIsNull() {
            addCriterion("activity_img is null");
            return (Criteria) this;
        }

        public Criteria andActivityImgIsNotNull() {
            addCriterion("activity_img is not null");
            return (Criteria) this;
        }

        public Criteria andActivityImgEqualTo(String value) {
            addCriterion("activity_img =", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgNotEqualTo(String value) {
            addCriterion("activity_img <>", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgGreaterThan(String value) {
            addCriterion("activity_img >", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgGreaterThanOrEqualTo(String value) {
            addCriterion("activity_img >=", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgLessThan(String value) {
            addCriterion("activity_img <", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgLessThanOrEqualTo(String value) {
            addCriterion("activity_img <=", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgLike(String value) {
            addCriterion("activity_img like", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgNotLike(String value) {
            addCriterion("activity_img not like", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgIn(List<String> values) {
            addCriterion("activity_img in", values, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgNotIn(List<String> values) {
            addCriterion("activity_img not in", values, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgBetween(String value1, String value2) {
            addCriterion("activity_img between", value1, value2, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgNotBetween(String value1, String value2) {
            addCriterion("activity_img not between", value1, value2, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActiviyCommityIdIsNull() {
            addCriterion("activiy_commity_id is null");
            return (Criteria) this;
        }

        public Criteria andActiviyCommityIdIsNotNull() {
            addCriterion("activiy_commity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActiviyCommityIdEqualTo(Integer value) {
            addCriterion("activiy_commity_id =", value, "activiyCommityId");
            return (Criteria) this;
        }

        public Criteria andActiviyCommityIdNotEqualTo(Integer value) {
            addCriterion("activiy_commity_id <>", value, "activiyCommityId");
            return (Criteria) this;
        }

        public Criteria andActiviyCommityIdGreaterThan(Integer value) {
            addCriterion("activiy_commity_id >", value, "activiyCommityId");
            return (Criteria) this;
        }

        public Criteria andActiviyCommityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activiy_commity_id >=", value, "activiyCommityId");
            return (Criteria) this;
        }

        public Criteria andActiviyCommityIdLessThan(Integer value) {
            addCriterion("activiy_commity_id <", value, "activiyCommityId");
            return (Criteria) this;
        }

        public Criteria andActiviyCommityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activiy_commity_id <=", value, "activiyCommityId");
            return (Criteria) this;
        }

        public Criteria andActiviyCommityIdIn(List<Integer> values) {
            addCriterion("activiy_commity_id in", values, "activiyCommityId");
            return (Criteria) this;
        }

        public Criteria andActiviyCommityIdNotIn(List<Integer> values) {
            addCriterion("activiy_commity_id not in", values, "activiyCommityId");
            return (Criteria) this;
        }

        public Criteria andActiviyCommityIdBetween(Integer value1, Integer value2) {
            addCriterion("activiy_commity_id between", value1, value2, "activiyCommityId");
            return (Criteria) this;
        }

        public Criteria andActiviyCommityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activiy_commity_id not between", value1, value2, "activiyCommityId");
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