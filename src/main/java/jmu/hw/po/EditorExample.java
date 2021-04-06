package jmu.hw.po;

import java.util.ArrayList;
import java.util.List;

public class EditorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EditorExample() {
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

        public Criteria andWriterIdIsNull() {
            addCriterion("writer_id is null");
            return (Criteria) this;
        }

        public Criteria andWriterIdIsNotNull() {
            addCriterion("writer_id is not null");
            return (Criteria) this;
        }

        public Criteria andWriterIdEqualTo(Integer value) {
            addCriterion("writer_id =", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdNotEqualTo(Integer value) {
            addCriterion("writer_id <>", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdGreaterThan(Integer value) {
            addCriterion("writer_id >", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("writer_id >=", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdLessThan(Integer value) {
            addCriterion("writer_id <", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdLessThanOrEqualTo(Integer value) {
            addCriterion("writer_id <=", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdIn(List<Integer> values) {
            addCriterion("writer_id in", values, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdNotIn(List<Integer> values) {
            addCriterion("writer_id not in", values, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdBetween(Integer value1, Integer value2) {
            addCriterion("writer_id between", value1, value2, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("writer_id not between", value1, value2, "writerId");
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

        public Criteria andEditorRoleIsNull() {
            addCriterion("editor_role is null");
            return (Criteria) this;
        }

        public Criteria andEditorRoleIsNotNull() {
            addCriterion("editor_role is not null");
            return (Criteria) this;
        }

        public Criteria andEditorRoleEqualTo(String value) {
            addCriterion("editor_role =", value, "editorRole");
            return (Criteria) this;
        }

        public Criteria andEditorRoleNotEqualTo(String value) {
            addCriterion("editor_role <>", value, "editorRole");
            return (Criteria) this;
        }

        public Criteria andEditorRoleGreaterThan(String value) {
            addCriterion("editor_role >", value, "editorRole");
            return (Criteria) this;
        }

        public Criteria andEditorRoleGreaterThanOrEqualTo(String value) {
            addCriterion("editor_role >=", value, "editorRole");
            return (Criteria) this;
        }

        public Criteria andEditorRoleLessThan(String value) {
            addCriterion("editor_role <", value, "editorRole");
            return (Criteria) this;
        }

        public Criteria andEditorRoleLessThanOrEqualTo(String value) {
            addCriterion("editor_role <=", value, "editorRole");
            return (Criteria) this;
        }

        public Criteria andEditorRoleLike(String value) {
            addCriterion("editor_role like", value, "editorRole");
            return (Criteria) this;
        }

        public Criteria andEditorRoleNotLike(String value) {
            addCriterion("editor_role not like", value, "editorRole");
            return (Criteria) this;
        }

        public Criteria andEditorRoleIn(List<String> values) {
            addCriterion("editor_role in", values, "editorRole");
            return (Criteria) this;
        }

        public Criteria andEditorRoleNotIn(List<String> values) {
            addCriterion("editor_role not in", values, "editorRole");
            return (Criteria) this;
        }

        public Criteria andEditorRoleBetween(String value1, String value2) {
            addCriterion("editor_role between", value1, value2, "editorRole");
            return (Criteria) this;
        }

        public Criteria andEditorRoleNotBetween(String value1, String value2) {
            addCriterion("editor_role not between", value1, value2, "editorRole");
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