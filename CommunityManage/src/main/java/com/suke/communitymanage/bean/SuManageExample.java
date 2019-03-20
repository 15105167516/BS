package com.suke.communitymanage.bean;

import java.util.ArrayList;
import java.util.List;

public class SuManageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuManageExample() {
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

        public Criteria andSuIdIsNull() {
            addCriterion("su_id is null");
            return (Criteria) this;
        }

        public Criteria andSuIdIsNotNull() {
            addCriterion("su_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuIdEqualTo(Integer value) {
            addCriterion("su_id =", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotEqualTo(Integer value) {
            addCriterion("su_id <>", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdGreaterThan(Integer value) {
            addCriterion("su_id >", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_id >=", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdLessThan(Integer value) {
            addCriterion("su_id <", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdLessThanOrEqualTo(Integer value) {
            addCriterion("su_id <=", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdIn(List<Integer> values) {
            addCriterion("su_id in", values, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotIn(List<Integer> values) {
            addCriterion("su_id not in", values, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdBetween(Integer value1, Integer value2) {
            addCriterion("su_id between", value1, value2, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("su_id not between", value1, value2, "suId");
            return (Criteria) this;
        }

        public Criteria andSuNameIsNull() {
            addCriterion("su_name is null");
            return (Criteria) this;
        }

        public Criteria andSuNameIsNotNull() {
            addCriterion("su_name is not null");
            return (Criteria) this;
        }

        public Criteria andSuNameEqualTo(String value) {
            addCriterion("su_name =", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameNotEqualTo(String value) {
            addCriterion("su_name <>", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameGreaterThan(String value) {
            addCriterion("su_name >", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameGreaterThanOrEqualTo(String value) {
            addCriterion("su_name >=", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameLessThan(String value) {
            addCriterion("su_name <", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameLessThanOrEqualTo(String value) {
            addCriterion("su_name <=", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameLike(String value) {
            addCriterion("su_name like", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameNotLike(String value) {
            addCriterion("su_name not like", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameIn(List<String> values) {
            addCriterion("su_name in", values, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameNotIn(List<String> values) {
            addCriterion("su_name not in", values, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameBetween(String value1, String value2) {
            addCriterion("su_name between", value1, value2, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameNotBetween(String value1, String value2) {
            addCriterion("su_name not between", value1, value2, "suName");
            return (Criteria) this;
        }

        public Criteria andSuPasswordIsNull() {
            addCriterion("su_password is null");
            return (Criteria) this;
        }

        public Criteria andSuPasswordIsNotNull() {
            addCriterion("su_password is not null");
            return (Criteria) this;
        }

        public Criteria andSuPasswordEqualTo(String value) {
            addCriterion("su_password =", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotEqualTo(String value) {
            addCriterion("su_password <>", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordGreaterThan(String value) {
            addCriterion("su_password >", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("su_password >=", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordLessThan(String value) {
            addCriterion("su_password <", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordLessThanOrEqualTo(String value) {
            addCriterion("su_password <=", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordLike(String value) {
            addCriterion("su_password like", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotLike(String value) {
            addCriterion("su_password not like", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordIn(List<String> values) {
            addCriterion("su_password in", values, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotIn(List<String> values) {
            addCriterion("su_password not in", values, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordBetween(String value1, String value2) {
            addCriterion("su_password between", value1, value2, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotBetween(String value1, String value2) {
            addCriterion("su_password not between", value1, value2, "suPassword");
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