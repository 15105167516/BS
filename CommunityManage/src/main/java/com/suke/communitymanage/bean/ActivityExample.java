package com.suke.communitymanage.bean;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andActiIdIsNull() {
            addCriterion("acti_id is null");
            return (Criteria) this;
        }

        public Criteria andActiIdIsNotNull() {
            addCriterion("acti_id is not null");
            return (Criteria) this;
        }

        public Criteria andActiIdEqualTo(Integer value) {
            addCriterion("acti_id =", value, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdNotEqualTo(Integer value) {
            addCriterion("acti_id <>", value, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdGreaterThan(Integer value) {
            addCriterion("acti_id >", value, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("acti_id >=", value, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdLessThan(Integer value) {
            addCriterion("acti_id <", value, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdLessThanOrEqualTo(Integer value) {
            addCriterion("acti_id <=", value, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdIn(List<Integer> values) {
            addCriterion("acti_id in", values, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdNotIn(List<Integer> values) {
            addCriterion("acti_id not in", values, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdBetween(Integer value1, Integer value2) {
            addCriterion("acti_id between", value1, value2, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("acti_id not between", value1, value2, "actiId");
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

        public Criteria andActivityEndTimeIsNull() {
            addCriterion("activity_end_time is null");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeIsNotNull() {
            addCriterion("activity_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeEqualTo(Date value) {
            addCriterion("activity_end_time =", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeNotEqualTo(Date value) {
            addCriterion("activity_end_time <>", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeGreaterThan(Date value) {
            addCriterion("activity_end_time >", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_end_time >=", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeLessThan(Date value) {
            addCriterion("activity_end_time <", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("activity_end_time <=", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeIn(List<Date> values) {
            addCriterion("activity_end_time in", values, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeNotIn(List<Date> values) {
            addCriterion("activity_end_time not in", values, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeBetween(Date value1, Date value2) {
            addCriterion("activity_end_time between", value1, value2, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("activity_end_time not between", value1, value2, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeIsNull() {
            addCriterion("activity_start_time is null");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeIsNotNull() {
            addCriterion("activity_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeEqualTo(Date value) {
            addCriterion("activity_start_time =", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeNotEqualTo(Date value) {
            addCriterion("activity_start_time <>", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeGreaterThan(Date value) {
            addCriterion("activity_start_time >", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_start_time >=", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeLessThan(Date value) {
            addCriterion("activity_start_time <", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("activity_start_time <=", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeIn(List<Date> values) {
            addCriterion("activity_start_time in", values, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeNotIn(List<Date> values) {
            addCriterion("activity_start_time not in", values, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeBetween(Date value1, Date value2) {
            addCriterion("activity_start_time between", value1, value2, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("activity_start_time not between", value1, value2, "activityStartTime");
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

        public Criteria andActivityLabelIsNull() {
            addCriterion("activity_label is null");
            return (Criteria) this;
        }

        public Criteria andActivityLabelIsNotNull() {
            addCriterion("activity_label is not null");
            return (Criteria) this;
        }

        public Criteria andActivityLabelEqualTo(String value) {
            addCriterion("activity_label =", value, "activityLabel");
            return (Criteria) this;
        }

        public Criteria andActivityLabelNotEqualTo(String value) {
            addCriterion("activity_label <>", value, "activityLabel");
            return (Criteria) this;
        }

        public Criteria andActivityLabelGreaterThan(String value) {
            addCriterion("activity_label >", value, "activityLabel");
            return (Criteria) this;
        }

        public Criteria andActivityLabelGreaterThanOrEqualTo(String value) {
            addCriterion("activity_label >=", value, "activityLabel");
            return (Criteria) this;
        }

        public Criteria andActivityLabelLessThan(String value) {
            addCriterion("activity_label <", value, "activityLabel");
            return (Criteria) this;
        }

        public Criteria andActivityLabelLessThanOrEqualTo(String value) {
            addCriterion("activity_label <=", value, "activityLabel");
            return (Criteria) this;
        }

        public Criteria andActivityLabelLike(String value) {
            addCriterion("activity_label like", value, "activityLabel");
            return (Criteria) this;
        }

        public Criteria andActivityLabelNotLike(String value) {
            addCriterion("activity_label not like", value, "activityLabel");
            return (Criteria) this;
        }

        public Criteria andActivityLabelIn(List<String> values) {
            addCriterion("activity_label in", values, "activityLabel");
            return (Criteria) this;
        }

        public Criteria andActivityLabelNotIn(List<String> values) {
            addCriterion("activity_label not in", values, "activityLabel");
            return (Criteria) this;
        }

        public Criteria andActivityLabelBetween(String value1, String value2) {
            addCriterion("activity_label between", value1, value2, "activityLabel");
            return (Criteria) this;
        }

        public Criteria andActivityLabelNotBetween(String value1, String value2) {
            addCriterion("activity_label not between", value1, value2, "activityLabel");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyIsNull() {
            addCriterion("apply_money is null");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyIsNotNull() {
            addCriterion("apply_money is not null");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyEqualTo(String value) {
            addCriterion("apply_money =", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyNotEqualTo(String value) {
            addCriterion("apply_money <>", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyGreaterThan(String value) {
            addCriterion("apply_money >", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("apply_money >=", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyLessThan(String value) {
            addCriterion("apply_money <", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyLessThanOrEqualTo(String value) {
            addCriterion("apply_money <=", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyLike(String value) {
            addCriterion("apply_money like", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyNotLike(String value) {
            addCriterion("apply_money not like", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyIn(List<String> values) {
            addCriterion("apply_money in", values, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyNotIn(List<String> values) {
            addCriterion("apply_money not in", values, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyBetween(String value1, String value2) {
            addCriterion("apply_money between", value1, value2, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyNotBetween(String value1, String value2) {
            addCriterion("apply_money not between", value1, value2, "applyMoney");
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