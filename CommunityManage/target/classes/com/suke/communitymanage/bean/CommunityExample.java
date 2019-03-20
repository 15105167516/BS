package com.suke.communitymanage.bean;

import java.util.ArrayList;
import java.util.List;

public class CommunityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommunityExample() {
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

        public Criteria andComIdIsNull() {
            addCriterion("com_id is null");
            return (Criteria) this;
        }

        public Criteria andComIdIsNotNull() {
            addCriterion("com_id is not null");
            return (Criteria) this;
        }

        public Criteria andComIdEqualTo(Integer value) {
            addCriterion("com_id =", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotEqualTo(Integer value) {
            addCriterion("com_id <>", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThan(Integer value) {
            addCriterion("com_id >", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_id >=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThan(Integer value) {
            addCriterion("com_id <", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThanOrEqualTo(Integer value) {
            addCriterion("com_id <=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdIn(List<Integer> values) {
            addCriterion("com_id in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotIn(List<Integer> values) {
            addCriterion("com_id not in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdBetween(Integer value1, Integer value2) {
            addCriterion("com_id between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotBetween(Integer value1, Integer value2) {
            addCriterion("com_id not between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComNameIsNull() {
            addCriterion("com_name is null");
            return (Criteria) this;
        }

        public Criteria andComNameIsNotNull() {
            addCriterion("com_name is not null");
            return (Criteria) this;
        }

        public Criteria andComNameEqualTo(String value) {
            addCriterion("com_name =", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotEqualTo(String value) {
            addCriterion("com_name <>", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameGreaterThan(String value) {
            addCriterion("com_name >", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameGreaterThanOrEqualTo(String value) {
            addCriterion("com_name >=", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLessThan(String value) {
            addCriterion("com_name <", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLessThanOrEqualTo(String value) {
            addCriterion("com_name <=", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLike(String value) {
            addCriterion("com_name like", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotLike(String value) {
            addCriterion("com_name not like", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameIn(List<String> values) {
            addCriterion("com_name in", values, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotIn(List<String> values) {
            addCriterion("com_name not in", values, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameBetween(String value1, String value2) {
            addCriterion("com_name between", value1, value2, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotBetween(String value1, String value2) {
            addCriterion("com_name not between", value1, value2, "comName");
            return (Criteria) this;
        }

        public Criteria andComCreateDateIsNull() {
            addCriterion("com_create_date is null");
            return (Criteria) this;
        }

        public Criteria andComCreateDateIsNotNull() {
            addCriterion("com_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andComCreateDateEqualTo(String value) {
            addCriterion("com_create_date =", value, "comCreateDate");
            return (Criteria) this;
        }

        public Criteria andComCreateDateNotEqualTo(String value) {
            addCriterion("com_create_date <>", value, "comCreateDate");
            return (Criteria) this;
        }

        public Criteria andComCreateDateGreaterThan(String value) {
            addCriterion("com_create_date >", value, "comCreateDate");
            return (Criteria) this;
        }

        public Criteria andComCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("com_create_date >=", value, "comCreateDate");
            return (Criteria) this;
        }

        public Criteria andComCreateDateLessThan(String value) {
            addCriterion("com_create_date <", value, "comCreateDate");
            return (Criteria) this;
        }

        public Criteria andComCreateDateLessThanOrEqualTo(String value) {
            addCriterion("com_create_date <=", value, "comCreateDate");
            return (Criteria) this;
        }

        public Criteria andComCreateDateLike(String value) {
            addCriterion("com_create_date like", value, "comCreateDate");
            return (Criteria) this;
        }

        public Criteria andComCreateDateNotLike(String value) {
            addCriterion("com_create_date not like", value, "comCreateDate");
            return (Criteria) this;
        }

        public Criteria andComCreateDateIn(List<String> values) {
            addCriterion("com_create_date in", values, "comCreateDate");
            return (Criteria) this;
        }

        public Criteria andComCreateDateNotIn(List<String> values) {
            addCriterion("com_create_date not in", values, "comCreateDate");
            return (Criteria) this;
        }

        public Criteria andComCreateDateBetween(String value1, String value2) {
            addCriterion("com_create_date between", value1, value2, "comCreateDate");
            return (Criteria) this;
        }

        public Criteria andComCreateDateNotBetween(String value1, String value2) {
            addCriterion("com_create_date not between", value1, value2, "comCreateDate");
            return (Criteria) this;
        }

        public Criteria andComImgIsNull() {
            addCriterion("com_img is null");
            return (Criteria) this;
        }

        public Criteria andComImgIsNotNull() {
            addCriterion("com_img is not null");
            return (Criteria) this;
        }

        public Criteria andComImgEqualTo(String value) {
            addCriterion("com_img =", value, "comImg");
            return (Criteria) this;
        }

        public Criteria andComImgNotEqualTo(String value) {
            addCriterion("com_img <>", value, "comImg");
            return (Criteria) this;
        }

        public Criteria andComImgGreaterThan(String value) {
            addCriterion("com_img >", value, "comImg");
            return (Criteria) this;
        }

        public Criteria andComImgGreaterThanOrEqualTo(String value) {
            addCriterion("com_img >=", value, "comImg");
            return (Criteria) this;
        }

        public Criteria andComImgLessThan(String value) {
            addCriterion("com_img <", value, "comImg");
            return (Criteria) this;
        }

        public Criteria andComImgLessThanOrEqualTo(String value) {
            addCriterion("com_img <=", value, "comImg");
            return (Criteria) this;
        }

        public Criteria andComImgLike(String value) {
            addCriterion("com_img like", value, "comImg");
            return (Criteria) this;
        }

        public Criteria andComImgNotLike(String value) {
            addCriterion("com_img not like", value, "comImg");
            return (Criteria) this;
        }

        public Criteria andComImgIn(List<String> values) {
            addCriterion("com_img in", values, "comImg");
            return (Criteria) this;
        }

        public Criteria andComImgNotIn(List<String> values) {
            addCriterion("com_img not in", values, "comImg");
            return (Criteria) this;
        }

        public Criteria andComImgBetween(String value1, String value2) {
            addCriterion("com_img between", value1, value2, "comImg");
            return (Criteria) this;
        }

        public Criteria andComImgNotBetween(String value1, String value2) {
            addCriterion("com_img not between", value1, value2, "comImg");
            return (Criteria) this;
        }

        public Criteria andComMemberNumberIsNull() {
            addCriterion("com_member_number is null");
            return (Criteria) this;
        }

        public Criteria andComMemberNumberIsNotNull() {
            addCriterion("com_member_number is not null");
            return (Criteria) this;
        }

        public Criteria andComMemberNumberEqualTo(Integer value) {
            addCriterion("com_member_number =", value, "comMemberNumber");
            return (Criteria) this;
        }

        public Criteria andComMemberNumberNotEqualTo(Integer value) {
            addCriterion("com_member_number <>", value, "comMemberNumber");
            return (Criteria) this;
        }

        public Criteria andComMemberNumberGreaterThan(Integer value) {
            addCriterion("com_member_number >", value, "comMemberNumber");
            return (Criteria) this;
        }

        public Criteria andComMemberNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_member_number >=", value, "comMemberNumber");
            return (Criteria) this;
        }

        public Criteria andComMemberNumberLessThan(Integer value) {
            addCriterion("com_member_number <", value, "comMemberNumber");
            return (Criteria) this;
        }

        public Criteria andComMemberNumberLessThanOrEqualTo(Integer value) {
            addCriterion("com_member_number <=", value, "comMemberNumber");
            return (Criteria) this;
        }

        public Criteria andComMemberNumberIn(List<Integer> values) {
            addCriterion("com_member_number in", values, "comMemberNumber");
            return (Criteria) this;
        }

        public Criteria andComMemberNumberNotIn(List<Integer> values) {
            addCriterion("com_member_number not in", values, "comMemberNumber");
            return (Criteria) this;
        }

        public Criteria andComMemberNumberBetween(Integer value1, Integer value2) {
            addCriterion("com_member_number between", value1, value2, "comMemberNumber");
            return (Criteria) this;
        }

        public Criteria andComMemberNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("com_member_number not between", value1, value2, "comMemberNumber");
            return (Criteria) this;
        }

        public Criteria andComIntroductionIsNull() {
            addCriterion("com_introduction is null");
            return (Criteria) this;
        }

        public Criteria andComIntroductionIsNotNull() {
            addCriterion("com_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andComIntroductionEqualTo(String value) {
            addCriterion("com_introduction =", value, "comIntroduction");
            return (Criteria) this;
        }

        public Criteria andComIntroductionNotEqualTo(String value) {
            addCriterion("com_introduction <>", value, "comIntroduction");
            return (Criteria) this;
        }

        public Criteria andComIntroductionGreaterThan(String value) {
            addCriterion("com_introduction >", value, "comIntroduction");
            return (Criteria) this;
        }

        public Criteria andComIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("com_introduction >=", value, "comIntroduction");
            return (Criteria) this;
        }

        public Criteria andComIntroductionLessThan(String value) {
            addCriterion("com_introduction <", value, "comIntroduction");
            return (Criteria) this;
        }

        public Criteria andComIntroductionLessThanOrEqualTo(String value) {
            addCriterion("com_introduction <=", value, "comIntroduction");
            return (Criteria) this;
        }

        public Criteria andComIntroductionLike(String value) {
            addCriterion("com_introduction like", value, "comIntroduction");
            return (Criteria) this;
        }

        public Criteria andComIntroductionNotLike(String value) {
            addCriterion("com_introduction not like", value, "comIntroduction");
            return (Criteria) this;
        }

        public Criteria andComIntroductionIn(List<String> values) {
            addCriterion("com_introduction in", values, "comIntroduction");
            return (Criteria) this;
        }

        public Criteria andComIntroductionNotIn(List<String> values) {
            addCriterion("com_introduction not in", values, "comIntroduction");
            return (Criteria) this;
        }

        public Criteria andComIntroductionBetween(String value1, String value2) {
            addCriterion("com_introduction between", value1, value2, "comIntroduction");
            return (Criteria) this;
        }

        public Criteria andComIntroductionNotBetween(String value1, String value2) {
            addCriterion("com_introduction not between", value1, value2, "comIntroduction");
            return (Criteria) this;
        }

        public Criteria andComAdminIdIsNull() {
            addCriterion("com_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andComAdminIdIsNotNull() {
            addCriterion("com_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andComAdminIdEqualTo(String value) {
            addCriterion("com_admin_id =", value, "comAdminId");
            return (Criteria) this;
        }

        public Criteria andComAdminIdNotEqualTo(String value) {
            addCriterion("com_admin_id <>", value, "comAdminId");
            return (Criteria) this;
        }

        public Criteria andComAdminIdGreaterThan(String value) {
            addCriterion("com_admin_id >", value, "comAdminId");
            return (Criteria) this;
        }

        public Criteria andComAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("com_admin_id >=", value, "comAdminId");
            return (Criteria) this;
        }

        public Criteria andComAdminIdLessThan(String value) {
            addCriterion("com_admin_id <", value, "comAdminId");
            return (Criteria) this;
        }

        public Criteria andComAdminIdLessThanOrEqualTo(String value) {
            addCriterion("com_admin_id <=", value, "comAdminId");
            return (Criteria) this;
        }

        public Criteria andComAdminIdLike(String value) {
            addCriterion("com_admin_id like", value, "comAdminId");
            return (Criteria) this;
        }

        public Criteria andComAdminIdNotLike(String value) {
            addCriterion("com_admin_id not like", value, "comAdminId");
            return (Criteria) this;
        }

        public Criteria andComAdminIdIn(List<String> values) {
            addCriterion("com_admin_id in", values, "comAdminId");
            return (Criteria) this;
        }

        public Criteria andComAdminIdNotIn(List<String> values) {
            addCriterion("com_admin_id not in", values, "comAdminId");
            return (Criteria) this;
        }

        public Criteria andComAdminIdBetween(String value1, String value2) {
            addCriterion("com_admin_id between", value1, value2, "comAdminId");
            return (Criteria) this;
        }

        public Criteria andComAdminIdNotBetween(String value1, String value2) {
            addCriterion("com_admin_id not between", value1, value2, "comAdminId");
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