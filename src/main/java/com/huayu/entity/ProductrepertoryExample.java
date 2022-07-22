package com.huayu.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductrepertoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductrepertoryExample() {
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

        public Criteria andProrepidIsNull() {
            addCriterion("ProRepId is null");
            return (Criteria) this;
        }

        public Criteria andProrepidIsNotNull() {
            addCriterion("ProRepId is not null");
            return (Criteria) this;
        }

        public Criteria andProrepidEqualTo(Integer value) {
            addCriterion("ProRepId =", value, "prorepid");
            return (Criteria) this;
        }

        public Criteria andProrepidNotEqualTo(Integer value) {
            addCriterion("ProRepId <>", value, "prorepid");
            return (Criteria) this;
        }

        public Criteria andProrepidGreaterThan(Integer value) {
            addCriterion("ProRepId >", value, "prorepid");
            return (Criteria) this;
        }

        public Criteria andProrepidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProRepId >=", value, "prorepid");
            return (Criteria) this;
        }

        public Criteria andProrepidLessThan(Integer value) {
            addCriterion("ProRepId <", value, "prorepid");
            return (Criteria) this;
        }

        public Criteria andProrepidLessThanOrEqualTo(Integer value) {
            addCriterion("ProRepId <=", value, "prorepid");
            return (Criteria) this;
        }

        public Criteria andProrepidIn(List<Integer> values) {
            addCriterion("ProRepId in", values, "prorepid");
            return (Criteria) this;
        }

        public Criteria andProrepidNotIn(List<Integer> values) {
            addCriterion("ProRepId not in", values, "prorepid");
            return (Criteria) this;
        }

        public Criteria andProrepidBetween(Integer value1, Integer value2) {
            addCriterion("ProRepId between", value1, value2, "prorepid");
            return (Criteria) this;
        }

        public Criteria andProrepidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProRepId not between", value1, value2, "prorepid");
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

        public Criteria andProrepcountIsNull() {
            addCriterion("ProRepCount is null");
            return (Criteria) this;
        }

        public Criteria andProrepcountIsNotNull() {
            addCriterion("ProRepCount is not null");
            return (Criteria) this;
        }

        public Criteria andProrepcountEqualTo(Integer value) {
            addCriterion("ProRepCount =", value, "prorepcount");
            return (Criteria) this;
        }

        public Criteria andProrepcountNotEqualTo(Integer value) {
            addCriterion("ProRepCount <>", value, "prorepcount");
            return (Criteria) this;
        }

        public Criteria andProrepcountGreaterThan(Integer value) {
            addCriterion("ProRepCount >", value, "prorepcount");
            return (Criteria) this;
        }

        public Criteria andProrepcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProRepCount >=", value, "prorepcount");
            return (Criteria) this;
        }

        public Criteria andProrepcountLessThan(Integer value) {
            addCriterion("ProRepCount <", value, "prorepcount");
            return (Criteria) this;
        }

        public Criteria andProrepcountLessThanOrEqualTo(Integer value) {
            addCriterion("ProRepCount <=", value, "prorepcount");
            return (Criteria) this;
        }

        public Criteria andProrepcountIn(List<Integer> values) {
            addCriterion("ProRepCount in", values, "prorepcount");
            return (Criteria) this;
        }

        public Criteria andProrepcountNotIn(List<Integer> values) {
            addCriterion("ProRepCount not in", values, "prorepcount");
            return (Criteria) this;
        }

        public Criteria andProrepcountBetween(Integer value1, Integer value2) {
            addCriterion("ProRepCount between", value1, value2, "prorepcount");
            return (Criteria) this;
        }

        public Criteria andProrepcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ProRepCount not between", value1, value2, "prorepcount");
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