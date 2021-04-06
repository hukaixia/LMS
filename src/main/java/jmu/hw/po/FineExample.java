package jmu.hw.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FineExample() {
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

        public Criteria andFineIdIsNull() {
            addCriterion("fine_id is null");
            return (Criteria) this;
        }

        public Criteria andFineIdIsNotNull() {
            addCriterion("fine_id is not null");
            return (Criteria) this;
        }

        public Criteria andFineIdEqualTo(Integer value) {
            addCriterion("fine_id =", value, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdNotEqualTo(Integer value) {
            addCriterion("fine_id <>", value, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdGreaterThan(Integer value) {
            addCriterion("fine_id >", value, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fine_id >=", value, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdLessThan(Integer value) {
            addCriterion("fine_id <", value, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdLessThanOrEqualTo(Integer value) {
            addCriterion("fine_id <=", value, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdIn(List<Integer> values) {
            addCriterion("fine_id in", values, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdNotIn(List<Integer> values) {
            addCriterion("fine_id not in", values, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdBetween(Integer value1, Integer value2) {
            addCriterion("fine_id between", value1, value2, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fine_id not between", value1, value2, "fineId");
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(String value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(String value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(String value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(String value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(String value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLike(String value) {
            addCriterion("admin_id like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotLike(String value) {
            addCriterion("admin_id not like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<String> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<String> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(String value1, String value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(String value1, String value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
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

        public Criteria andFineTimeIsNull() {
            addCriterion("fine_time is null");
            return (Criteria) this;
        }

        public Criteria andFineTimeIsNotNull() {
            addCriterion("fine_time is not null");
            return (Criteria) this;
        }

        public Criteria andFineTimeEqualTo(Date value) {
            addCriterionForJDBCDate("fine_time =", value, "fineTime");
            return (Criteria) this;
        }

        public Criteria andFineTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("fine_time <>", value, "fineTime");
            return (Criteria) this;
        }

        public Criteria andFineTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("fine_time >", value, "fineTime");
            return (Criteria) this;
        }

        public Criteria andFineTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fine_time >=", value, "fineTime");
            return (Criteria) this;
        }

        public Criteria andFineTimeLessThan(Date value) {
            addCriterionForJDBCDate("fine_time <", value, "fineTime");
            return (Criteria) this;
        }

        public Criteria andFineTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fine_time <=", value, "fineTime");
            return (Criteria) this;
        }

        public Criteria andFineTimeIn(List<Date> values) {
            addCriterionForJDBCDate("fine_time in", values, "fineTime");
            return (Criteria) this;
        }

        public Criteria andFineTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("fine_time not in", values, "fineTime");
            return (Criteria) this;
        }

        public Criteria andFineTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fine_time between", value1, value2, "fineTime");
            return (Criteria) this;
        }

        public Criteria andFineTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fine_time not between", value1, value2, "fineTime");
            return (Criteria) this;
        }

        public Criteria andFineTotalIsNull() {
            addCriterion("fine_total is null");
            return (Criteria) this;
        }

        public Criteria andFineTotalIsNotNull() {
            addCriterion("fine_total is not null");
            return (Criteria) this;
        }

        public Criteria andFineTotalEqualTo(BigDecimal value) {
            addCriterion("fine_total =", value, "fineTotal");
            return (Criteria) this;
        }

        public Criteria andFineTotalNotEqualTo(BigDecimal value) {
            addCriterion("fine_total <>", value, "fineTotal");
            return (Criteria) this;
        }

        public Criteria andFineTotalGreaterThan(BigDecimal value) {
            addCriterion("fine_total >", value, "fineTotal");
            return (Criteria) this;
        }

        public Criteria andFineTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fine_total >=", value, "fineTotal");
            return (Criteria) this;
        }

        public Criteria andFineTotalLessThan(BigDecimal value) {
            addCriterion("fine_total <", value, "fineTotal");
            return (Criteria) this;
        }

        public Criteria andFineTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fine_total <=", value, "fineTotal");
            return (Criteria) this;
        }

        public Criteria andFineTotalIn(List<BigDecimal> values) {
            addCriterion("fine_total in", values, "fineTotal");
            return (Criteria) this;
        }

        public Criteria andFineTotalNotIn(List<BigDecimal> values) {
            addCriterion("fine_total not in", values, "fineTotal");
            return (Criteria) this;
        }

        public Criteria andFineTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fine_total between", value1, value2, "fineTotal");
            return (Criteria) this;
        }

        public Criteria andFineTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fine_total not between", value1, value2, "fineTotal");
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