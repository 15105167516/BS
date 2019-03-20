package com.suke.communitymanage.bean;

import java.util.ArrayList;
import java.util.List;

public class ApplyCommunityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyCommunityExample() {
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

        public Criteria andTemIdIsNull() {
            addCriterion("tem_id is null");
            return (Criteria) this;
        }

        public Criteria andTemIdIsNotNull() {
            addCriterion("tem_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemIdEqualTo(Integer value) {
            addCriterion("tem_id =", value, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdNotEqualTo(Integer value) {
            addCriterion("tem_id <>", value, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdGreaterThan(Integer value) {
            addCriterion("tem_id >", value, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tem_id >=", value, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdLessThan(Integer value) {
            addCriterion("tem_id <", value, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdLessThanOrEqualTo(Integer value) {
            addCriterion("tem_id <=", value, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdIn(List<Integer> values) {
            addCriterion("tem_id in", values, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdNotIn(List<Integer> values) {
            addCriterion("tem_id not in", values, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdBetween(Integer value1, Integer value2) {
            addCriterion("tem_id between", value1, value2, "temId");
            return (Criteria) this;
        }

        public Criteria andTemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tem_id not between", value1, value2, "temId");
            return (Criteria) this;
        }

        public Criteria andTemUserIdIsNull() {
            addCriterion("tem_user_id is null");
            return (Criteria) this;
        }

        public Criteria andTemUserIdIsNotNull() {
            addCriterion("tem_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemUserIdEqualTo(String value) {
            addCriterion("tem_user_id =", value, "temUserId");
            return (Criteria) this;
        }

        public Criteria andTemUserIdNotEqualTo(String value) {
            addCriterion("tem_user_id <>", value, "temUserId");
            return (Criteria) this;
        }

        public Criteria andTemUserIdGreaterThan(String value) {
            addCriterion("tem_user_id >", value, "temUserId");
            return (Criteria) this;
        }

        public Criteria andTemUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("tem_user_id >=", value, "temUserId");
            return (Criteria) this;
        }

        public Criteria andTemUserIdLessThan(String value) {
            addCriterion("tem_user_id <", value, "temUserId");
            return (Criteria) this;
        }

        public Criteria andTemUserIdLessThanOrEqualTo(String value) {
            addCriterion("tem_user_id <=", value, "temUserId");
            return (Criteria) this;
        }

        public Criteria andTemUserIdLike(String value) {
            addCriterion("tem_user_id like", value, "temUserId");
            return (Criteria) this;
        }

        public Criteria andTemUserIdNotLike(String value) {
            addCriterion("tem_user_id not like", value, "temUserId");
            return (Criteria) this;
        }

        public Criteria andTemUserIdIn(List<String> values) {
            addCriterion("tem_user_id in", values, "temUserId");
            return (Criteria) this;
        }

        public Criteria andTemUserIdNotIn(List<String> values) {
            addCriterion("tem_user_id not in", values, "temUserId");
            return (Criteria) this;
        }

        public Criteria andTemUserIdBetween(String value1, String value2) {
            addCriterion("tem_user_id between", value1, value2, "temUserId");
            return (Criteria) this;
        }

        public Criteria andTemUserIdNotBetween(String value1, String value2) {
            addCriterion("tem_user_id not between", value1, value2, "temUserId");
            return (Criteria) this;
        }

        public Criteria andTemComIdIsNull() {
            addCriterion("tem_com_id is null");
            return (Criteria) this;
        }

        public Criteria andTemComIdIsNotNull() {
            addCriterion("tem_com_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemComIdEqualTo(Integer value) {
            addCriterion("tem_com_id =", value, "temComId");
            return (Criteria) this;
        }

        public Criteria andTemComIdNotEqualTo(Integer value) {
            addCriterion("tem_com_id <>", value, "temComId");
            return (Criteria) this;
        }

        public Criteria andTemComIdGreaterThan(Integer value) {
            addCriterion("tem_com_id >", value, "temComId");
            return (Criteria) this;
        }

        public Criteria andTemComIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tem_com_id >=", value, "temComId");
            return (Criteria) this;
        }

        public Criteria andTemComIdLessThan(Integer value) {
            addCriterion("tem_com_id <", value, "temComId");
            return (Criteria) this;
        }

        public Criteria andTemComIdLessThanOrEqualTo(Integer value) {
            addCriterion("tem_com_id <=", value, "temComId");
            return (Criteria) this;
        }

        public Criteria andTemComIdIn(List<Integer> values) {
            addCriterion("tem_com_id in", values, "temComId");
            return (Criteria) this;
        }

        public Criteria andTemComIdNotIn(List<Integer> values) {
            addCriterion("tem_com_id not in", values, "temComId");
            return (Criteria) this;
        }

        public Criteria andTemComIdBetween(Integer value1, Integer value2) {
            addCriterion("tem_com_id between", value1, value2, "temComId");
            return (Criteria) this;
        }

        public Criteria andTemComIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tem_com_id not between", value1, value2, "temComId");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(String value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(String value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(String value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(String value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(String value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLike(String value) {
            addCriterion("apply_time like", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotLike(String value) {
            addCriterion("apply_time not like", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<String> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<String> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(String value1, String value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(String value1, String value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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