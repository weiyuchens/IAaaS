package com.gbtech.iaaas.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcAccessRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcAccessRecordExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdIsNull() {
            addCriterion("access_card_id is null");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdIsNotNull() {
            addCriterion("access_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdEqualTo(Integer value) {
            addCriterion("access_card_id =", value, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdNotEqualTo(Integer value) {
            addCriterion("access_card_id <>", value, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdGreaterThan(Integer value) {
            addCriterion("access_card_id >", value, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("access_card_id >=", value, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdLessThan(Integer value) {
            addCriterion("access_card_id <", value, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdLessThanOrEqualTo(Integer value) {
            addCriterion("access_card_id <=", value, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdIn(List<Integer> values) {
            addCriterion("access_card_id in", values, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdNotIn(List<Integer> values) {
            addCriterion("access_card_id not in", values, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdBetween(Integer value1, Integer value2) {
            addCriterion("access_card_id between", value1, value2, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("access_card_id not between", value1, value2, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andPublicAccessControlIdIsNull() {
            addCriterion("public_access_control_id is null");
            return (Criteria) this;
        }

        public Criteria andPublicAccessControlIdIsNotNull() {
            addCriterion("public_access_control_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublicAccessControlIdEqualTo(Integer value) {
            addCriterion("public_access_control_id =", value, "publicAccessControlId");
            return (Criteria) this;
        }

        public Criteria andPublicAccessControlIdNotEqualTo(Integer value) {
            addCriterion("public_access_control_id <>", value, "publicAccessControlId");
            return (Criteria) this;
        }

        public Criteria andPublicAccessControlIdGreaterThan(Integer value) {
            addCriterion("public_access_control_id >", value, "publicAccessControlId");
            return (Criteria) this;
        }

        public Criteria andPublicAccessControlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("public_access_control_id >=", value, "publicAccessControlId");
            return (Criteria) this;
        }

        public Criteria andPublicAccessControlIdLessThan(Integer value) {
            addCriterion("public_access_control_id <", value, "publicAccessControlId");
            return (Criteria) this;
        }

        public Criteria andPublicAccessControlIdLessThanOrEqualTo(Integer value) {
            addCriterion("public_access_control_id <=", value, "publicAccessControlId");
            return (Criteria) this;
        }

        public Criteria andPublicAccessControlIdIn(List<Integer> values) {
            addCriterion("public_access_control_id in", values, "publicAccessControlId");
            return (Criteria) this;
        }

        public Criteria andPublicAccessControlIdNotIn(List<Integer> values) {
            addCriterion("public_access_control_id not in", values, "publicAccessControlId");
            return (Criteria) this;
        }

        public Criteria andPublicAccessControlIdBetween(Integer value1, Integer value2) {
            addCriterion("public_access_control_id between", value1, value2, "publicAccessControlId");
            return (Criteria) this;
        }

        public Criteria andPublicAccessControlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("public_access_control_id not between", value1, value2, "publicAccessControlId");
            return (Criteria) this;
        }

        public Criteria andRoomAccessControlIdIsNull() {
            addCriterion("room_access_control_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomAccessControlIdIsNotNull() {
            addCriterion("room_access_control_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomAccessControlIdEqualTo(Integer value) {
            addCriterion("room_access_control_id =", value, "roomAccessControlId");
            return (Criteria) this;
        }

        public Criteria andRoomAccessControlIdNotEqualTo(Integer value) {
            addCriterion("room_access_control_id <>", value, "roomAccessControlId");
            return (Criteria) this;
        }

        public Criteria andRoomAccessControlIdGreaterThan(Integer value) {
            addCriterion("room_access_control_id >", value, "roomAccessControlId");
            return (Criteria) this;
        }

        public Criteria andRoomAccessControlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_access_control_id >=", value, "roomAccessControlId");
            return (Criteria) this;
        }

        public Criteria andRoomAccessControlIdLessThan(Integer value) {
            addCriterion("room_access_control_id <", value, "roomAccessControlId");
            return (Criteria) this;
        }

        public Criteria andRoomAccessControlIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_access_control_id <=", value, "roomAccessControlId");
            return (Criteria) this;
        }

        public Criteria andRoomAccessControlIdIn(List<Integer> values) {
            addCriterion("room_access_control_id in", values, "roomAccessControlId");
            return (Criteria) this;
        }

        public Criteria andRoomAccessControlIdNotIn(List<Integer> values) {
            addCriterion("room_access_control_id not in", values, "roomAccessControlId");
            return (Criteria) this;
        }

        public Criteria andRoomAccessControlIdBetween(Integer value1, Integer value2) {
            addCriterion("room_access_control_id between", value1, value2, "roomAccessControlId");
            return (Criteria) this;
        }

        public Criteria andRoomAccessControlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_access_control_id not between", value1, value2, "roomAccessControlId");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNull() {
            addCriterion("operate_type is null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNotNull() {
            addCriterion("operate_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeEqualTo(Byte value) {
            addCriterion("operate_type =", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotEqualTo(Byte value) {
            addCriterion("operate_type <>", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThan(Byte value) {
            addCriterion("operate_type >", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("operate_type >=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThan(Byte value) {
            addCriterion("operate_type <", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThanOrEqualTo(Byte value) {
            addCriterion("operate_type <=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIn(List<Byte> values) {
            addCriterion("operate_type in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotIn(List<Byte> values) {
            addCriterion("operate_type not in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeBetween(Byte value1, Byte value2) {
            addCriterion("operate_type between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("operate_type not between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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