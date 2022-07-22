package com.huayu.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderdetailExample() {
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

        public Criteria andOrderdetailidIsNull() {
            addCriterion("OrderDetailId is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIsNotNull() {
            addCriterion("OrderDetailId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidEqualTo(Integer value) {
            addCriterion("OrderDetailId =", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotEqualTo(Integer value) {
            addCriterion("OrderDetailId <>", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidGreaterThan(Integer value) {
            addCriterion("OrderDetailId >", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderDetailId >=", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLessThan(Integer value) {
            addCriterion("OrderDetailId <", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLessThanOrEqualTo(Integer value) {
            addCriterion("OrderDetailId <=", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIn(List<Integer> values) {
            addCriterion("OrderDetailId in", values, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotIn(List<Integer> values) {
            addCriterion("OrderDetailId not in", values, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidBetween(Integer value1, Integer value2) {
            addCriterion("OrderDetailId between", value1, value2, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderDetailId not between", value1, value2, "orderdetailid");
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

        public Criteria andOrderidIsNull() {
            addCriterion("OrderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("OrderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("OrderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("OrderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("OrderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("OrderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("OrderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("OrderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("OrderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderpartscountIsNull() {
            addCriterion("OrderPartsCount is null");
            return (Criteria) this;
        }

        public Criteria andOrderpartscountIsNotNull() {
            addCriterion("OrderPartsCount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpartscountEqualTo(Integer value) {
            addCriterion("OrderPartsCount =", value, "orderpartscount");
            return (Criteria) this;
        }

        public Criteria andOrderpartscountNotEqualTo(Integer value) {
            addCriterion("OrderPartsCount <>", value, "orderpartscount");
            return (Criteria) this;
        }

        public Criteria andOrderpartscountGreaterThan(Integer value) {
            addCriterion("OrderPartsCount >", value, "orderpartscount");
            return (Criteria) this;
        }

        public Criteria andOrderpartscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderPartsCount >=", value, "orderpartscount");
            return (Criteria) this;
        }

        public Criteria andOrderpartscountLessThan(Integer value) {
            addCriterion("OrderPartsCount <", value, "orderpartscount");
            return (Criteria) this;
        }

        public Criteria andOrderpartscountLessThanOrEqualTo(Integer value) {
            addCriterion("OrderPartsCount <=", value, "orderpartscount");
            return (Criteria) this;
        }

        public Criteria andOrderpartscountIn(List<Integer> values) {
            addCriterion("OrderPartsCount in", values, "orderpartscount");
            return (Criteria) this;
        }

        public Criteria andOrderpartscountNotIn(List<Integer> values) {
            addCriterion("OrderPartsCount not in", values, "orderpartscount");
            return (Criteria) this;
        }

        public Criteria andOrderpartscountBetween(Integer value1, Integer value2) {
            addCriterion("OrderPartsCount between", value1, value2, "orderpartscount");
            return (Criteria) this;
        }

        public Criteria andOrderpartscountNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderPartsCount not between", value1, value2, "orderpartscount");
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