package jmu.hw.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BorrowTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowTypeExample() {
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

        public Criteria andBorrowTypeNameIsNull() {
            addCriterion("borrow_type_name is null");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNameIsNotNull() {
            addCriterion("borrow_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNameEqualTo(String value) {
            addCriterion("borrow_type_name =", value, "borrowTypeName");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNameNotEqualTo(String value) {
            addCriterion("borrow_type_name <>", value, "borrowTypeName");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNameGreaterThan(String value) {
            addCriterion("borrow_type_name >", value, "borrowTypeName");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_type_name >=", value, "borrowTypeName");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNameLessThan(String value) {
            addCriterion("borrow_type_name <", value, "borrowTypeName");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNameLessThanOrEqualTo(String value) {
            addCriterion("borrow_type_name <=", value, "borrowTypeName");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNameLike(String value) {
            addCriterion("borrow_type_name like", value, "borrowTypeName");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNameNotLike(String value) {
            addCriterion("borrow_type_name not like", value, "borrowTypeName");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNameIn(List<String> values) {
            addCriterion("borrow_type_name in", values, "borrowTypeName");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNameNotIn(List<String> values) {
            addCriterion("borrow_type_name not in", values, "borrowTypeName");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNameBetween(String value1, String value2) {
            addCriterion("borrow_type_name between", value1, value2, "borrowTypeName");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNameNotBetween(String value1, String value2) {
            addCriterion("borrow_type_name not between", value1, value2, "borrowTypeName");
            return (Criteria) this;
        }

        public Criteria andFineUnivalenceIsNull() {
            addCriterion("fine_univalence is null");
            return (Criteria) this;
        }

        public Criteria andFineUnivalenceIsNotNull() {
            addCriterion("fine_univalence is not null");
            return (Criteria) this;
        }

        public Criteria andFineUnivalenceEqualTo(BigDecimal value) {
            addCriterion("fine_univalence =", value, "fineUnivalence");
            return (Criteria) this;
        }

        public Criteria andFineUnivalenceNotEqualTo(BigDecimal value) {
            addCriterion("fine_univalence <>", value, "fineUnivalence");
            return (Criteria) this;
        }

        public Criteria andFineUnivalenceGreaterThan(BigDecimal value) {
            addCriterion("fine_univalence >", value, "fineUnivalence");
            return (Criteria) this;
        }

        public Criteria andFineUnivalenceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fine_univalence >=", value, "fineUnivalence");
            return (Criteria) this;
        }

        public Criteria andFineUnivalenceLessThan(BigDecimal value) {
            addCriterion("fine_univalence <", value, "fineUnivalence");
            return (Criteria) this;
        }

        public Criteria andFineUnivalenceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fine_univalence <=", value, "fineUnivalence");
            return (Criteria) this;
        }

        public Criteria andFineUnivalenceIn(List<BigDecimal> values) {
            addCriterion("fine_univalence in", values, "fineUnivalence");
            return (Criteria) this;
        }

        public Criteria andFineUnivalenceNotIn(List<BigDecimal> values) {
            addCriterion("fine_univalence not in", values, "fineUnivalence");
            return (Criteria) this;
        }

        public Criteria andFineUnivalenceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fine_univalence between", value1, value2, "fineUnivalence");
            return (Criteria) this;
        }

        public Criteria andFineUnivalenceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fine_univalence not between", value1, value2, "fineUnivalence");
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