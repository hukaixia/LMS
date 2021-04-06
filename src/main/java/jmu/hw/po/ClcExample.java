package jmu.hw.po;

import java.util.ArrayList;
import java.util.List;

public class ClcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClcExample() {
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

        public Criteria andClcIdIsNull() {
            addCriterion("clc_id is null");
            return (Criteria) this;
        }

        public Criteria andClcIdIsNotNull() {
            addCriterion("clc_id is not null");
            return (Criteria) this;
        }

        public Criteria andClcIdEqualTo(String value) {
            addCriterion("clc_id =", value, "clcId");
            return (Criteria) this;
        }

        public Criteria andClcIdNotEqualTo(String value) {
            addCriterion("clc_id <>", value, "clcId");
            return (Criteria) this;
        }

        public Criteria andClcIdGreaterThan(String value) {
            addCriterion("clc_id >", value, "clcId");
            return (Criteria) this;
        }

        public Criteria andClcIdGreaterThanOrEqualTo(String value) {
            addCriterion("clc_id >=", value, "clcId");
            return (Criteria) this;
        }

        public Criteria andClcIdLessThan(String value) {
            addCriterion("clc_id <", value, "clcId");
            return (Criteria) this;
        }

        public Criteria andClcIdLessThanOrEqualTo(String value) {
            addCriterion("clc_id <=", value, "clcId");
            return (Criteria) this;
        }

        public Criteria andClcIdLike(String value) {
            addCriterion("clc_id like", value, "clcId");
            return (Criteria) this;
        }

        public Criteria andClcIdNotLike(String value) {
            addCriterion("clc_id not like", value, "clcId");
            return (Criteria) this;
        }

        public Criteria andClcIdIn(List<String> values) {
            addCriterion("clc_id in", values, "clcId");
            return (Criteria) this;
        }

        public Criteria andClcIdNotIn(List<String> values) {
            addCriterion("clc_id not in", values, "clcId");
            return (Criteria) this;
        }

        public Criteria andClcIdBetween(String value1, String value2) {
            addCriterion("clc_id between", value1, value2, "clcId");
            return (Criteria) this;
        }

        public Criteria andClcIdNotBetween(String value1, String value2) {
            addCriterion("clc_id not between", value1, value2, "clcId");
            return (Criteria) this;
        }

        public Criteria andClcUpIdIsNull() {
            addCriterion("clc_up_id is null");
            return (Criteria) this;
        }

        public Criteria andClcUpIdIsNotNull() {
            addCriterion("clc_up_id is not null");
            return (Criteria) this;
        }

        public Criteria andClcUpIdEqualTo(String value) {
            addCriterion("clc_up_id =", value, "clcUpId");
            return (Criteria) this;
        }

        public Criteria andClcUpIdNotEqualTo(String value) {
            addCriterion("clc_up_id <>", value, "clcUpId");
            return (Criteria) this;
        }

        public Criteria andClcUpIdGreaterThan(String value) {
            addCriterion("clc_up_id >", value, "clcUpId");
            return (Criteria) this;
        }

        public Criteria andClcUpIdGreaterThanOrEqualTo(String value) {
            addCriterion("clc_up_id >=", value, "clcUpId");
            return (Criteria) this;
        }

        public Criteria andClcUpIdLessThan(String value) {
            addCriterion("clc_up_id <", value, "clcUpId");
            return (Criteria) this;
        }

        public Criteria andClcUpIdLessThanOrEqualTo(String value) {
            addCriterion("clc_up_id <=", value, "clcUpId");
            return (Criteria) this;
        }

        public Criteria andClcUpIdLike(String value) {
            addCriterion("clc_up_id like", value, "clcUpId");
            return (Criteria) this;
        }

        public Criteria andClcUpIdNotLike(String value) {
            addCriterion("clc_up_id not like", value, "clcUpId");
            return (Criteria) this;
        }

        public Criteria andClcUpIdIn(List<String> values) {
            addCriterion("clc_up_id in", values, "clcUpId");
            return (Criteria) this;
        }

        public Criteria andClcUpIdNotIn(List<String> values) {
            addCriterion("clc_up_id not in", values, "clcUpId");
            return (Criteria) this;
        }

        public Criteria andClcUpIdBetween(String value1, String value2) {
            addCriterion("clc_up_id between", value1, value2, "clcUpId");
            return (Criteria) this;
        }

        public Criteria andClcUpIdNotBetween(String value1, String value2) {
            addCriterion("clc_up_id not between", value1, value2, "clcUpId");
            return (Criteria) this;
        }

        public Criteria andClcNameIsNull() {
            addCriterion("clc_name is null");
            return (Criteria) this;
        }

        public Criteria andClcNameIsNotNull() {
            addCriterion("clc_name is not null");
            return (Criteria) this;
        }

        public Criteria andClcNameEqualTo(String value) {
            addCriterion("clc_name =", value, "clcName");
            return (Criteria) this;
        }

        public Criteria andClcNameNotEqualTo(String value) {
            addCriterion("clc_name <>", value, "clcName");
            return (Criteria) this;
        }

        public Criteria andClcNameGreaterThan(String value) {
            addCriterion("clc_name >", value, "clcName");
            return (Criteria) this;
        }

        public Criteria andClcNameGreaterThanOrEqualTo(String value) {
            addCriterion("clc_name >=", value, "clcName");
            return (Criteria) this;
        }

        public Criteria andClcNameLessThan(String value) {
            addCriterion("clc_name <", value, "clcName");
            return (Criteria) this;
        }

        public Criteria andClcNameLessThanOrEqualTo(String value) {
            addCriterion("clc_name <=", value, "clcName");
            return (Criteria) this;
        }

        public Criteria andClcNameLike(String value) {
            addCriterion("clc_name like", value, "clcName");
            return (Criteria) this;
        }

        public Criteria andClcNameNotLike(String value) {
            addCriterion("clc_name not like", value, "clcName");
            return (Criteria) this;
        }

        public Criteria andClcNameIn(List<String> values) {
            addCriterion("clc_name in", values, "clcName");
            return (Criteria) this;
        }

        public Criteria andClcNameNotIn(List<String> values) {
            addCriterion("clc_name not in", values, "clcName");
            return (Criteria) this;
        }

        public Criteria andClcNameBetween(String value1, String value2) {
            addCriterion("clc_name between", value1, value2, "clcName");
            return (Criteria) this;
        }

        public Criteria andClcNameNotBetween(String value1, String value2) {
            addCriterion("clc_name not between", value1, value2, "clcName");
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