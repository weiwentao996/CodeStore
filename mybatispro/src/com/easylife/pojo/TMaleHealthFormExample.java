package com.easylife.pojo;

import java.util.ArrayList;
import java.util.List;

public class TMaleHealthFormExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMaleHealthFormExample() {
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

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andHeartIsNull() {
            addCriterion("heart is null");
            return (Criteria) this;
        }

        public Criteria andHeartIsNotNull() {
            addCriterion("heart is not null");
            return (Criteria) this;
        }

        public Criteria andHeartEqualTo(String value) {
            addCriterion("heart =", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartNotEqualTo(String value) {
            addCriterion("heart <>", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartGreaterThan(String value) {
            addCriterion("heart >", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartGreaterThanOrEqualTo(String value) {
            addCriterion("heart >=", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartLessThan(String value) {
            addCriterion("heart <", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartLessThanOrEqualTo(String value) {
            addCriterion("heart <=", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartLike(String value) {
            addCriterion("heart like", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartNotLike(String value) {
            addCriterion("heart not like", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartIn(List<String> values) {
            addCriterion("heart in", values, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartNotIn(List<String> values) {
            addCriterion("heart not in", values, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartBetween(String value1, String value2) {
            addCriterion("heart between", value1, value2, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartNotBetween(String value1, String value2) {
            addCriterion("heart not between", value1, value2, "heart");
            return (Criteria) this;
        }

        public Criteria andLiverIsNull() {
            addCriterion("liver is null");
            return (Criteria) this;
        }

        public Criteria andLiverIsNotNull() {
            addCriterion("liver is not null");
            return (Criteria) this;
        }

        public Criteria andLiverEqualTo(String value) {
            addCriterion("liver =", value, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverNotEqualTo(String value) {
            addCriterion("liver <>", value, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverGreaterThan(String value) {
            addCriterion("liver >", value, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverGreaterThanOrEqualTo(String value) {
            addCriterion("liver >=", value, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverLessThan(String value) {
            addCriterion("liver <", value, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverLessThanOrEqualTo(String value) {
            addCriterion("liver <=", value, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverLike(String value) {
            addCriterion("liver like", value, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverNotLike(String value) {
            addCriterion("liver not like", value, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverIn(List<String> values) {
            addCriterion("liver in", values, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverNotIn(List<String> values) {
            addCriterion("liver not in", values, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverBetween(String value1, String value2) {
            addCriterion("liver between", value1, value2, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverNotBetween(String value1, String value2) {
            addCriterion("liver not between", value1, value2, "liver");
            return (Criteria) this;
        }

        public Criteria andSpleenIsNull() {
            addCriterion("spleen is null");
            return (Criteria) this;
        }

        public Criteria andSpleenIsNotNull() {
            addCriterion("spleen is not null");
            return (Criteria) this;
        }

        public Criteria andSpleenEqualTo(String value) {
            addCriterion("spleen =", value, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenNotEqualTo(String value) {
            addCriterion("spleen <>", value, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenGreaterThan(String value) {
            addCriterion("spleen >", value, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenGreaterThanOrEqualTo(String value) {
            addCriterion("spleen >=", value, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenLessThan(String value) {
            addCriterion("spleen <", value, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenLessThanOrEqualTo(String value) {
            addCriterion("spleen <=", value, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenLike(String value) {
            addCriterion("spleen like", value, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenNotLike(String value) {
            addCriterion("spleen not like", value, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenIn(List<String> values) {
            addCriterion("spleen in", values, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenNotIn(List<String> values) {
            addCriterion("spleen not in", values, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenBetween(String value1, String value2) {
            addCriterion("spleen between", value1, value2, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenNotBetween(String value1, String value2) {
            addCriterion("spleen not between", value1, value2, "spleen");
            return (Criteria) this;
        }

        public Criteria andLungIsNull() {
            addCriterion("lung is null");
            return (Criteria) this;
        }

        public Criteria andLungIsNotNull() {
            addCriterion("lung is not null");
            return (Criteria) this;
        }

        public Criteria andLungEqualTo(String value) {
            addCriterion("lung =", value, "lung");
            return (Criteria) this;
        }

        public Criteria andLungNotEqualTo(String value) {
            addCriterion("lung <>", value, "lung");
            return (Criteria) this;
        }

        public Criteria andLungGreaterThan(String value) {
            addCriterion("lung >", value, "lung");
            return (Criteria) this;
        }

        public Criteria andLungGreaterThanOrEqualTo(String value) {
            addCriterion("lung >=", value, "lung");
            return (Criteria) this;
        }

        public Criteria andLungLessThan(String value) {
            addCriterion("lung <", value, "lung");
            return (Criteria) this;
        }

        public Criteria andLungLessThanOrEqualTo(String value) {
            addCriterion("lung <=", value, "lung");
            return (Criteria) this;
        }

        public Criteria andLungLike(String value) {
            addCriterion("lung like", value, "lung");
            return (Criteria) this;
        }

        public Criteria andLungNotLike(String value) {
            addCriterion("lung not like", value, "lung");
            return (Criteria) this;
        }

        public Criteria andLungIn(List<String> values) {
            addCriterion("lung in", values, "lung");
            return (Criteria) this;
        }

        public Criteria andLungNotIn(List<String> values) {
            addCriterion("lung not in", values, "lung");
            return (Criteria) this;
        }

        public Criteria andLungBetween(String value1, String value2) {
            addCriterion("lung between", value1, value2, "lung");
            return (Criteria) this;
        }

        public Criteria andLungNotBetween(String value1, String value2) {
            addCriterion("lung not between", value1, value2, "lung");
            return (Criteria) this;
        }

        public Criteria andKidneyIsNull() {
            addCriterion("kidney is null");
            return (Criteria) this;
        }

        public Criteria andKidneyIsNotNull() {
            addCriterion("kidney is not null");
            return (Criteria) this;
        }

        public Criteria andKidneyEqualTo(String value) {
            addCriterion("kidney =", value, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyNotEqualTo(String value) {
            addCriterion("kidney <>", value, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyGreaterThan(String value) {
            addCriterion("kidney >", value, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyGreaterThanOrEqualTo(String value) {
            addCriterion("kidney >=", value, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyLessThan(String value) {
            addCriterion("kidney <", value, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyLessThanOrEqualTo(String value) {
            addCriterion("kidney <=", value, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyLike(String value) {
            addCriterion("kidney like", value, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyNotLike(String value) {
            addCriterion("kidney not like", value, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyIn(List<String> values) {
            addCriterion("kidney in", values, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyNotIn(List<String> values) {
            addCriterion("kidney not in", values, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyBetween(String value1, String value2) {
            addCriterion("kidney between", value1, value2, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyNotBetween(String value1, String value2) {
            addCriterion("kidney not between", value1, value2, "kidney");
            return (Criteria) this;
        }

        public Criteria andProstateIsNull() {
            addCriterion("prostate is null");
            return (Criteria) this;
        }

        public Criteria andProstateIsNotNull() {
            addCriterion("prostate is not null");
            return (Criteria) this;
        }

        public Criteria andProstateEqualTo(String value) {
            addCriterion("prostate =", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateNotEqualTo(String value) {
            addCriterion("prostate <>", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateGreaterThan(String value) {
            addCriterion("prostate >", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateGreaterThanOrEqualTo(String value) {
            addCriterion("prostate >=", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateLessThan(String value) {
            addCriterion("prostate <", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateLessThanOrEqualTo(String value) {
            addCriterion("prostate <=", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateLike(String value) {
            addCriterion("prostate like", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateNotLike(String value) {
            addCriterion("prostate not like", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateIn(List<String> values) {
            addCriterion("prostate in", values, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateNotIn(List<String> values) {
            addCriterion("prostate not in", values, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateBetween(String value1, String value2) {
            addCriterion("prostate between", value1, value2, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateNotBetween(String value1, String value2) {
            addCriterion("prostate not between", value1, value2, "prostate");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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