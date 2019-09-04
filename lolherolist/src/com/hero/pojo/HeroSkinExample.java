package com.hero.pojo;

import java.util.ArrayList;
import java.util.List;

public class HeroSkinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HeroSkinExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSkinNameIsNull() {
            addCriterion("skin_name is null");
            return (Criteria) this;
        }

        public Criteria andSkinNameIsNotNull() {
            addCriterion("skin_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkinNameEqualTo(String value) {
            addCriterion("skin_name =", value, "skinName");
            return (Criteria) this;
        }

        public Criteria andSkinNameNotEqualTo(String value) {
            addCriterion("skin_name <>", value, "skinName");
            return (Criteria) this;
        }

        public Criteria andSkinNameGreaterThan(String value) {
            addCriterion("skin_name >", value, "skinName");
            return (Criteria) this;
        }

        public Criteria andSkinNameGreaterThanOrEqualTo(String value) {
            addCriterion("skin_name >=", value, "skinName");
            return (Criteria) this;
        }

        public Criteria andSkinNameLessThan(String value) {
            addCriterion("skin_name <", value, "skinName");
            return (Criteria) this;
        }

        public Criteria andSkinNameLessThanOrEqualTo(String value) {
            addCriterion("skin_name <=", value, "skinName");
            return (Criteria) this;
        }

        public Criteria andSkinNameLike(String value) {
            addCriterion("skin_name like", value, "skinName");
            return (Criteria) this;
        }

        public Criteria andSkinNameNotLike(String value) {
            addCriterion("skin_name not like", value, "skinName");
            return (Criteria) this;
        }

        public Criteria andSkinNameIn(List<String> values) {
            addCriterion("skin_name in", values, "skinName");
            return (Criteria) this;
        }

        public Criteria andSkinNameNotIn(List<String> values) {
            addCriterion("skin_name not in", values, "skinName");
            return (Criteria) this;
        }

        public Criteria andSkinNameBetween(String value1, String value2) {
            addCriterion("skin_name between", value1, value2, "skinName");
            return (Criteria) this;
        }

        public Criteria andSkinNameNotBetween(String value1, String value2) {
            addCriterion("skin_name not between", value1, value2, "skinName");
            return (Criteria) this;
        }

        public Criteria andBigImgIsNull() {
            addCriterion("big_img is null");
            return (Criteria) this;
        }

        public Criteria andBigImgIsNotNull() {
            addCriterion("big_img is not null");
            return (Criteria) this;
        }

        public Criteria andBigImgEqualTo(String value) {
            addCriterion("big_img =", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotEqualTo(String value) {
            addCriterion("big_img <>", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgGreaterThan(String value) {
            addCriterion("big_img >", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgGreaterThanOrEqualTo(String value) {
            addCriterion("big_img >=", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgLessThan(String value) {
            addCriterion("big_img <", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgLessThanOrEqualTo(String value) {
            addCriterion("big_img <=", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgLike(String value) {
            addCriterion("big_img like", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotLike(String value) {
            addCriterion("big_img not like", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgIn(List<String> values) {
            addCriterion("big_img in", values, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotIn(List<String> values) {
            addCriterion("big_img not in", values, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgBetween(String value1, String value2) {
            addCriterion("big_img between", value1, value2, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotBetween(String value1, String value2) {
            addCriterion("big_img not between", value1, value2, "bigImg");
            return (Criteria) this;
        }

        public Criteria andTinyImgIsNull() {
            addCriterion("tiny_img is null");
            return (Criteria) this;
        }

        public Criteria andTinyImgIsNotNull() {
            addCriterion("tiny_img is not null");
            return (Criteria) this;
        }

        public Criteria andTinyImgEqualTo(String value) {
            addCriterion("tiny_img =", value, "tinyImg");
            return (Criteria) this;
        }

        public Criteria andTinyImgNotEqualTo(String value) {
            addCriterion("tiny_img <>", value, "tinyImg");
            return (Criteria) this;
        }

        public Criteria andTinyImgGreaterThan(String value) {
            addCriterion("tiny_img >", value, "tinyImg");
            return (Criteria) this;
        }

        public Criteria andTinyImgGreaterThanOrEqualTo(String value) {
            addCriterion("tiny_img >=", value, "tinyImg");
            return (Criteria) this;
        }

        public Criteria andTinyImgLessThan(String value) {
            addCriterion("tiny_img <", value, "tinyImg");
            return (Criteria) this;
        }

        public Criteria andTinyImgLessThanOrEqualTo(String value) {
            addCriterion("tiny_img <=", value, "tinyImg");
            return (Criteria) this;
        }

        public Criteria andTinyImgLike(String value) {
            addCriterion("tiny_img like", value, "tinyImg");
            return (Criteria) this;
        }

        public Criteria andTinyImgNotLike(String value) {
            addCriterion("tiny_img not like", value, "tinyImg");
            return (Criteria) this;
        }

        public Criteria andTinyImgIn(List<String> values) {
            addCriterion("tiny_img in", values, "tinyImg");
            return (Criteria) this;
        }

        public Criteria andTinyImgNotIn(List<String> values) {
            addCriterion("tiny_img not in", values, "tinyImg");
            return (Criteria) this;
        }

        public Criteria andTinyImgBetween(String value1, String value2) {
            addCriterion("tiny_img between", value1, value2, "tinyImg");
            return (Criteria) this;
        }

        public Criteria andTinyImgNotBetween(String value1, String value2) {
            addCriterion("tiny_img not between", value1, value2, "tinyImg");
            return (Criteria) this;
        }

        public Criteria andUkNameIsNull() {
            addCriterion("uk_name is null");
            return (Criteria) this;
        }

        public Criteria andUkNameIsNotNull() {
            addCriterion("uk_name is not null");
            return (Criteria) this;
        }

        public Criteria andUkNameEqualTo(String value) {
            addCriterion("uk_name =", value, "ukName");
            return (Criteria) this;
        }

        public Criteria andUkNameNotEqualTo(String value) {
            addCriterion("uk_name <>", value, "ukName");
            return (Criteria) this;
        }

        public Criteria andUkNameGreaterThan(String value) {
            addCriterion("uk_name >", value, "ukName");
            return (Criteria) this;
        }

        public Criteria andUkNameGreaterThanOrEqualTo(String value) {
            addCriterion("uk_name >=", value, "ukName");
            return (Criteria) this;
        }

        public Criteria andUkNameLessThan(String value) {
            addCriterion("uk_name <", value, "ukName");
            return (Criteria) this;
        }

        public Criteria andUkNameLessThanOrEqualTo(String value) {
            addCriterion("uk_name <=", value, "ukName");
            return (Criteria) this;
        }

        public Criteria andUkNameLike(String value) {
            addCriterion("uk_name like", value, "ukName");
            return (Criteria) this;
        }

        public Criteria andUkNameNotLike(String value) {
            addCriterion("uk_name not like", value, "ukName");
            return (Criteria) this;
        }

        public Criteria andUkNameIn(List<String> values) {
            addCriterion("uk_name in", values, "ukName");
            return (Criteria) this;
        }

        public Criteria andUkNameNotIn(List<String> values) {
            addCriterion("uk_name not in", values, "ukName");
            return (Criteria) this;
        }

        public Criteria andUkNameBetween(String value1, String value2) {
            addCriterion("uk_name between", value1, value2, "ukName");
            return (Criteria) this;
        }

        public Criteria andUkNameNotBetween(String value1, String value2) {
            addCriterion("uk_name not between", value1, value2, "ukName");
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