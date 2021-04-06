package jmu.hw.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BorrowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andReaderIdIsNull() {
            addCriterion("reader_id is null");
            return (Criteria) this;
        }

        public Criteria andReaderIdIsNotNull() {
            addCriterion("reader_id is not null");
            return (Criteria) this;
        }

        public Criteria andReaderIdEqualTo(String value) {
            addCriterion("reader_id =", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdNotEqualTo(String value) {
            addCriterion("reader_id <>", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdGreaterThan(String value) {
            addCriterion("reader_id >", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdGreaterThanOrEqualTo(String value) {
            addCriterion("reader_id >=", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdLessThan(String value) {
            addCriterion("reader_id <", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdLessThanOrEqualTo(String value) {
            addCriterion("reader_id <=", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdLike(String value) {
            addCriterion("reader_id like", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdNotLike(String value) {
            addCriterion("reader_id not like", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdIn(List<String> values) {
            addCriterion("reader_id in", values, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdNotIn(List<String> values) {
            addCriterion("reader_id not in", values, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdBetween(String value1, String value2) {
            addCriterion("reader_id between", value1, value2, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdNotBetween(String value1, String value2) {
            addCriterion("reader_id not between", value1, value2, "readerId");
            return (Criteria) this;
        }

        public Criteria andBorrowDateIsNull() {
            addCriterion("borrow_date is null");
            return (Criteria) this;
        }

        public Criteria andBorrowDateIsNotNull() {
            addCriterion("borrow_date is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowDateEqualTo(Date value) {
            addCriterionForJDBCDate("borrow_date =", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("borrow_date <>", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateGreaterThan(Date value) {
            addCriterionForJDBCDate("borrow_date >", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("borrow_date >=", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateLessThan(Date value) {
            addCriterionForJDBCDate("borrow_date <", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("borrow_date <=", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateIn(List<Date> values) {
            addCriterionForJDBCDate("borrow_date in", values, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("borrow_date not in", values, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("borrow_date between", value1, value2, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("borrow_date not between", value1, value2, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNull() {
            addCriterion("return_date is null");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNotNull() {
            addCriterion("return_date is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDateEqualTo(Date value) {
            addCriterionForJDBCDate("return_date =", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("return_date <>", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThan(Date value) {
            addCriterionForJDBCDate("return_date >", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("return_date >=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThan(Date value) {
            addCriterionForJDBCDate("return_date <", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("return_date <=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIn(List<Date> values) {
            addCriterionForJDBCDate("return_date in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("return_date not in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("return_date between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("return_date not between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andBorrowStateIsNull() {
            addCriterion("borrow_state is null");
            return (Criteria) this;
        }

        public Criteria andBorrowStateIsNotNull() {
            addCriterion("borrow_state is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowStateEqualTo(Boolean value) {
            addCriterion("borrow_state =", value, "borrowState");
            return (Criteria) this;
        }

        public Criteria andBorrowStateNotEqualTo(Boolean value) {
            addCriterion("borrow_state <>", value, "borrowState");
            return (Criteria) this;
        }

        public Criteria andBorrowStateGreaterThan(Boolean value) {
            addCriterion("borrow_state >", value, "borrowState");
            return (Criteria) this;
        }

        public Criteria andBorrowStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("borrow_state >=", value, "borrowState");
            return (Criteria) this;
        }

        public Criteria andBorrowStateLessThan(Boolean value) {
            addCriterion("borrow_state <", value, "borrowState");
            return (Criteria) this;
        }

        public Criteria andBorrowStateLessThanOrEqualTo(Boolean value) {
            addCriterion("borrow_state <=", value, "borrowState");
            return (Criteria) this;
        }

        public Criteria andBorrowStateIn(List<Boolean> values) {
            addCriterion("borrow_state in", values, "borrowState");
            return (Criteria) this;
        }

        public Criteria andBorrowStateNotIn(List<Boolean> values) {
            addCriterion("borrow_state not in", values, "borrowState");
            return (Criteria) this;
        }

        public Criteria andBorrowStateBetween(Boolean value1, Boolean value2) {
            addCriterion("borrow_state between", value1, value2, "borrowState");
            return (Criteria) this;
        }

        public Criteria andBorrowStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("borrow_state not between", value1, value2, "borrowState");
            return (Criteria) this;
        }

        public Criteria andRenewStateIsNull() {
            addCriterion("renew_state is null");
            return (Criteria) this;
        }

        public Criteria andRenewStateIsNotNull() {
            addCriterion("renew_state is not null");
            return (Criteria) this;
        }

        public Criteria andRenewStateEqualTo(Short value) {
            addCriterion("renew_state =", value, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateNotEqualTo(Short value) {
            addCriterion("renew_state <>", value, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateGreaterThan(Short value) {
            addCriterion("renew_state >", value, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateGreaterThanOrEqualTo(Short value) {
            addCriterion("renew_state >=", value, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateLessThan(Short value) {
            addCriterion("renew_state <", value, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateLessThanOrEqualTo(Short value) {
            addCriterion("renew_state <=", value, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateIn(List<Short> values) {
            addCriterion("renew_state in", values, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateNotIn(List<Short> values) {
            addCriterion("renew_state not in", values, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateBetween(Short value1, Short value2) {
            addCriterion("renew_state between", value1, value2, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateNotBetween(Short value1, Short value2) {
            addCriterion("renew_state not between", value1, value2, "renewState");
            return (Criteria) this;
        }

        public Criteria andReturnReadateIsNull() {
            addCriterion("return_readate is null");
            return (Criteria) this;
        }

        public Criteria andReturnReadateIsNotNull() {
            addCriterion("return_readate is not null");
            return (Criteria) this;
        }

        public Criteria andReturnReadateEqualTo(Date value) {
            addCriterionForJDBCDate("return_readate =", value, "returnReadate");
            return (Criteria) this;
        }

        public Criteria andReturnReadateNotEqualTo(Date value) {
            addCriterionForJDBCDate("return_readate <>", value, "returnReadate");
            return (Criteria) this;
        }

        public Criteria andReturnReadateGreaterThan(Date value) {
            addCriterionForJDBCDate("return_readate >", value, "returnReadate");
            return (Criteria) this;
        }

        public Criteria andReturnReadateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("return_readate >=", value, "returnReadate");
            return (Criteria) this;
        }

        public Criteria andReturnReadateLessThan(Date value) {
            addCriterionForJDBCDate("return_readate <", value, "returnReadate");
            return (Criteria) this;
        }

        public Criteria andReturnReadateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("return_readate <=", value, "returnReadate");
            return (Criteria) this;
        }

        public Criteria andReturnReadateIn(List<Date> values) {
            addCriterionForJDBCDate("return_readate in", values, "returnReadate");
            return (Criteria) this;
        }

        public Criteria andReturnReadateNotIn(List<Date> values) {
            addCriterionForJDBCDate("return_readate not in", values, "returnReadate");
            return (Criteria) this;
        }

        public Criteria andReturnReadateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("return_readate between", value1, value2, "returnReadate");
            return (Criteria) this;
        }

        public Criteria andReturnReadateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("return_readate not between", value1, value2, "returnReadate");
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