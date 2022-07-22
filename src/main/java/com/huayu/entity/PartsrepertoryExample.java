package com.huayu.entity;

import java.util.ArrayList;
import java.util.List;

public class PartsrepertoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartsrepertoryExample() {
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

        public Criteria andPartsrepidIsNull() {
            addCriterion("PartsRepId is null");
            return (Criteria) this;
        }

        public Criteria andPartsrepidIsNotNull() {
            addCriterion("PartsRepId is not null");
            return (Criteria) this;
        }

        public Criteria andPartsrepidEqualTo(Integer value) {
            addCriterion("PartsRepId =", value, "partsrepid");
            return (Criteria) this;
        }

        public Criteria andPartsrepidNotEqualTo(Integer value) {
            addCriterion("PartsRepId <>", value, "partsrepid");
            return (Criteria) this;
        }

        public Criteria andPartsrepidGreaterThan(Integer value) {
            addCriterion("PartsRepId >", value, "partsrepid");
            return (Criteria) this;
        }

        public Criteria andPartsrepidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PartsRepId >=", value, "partsrepid");
            return (Criteria) this;
        }

        public Criteria andPartsrepidLessThan(Integer value) {
            addCriterion("PartsRepId <", value, "partsrepid");
            return (Criteria) this;
        }

        public Criteria andPartsrepidLessThanOrEqualTo(Integer value) {
            addCriterion("PartsRepId <=", value, "partsrepid");
            return (Criteria) this;
        }

        public Criteria andPartsrepidIn(List<Integer> values) {
            addCriterion("PartsRepId in", values, "partsrepid");
            return (Criteria) this;
        }

        public Criteria andPartsrepidNotIn(List<Integer> values) {
            addCriterion("PartsRepId not in", values, "partsrepid");
            return (Criteria) this;
        }

        public Criteria andPartsrepidBetween(Integer value1, Integer value2) {
            addCriterion("PartsRepId between", value1, value2, "partsrepid");
            return (Criteria) this;
        }

        public Criteria andPartsrepidNotBetween(Integer value1, Integer value2) {
            addCriterion("PartsRepId not between", value1, value2, "partsrepid");
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

        public Criteria andPartsreqcountIsNull() {
            addCriterion("PartsReqCount is null");
            return (Criteria) this;
        }

        public Criteria andPartsreqcountIsNotNull() {
            addCriterion("PartsReqCount is not null");
            return (Criteria) this;
        }

        public Criteria andPartsreqcountEqualTo(Integer value) {
            addCriterion("PartsReqCount =", value, "partsreqcount");
            return (Criteria) this;
        }

        public Criteria andPartsreqcountNotEqualTo(Integer value) {
            addCriterion("PartsReqCount <>", value, "partsreqcount");
            return (Criteria) this;
        }

        public Criteria andPartsreqcountGreaterThan(Integer value) {
            addCriterion("PartsReqCount >", value, "partsreqcount");
            return (Criteria) this;
        }

        public Criteria andPartsreqcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PartsReqCount >=", value, "partsreqcount");
            return (Criteria) this;
        }

        public Criteria andPartsreqcountLessThan(Integer value) {
            addCriterion("PartsReqCount <", value, "partsreqcount");
            return (Criteria) this;
        }

        public Criteria andPartsreqcountLessThanOrEqualTo(Integer value) {
            addCriterion("PartsReqCount <=", value, "partsreqcount");
            return (Criteria) this;
        }

        public Criteria andPartsreqcountIn(List<Integer> values) {
            addCriterion("PartsReqCount in", values, "partsreqcount");
            return (Criteria) this;
        }

        public Criteria andPartsreqcountNotIn(List<Integer> values) {
            addCriterion("PartsReqCount not in", values, "partsreqcount");
            return (Criteria) this;
        }

        public Criteria andPartsreqcountBetween(Integer value1, Integer value2) {
            addCriterion("PartsReqCount between", value1, value2, "partsreqcount");
            return (Criteria) this;
        }

        public Criteria andPartsreqcountNotBetween(Integer value1, Integer value2) {
            addCriterion("PartsReqCount not between", value1, value2, "partsreqcount");
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