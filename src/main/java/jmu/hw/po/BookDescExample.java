package jmu.hw.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BookDescExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookDescExample() {
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

        public Criteria andPressIdIsNull() {
            addCriterion("press_id is null");
            return (Criteria) this;
        }

        public Criteria andPressIdIsNotNull() {
            addCriterion("press_id is not null");
            return (Criteria) this;
        }

        public Criteria andPressIdEqualTo(String value) {
            addCriterion("press_id =", value, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdNotEqualTo(String value) {
            addCriterion("press_id <>", value, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdGreaterThan(String value) {
            addCriterion("press_id >", value, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdGreaterThanOrEqualTo(String value) {
            addCriterion("press_id >=", value, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdLessThan(String value) {
            addCriterion("press_id <", value, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdLessThanOrEqualTo(String value) {
            addCriterion("press_id <=", value, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdLike(String value) {
            addCriterion("press_id like", value, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdNotLike(String value) {
            addCriterion("press_id not like", value, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdIn(List<String> values) {
            addCriterion("press_id in", values, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdNotIn(List<String> values) {
            addCriterion("press_id not in", values, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdBetween(String value1, String value2) {
            addCriterion("press_id between", value1, value2, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdNotBetween(String value1, String value2) {
            addCriterion("press_id not between", value1, value2, "pressId");
            return (Criteria) this;
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

        public Criteria andIsbnIsNull() {
            addCriterion("ISBN is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("ISBN is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("ISBN =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("ISBN <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("ISBN >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("ISBN >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("ISBN <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("ISBN <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("ISBN like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("ISBN not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("ISBN in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("ISBN not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("ISBN between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("ISBN not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNull() {
            addCriterion("book_price is null");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNotNull() {
            addCriterion("book_price is not null");
            return (Criteria) this;
        }

        public Criteria andBookPriceEqualTo(BigDecimal value) {
            addCriterion("book_price =", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotEqualTo(BigDecimal value) {
            addCriterion("book_price <>", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThan(BigDecimal value) {
            addCriterion("book_price >", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("book_price >=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThan(BigDecimal value) {
            addCriterion("book_price <", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("book_price <=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceIn(List<BigDecimal> values) {
            addCriterion("book_price in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotIn(List<BigDecimal> values) {
            addCriterion("book_price not in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_price between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_price not between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andWordNumberIsNull() {
            addCriterion("word_number is null");
            return (Criteria) this;
        }

        public Criteria andWordNumberIsNotNull() {
            addCriterion("word_number is not null");
            return (Criteria) this;
        }

        public Criteria andWordNumberEqualTo(Integer value) {
            addCriterion("word_number =", value, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberNotEqualTo(Integer value) {
            addCriterion("word_number <>", value, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberGreaterThan(Integer value) {
            addCriterion("word_number >", value, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("word_number >=", value, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberLessThan(Integer value) {
            addCriterion("word_number <", value, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberLessThanOrEqualTo(Integer value) {
            addCriterion("word_number <=", value, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberIn(List<Integer> values) {
            addCriterion("word_number in", values, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberNotIn(List<Integer> values) {
            addCriterion("word_number not in", values, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberBetween(Integer value1, Integer value2) {
            addCriterion("word_number between", value1, value2, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("word_number not between", value1, value2, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andBookIntroIsNull() {
            addCriterion("book_intro is null");
            return (Criteria) this;
        }

        public Criteria andBookIntroIsNotNull() {
            addCriterion("book_intro is not null");
            return (Criteria) this;
        }

        public Criteria andBookIntroEqualTo(String value) {
            addCriterion("book_intro =", value, "bookIntro");
            return (Criteria) this;
        }

        public Criteria andBookIntroNotEqualTo(String value) {
            addCriterion("book_intro <>", value, "bookIntro");
            return (Criteria) this;
        }

        public Criteria andBookIntroGreaterThan(String value) {
            addCriterion("book_intro >", value, "bookIntro");
            return (Criteria) this;
        }

        public Criteria andBookIntroGreaterThanOrEqualTo(String value) {
            addCriterion("book_intro >=", value, "bookIntro");
            return (Criteria) this;
        }

        public Criteria andBookIntroLessThan(String value) {
            addCriterion("book_intro <", value, "bookIntro");
            return (Criteria) this;
        }

        public Criteria andBookIntroLessThanOrEqualTo(String value) {
            addCriterion("book_intro <=", value, "bookIntro");
            return (Criteria) this;
        }

        public Criteria andBookIntroLike(String value) {
            addCriterion("book_intro like", value, "bookIntro");
            return (Criteria) this;
        }

        public Criteria andBookIntroNotLike(String value) {
            addCriterion("book_intro not like", value, "bookIntro");
            return (Criteria) this;
        }

        public Criteria andBookIntroIn(List<String> values) {
            addCriterion("book_intro in", values, "bookIntro");
            return (Criteria) this;
        }

        public Criteria andBookIntroNotIn(List<String> values) {
            addCriterion("book_intro not in", values, "bookIntro");
            return (Criteria) this;
        }

        public Criteria andBookIntroBetween(String value1, String value2) {
            addCriterion("book_intro between", value1, value2, "bookIntro");
            return (Criteria) this;
        }

        public Criteria andBookIntroNotBetween(String value1, String value2) {
            addCriterion("book_intro not between", value1, value2, "bookIntro");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNull() {
            addCriterion("publish_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNotNull() {
            addCriterion("publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date =", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date <>", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("publish_date >", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date >=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThan(Date value) {
            addCriterionForJDBCDate("publish_date <", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date <=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateIn(List<Date> values) {
            addCriterionForJDBCDate("publish_date in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("publish_date not in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publish_date between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publish_date not between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateIsNull() {
            addCriterion("collection_date is null");
            return (Criteria) this;
        }

        public Criteria andCollectionDateIsNotNull() {
            addCriterion("collection_date is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionDateEqualTo(Date value) {
            addCriterionForJDBCDate("collection_date =", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("collection_date <>", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("collection_date >", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("collection_date >=", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateLessThan(Date value) {
            addCriterionForJDBCDate("collection_date <", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("collection_date <=", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateIn(List<Date> values) {
            addCriterionForJDBCDate("collection_date in", values, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("collection_date not in", values, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("collection_date between", value1, value2, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("collection_date not between", value1, value2, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberIsNull() {
            addCriterion("collection_number is null");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberIsNotNull() {
            addCriterion("collection_number is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberEqualTo(Short value) {
            addCriterion("collection_number =", value, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberNotEqualTo(Short value) {
            addCriterion("collection_number <>", value, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberGreaterThan(Short value) {
            addCriterion("collection_number >", value, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("collection_number >=", value, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberLessThan(Short value) {
            addCriterion("collection_number <", value, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberLessThanOrEqualTo(Short value) {
            addCriterion("collection_number <=", value, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberIn(List<Short> values) {
            addCriterion("collection_number in", values, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberNotIn(List<Short> values) {
            addCriterion("collection_number not in", values, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberBetween(Short value1, Short value2) {
            addCriterion("collection_number between", value1, value2, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberNotBetween(Short value1, Short value2) {
            addCriterion("collection_number not between", value1, value2, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andAvaliableLoanIsNull() {
            addCriterion("avaliable_loan is null");
            return (Criteria) this;
        }

        public Criteria andAvaliableLoanIsNotNull() {
            addCriterion("avaliable_loan is not null");
            return (Criteria) this;
        }

        public Criteria andAvaliableLoanEqualTo(Short value) {
            addCriterion("avaliable_loan =", value, "avaliableLoan");
            return (Criteria) this;
        }

        public Criteria andAvaliableLoanNotEqualTo(Short value) {
            addCriterion("avaliable_loan <>", value, "avaliableLoan");
            return (Criteria) this;
        }

        public Criteria andAvaliableLoanGreaterThan(Short value) {
            addCriterion("avaliable_loan >", value, "avaliableLoan");
            return (Criteria) this;
        }

        public Criteria andAvaliableLoanGreaterThanOrEqualTo(Short value) {
            addCriterion("avaliable_loan >=", value, "avaliableLoan");
            return (Criteria) this;
        }

        public Criteria andAvaliableLoanLessThan(Short value) {
            addCriterion("avaliable_loan <", value, "avaliableLoan");
            return (Criteria) this;
        }

        public Criteria andAvaliableLoanLessThanOrEqualTo(Short value) {
            addCriterion("avaliable_loan <=", value, "avaliableLoan");
            return (Criteria) this;
        }

        public Criteria andAvaliableLoanIn(List<Short> values) {
            addCriterion("avaliable_loan in", values, "avaliableLoan");
            return (Criteria) this;
        }

        public Criteria andAvaliableLoanNotIn(List<Short> values) {
            addCriterion("avaliable_loan not in", values, "avaliableLoan");
            return (Criteria) this;
        }

        public Criteria andAvaliableLoanBetween(Short value1, Short value2) {
            addCriterion("avaliable_loan between", value1, value2, "avaliableLoan");
            return (Criteria) this;
        }

        public Criteria andAvaliableLoanNotBetween(Short value1, Short value2) {
            addCriterion("avaliable_loan not between", value1, value2, "avaliableLoan");
            return (Criteria) this;
        }

        public Criteria andBookImageIsNull() {
            addCriterion("book_image is null");
            return (Criteria) this;
        }

        public Criteria andBookImageIsNotNull() {
            addCriterion("book_image is not null");
            return (Criteria) this;
        }

        public Criteria andBookImageEqualTo(String value) {
            addCriterion("book_image =", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageNotEqualTo(String value) {
            addCriterion("book_image <>", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageGreaterThan(String value) {
            addCriterion("book_image >", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageGreaterThanOrEqualTo(String value) {
            addCriterion("book_image >=", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageLessThan(String value) {
            addCriterion("book_image <", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageLessThanOrEqualTo(String value) {
            addCriterion("book_image <=", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageLike(String value) {
            addCriterion("book_image like", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageNotLike(String value) {
            addCriterion("book_image not like", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageIn(List<String> values) {
            addCriterion("book_image in", values, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageNotIn(List<String> values) {
            addCriterion("book_image not in", values, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageBetween(String value1, String value2) {
            addCriterion("book_image between", value1, value2, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageNotBetween(String value1, String value2) {
            addCriterion("book_image not between", value1, value2, "bookImage");
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