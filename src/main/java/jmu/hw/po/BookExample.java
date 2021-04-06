package jmu.hw.po;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookCallnoIsNull() {
            addCriterion("book_callno is null");
            return (Criteria) this;
        }

        public Criteria andBookCallnoIsNotNull() {
            addCriterion("book_callno is not null");
            return (Criteria) this;
        }

        public Criteria andBookCallnoEqualTo(String value) {
            addCriterion("book_callno =", value, "bookCallno");
            return (Criteria) this;
        }

        public Criteria andBookCallnoNotEqualTo(String value) {
            addCriterion("book_callno <>", value, "bookCallno");
            return (Criteria) this;
        }

        public Criteria andBookCallnoGreaterThan(String value) {
            addCriterion("book_callno >", value, "bookCallno");
            return (Criteria) this;
        }

        public Criteria andBookCallnoGreaterThanOrEqualTo(String value) {
            addCriterion("book_callno >=", value, "bookCallno");
            return (Criteria) this;
        }

        public Criteria andBookCallnoLessThan(String value) {
            addCriterion("book_callno <", value, "bookCallno");
            return (Criteria) this;
        }

        public Criteria andBookCallnoLessThanOrEqualTo(String value) {
            addCriterion("book_callno <=", value, "bookCallno");
            return (Criteria) this;
        }

        public Criteria andBookCallnoLike(String value) {
            addCriterion("book_callno like", value, "bookCallno");
            return (Criteria) this;
        }

        public Criteria andBookCallnoNotLike(String value) {
            addCriterion("book_callno not like", value, "bookCallno");
            return (Criteria) this;
        }

        public Criteria andBookCallnoIn(List<String> values) {
            addCriterion("book_callno in", values, "bookCallno");
            return (Criteria) this;
        }

        public Criteria andBookCallnoNotIn(List<String> values) {
            addCriterion("book_callno not in", values, "bookCallno");
            return (Criteria) this;
        }

        public Criteria andBookCallnoBetween(String value1, String value2) {
            addCriterion("book_callno between", value1, value2, "bookCallno");
            return (Criteria) this;
        }

        public Criteria andBookCallnoNotBetween(String value1, String value2) {
            addCriterion("book_callno not between", value1, value2, "bookCallno");
            return (Criteria) this;
        }

        public Criteria andBookStateIsNull() {
            addCriterion("book_state is null");
            return (Criteria) this;
        }

        public Criteria andBookStateIsNotNull() {
            addCriterion("book_state is not null");
            return (Criteria) this;
        }

        public Criteria andBookStateEqualTo(String value) {
            addCriterion("book_state =", value, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateNotEqualTo(String value) {
            addCriterion("book_state <>", value, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateGreaterThan(String value) {
            addCriterion("book_state >", value, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateGreaterThanOrEqualTo(String value) {
            addCriterion("book_state >=", value, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateLessThan(String value) {
            addCriterion("book_state <", value, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateLessThanOrEqualTo(String value) {
            addCriterion("book_state <=", value, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateLike(String value) {
            addCriterion("book_state like", value, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateNotLike(String value) {
            addCriterion("book_state not like", value, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateIn(List<String> values) {
            addCriterion("book_state in", values, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateNotIn(List<String> values) {
            addCriterion("book_state not in", values, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateBetween(String value1, String value2) {
            addCriterion("book_state between", value1, value2, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateNotBetween(String value1, String value2) {
            addCriterion("book_state not between", value1, value2, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookDamageIsNull() {
            addCriterion("book_damage is null");
            return (Criteria) this;
        }

        public Criteria andBookDamageIsNotNull() {
            addCriterion("book_damage is not null");
            return (Criteria) this;
        }

        public Criteria andBookDamageEqualTo(int i) {
            addCriterion("book_damage =", i, "bookDamage");
            return (Criteria) this;
        }

        public Criteria andBookDamageNotEqualTo(int i) {
            addCriterion("book_damage <>", i, "bookDamage");
            return (Criteria) this;
        }

        public Criteria andBookDamageGreaterThan(Byte value) {
            addCriterion("book_damage >", value, "bookDamage");
            return (Criteria) this;
        }

        public Criteria andBookDamageGreaterThanOrEqualTo(Byte value) {
            addCriterion("book_damage >=", value, "bookDamage");
            return (Criteria) this;
        }

        public Criteria andBookDamageLessThan(Byte value) {
            addCriterion("book_damage <", value, "bookDamage");
            return (Criteria) this;
        }

        public Criteria andBookDamageLessThanOrEqualTo(Byte value) {
            addCriterion("book_damage <=", value, "bookDamage");
            return (Criteria) this;
        }

        public Criteria andBookDamageIn(List<Byte> values) {
            addCriterion("book_damage in", values, "bookDamage");
            return (Criteria) this;
        }

        public Criteria andBookDamageNotIn(List<Byte> values) {
            addCriterion("book_damage not in", values, "bookDamage");
            return (Criteria) this;
        }

        public Criteria andBookDamageBetween(Byte value1, Byte value2) {
            addCriterion("book_damage between", value1, value2, "bookDamage");
            return (Criteria) this;
        }

        public Criteria andBookDamageNotBetween(Byte value1, Byte value2) {
            addCriterion("book_damage not between", value1, value2, "bookDamage");
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