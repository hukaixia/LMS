package jmu.hw.po;

import java.util.ArrayList;
import java.util.List;

public class ReaderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReaderExample() {
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

        public Criteria andUnitIdIsNull() {
            addCriterion("unit_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(String value) {
            addCriterion("unit_id =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(String value) {
            addCriterion("unit_id <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(String value) {
            addCriterion("unit_id >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("unit_id >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(String value) {
            addCriterion("unit_id <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(String value) {
            addCriterion("unit_id <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLike(String value) {
            addCriterion("unit_id like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotLike(String value) {
            addCriterion("unit_id not like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<String> values) {
            addCriterion("unit_id in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<String> values) {
            addCriterion("unit_id not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(String value1, String value2) {
            addCriterion("unit_id between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(String value1, String value2) {
            addCriterion("unit_id not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPswdIsNull() {
            addCriterion("user_pswd is null");
            return (Criteria) this;
        }

        public Criteria andUserPswdIsNotNull() {
            addCriterion("user_pswd is not null");
            return (Criteria) this;
        }

        public Criteria andUserPswdEqualTo(String value) {
            addCriterion("user_pswd =", value, "userPswd");
            return (Criteria) this;
        }

        public Criteria andUserPswdNotEqualTo(String value) {
            addCriterion("user_pswd <>", value, "userPswd");
            return (Criteria) this;
        }

        public Criteria andUserPswdGreaterThan(String value) {
            addCriterion("user_pswd >", value, "userPswd");
            return (Criteria) this;
        }

        public Criteria andUserPswdGreaterThanOrEqualTo(String value) {
            addCriterion("user_pswd >=", value, "userPswd");
            return (Criteria) this;
        }

        public Criteria andUserPswdLessThan(String value) {
            addCriterion("user_pswd <", value, "userPswd");
            return (Criteria) this;
        }

        public Criteria andUserPswdLessThanOrEqualTo(String value) {
            addCriterion("user_pswd <=", value, "userPswd");
            return (Criteria) this;
        }

        public Criteria andUserPswdLike(String value) {
            addCriterion("user_pswd like", value, "userPswd");
            return (Criteria) this;
        }

        public Criteria andUserPswdNotLike(String value) {
            addCriterion("user_pswd not like", value, "userPswd");
            return (Criteria) this;
        }

        public Criteria andUserPswdIn(List<String> values) {
            addCriterion("user_pswd in", values, "userPswd");
            return (Criteria) this;
        }

        public Criteria andUserPswdNotIn(List<String> values) {
            addCriterion("user_pswd not in", values, "userPswd");
            return (Criteria) this;
        }

        public Criteria andUserPswdBetween(String value1, String value2) {
            addCriterion("user_pswd between", value1, value2, "userPswd");
            return (Criteria) this;
        }

        public Criteria andUserPswdNotBetween(String value1, String value2) {
            addCriterion("user_pswd not between", value1, value2, "userPswd");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNull() {
            addCriterion("user_role is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNotNull() {
            addCriterion("user_role is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleEqualTo(String value) {
            addCriterion("user_role =", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotEqualTo(String value) {
            addCriterion("user_role <>", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThan(String value) {
            addCriterion("user_role >", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThanOrEqualTo(String value) {
            addCriterion("user_role >=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThan(String value) {
            addCriterion("user_role <", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThanOrEqualTo(String value) {
            addCriterion("user_role <=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLike(String value) {
            addCriterion("user_role like", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotLike(String value) {
            addCriterion("user_role not like", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleIn(List<String> values) {
            addCriterion("user_role in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotIn(List<String> values) {
            addCriterion("user_role not in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleBetween(String value1, String value2) {
            addCriterion("user_role between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotBetween(String value1, String value2) {
            addCriterion("user_role not between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andReaderSexIsNull() {
            addCriterion("reader_sex is null");
            return (Criteria) this;
        }

        public Criteria andReaderSexIsNotNull() {
            addCriterion("reader_sex is not null");
            return (Criteria) this;
        }

        public Criteria andReaderSexEqualTo(Byte value) {
            addCriterion("reader_sex =", value, "readerSex");
            return (Criteria) this;
        }

        public Criteria andReaderSexNotEqualTo(Byte value) {
            addCriterion("reader_sex <>", value, "readerSex");
            return (Criteria) this;
        }

        public Criteria andReaderSexGreaterThan(Byte value) {
            addCriterion("reader_sex >", value, "readerSex");
            return (Criteria) this;
        }

        public Criteria andReaderSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("reader_sex >=", value, "readerSex");
            return (Criteria) this;
        }

        public Criteria andReaderSexLessThan(Byte value) {
            addCriterion("reader_sex <", value, "readerSex");
            return (Criteria) this;
        }

        public Criteria andReaderSexLessThanOrEqualTo(Byte value) {
            addCriterion("reader_sex <=", value, "readerSex");
            return (Criteria) this;
        }

        public Criteria andReaderSexIn(List<Byte> values) {
            addCriterion("reader_sex in", values, "readerSex");
            return (Criteria) this;
        }

        public Criteria andReaderSexNotIn(List<Byte> values) {
            addCriterion("reader_sex not in", values, "readerSex");
            return (Criteria) this;
        }

        public Criteria andReaderSexBetween(Byte value1, Byte value2) {
            addCriterion("reader_sex between", value1, value2, "readerSex");
            return (Criteria) this;
        }

        public Criteria andReaderSexNotBetween(Byte value1, Byte value2) {
            addCriterion("reader_sex not between", value1, value2, "readerSex");
            return (Criteria) this;
        }

        public Criteria andReaderEmailIsNull() {
            addCriterion("reader_email is null");
            return (Criteria) this;
        }

        public Criteria andReaderEmailIsNotNull() {
            addCriterion("reader_email is not null");
            return (Criteria) this;
        }

        public Criteria andReaderEmailEqualTo(String value) {
            addCriterion("reader_email =", value, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailNotEqualTo(String value) {
            addCriterion("reader_email <>", value, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailGreaterThan(String value) {
            addCriterion("reader_email >", value, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailGreaterThanOrEqualTo(String value) {
            addCriterion("reader_email >=", value, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailLessThan(String value) {
            addCriterion("reader_email <", value, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailLessThanOrEqualTo(String value) {
            addCriterion("reader_email <=", value, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailLike(String value) {
            addCriterion("reader_email like", value, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailNotLike(String value) {
            addCriterion("reader_email not like", value, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailIn(List<String> values) {
            addCriterion("reader_email in", values, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailNotIn(List<String> values) {
            addCriterion("reader_email not in", values, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailBetween(String value1, String value2) {
            addCriterion("reader_email between", value1, value2, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailNotBetween(String value1, String value2) {
            addCriterion("reader_email not between", value1, value2, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderPhoneIsNull() {
            addCriterion("reader_phone is null");
            return (Criteria) this;
        }

        public Criteria andReaderPhoneIsNotNull() {
            addCriterion("reader_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReaderPhoneEqualTo(String value) {
            addCriterion("reader_phone =", value, "readerPhone");
            return (Criteria) this;
        }

        public Criteria andReaderPhoneNotEqualTo(String value) {
            addCriterion("reader_phone <>", value, "readerPhone");
            return (Criteria) this;
        }

        public Criteria andReaderPhoneGreaterThan(String value) {
            addCriterion("reader_phone >", value, "readerPhone");
            return (Criteria) this;
        }

        public Criteria andReaderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("reader_phone >=", value, "readerPhone");
            return (Criteria) this;
        }

        public Criteria andReaderPhoneLessThan(String value) {
            addCriterion("reader_phone <", value, "readerPhone");
            return (Criteria) this;
        }

        public Criteria andReaderPhoneLessThanOrEqualTo(String value) {
            addCriterion("reader_phone <=", value, "readerPhone");
            return (Criteria) this;
        }

        public Criteria andReaderPhoneLike(String value) {
            addCriterion("reader_phone like", value, "readerPhone");
            return (Criteria) this;
        }

        public Criteria andReaderPhoneNotLike(String value) {
            addCriterion("reader_phone not like", value, "readerPhone");
            return (Criteria) this;
        }

        public Criteria andReaderPhoneIn(List<String> values) {
            addCriterion("reader_phone in", values, "readerPhone");
            return (Criteria) this;
        }

        public Criteria andReaderPhoneNotIn(List<String> values) {
            addCriterion("reader_phone not in", values, "readerPhone");
            return (Criteria) this;
        }

        public Criteria andReaderPhoneBetween(String value1, String value2) {
            addCriterion("reader_phone between", value1, value2, "readerPhone");
            return (Criteria) this;
        }

        public Criteria andReaderPhoneNotBetween(String value1, String value2) {
            addCriterion("reader_phone not between", value1, value2, "readerPhone");
            return (Criteria) this;
        }

        public Criteria andReaderStateIsNull() {
            addCriterion("reader_state is null");
            return (Criteria) this;
        }

        public Criteria andReaderStateIsNotNull() {
            addCriterion("reader_state is not null");
            return (Criteria) this;
        }

        public Criteria andReaderStateEqualTo(String value) {
            addCriterion("reader_state =", value, "readerState");
            return (Criteria) this;
        }

        public Criteria andReaderStateNotEqualTo(String value) {
            addCriterion("reader_state <>", value, "readerState");
            return (Criteria) this;
        }

        public Criteria andReaderStateGreaterThan(String value) {
            addCriterion("reader_state >", value, "readerState");
            return (Criteria) this;
        }

        public Criteria andReaderStateGreaterThanOrEqualTo(String value) {
            addCriterion("reader_state >=", value, "readerState");
            return (Criteria) this;
        }

        public Criteria andReaderStateLessThan(String value) {
            addCriterion("reader_state <", value, "readerState");
            return (Criteria) this;
        }

        public Criteria andReaderStateLessThanOrEqualTo(String value) {
            addCriterion("reader_state <=", value, "readerState");
            return (Criteria) this;
        }

        public Criteria andReaderStateLike(String value) {
            addCriterion("reader_state like", value, "readerState");
            return (Criteria) this;
        }

        public Criteria andReaderStateNotLike(String value) {
            addCriterion("reader_state not like", value, "readerState");
            return (Criteria) this;
        }

        public Criteria andReaderStateIn(List<String> values) {
            addCriterion("reader_state in", values, "readerState");
            return (Criteria) this;
        }

        public Criteria andReaderStateNotIn(List<String> values) {
            addCriterion("reader_state not in", values, "readerState");
            return (Criteria) this;
        }

        public Criteria andReaderStateBetween(String value1, String value2) {
            addCriterion("reader_state between", value1, value2, "readerState");
            return (Criteria) this;
        }

        public Criteria andReaderStateNotBetween(String value1, String value2) {
            addCriterion("reader_state not between", value1, value2, "readerState");
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