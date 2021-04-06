package jmu.hw.po;

import java.util.ArrayList;
import java.util.List;

public class BorrowRequireExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowRequireExample() {
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

        public Criteria andBorrowTypeIdIsNull() {
            addCriterion("borrow_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIdIsNotNull() {
            addCriterion("borrow_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIdEqualTo(String value) {
            addCriterion("borrow_type_id =", value, "borrowTypeId");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIdNotEqualTo(String value) {
            addCriterion("borrow_type_id <>", value, "borrowTypeId");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIdGreaterThan(String value) {
            addCriterion("borrow_type_id >", value, "borrowTypeId");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_type_id >=", value, "borrowTypeId");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIdLessThan(String value) {
            addCriterion("borrow_type_id <", value, "borrowTypeId");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIdLessThanOrEqualTo(String value) {
            addCriterion("borrow_type_id <=", value, "borrowTypeId");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIdLike(String value) {
            addCriterion("borrow_type_id like", value, "borrowTypeId");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIdNotLike(String value) {
            addCriterion("borrow_type_id not like", value, "borrowTypeId");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIdIn(List<String> values) {
            addCriterion("borrow_type_id in", values, "borrowTypeId");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIdNotIn(List<String> values) {
            addCriterion("borrow_type_id not in", values, "borrowTypeId");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIdBetween(String value1, String value2) {
            addCriterion("borrow_type_id between", value1, value2, "borrowTypeId");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIdNotBetween(String value1, String value2) {
            addCriterion("borrow_type_id not between", value1, value2, "borrowTypeId");
            return (Criteria) this;
        }

        public Criteria andReaderTypeIdIsNull() {
            addCriterion("reader_type_id is null");
            return (Criteria) this;
        }

        public Criteria andReaderTypeIdIsNotNull() {
            addCriterion("reader_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andReaderTypeIdEqualTo(String value) {
            addCriterion("reader_type_id =", value, "readerTypeId");
            return (Criteria) this;
        }

        public Criteria andReaderTypeIdNotEqualTo(String value) {
            addCriterion("reader_type_id <>", value, "readerTypeId");
            return (Criteria) this;
        }

        public Criteria andReaderTypeIdGreaterThan(String value) {
            addCriterion("reader_type_id >", value, "readerTypeId");
            return (Criteria) this;
        }

        public Criteria andReaderTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("reader_type_id >=", value, "readerTypeId");
            return (Criteria) this;
        }

        public Criteria andReaderTypeIdLessThan(String value) {
            addCriterion("reader_type_id <", value, "readerTypeId");
            return (Criteria) this;
        }

        public Criteria andReaderTypeIdLessThanOrEqualTo(String value) {
            addCriterion("reader_type_id <=", value, "readerTypeId");
            return (Criteria) this;
        }

        public Criteria andReaderTypeIdLike(String value) {
            addCriterion("reader_type_id like", value, "readerTypeId");
            return (Criteria) this;
        }

        public Criteria andReaderTypeIdNotLike(String value) {
            addCriterion("reader_type_id not like", value, "readerTypeId");
            return (Criteria) this;
        }

        public Criteria andReaderTypeIdIn(List<String> values) {
            addCriterion("reader_type_id in", values, "readerTypeId");
            return (Criteria) this;
        }

        public Criteria andReaderTypeIdNotIn(List<String> values) {
            addCriterion("reader_type_id not in", values, "readerTypeId");
            return (Criteria) this;
        }

        public Criteria andReaderTypeIdBetween(String value1, String value2) {
            addCriterion("reader_type_id between", value1, value2, "readerTypeId");
            return (Criteria) this;
        }

        public Criteria andReaderTypeIdNotBetween(String value1, String value2) {
            addCriterion("reader_type_id not between", value1, value2, "readerTypeId");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodIsNull() {
            addCriterion("borrow_period is null");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodIsNotNull() {
            addCriterion("borrow_period is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodEqualTo(Short value) {
            addCriterion("borrow_period =", value, "borrowPeriod");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodNotEqualTo(Short value) {
            addCriterion("borrow_period <>", value, "borrowPeriod");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodGreaterThan(Short value) {
            addCriterion("borrow_period >", value, "borrowPeriod");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodGreaterThanOrEqualTo(Short value) {
            addCriterion("borrow_period >=", value, "borrowPeriod");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodLessThan(Short value) {
            addCriterion("borrow_period <", value, "borrowPeriod");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodLessThanOrEqualTo(Short value) {
            addCriterion("borrow_period <=", value, "borrowPeriod");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodIn(List<Short> values) {
            addCriterion("borrow_period in", values, "borrowPeriod");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodNotIn(List<Short> values) {
            addCriterion("borrow_period not in", values, "borrowPeriod");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodBetween(Short value1, Short value2) {
            addCriterion("borrow_period between", value1, value2, "borrowPeriod");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodNotBetween(Short value1, Short value2) {
            addCriterion("borrow_period not between", value1, value2, "borrowPeriod");
            return (Criteria) this;
        }

        public Criteria andBookNumberIsNull() {
            addCriterion("book_number is null");
            return (Criteria) this;
        }

        public Criteria andBookNumberIsNotNull() {
            addCriterion("book_number is not null");
            return (Criteria) this;
        }

        public Criteria andBookNumberEqualTo(Short value) {
            addCriterion("book_number =", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberNotEqualTo(Short value) {
            addCriterion("book_number <>", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberGreaterThan(Short value) {
            addCriterion("book_number >", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("book_number >=", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberLessThan(Short value) {
            addCriterion("book_number <", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberLessThanOrEqualTo(Short value) {
            addCriterion("book_number <=", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberIn(List<Short> values) {
            addCriterion("book_number in", values, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberNotIn(List<Short> values) {
            addCriterion("book_number not in", values, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberBetween(Short value1, Short value2) {
            addCriterion("book_number between", value1, value2, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberNotBetween(Short value1, Short value2) {
            addCriterion("book_number not between", value1, value2, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysIsNull() {
            addCriterion("renewal_days is null");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysIsNotNull() {
            addCriterion("renewal_days is not null");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysEqualTo(Short value) {
            addCriterion("renewal_days =", value, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysNotEqualTo(Short value) {
            addCriterion("renewal_days <>", value, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysGreaterThan(Short value) {
            addCriterion("renewal_days >", value, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("renewal_days >=", value, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysLessThan(Short value) {
            addCriterion("renewal_days <", value, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysLessThanOrEqualTo(Short value) {
            addCriterion("renewal_days <=", value, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysIn(List<Short> values) {
            addCriterion("renewal_days in", values, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysNotIn(List<Short> values) {
            addCriterion("renewal_days not in", values, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysBetween(Short value1, Short value2) {
            addCriterion("renewal_days between", value1, value2, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysNotBetween(Short value1, Short value2) {
            addCriterion("renewal_days not between", value1, value2, "renewalDays");
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