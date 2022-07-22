package com.huayu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartsrepbillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartsrepbillExample() {
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

        public Criteria andBillidIsNull() {
            addCriterion("billid is null");
            return (Criteria) this;
        }

        public Criteria andBillidIsNotNull() {
            addCriterion("billid is not null");
            return (Criteria) this;
        }

        public Criteria andBillidEqualTo(Integer value) {
            addCriterion("billid =", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotEqualTo(Integer value) {
            addCriterion("billid <>", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThan(Integer value) {
            addCriterion("billid >", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThanOrEqualTo(Integer value) {
            addCriterion("billid >=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThan(Integer value) {
            addCriterion("billid <", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThanOrEqualTo(Integer value) {
            addCriterion("billid <=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidIn(List<Integer> values) {
            addCriterion("billid in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotIn(List<Integer> values) {
            addCriterion("billid not in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidBetween(Integer value1, Integer value2) {
            addCriterion("billid between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotBetween(Integer value1, Integer value2) {
            addCriterion("billid not between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andBillflagIsNull() {
            addCriterion("billflag is null");
            return (Criteria) this;
        }

        public Criteria andBillflagIsNotNull() {
            addCriterion("billflag is not null");
            return (Criteria) this;
        }

        public Criteria andBillflagEqualTo(String value) {
            addCriterion("billflag =", value, "billflag");
            return (Criteria) this;
        }

        public Criteria andBillflagNotEqualTo(String value) {
            addCriterion("billflag <>", value, "billflag");
            return (Criteria) this;
        }

        public Criteria andBillflagGreaterThan(String value) {
            addCriterion("billflag >", value, "billflag");
            return (Criteria) this;
        }

        public Criteria andBillflagGreaterThanOrEqualTo(String value) {
            addCriterion("billflag >=", value, "billflag");
            return (Criteria) this;
        }

        public Criteria andBillflagLessThan(String value) {
            addCriterion("billflag <", value, "billflag");
            return (Criteria) this;
        }

        public Criteria andBillflagLessThanOrEqualTo(String value) {
            addCriterion("billflag <=", value, "billflag");
            return (Criteria) this;
        }

        public Criteria andBillflagLike(String value) {
            addCriterion("billflag like", value, "billflag");
            return (Criteria) this;
        }

        public Criteria andBillflagNotLike(String value) {
            addCriterion("billflag not like", value, "billflag");
            return (Criteria) this;
        }

        public Criteria andBillflagIn(List<String> values) {
            addCriterion("billflag in", values, "billflag");
            return (Criteria) this;
        }

        public Criteria andBillflagNotIn(List<String> values) {
            addCriterion("billflag not in", values, "billflag");
            return (Criteria) this;
        }

        public Criteria andBillflagBetween(String value1, String value2) {
            addCriterion("billflag between", value1, value2, "billflag");
            return (Criteria) this;
        }

        public Criteria andBillflagNotBetween(String value1, String value2) {
            addCriterion("billflag not between", value1, value2, "billflag");
            return (Criteria) this;
        }

        public Criteria andBilltypeIsNull() {
            addCriterion("billtype is null");
            return (Criteria) this;
        }

        public Criteria andBilltypeIsNotNull() {
            addCriterion("billtype is not null");
            return (Criteria) this;
        }

        public Criteria andBilltypeEqualTo(String value) {
            addCriterion("billtype =", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotEqualTo(String value) {
            addCriterion("billtype <>", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeGreaterThan(String value) {
            addCriterion("billtype >", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeGreaterThanOrEqualTo(String value) {
            addCriterion("billtype >=", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeLessThan(String value) {
            addCriterion("billtype <", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeLessThanOrEqualTo(String value) {
            addCriterion("billtype <=", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeLike(String value) {
            addCriterion("billtype like", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotLike(String value) {
            addCriterion("billtype not like", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeIn(List<String> values) {
            addCriterion("billtype in", values, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotIn(List<String> values) {
            addCriterion("billtype not in", values, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeBetween(String value1, String value2) {
            addCriterion("billtype between", value1, value2, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotBetween(String value1, String value2) {
            addCriterion("billtype not between", value1, value2, "billtype");
            return (Criteria) this;
        }

        public Criteria andPartsidIsNull() {
            addCriterion("partsid is null");
            return (Criteria) this;
        }

        public Criteria andPartsidIsNotNull() {
            addCriterion("partsid is not null");
            return (Criteria) this;
        }

        public Criteria andPartsidEqualTo(Integer value) {
            addCriterion("partsid =", value, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidNotEqualTo(Integer value) {
            addCriterion("partsid <>", value, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidGreaterThan(Integer value) {
            addCriterion("partsid >", value, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("partsid >=", value, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidLessThan(Integer value) {
            addCriterion("partsid <", value, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidLessThanOrEqualTo(Integer value) {
            addCriterion("partsid <=", value, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidIn(List<Integer> values) {
            addCriterion("partsid in", values, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidNotIn(List<Integer> values) {
            addCriterion("partsid not in", values, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidBetween(Integer value1, Integer value2) {
            addCriterion("partsid between", value1, value2, "partsid");
            return (Criteria) this;
        }

        public Criteria andPartsidNotBetween(Integer value1, Integer value2) {
            addCriterion("partsid not between", value1, value2, "partsid");
            return (Criteria) this;
        }

        public Criteria andBillcountIsNull() {
            addCriterion("billcount is null");
            return (Criteria) this;
        }

        public Criteria andBillcountIsNotNull() {
            addCriterion("billcount is not null");
            return (Criteria) this;
        }

        public Criteria andBillcountEqualTo(Integer value) {
            addCriterion("billcount =", value, "billcount");
            return (Criteria) this;
        }

        public Criteria andBillcountNotEqualTo(Integer value) {
            addCriterion("billcount <>", value, "billcount");
            return (Criteria) this;
        }

        public Criteria andBillcountGreaterThan(Integer value) {
            addCriterion("billcount >", value, "billcount");
            return (Criteria) this;
        }

        public Criteria andBillcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("billcount >=", value, "billcount");
            return (Criteria) this;
        }

        public Criteria andBillcountLessThan(Integer value) {
            addCriterion("billcount <", value, "billcount");
            return (Criteria) this;
        }

        public Criteria andBillcountLessThanOrEqualTo(Integer value) {
            addCriterion("billcount <=", value, "billcount");
            return (Criteria) this;
        }

        public Criteria andBillcountIn(List<Integer> values) {
            addCriterion("billcount in", values, "billcount");
            return (Criteria) this;
        }

        public Criteria andBillcountNotIn(List<Integer> values) {
            addCriterion("billcount not in", values, "billcount");
            return (Criteria) this;
        }

        public Criteria andBillcountBetween(Integer value1, Integer value2) {
            addCriterion("billcount between", value1, value2, "billcount");
            return (Criteria) this;
        }

        public Criteria andBillcountNotBetween(Integer value1, Integer value2) {
            addCriterion("billcount not between", value1, value2, "billcount");
            return (Criteria) this;
        }

        public Criteria andBilltimeIsNull() {
            addCriterion("billtime is null");
            return (Criteria) this;
        }

        public Criteria andBilltimeIsNotNull() {
            addCriterion("billtime is not null");
            return (Criteria) this;
        }

        public Criteria andBilltimeEqualTo(Date value) {
            addCriterion("billtime =", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeNotEqualTo(Date value) {
            addCriterion("billtime <>", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeGreaterThan(Date value) {
            addCriterion("billtime >", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("billtime >=", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeLessThan(Date value) {
            addCriterion("billtime <", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeLessThanOrEqualTo(Date value) {
            addCriterion("billtime <=", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeIn(List<Date> values) {
            addCriterion("billtime in", values, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeNotIn(List<Date> values) {
            addCriterion("billtime not in", values, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeBetween(Date value1, Date value2) {
            addCriterion("billtime between", value1, value2, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeNotBetween(Date value1, Date value2) {
            addCriterion("billtime not between", value1, value2, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilluserIsNull() {
            addCriterion("billuser is null");
            return (Criteria) this;
        }

        public Criteria andBilluserIsNotNull() {
            addCriterion("billuser is not null");
            return (Criteria) this;
        }

        public Criteria andBilluserEqualTo(Integer value) {
            addCriterion("billuser =", value, "billuser");
            return (Criteria) this;
        }

        public Criteria andBilluserNotEqualTo(Integer value) {
            addCriterion("billuser <>", value, "billuser");
            return (Criteria) this;
        }

        public Criteria andBilluserGreaterThan(Integer value) {
            addCriterion("billuser >", value, "billuser");
            return (Criteria) this;
        }

        public Criteria andBilluserGreaterThanOrEqualTo(Integer value) {
            addCriterion("billuser >=", value, "billuser");
            return (Criteria) this;
        }

        public Criteria andBilluserLessThan(Integer value) {
            addCriterion("billuser <", value, "billuser");
            return (Criteria) this;
        }

        public Criteria andBilluserLessThanOrEqualTo(Integer value) {
            addCriterion("billuser <=", value, "billuser");
            return (Criteria) this;
        }

        public Criteria andBilluserIn(List<Integer> values) {
            addCriterion("billuser in", values, "billuser");
            return (Criteria) this;
        }

        public Criteria andBilluserNotIn(List<Integer> values) {
            addCriterion("billuser not in", values, "billuser");
            return (Criteria) this;
        }

        public Criteria andBilluserBetween(Integer value1, Integer value2) {
            addCriterion("billuser between", value1, value2, "billuser");
            return (Criteria) this;
        }

        public Criteria andBilluserNotBetween(Integer value1, Integer value2) {
            addCriterion("billuser not between", value1, value2, "billuser");
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