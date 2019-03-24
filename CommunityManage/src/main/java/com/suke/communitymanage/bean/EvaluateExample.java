package com.suke.communitymanage.bean;

import java.util.ArrayList;
import java.util.List;

public class EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluateExample() {
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

        public Criteria andMemIdIsNull() {
            addCriterion("mem_id is null");
            return (Criteria) this;
        }

        public Criteria andMemIdIsNotNull() {
            addCriterion("mem_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemIdEqualTo(String value) {
            addCriterion("mem_id =", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotEqualTo(String value) {
            addCriterion("mem_id <>", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdGreaterThan(String value) {
            addCriterion("mem_id >", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdGreaterThanOrEqualTo(String value) {
            addCriterion("mem_id >=", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLessThan(String value) {
            addCriterion("mem_id <", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLessThanOrEqualTo(String value) {
            addCriterion("mem_id <=", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLike(String value) {
            addCriterion("mem_id like", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotLike(String value) {
            addCriterion("mem_id not like", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdIn(List<String> values) {
            addCriterion("mem_id in", values, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotIn(List<String> values) {
            addCriterion("mem_id not in", values, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdBetween(String value1, String value2) {
            addCriterion("mem_id between", value1, value2, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotBetween(String value1, String value2) {
            addCriterion("mem_id not between", value1, value2, "memId");
            return (Criteria) this;
        }

        public Criteria andMemEvaIsNull() {
            addCriterion("mem_eva is null");
            return (Criteria) this;
        }

        public Criteria andMemEvaIsNotNull() {
            addCriterion("mem_eva is not null");
            return (Criteria) this;
        }

        public Criteria andMemEvaEqualTo(String value) {
            addCriterion("mem_eva =", value, "memEva");
            return (Criteria) this;
        }

        public Criteria andMemEvaNotEqualTo(String value) {
            addCriterion("mem_eva <>", value, "memEva");
            return (Criteria) this;
        }

        public Criteria andMemEvaGreaterThan(String value) {
            addCriterion("mem_eva >", value, "memEva");
            return (Criteria) this;
        }

        public Criteria andMemEvaGreaterThanOrEqualTo(String value) {
            addCriterion("mem_eva >=", value, "memEva");
            return (Criteria) this;
        }

        public Criteria andMemEvaLessThan(String value) {
            addCriterion("mem_eva <", value, "memEva");
            return (Criteria) this;
        }

        public Criteria andMemEvaLessThanOrEqualTo(String value) {
            addCriterion("mem_eva <=", value, "memEva");
            return (Criteria) this;
        }

        public Criteria andMemEvaLike(String value) {
            addCriterion("mem_eva like", value, "memEva");
            return (Criteria) this;
        }

        public Criteria andMemEvaNotLike(String value) {
            addCriterion("mem_eva not like", value, "memEva");
            return (Criteria) this;
        }

        public Criteria andMemEvaIn(List<String> values) {
            addCriterion("mem_eva in", values, "memEva");
            return (Criteria) this;
        }

        public Criteria andMemEvaNotIn(List<String> values) {
            addCriterion("mem_eva not in", values, "memEva");
            return (Criteria) this;
        }

        public Criteria andMemEvaBetween(String value1, String value2) {
            addCriterion("mem_eva between", value1, value2, "memEva");
            return (Criteria) this;
        }

        public Criteria andMemEvaNotBetween(String value1, String value2) {
            addCriterion("mem_eva not between", value1, value2, "memEva");
            return (Criteria) this;
        }

        public Criteria andEvaTimeIsNull() {
            addCriterion("eva_time is null");
            return (Criteria) this;
        }

        public Criteria andEvaTimeIsNotNull() {
            addCriterion("eva_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvaTimeEqualTo(String value) {
            addCriterion("eva_time =", value, "evaTime");
            return (Criteria) this;
        }

        public Criteria andEvaTimeNotEqualTo(String value) {
            addCriterion("eva_time <>", value, "evaTime");
            return (Criteria) this;
        }

        public Criteria andEvaTimeGreaterThan(String value) {
            addCriterion("eva_time >", value, "evaTime");
            return (Criteria) this;
        }

        public Criteria andEvaTimeGreaterThanOrEqualTo(String value) {
            addCriterion("eva_time >=", value, "evaTime");
            return (Criteria) this;
        }

        public Criteria andEvaTimeLessThan(String value) {
            addCriterion("eva_time <", value, "evaTime");
            return (Criteria) this;
        }

        public Criteria andEvaTimeLessThanOrEqualTo(String value) {
            addCriterion("eva_time <=", value, "evaTime");
            return (Criteria) this;
        }

        public Criteria andEvaTimeLike(String value) {
            addCriterion("eva_time like", value, "evaTime");
            return (Criteria) this;
        }

        public Criteria andEvaTimeNotLike(String value) {
            addCriterion("eva_time not like", value, "evaTime");
            return (Criteria) this;
        }

        public Criteria andEvaTimeIn(List<String> values) {
            addCriterion("eva_time in", values, "evaTime");
            return (Criteria) this;
        }

        public Criteria andEvaTimeNotIn(List<String> values) {
            addCriterion("eva_time not in", values, "evaTime");
            return (Criteria) this;
        }

        public Criteria andEvaTimeBetween(String value1, String value2) {
            addCriterion("eva_time between", value1, value2, "evaTime");
            return (Criteria) this;
        }

        public Criteria andEvaTimeNotBetween(String value1, String value2) {
            addCriterion("eva_time not between", value1, value2, "evaTime");
            return (Criteria) this;
        }

        public Criteria andEvaScoreIsNull() {
            addCriterion("eva_score is null");
            return (Criteria) this;
        }

        public Criteria andEvaScoreIsNotNull() {
            addCriterion("eva_score is not null");
            return (Criteria) this;
        }

        public Criteria andEvaScoreEqualTo(String value) {
            addCriterion("eva_score =", value, "evaScore");
            return (Criteria) this;
        }

        public Criteria andEvaScoreNotEqualTo(String value) {
            addCriterion("eva_score <>", value, "evaScore");
            return (Criteria) this;
        }

        public Criteria andEvaScoreGreaterThan(String value) {
            addCriterion("eva_score >", value, "evaScore");
            return (Criteria) this;
        }

        public Criteria andEvaScoreGreaterThanOrEqualTo(String value) {
            addCriterion("eva_score >=", value, "evaScore");
            return (Criteria) this;
        }

        public Criteria andEvaScoreLessThan(String value) {
            addCriterion("eva_score <", value, "evaScore");
            return (Criteria) this;
        }

        public Criteria andEvaScoreLessThanOrEqualTo(String value) {
            addCriterion("eva_score <=", value, "evaScore");
            return (Criteria) this;
        }

        public Criteria andEvaScoreLike(String value) {
            addCriterion("eva_score like", value, "evaScore");
            return (Criteria) this;
        }

        public Criteria andEvaScoreNotLike(String value) {
            addCriterion("eva_score not like", value, "evaScore");
            return (Criteria) this;
        }

        public Criteria andEvaScoreIn(List<String> values) {
            addCriterion("eva_score in", values, "evaScore");
            return (Criteria) this;
        }

        public Criteria andEvaScoreNotIn(List<String> values) {
            addCriterion("eva_score not in", values, "evaScore");
            return (Criteria) this;
        }

        public Criteria andEvaScoreBetween(String value1, String value2) {
            addCriterion("eva_score between", value1, value2, "evaScore");
            return (Criteria) this;
        }

        public Criteria andEvaScoreNotBetween(String value1, String value2) {
            addCriterion("eva_score not between", value1, value2, "evaScore");
            return (Criteria) this;
        }

        public Criteria andActIdIsNull() {
            addCriterion("act_id is null");
            return (Criteria) this;
        }

        public Criteria andActIdIsNotNull() {
            addCriterion("act_id is not null");
            return (Criteria) this;
        }

        public Criteria andActIdEqualTo(Integer value) {
            addCriterion("act_id =", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotEqualTo(Integer value) {
            addCriterion("act_id <>", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThan(Integer value) {
            addCriterion("act_id >", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_id >=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThan(Integer value) {
            addCriterion("act_id <", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThanOrEqualTo(Integer value) {
            addCriterion("act_id <=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdIn(List<Integer> values) {
            addCriterion("act_id in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotIn(List<Integer> values) {
            addCriterion("act_id not in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdBetween(Integer value1, Integer value2) {
            addCriterion("act_id between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotBetween(Integer value1, Integer value2) {
            addCriterion("act_id not between", value1, value2, "actId");
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