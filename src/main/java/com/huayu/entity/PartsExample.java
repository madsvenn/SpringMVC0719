package com.huayu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PartsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartsExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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
            List<java.sql.Date> dateList = new ArrayList<>();
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

        public Criteria andPartsidIsNull() {
            addCriterion("PartsId is null");
            return (Criteria) this;
        }

        public Criteria andPartsidIsNotNull() {
            addCriterion("PartsId is not null");
            return (Criteria) this;
        }

        public Criteria andPartsidEqualTo(Integer value) {
            addCriterion("PartsId =", value, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidNotEqualTo(Integer value) {
            addCriterion("PartsId <>", value, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidGreaterThan(Integer value) {
            addCriterion("PartsId >", value, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PartsId >=", value, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidLessThan(Integer value) {
            addCriterion("PartsId <", value, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidLessThanOrEqualTo(Integer value) {
            addCriterion("PartsId <=", value, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidIn(List<Integer> values) {
            addCriterion("PartsId in", values, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidNotIn(List<Integer> values) {
            addCriterion("PartsId not in", values, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidBetween(Integer value1, Integer value2) {
            addCriterion("PartsId between", value1, value2, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidNotBetween(Integer value1, Integer value2) {
            addCriterion("PartsId not between", value1, value2, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsnameIsNull() {
            addCriterion("PartsName is null");
            return (Criteria) this;
        }

        public Criteria andPartsnameIsNotNull() {
            addCriterion("PartsName is not null");
            return (Criteria) this;
        }

        public Criteria andPartsnameEqualTo(String value) {
            addCriterion("PartsName =", value, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameNotEqualTo(String value) {
            addCriterion("PartsName <>", value, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameGreaterThan(String value) {
            addCriterion("PartsName >", value, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameGreaterThanOrEqualTo(String value) {
            addCriterion("PartsName >=", value, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameLessThan(String value) {
            addCriterion("PartsName <", value, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameLessThanOrEqualTo(String value) {
            addCriterion("PartsName <=", value, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameLike(String value) {
            addCriterion("PartsName like", value, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameNotLike(String value) {
            addCriterion("PartsName not like", value, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameIn(List<String> values) {
            addCriterion("PartsName in", values, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameNotIn(List<String> values) {
            addCriterion("PartsName not in", values, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameBetween(String value1, String value2) {
            addCriterion("PartsName between", value1, value2, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameNotBetween(String value1, String value2) {
            addCriterion("PartsName not between", value1, value2, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsmodelIsNull() {
            addCriterion("PartsModel is null");
            return (Criteria) this;
        }

        public Criteria andPartsmodelIsNotNull() {
            addCriterion("PartsModel is not null");
            return (Criteria) this;
        }

        public Criteria andPartsmodelEqualTo(String value) {
            addCriterion("PartsModel =", value, "partsmodel");
            return (Criteria) this;
        }

        public Criteria andPartsmodelNotEqualTo(String value) {
            addCriterion("PartsModel <>", value, "partsmodel");
            return (Criteria) this;
        }

        public Criteria andPartsmodelGreaterThan(String value) {
            addCriterion("PartsModel >", value, "partsmodel");
            return (Criteria) this;
        }

        public Criteria andPartsmodelGreaterThanOrEqualTo(String value) {
            addCriterion("PartsModel >=", value, "partsmodel");
            return (Criteria) this;
        }

        public Criteria andPartsmodelLessThan(String value) {
            addCriterion("PartsModel <", value, "partsmodel");
            return (Criteria) this;
        }

        public Criteria andPartsmodelLessThanOrEqualTo(String value) {
            addCriterion("PartsModel <=", value, "partsmodel");
            return (Criteria) this;
        }

        public Criteria andPartsmodelLike(String value) {
            addCriterion("PartsModel like", value, "partsmodel");
            return (Criteria) this;
        }

        public Criteria andPartsmodelNotLike(String value) {
            addCriterion("PartsModel not like", value, "partsmodel");
            return (Criteria) this;
        }

        public Criteria andPartsmodelIn(List<String> values) {
            addCriterion("PartsModel in", values, "partsmodel");
            return (Criteria) this;
        }

        public Criteria andPartsmodelNotIn(List<String> values) {
            addCriterion("PartsModel not in", values, "partsmodel");
            return (Criteria) this;
        }

        public Criteria andPartsmodelBetween(String value1, String value2) {
            addCriterion("PartsModel between", value1, value2, "partsmodel");
            return (Criteria) this;
        }

        public Criteria andPartsmodelNotBetween(String value1, String value2) {
            addCriterion("PartsModel not between", value1, value2, "partsmodel");
            return (Criteria) this;
        }

        public Criteria andPartslocIsNull() {
            addCriterion("PartsLoc is null");
            return (Criteria) this;
        }

        public Criteria andPartslocIsNotNull() {
            addCriterion("PartsLoc is not null");
            return (Criteria) this;
        }

        public Criteria andPartslocEqualTo(String value) {
            addCriterion("PartsLoc =", value, "partsloc");
            return (Criteria) this;
        }

        public Criteria andPartslocNotEqualTo(String value) {
            addCriterion("PartsLoc <>", value, "partsloc");
            return (Criteria) this;
        }

        public Criteria andPartslocGreaterThan(String value) {
            addCriterion("PartsLoc >", value, "partsloc");
            return (Criteria) this;
        }

        public Criteria andPartslocGreaterThanOrEqualTo(String value) {
            addCriterion("PartsLoc >=", value, "partsloc");
            return (Criteria) this;
        }

        public Criteria andPartslocLessThan(String value) {
            addCriterion("PartsLoc <", value, "partsloc");
            return (Criteria) this;
        }

        public Criteria andPartslocLessThanOrEqualTo(String value) {
            addCriterion("PartsLoc <=", value, "partsloc");
            return (Criteria) this;
        }

        public Criteria andPartslocLike(String value) {
            addCriterion("PartsLoc like", value, "partsloc");
            return (Criteria) this;
        }

        public Criteria andPartslocNotLike(String value) {
            addCriterion("PartsLoc not like", value, "partsloc");
            return (Criteria) this;
        }

        public Criteria andPartslocIn(List<String> values) {
            addCriterion("PartsLoc in", values, "partsloc");
            return (Criteria) this;
        }

        public Criteria andPartslocNotIn(List<String> values) {
            addCriterion("PartsLoc not in", values, "partsloc");
            return (Criteria) this;
        }

        public Criteria andPartslocBetween(String value1, String value2) {
            addCriterion("PartsLoc between", value1, value2, "partsloc");
            return (Criteria) this;
        }

        public Criteria andPartslocNotBetween(String value1, String value2) {
            addCriterion("PartsLoc not between", value1, value2, "partsloc");
            return (Criteria) this;
        }

        public Criteria andPartsprodateIsNull() {
            addCriterion("PartsProDate is null");
            return (Criteria) this;
        }

        public Criteria andPartsprodateIsNotNull() {
            addCriterion("PartsProDate is not null");
            return (Criteria) this;
        }

        public Criteria andPartsprodateEqualTo(Date value) {
            addCriterionForJDBCDate("PartsProDate =", value, "partsprodate");
            return (Criteria) this;
        }

        public Criteria andPartsprodateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PartsProDate <>", value, "partsprodate");
            return (Criteria) this;
        }

        public Criteria andPartsprodateGreaterThan(Date value) {
            addCriterionForJDBCDate("PartsProDate >", value, "partsprodate");
            return (Criteria) this;
        }

        public Criteria andPartsprodateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PartsProDate >=", value, "partsprodate");
            return (Criteria) this;
        }

        public Criteria andPartsprodateLessThan(Date value) {
            addCriterionForJDBCDate("PartsProDate <", value, "partsprodate");
            return (Criteria) this;
        }

        public Criteria andPartsprodateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PartsProDate <=", value, "partsprodate");
            return (Criteria) this;
        }

        public Criteria andPartsprodateIn(List<Date> values) {
            addCriterionForJDBCDate("PartsProDate in", values, "partsprodate");
            return (Criteria) this;
        }

        public Criteria andPartsprodateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PartsProDate not in", values, "partsprodate");
            return (Criteria) this;
        }

        public Criteria andPartsprodateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PartsProDate between", value1, value2, "partsprodate");
            return (Criteria) this;
        }

        public Criteria andPartsprodateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PartsProDate not between", value1, value2, "partsprodate");
            return (Criteria) this;
        }

        public Criteria andPartsremarkIsNull() {
            addCriterion("PartsRemark is null");
            return (Criteria) this;
        }

        public Criteria andPartsremarkIsNotNull() {
            addCriterion("PartsRemark is not null");
            return (Criteria) this;
        }

        public Criteria andPartsremarkEqualTo(String value) {
            addCriterion("PartsRemark =", value, "partsremark");
            return (Criteria) this;
        }

        public Criteria andPartsremarkNotEqualTo(String value) {
            addCriterion("PartsRemark <>", value, "partsremark");
            return (Criteria) this;
        }

        public Criteria andPartsremarkGreaterThan(String value) {
            addCriterion("PartsRemark >", value, "partsremark");
            return (Criteria) this;
        }

        public Criteria andPartsremarkGreaterThanOrEqualTo(String value) {
            addCriterion("PartsRemark >=", value, "partsremark");
            return (Criteria) this;
        }

        public Criteria andPartsremarkLessThan(String value) {
            addCriterion("PartsRemark <", value, "partsremark");
            return (Criteria) this;
        }

        public Criteria andPartsremarkLessThanOrEqualTo(String value) {
            addCriterion("PartsRemark <=", value, "partsremark");
            return (Criteria) this;
        }

        public Criteria andPartsremarkLike(String value) {
            addCriterion("PartsRemark like", value, "partsremark");
            return (Criteria) this;
        }

        public Criteria andPartsremarkNotLike(String value) {
            addCriterion("PartsRemark not like", value, "partsremark");
            return (Criteria) this;
        }

        public Criteria andPartsremarkIn(List<String> values) {
            addCriterion("PartsRemark in", values, "partsremark");
            return (Criteria) this;
        }

        public Criteria andPartsremarkNotIn(List<String> values) {
            addCriterion("PartsRemark not in", values, "partsremark");
            return (Criteria) this;
        }

        public Criteria andPartsremarkBetween(String value1, String value2) {
            addCriterion("PartsRemark between", value1, value2, "partsremark");
            return (Criteria) this;
        }

        public Criteria andPartsremarkNotBetween(String value1, String value2) {
            addCriterion("PartsRemark not between", value1, value2, "partsremark");
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