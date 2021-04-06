package jmu.hw.po;

import java.util.ArrayList;
import java.util.List;

public class BranchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BranchExample() {
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

        public Criteria andBranchIdIsNull() {
            addCriterion("branch_id is null");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranchIdEqualTo(String value) {
            addCriterion("branch_id =", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotEqualTo(String value) {
            addCriterion("branch_id <>", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThan(String value) {
            addCriterion("branch_id >", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("branch_id >=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThan(String value) {
            addCriterion("branch_id <", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(String value) {
            addCriterion("branch_id <=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLike(String value) {
            addCriterion("branch_id like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotLike(String value) {
            addCriterion("branch_id not like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIn(List<String> values) {
            addCriterion("branch_id in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotIn(List<String> values) {
            addCriterion("branch_id not in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdBetween(String value1, String value2) {
            addCriterion("branch_id between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotBetween(String value1, String value2) {
            addCriterion("branch_id not between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNull() {
            addCriterion("branch_name is null");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNotNull() {
            addCriterion("branch_name is not null");
            return (Criteria) this;
        }

        public Criteria andBranchNameEqualTo(String value) {
            addCriterion("branch_name =", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotEqualTo(String value) {
            addCriterion("branch_name <>", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThan(String value) {
            addCriterion("branch_name >", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("branch_name >=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThan(String value) {
            addCriterion("branch_name <", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThanOrEqualTo(String value) {
            addCriterion("branch_name <=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLike(String value) {
            addCriterion("branch_name like", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotLike(String value) {
            addCriterion("branch_name not like", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameIn(List<String> values) {
            addCriterion("branch_name in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotIn(List<String> values) {
            addCriterion("branch_name not in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameBetween(String value1, String value2) {
            addCriterion("branch_name between", value1, value2, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotBetween(String value1, String value2) {
            addCriterion("branch_name not between", value1, value2, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneIsNull() {
            addCriterion("branch_phone is null");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneIsNotNull() {
            addCriterion("branch_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneEqualTo(String value) {
            addCriterion("branch_phone =", value, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneNotEqualTo(String value) {
            addCriterion("branch_phone <>", value, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneGreaterThan(String value) {
            addCriterion("branch_phone >", value, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("branch_phone >=", value, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneLessThan(String value) {
            addCriterion("branch_phone <", value, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneLessThanOrEqualTo(String value) {
            addCriterion("branch_phone <=", value, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneLike(String value) {
            addCriterion("branch_phone like", value, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneNotLike(String value) {
            addCriterion("branch_phone not like", value, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneIn(List<String> values) {
            addCriterion("branch_phone in", values, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneNotIn(List<String> values) {
            addCriterion("branch_phone not in", values, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneBetween(String value1, String value2) {
            addCriterion("branch_phone between", value1, value2, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneNotBetween(String value1, String value2) {
            addCriterion("branch_phone not between", value1, value2, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchAddressIsNull() {
            addCriterion("branch_address is null");
            return (Criteria) this;
        }

        public Criteria andBranchAddressIsNotNull() {
            addCriterion("branch_address is not null");
            return (Criteria) this;
        }

        public Criteria andBranchAddressEqualTo(String value) {
            addCriterion("branch_address =", value, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressNotEqualTo(String value) {
            addCriterion("branch_address <>", value, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressGreaterThan(String value) {
            addCriterion("branch_address >", value, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressGreaterThanOrEqualTo(String value) {
            addCriterion("branch_address >=", value, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressLessThan(String value) {
            addCriterion("branch_address <", value, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressLessThanOrEqualTo(String value) {
            addCriterion("branch_address <=", value, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressLike(String value) {
            addCriterion("branch_address like", value, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressNotLike(String value) {
            addCriterion("branch_address not like", value, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressIn(List<String> values) {
            addCriterion("branch_address in", values, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressNotIn(List<String> values) {
            addCriterion("branch_address not in", values, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressBetween(String value1, String value2) {
            addCriterion("branch_address between", value1, value2, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressNotBetween(String value1, String value2) {
            addCriterion("branch_address not between", value1, value2, "branchAddress");
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