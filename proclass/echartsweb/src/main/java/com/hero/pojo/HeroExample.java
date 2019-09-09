package com.hero.pojo;

import java.util.ArrayList;
import java.util.List;

public class HeroExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HeroExample() {
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

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
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

        public Criteria andMagicPowerIsNull() {
            addCriterion("magic_power is null");
            return (Criteria) this;
        }

        public Criteria andMagicPowerIsNotNull() {
            addCriterion("magic_power is not null");
            return (Criteria) this;
        }

        public Criteria andMagicPowerEqualTo(Byte value) {
            addCriterion("magic_power =", value, "magicPower");
            return (Criteria) this;
        }

        public Criteria andMagicPowerNotEqualTo(Byte value) {
            addCriterion("magic_power <>", value, "magicPower");
            return (Criteria) this;
        }

        public Criteria andMagicPowerGreaterThan(Byte value) {
            addCriterion("magic_power >", value, "magicPower");
            return (Criteria) this;
        }

        public Criteria andMagicPowerGreaterThanOrEqualTo(Byte value) {
            addCriterion("magic_power >=", value, "magicPower");
            return (Criteria) this;
        }

        public Criteria andMagicPowerLessThan(Byte value) {
            addCriterion("magic_power <", value, "magicPower");
            return (Criteria) this;
        }

        public Criteria andMagicPowerLessThanOrEqualTo(Byte value) {
            addCriterion("magic_power <=", value, "magicPower");
            return (Criteria) this;
        }

        public Criteria andMagicPowerIn(List<Byte> values) {
            addCriterion("magic_power in", values, "magicPower");
            return (Criteria) this;
        }

        public Criteria andMagicPowerNotIn(List<Byte> values) {
            addCriterion("magic_power not in", values, "magicPower");
            return (Criteria) this;
        }

        public Criteria andMagicPowerBetween(Byte value1, Byte value2) {
            addCriterion("magic_power between", value1, value2, "magicPower");
            return (Criteria) this;
        }

        public Criteria andMagicPowerNotBetween(Byte value1, Byte value2) {
            addCriterion("magic_power not between", value1, value2, "magicPower");
            return (Criteria) this;
        }

        public Criteria andPhysicPowerIsNull() {
            addCriterion("physic_power is null");
            return (Criteria) this;
        }

