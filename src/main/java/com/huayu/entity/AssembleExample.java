package com.huayu.entity;

import java.util.ArrayList;
import java.util.List;

public class AssembleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssembleExample() {
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

        public Criteria andAssembleidIsNull() {
            addCriterion("AssembleId is null");
            return (Criteria) this;
        }

        public Criteria andAssembleidIsNotNull() {
            addCriterion("AssembleId is not null");
            return (Criteria) this;
        }

        public Criteria andAssembleidEqualTo(Integer value) {
            addCriterion("AssembleId =", value, "assembleid");
            return (Criteria) this;
        }

        public Criteria andAssembleidNotEqualTo(Integer value) {
            addCriterion("AssembleId <>", value, "assembleid");
            return (Criteria) this;
        }

        public Criteria andAssembleidGreaterThan(Integer value) {
            addCriterion("AssembleId >", value, "assembleid");
            return (Criteria) this;
        }

        public Criteria andAssembleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AssembleId >=", value, "assembleid");
            return (Criteria) this;
        }

        public Criteria andAssembleidLessThan(Integer value) {
            addCriterion("AssembleId <", value, "assembleid");
            return (Criteria) this;
        }

        public Criteria andAssembleidLessThanOrEqualTo(Integer value) {
            addCriterion("AssembleId <=", value, "assembleid");
            return (Criteria) this;
        }

        public Criteria andAssembleidIn(List<Integer> values) {
            addCriterion("AssembleId in", values, "assembleid");
            return (Criteria) this;
        }

        public Criteria andAssembleidNotIn(List<Integer> values) {
            addCriterion("AssembleId not in", values, "assembleid");
            return (Criteria) this;
        }

        public Criteria andAssembleidBetween(Integer value1, Integer value2) {
            addCriterion("AssembleId between", value1, value2, "assembleid");
            return (Criteria) this;
        }

        public Criteria andAssembleidNotBetween(Integer value1, Integer value2) {
            addCriterion("AssembleId not between", value1, value2, "assembleid");
            return (Criteria) this;
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

        public Criteria andProductidIsNull() {
            addCriterion("ProductId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("ProductId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("ProductId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("ProductId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("ProductId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("ProductId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("ProductId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("ProductId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("ProductId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("ProductId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andPartscountIsNull() {
            addCriterion("PartsCount is null");
            return (Criteria) this;
        }

        public Criteria andPartscountIsNotNull() {
            addCriterion("PartsCount is not null");
            return (Criteria) this;
        }

        public Criteria andPartscountEqualTo(Integer value) {
            addCriterion("PartsCount =", value, "partscount");
            return (Criteria) this;
        }

        public Criteria andPartscountNotEqualTo(Integer value) {
            addCriterion("PartsCount <>", value, "partscount");
            return (Criteria) this;
        }

        public Criteria andPartscountGreaterThan(Integer value) {
            addCriterion("PartsCount >", value, "partscount");
            return (Criteria) this;
        }

        public Criteria andPartscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PartsCount >=", value, "partscount");
            return (Criteria) this;
        }

        public Criteria andPartscountLessThan(Integer value) {
            addCriterion("PartsCount <", value, "partscount");
            return (Criteria) this;
        }

        public Criteria andPartscountLessThanOrEqualTo(Integer value) {
            addCriterion("PartsCount <=", value, "partscount");
            return (Criteria) this;
        }

        public Criteria andPartscountIn(List<Integer> values) {
            addCriterion("PartsCount in", values, "partscount");
            return (Criteria) this;
        }

        public Criteria andPartscountNotIn(List<Integer> values) {
            addCriterion("PartsCount not in", values, "partscount");
            return (Criteria) this;
        }

        public Criteria andPartscountBetween(Integer value1, Integer value2) {
            addCriterion("PartsCount between", value1, value2, "partscount");
            return (Criteria) this;
        }

        public Criteria andPartscountNotBetween(Integer value1, Integer value2) {
            addCriterion("PartsCount not between", value1, value2, "partscount");
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