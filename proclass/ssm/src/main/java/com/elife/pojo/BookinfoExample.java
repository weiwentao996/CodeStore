package com.elife.pojo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class BookinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookinfoExample() {
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

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookImgIsNull() {
            addCriterion("book_img is null");
            return (Criteria) this;
        }

        public Criteria andBookImgIsNotNull() {
            addCriterion("book_img is not null");
            return (Criteria) this;
        }

        public Criteria andBookImgEqualTo(String value) {
            addCriterion("book_img =", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgNotEqualTo(String value) {
            addCriterion("book_img <>", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgGreaterThan(String value) {
            addCriterion("book_img >", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgGreaterThanOrEqualTo(String value) {
            addCriterion("book_img >=", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgLessThan(String value) {
            addCriterion("book_img <", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgLessThanOrEqualTo(String value) {
            addCriterion("book_img <=", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgLike(String value) {
            addCriterion("book_img like", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgNotLike(String value) {
            addCriterion("book_img not like", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgIn(List<String> values) {
            addCriterion("book_img in", values, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgNotIn(List<String> values) {
            addCriterion("book_img not in", values, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgBetween(String value1, String value2) {
            addCriterion("book_img between", value1, value2, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgNotBetween(String value1, String value2) {
            addCriterion("book_img not between", value1, value2, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookNowPriceIsNull() {
            addCriterion("book_now_price is null");
            return (Criteria) this;
        }

        public Criteria andBookNowPriceIsNotNull() {
            addCriterion("book_now_price is not null");
            return (Criteria) this;
        }

        public Criteria andBookNowPriceEqualTo(String value) {
            addCriterion("book_now_price =", value, "bookNowPrice");
            return (Criteria) this;
        }

        public Criteria andBookNowPriceNotEqualTo(String value) {
            addCriterion("book_now_price <>", value, "bookNowPrice");
            return (Criteria) this;
        }

        public Criteria andBookNowPriceGreaterThan(String value) {
            addCriterion("book_now_price >", value, "bookNowPrice");
            return (Criteria) this;
        }

        public Criteria andBookNowPriceGreaterThanOrEqualTo(String value) {
            addCriterion("book_now_price >=", value, "bookNowPrice");
            return (Criteria) this;
        }

        public Criteria andBookNowPriceLessThan(String value) {
            addCriterion("book_now_price <", value, "bookNowPrice");
            return (Criteria) this;
        }

        public Criteria andBookNowPriceLessThanOrEqualTo(String value) {
            addCriterion("book_now_price <=", value, "bookNowPrice");
            return (Criteria) this;
        }

        public Criteria andBookNowPriceLike(String value) {
            addCriterion("book_now_price like", value, "bookNowPrice");
            return (Criteria) this;
        }

        public Criteria andBookNowPriceNotLike(String value) {
            addCriterion("book_now_price not like", value, "bookNowPrice");
            return (Criteria) this;
        }

        public Criteria andBookNowPriceIn(List<String> values) {
            addCriterion("book_now_price in", values, "bookNowPrice");
            return (Criteria) this;
        }

        public Criteria andBookNowPriceNotIn(List<String> values) {
            addCriterion("book_now_price not in", values, "bookNowPrice");
            return (Criteria) this;
        }

        public Criteria andBookNowPriceBetween(String value1, String value2) {
            addCriterion("book_now_price between", value1, value2, "bookNowPrice");
            return (Criteria) this;
        }

        public Criteria andBookNowPriceNotBetween(String value1, String value2) {
            addCriterion("book_now_price not between", value1, value2, "bookNowPrice");
            return (Criteria) this;
        }

        public Criteria andBookPrePriceIsNull() {
            addCriterion("book_pre_price is null");
            return (Criteria) this;
        }

        public Criteria andBookPrePriceIsNotNull() {
            addCriterion("book_pre_price is not null");
            return (Criteria) this;
        }

        public Criteria andBookPrePriceEqualTo(String value) {
            addCriterion("book_pre_price =", value, "bookPrePrice");
            return (Criteria) this;
        }

        public Criteria andBookPrePriceNotEqualTo(String value) {
            addCriterion("book_pre_price <>", value, "bookPrePrice");
            return (Criteria) this;
        }

        public Criteria andBookPrePriceGreaterThan(String value) {
            addCriterion("book_pre_price >", value, "bookPrePrice");
            return (Criteria) this;
        }

        public Criteria andBookPrePriceGreaterThanOrEqualTo(String value) {
            addCriterion("book_pre_price >=", value, "bookPrePrice");
            return (Criteria) this;
        }

        public Criteria andBookPrePriceLessThan(String value) {
            addCriterion("book_pre_price <", value, "bookPrePrice");
            return (Criteria) this;
        }

        public Criteria andBookPrePriceLessThanOrEqualTo(String value) {
            addCriterion("book_pre_price <=", value, "bookPrePrice");
            return (Criteria) this;
        }

        public Criteria andBookPrePriceLike(String value) {
            addCriterion("book_pre_price like", value, "bookPrePrice");
            return (Criteria) this;
        }

        public Criteria andBookPrePriceNotLike(String value) {
            addCriterion("book_pre_price not like", value, "bookPrePrice");
            return (Criteria) this;
        }

        public Criteria andBookPrePriceIn(List<String> values) {
            addCriterion("book_pre_price in", values, "bookPrePrice");
            return (Criteria) this;
        }

        public Criteria andBookPrePriceNotIn(List<String> values) {
            addCriterion("book_pre_price not in", values, "bookPrePrice");
            return (Criteria) this;
        }

        public Criteria andBookPrePriceBetween(String value1, String value2) {
            addCriterion("book_pre_price between", value1, value2, "bookPrePrice");
            return (Criteria) this;
        }

        public Criteria andBookPrePriceNotBetween(String value1, String value2) {
            addCriterion("book_pre_price not between", value1, value2, "bookPrePrice");
            return (Criteria) this;
        }

        public Criteria andBookDiscountIsNull() {
            addCriterion("book_discount is null");
            return (Criteria) this;
        }

        public Criteria andBookDiscountIsNotNull() {
            addCriterion("book_discount is not null");
            return (Criteria) this;
        }

        public Criteria andBookDiscountEqualTo(String value) {
            addCriterion("book_discount =", value, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountNotEqualTo(String value) {
            addCriterion("book_discount <>", value, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountGreaterThan(String value) {
            addCriterion("book_discount >", value, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("book_discount >=", value, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountLessThan(String value) {
            addCriterion("book_discount <", value, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountLessThanOrEqualTo(String value) {
            addCriterion("book_discount <=", value, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountLike(String value) {
            addCriterion("book_discount like", value, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountNotLike(String value) {
            addCriterion("book_discount not like", value, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountIn(List<String> values) {
            addCriterion("book_discount in", values, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountNotIn(List<String> values) {
            addCriterion("book_discount not in", values, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountBetween(String value1, String value2) {
            addCriterion("book_discount between", value1, value2, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountNotBetween(String value1, String value2) {
            addCriterion("book_discount not between", value1, value2, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNull() {
            addCriterion("book_author is null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNotNull() {
            addCriterion("book_author is not null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorEqualTo(String value) {
            addCriterion("book_author =", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotEqualTo(String value) {
            addCriterion("book_author <>", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThan(String value) {
            addCriterion("book_author >", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("book_author >=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThan(String value) {
            addCriterion("book_author <", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThanOrEqualTo(String value) {
            addCriterion("book_author <=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLike(String value) {
            addCriterion("book_author like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotLike(String value) {
            addCriterion("book_author not like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIn(List<String> values) {
            addCriterion("book_author in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotIn(List<String> values) {
            addCriterion("book_author not in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorBetween(String value1, String value2) {
            addCriterion("book_author between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotBetween(String value1, String value2) {
            addCriterion("book_author not between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookPublishIsNull() {
            addCriterion("book_publish is null");
            return (Criteria) this;
        }

        public Criteria andBookPublishIsNotNull() {
            addCriterion("book_publish is not null");
            return (Criteria) this;
        }

        public Criteria andBookPublishEqualTo(String value) {
            addCriterion("book_publish =", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishNotEqualTo(String value) {
            addCriterion("book_publish <>", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishGreaterThan(String value) {
            addCriterion("book_publish >", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishGreaterThanOrEqualTo(String value) {
            addCriterion("book_publish >=", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishLessThan(String value) {
            addCriterion("book_publish <", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishLessThanOrEqualTo(String value) {
            addCriterion("book_publish <=", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishLike(String value) {
            addCriterion("book_publish like", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishNotLike(String value) {
            addCriterion("book_publish not like", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishIn(List<String> values) {
            addCriterion("book_publish in", values, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishNotIn(List<String> values) {
            addCriterion("book_publish not in", values, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishBetween(String value1, String value2) {
            addCriterion("book_publish between", value1, value2, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishNotBetween(String value1, String value2) {
            addCriterion("book_publish not between", value1, value2, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateIsNull() {
            addCriterion("book_publish_date is null");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateIsNotNull() {
            addCriterion("book_publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateEqualTo(String value) {
            addCriterion("book_publish_date =", value, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateNotEqualTo(String value) {
            addCriterion("book_publish_date <>", value, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateGreaterThan(String value) {
            addCriterion("book_publish_date >", value, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateGreaterThanOrEqualTo(String value) {
            addCriterion("book_publish_date >=", value, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateLessThan(String value) {
            addCriterion("book_publish_date <", value, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateLessThanOrEqualTo(String value) {
            addCriterion("book_publish_date <=", value, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateLike(String value) {
            addCriterion("book_publish_date like", value, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateNotLike(String value) {
            addCriterion("book_publish_date not like", value, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateIn(List<String> values) {
            addCriterion("book_publish_date in", values, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateNotIn(List<String> values) {
            addCriterion("book_publish_date not in", values, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateBetween(String value1, String value2) {
            addCriterion("book_publish_date between", value1, value2, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateNotBetween(String value1, String value2) {
            addCriterion("book_publish_date not between", value1, value2, "bookPublishDate");
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