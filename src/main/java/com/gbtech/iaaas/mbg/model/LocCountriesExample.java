package com.gbtech.iaaas.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class LocCountriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LocCountriesExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Short value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Short value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Short value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Short value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Short value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Short value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Short> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Short> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Short value1, Short value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Short value1, Short value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContinentIdIsNull() {
            addCriterion("continent_id is null");
            return (Criteria) this;
        }

        public Criteria andContinentIdIsNotNull() {
            addCriterion("continent_id is not null");
            return (Criteria) this;
        }

        public Criteria andContinentIdEqualTo(Integer value) {
            addCriterion("continent_id =", value, "continentId");
            return (Criteria) this;
        }

        public Criteria andContinentIdNotEqualTo(Integer value) {
            addCriterion("continent_id <>", value, "continentId");
            return (Criteria) this;
        }

        public Criteria andContinentIdGreaterThan(Integer value) {
            addCriterion("continent_id >", value, "continentId");
            return (Criteria) this;
        }

        public Criteria andContinentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("continent_id >=", value, "continentId");
            return (Criteria) this;
        }

        public Criteria andContinentIdLessThan(Integer value) {
            addCriterion("continent_id <", value, "continentId");
            return (Criteria) this;
        }

        public Criteria andContinentIdLessThanOrEqualTo(Integer value) {
            addCriterion("continent_id <=", value, "continentId");
            return (Criteria) this;
        }

        public Criteria andContinentIdIn(List<Integer> values) {
            addCriterion("continent_id in", values, "continentId");
            return (Criteria) this;
        }

        public Criteria andContinentIdNotIn(List<Integer> values) {
            addCriterion("continent_id not in", values, "continentId");
            return (Criteria) this;
        }

        public Criteria andContinentIdBetween(Integer value1, Integer value2) {
            addCriterion("continent_id between", value1, value2, "continentId");
            return (Criteria) this;
        }

        public Criteria andContinentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("continent_id not between", value1, value2, "continentId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("full_name is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("full_name =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("full_name <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("full_name >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("full_name >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("full_name <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("full_name <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("full_name like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("full_name not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("full_name in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("full_name not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("full_name between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("full_name not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andFullCnameIsNull() {
            addCriterion("full_cname is null");
            return (Criteria) this;
        }

        public Criteria andFullCnameIsNotNull() {
            addCriterion("full_cname is not null");
            return (Criteria) this;
        }

        public Criteria andFullCnameEqualTo(String value) {
            addCriterion("full_cname =", value, "fullCname");
            return (Criteria) this;
        }

        public Criteria andFullCnameNotEqualTo(String value) {
            addCriterion("full_cname <>", value, "fullCname");
            return (Criteria) this;
        }

        public Criteria andFullCnameGreaterThan(String value) {
            addCriterion("full_cname >", value, "fullCname");
            return (Criteria) this;
        }

        public Criteria andFullCnameGreaterThanOrEqualTo(String value) {
            addCriterion("full_cname >=", value, "fullCname");
            return (Criteria) this;
        }

        public Criteria andFullCnameLessThan(String value) {
            addCriterion("full_cname <", value, "fullCname");
            return (Criteria) this;
        }

        public Criteria andFullCnameLessThanOrEqualTo(String value) {
            addCriterion("full_cname <=", value, "fullCname");
            return (Criteria) this;
        }

        public Criteria andFullCnameLike(String value) {
            addCriterion("full_cname like", value, "fullCname");
            return (Criteria) this;
        }

        public Criteria andFullCnameNotLike(String value) {
            addCriterion("full_cname not like", value, "fullCname");
            return (Criteria) this;
        }

        public Criteria andFullCnameIn(List<String> values) {
            addCriterion("full_cname in", values, "fullCname");
            return (Criteria) this;
        }

        public Criteria andFullCnameNotIn(List<String> values) {
            addCriterion("full_cname not in", values, "fullCname");
            return (Criteria) this;
        }

        public Criteria andFullCnameBetween(String value1, String value2) {
            addCriterion("full_cname between", value1, value2, "fullCname");
            return (Criteria) this;
        }

        public Criteria andFullCnameNotBetween(String value1, String value2) {
            addCriterion("full_cname not between", value1, value2, "fullCname");
            return (Criteria) this;
        }

        public Criteria andLowerNameIsNull() {
            addCriterion("lower_name is null");
            return (Criteria) this;
        }

        public Criteria andLowerNameIsNotNull() {
            addCriterion("lower_name is not null");
            return (Criteria) this;
        }

        public Criteria andLowerNameEqualTo(String value) {
            addCriterion("lower_name =", value, "lowerName");
            return (Criteria) this;
        }

        public Criteria andLowerNameNotEqualTo(String value) {
            addCriterion("lower_name <>", value, "lowerName");
            return (Criteria) this;
        }

        public Criteria andLowerNameGreaterThan(String value) {
            addCriterion("lower_name >", value, "lowerName");
            return (Criteria) this;
        }

        public Criteria andLowerNameGreaterThanOrEqualTo(String value) {
            addCriterion("lower_name >=", value, "lowerName");
            return (Criteria) this;
        }

        public Criteria andLowerNameLessThan(String value) {
            addCriterion("lower_name <", value, "lowerName");
            return (Criteria) this;
        }

        public Criteria andLowerNameLessThanOrEqualTo(String value) {
            addCriterion("lower_name <=", value, "lowerName");
            return (Criteria) this;
        }

        public Criteria andLowerNameLike(String value) {
            addCriterion("lower_name like", value, "lowerName");
            return (Criteria) this;
        }

        public Criteria andLowerNameNotLike(String value) {
            addCriterion("lower_name not like", value, "lowerName");
            return (Criteria) this;
        }

        public Criteria andLowerNameIn(List<String> values) {
            addCriterion("lower_name in", values, "lowerName");
            return (Criteria) this;
        }

        public Criteria andLowerNameNotIn(List<String> values) {
            addCriterion("lower_name not in", values, "lowerName");
            return (Criteria) this;
        }

        public Criteria andLowerNameBetween(String value1, String value2) {
            addCriterion("lower_name between", value1, value2, "lowerName");
            return (Criteria) this;
        }

        public Criteria andLowerNameNotBetween(String value1, String value2) {
            addCriterion("lower_name not between", value1, value2, "lowerName");
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