        public Criteria andPhysicPowerIsNotNull() {
            addCriterion("physic_power is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicPowerEqualTo(Byte value) {
            addCriterion("physic_power =", value, "physicPower");
            return (Criteria) this;
        }

        public Criteria andPhysicPowerNotEqualTo(Byte value) {
            addCriterion("physic_power <>", value, "physicPower");
            return (Criteria) this;
        }

        public Criteria andPhysicPowerGreaterThan(Byte value) {
            addCriterion("physic_power >", value, "physicPower");
            return (Criteria) this;
        }

        public Criteria andPhysicPowerGreaterThanOrEqualTo(Byte value) {
            addCriterion("physic_power >=", value, "physicPower");
            return (Criteria) this;
        }

        public Criteria andPhysicPowerLessThan(Byte value) {
            addCriterion("physic_power <", value, "physicPower");
            return (Criteria) this;
        }

        public Criteria andPhysicPowerLessThanOrEqualTo(Byte value) {
            addCriterion("physic_power <=", value, "physicPower");
            return (Criteria) this;
        }

        public Criteria andPhysicPowerIn(List<Byte> values) {
            addCriterion("physic_power in", values, "physicPower");
            return (Criteria) this;
        }

        public Criteria andPhysicPowerNotIn(List<Byte> values) {
            addCriterion("physic_power not in", values, "physicPower");
            return (Criteria) this;
        }

        public Criteria andPhysicPowerBetween(Byte value1, Byte value2) {
            addCriterion("physic_power between", value1, value2, "physicPower");
            return (Criteria) this;
        }

        public Criteria andPhysicPowerNotBetween(Byte value1, Byte value2) {
            addCriterion("physic_power not between", value1, value2, "physicPower");
            return (Criteria) this;
        }

        public Criteria andDefencePowerIsNull() {
            addCriterion("defence_power is null");
            return (Criteria) this;
        }

        public Criteria andDefencePowerIsNotNull() {
            addCriterion("defence_power is not null");
            return (Criteria) this;
        }

        public Criteria andDefencePowerEqualTo(Byte value) {
            addCriterion("defence_power =", value, "defencePower");
            return (Criteria) this;
        }

        public Criteria andDefencePowerNotEqualTo(Byte value) {
            addCriterion("defence_power <>", value, "defencePower");
            return (Criteria) this;
        }

        public Criteria andDefencePowerGreaterThan(Byte value) {
            addCriterion("defence_power >", value, "defencePower");
            return (Criteria) this;
        }

        public Criteria andDefencePowerGreaterThanOrEqualTo(Byte value) {
            addCriterion("defence_power >=", value, "defencePower");
            return (Criteria) this;
        }

        public Criteria andDefencePowerLessThan(Byte value) {
            addCriterion("defence_power <", value, "defencePower");
            return (Criteria) this;
        }

        public Criteria andDefencePowerLessThanOrEqualTo(Byte value) {
            addCriterion("defence_power <=", value, "defencePower");
            return (Criteria) this;
        }

        public Criteria andDefencePowerIn(List<Byte> values) {
            addCriterion("defence_power in", values, "defencePower");
            return (Criteria) this;
        }

        public Criteria andDefencePowerNotIn(List<Byte> values) {
            addCriterion("defence_power not in", values, "defencePower");
            return (Criteria) this;
        }

        public Criteria andDefencePowerBetween(Byte value1, Byte value2) {
            addCriterion("defence_power between", value1, value2, "defencePower");
            return (Criteria) this;
        }

        public Criteria andDefencePowerNotBetween(Byte value1, Byte value2) {
            addCriterion("defence_power not between", value1, value2, "defencePower");
            return (Criteria) this;
        }

        public Criteria andHandHardIsNull() {
            addCriterion("hand_hard is null");
            return (Criteria) this;
        }

        public Criteria andHandHardIsNotNull() {
            addCriterion("hand_hard is not null");
            return (Criteria) this;
        }

        public Criteria andHandHardEqualTo(Byte value) {
            addCriterion("hand_hard =", value, "handHard");
            return (Criteria) this;
        }

        public Criteria andHandHardNotEqualTo(Byte value) {
            addCriterion("hand_hard <>", value, "handHard");
            return (Criteria) this;
        }

        public Criteria andHandHardGreaterThan(Byte value) {
            addCriterion("hand_hard >", value, "handHard");
            return (Criteria) this;
        }

        public Criteria andHandHardGreaterThanOrEqualTo(Byte value) {
            addCriterion("hand_hard >=", value, "handHard");
            return (Criteria) this;
        }

        public Criteria andHandHardLessThan(Byte value) {
            addCriterion("hand_hard <", value, "handHard");
            return (Criteria) this;
        }

        public Criteria andHandHardLessThanOrEqualTo(Byte value) {
            addCriterion("hand_hard <=", value, "handHard");
            return (Criteria) this;
        }

        public Criteria andHandHardIn(List<Byte> values) {
            addCriterion("hand_hard in", values, "handHard");
            return (Criteria) this;
        }

        public Criteria andHandHardNotIn(List<Byte> values) {
            addCriterion("hand_hard not in", values, "handHard");
            return (Criteria) this;
        }

        public Criteria andHandHardBetween(Byte value1, Byte value2) {
            addCriterion("hand_hard between", value1, value2, "handHard");
            return (Criteria) this;
        }

        public Criteria andHandHardNotBetween(Byte value1, Byte value2) {
            addCriterion("hand_hard not between", value1, value2, "handHard");
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