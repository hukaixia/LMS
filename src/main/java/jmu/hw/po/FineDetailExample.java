package jmu.hw.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FineDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FineDetailExample() {
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

        public Criteria andFineDetailIdIsNull() {
            addCriterion("fine_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andFineDetailIdIsNotNull() {
            addCriterion("fine_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andFineDetailIdEqualTo(Integer value) {
            addCriterion("fine_detail_id =", value, "fineDetailId");
            return (Criteria) this;
        }

        public Criteria andFineDetailIdNotEqualTo(Integer value) {
            addCriterion("fine_detail_id <>", value, "fineDetailId");
            return (Criteria) this;
        }

        public Criteria andFineDetailIdGreaterThan(Integer value) {
            addCriterion("fine_detail_id >", value, "fineDetailId");
            return (Criteria) this;
        }

        public Criteria andFineDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fine_detail_id >=", value, "fineDetailId");
            return (Criteria) this;
        }

        public Criteria andFineDetailIdLessThan(Integer value) {
            addCriterion("fine_detail_id <", value, "fineDetailId");
            return (Criteria) this;
        }

        public Criteria andFineDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("fine_detail_id <=", value, "fineDetailId");
            return (Criteria) this;
        }

        public Criteria andFineDetailIdIn(List<Integer> values) {
            addCriterion("fine_detail_id in", values, "fineDetailId");
            return (Criteria) this;
        }

        public Criteria andFineDetailIdNotIn(List<Integer> values) {
            addCriterion("fine_detail_id not in", values, "fineDetailId");
            return (Criteria) this;
        }

        public Criteria andFineDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("fine_detail_id between", value1, value2, "fineDetailId");
            return (Criteria) this;
        }

        public Criteria andFineDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fine_detail_id not between", value1, value2, "fineDetailId");
            return (Criteria) this;
        }

        public Criteria andFineReasonIsNull() {
            addCriterion("fine_reason is null");
            return (Criteria) this;
        }

        public Criteria andFineReasonIsNotNull() {
            addCriterion("fine_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFineReasonEqualTo(String value) {
            addCriterion("fine_reason =", value, "fineReason");
            return (Criteria) this;
        }

        public Criteria andFineReasonNotEqualTo(String value) {
            addCriterion("fine_reason <>", value, "fineReason");
            return (Criteria) this;
        }

        public Criteria andFineReasonGreaterThan(String value) {
            addCriterion("fine_reason >", value, "fineReason");
            return (Criteria) this;
        }

        public Criteria andFineReasonGreaterThanOrEqualTo(String value) {
            addCriterion("fine_reason >=", value, "fineReason");
            return (Criteria) this;
        }

        public Criteria andFineReasonLessThan(String value) {
            addCriterion("fine_reason <", value, "fineReason");
            return (Criteria) this;
        }

        public Criteria andFineReasonLessThanOrEqualTo(String value) {
            addCriterion("fine_reason <=", value, "fineReason");
            return (Criteria) this;
        }

        public Criteria andFineReasonLike(String value) {
            addCriterion("fine_reason like", value, "fineReason");
            return (Criteria) this;
        }

        public Criteria andFineReasonNotLike(String value) {
            addCriterion("fine_reason not like", value, "fineReason");
            return (Criteria) this;
        }

        public Criteria andFineReasonIn(List<String> values) {
            addCriterion("fine_reason in", values, "fineReason");
            return (Criteria) this;
        }

        public Criteria andFineReasonNotIn(List<String> values) {
            addCriterion("fine_reason not in", values, "fineReason");
            return (Criteria) this;
        }

        public Criteria andFineReasonBetween(String value1, String value2) {
            addCriterion("fine_reason between", value1, value2, "fineReason");
            return (Criteria) this;
        }

        public Criteria andFineReasonNotBetween(String value1, String value2) {
            addCriterion("fine_reason not between", value1, value2, "fineReason");
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