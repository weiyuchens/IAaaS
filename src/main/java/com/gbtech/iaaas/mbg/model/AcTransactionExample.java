package com.gbtech.iaaas.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcTransactionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcTransactionExample() {
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

        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(Integer value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(Integer value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(Integer value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(Integer value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(Integer value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<Integer> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<Integer> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(Integer value1, Integer value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andTransDetailIsNull() {
            addCriterion("trans_detail is null");
            return (Criteria) this;
        }

        public Criteria andTransDetailIsNotNull() {
            addCriterion("trans_detail is not null");
            return (Criteria) this;
        }

        public Criteria andTransDetailEqualTo(String value) {
            addCriterion("trans_detail =", value, "transDetail");
            return (Criteria) this;
        }

        public Criteria andTransDetailNotEqualTo(String value) {
            addCriterion("trans_detail <>", value, "transDetail");
            return (Criteria) this;
        }

        public Criteria andTransDetailGreaterThan(String value) {
            addCriterion("trans_detail >", value, "transDetail");
            return (Criteria) this;
        }

        public Criteria andTransDetailGreaterThanOrEqualTo(String value) {
            addCriterion("trans_detail >=", value, "transDetail");
            return (Criteria) this;
        }

        public Criteria andTransDetailLessThan(String value) {
            addCriterion("trans_detail <", value, "transDetail");
            return (Criteria) this;
        }

        public Criteria andTransDetailLessThanOrEqualTo(String value) {
            addCriterion("trans_detail <=", value, "transDetail");
            return (Criteria) this;
        }

        public Criteria andTransDetailLike(String value) {
            addCriterion("trans_detail like", value, "transDetail");
            return (Criteria) this;
        }

        public Criteria andTransDetailNotLike(String value) {
            addCriterion("trans_detail not like", value, "transDetail");
            return (Criteria) this;
        }

        public Criteria andTransDetailIn(List<String> values) {
            addCriterion("trans_detail in", values, "transDetail");
            return (Criteria) this;
        }

        public Criteria andTransDetailNotIn(List<String> values) {
            addCriterion("trans_detail not in", values, "transDetail");
            return (Criteria) this;
        }

        public Criteria andTransDetailBetween(String value1, String value2) {
            addCriterion("trans_detail between", value1, value2, "transDetail");
            return (Criteria) this;
        }

        public Criteria andTransDetailNotBetween(String value1, String value2) {
            addCriterion("trans_detail not between", value1, value2, "transDetail");
            return (Criteria) this;
        }

        public Criteria andTransPropertyIsNull() {
            addCriterion("trans_property is null");
            return (Criteria) this;
        }

        public Criteria andTransPropertyIsNotNull() {
            addCriterion("trans_property is not null");
            return (Criteria) this;
        }

        public Criteria andTransPropertyEqualTo(Byte value) {
            addCriterion("trans_property =", value, "transProperty");
            return (Criteria) this;
        }

        public Criteria andTransPropertyNotEqualTo(Byte value) {
            addCriterion("trans_property <>", value, "transProperty");
            return (Criteria) this;
        }

        public Criteria andTransPropertyGreaterThan(Byte value) {
            addCriterion("trans_property >", value, "transProperty");
            return (Criteria) this;
        }

        public Criteria andTransPropertyGreaterThanOrEqualTo(Byte value) {
            addCriterion("trans_property >=", value, "transProperty");
            return (Criteria) this;
        }

        public Criteria andTransPropertyLessThan(Byte value) {
            addCriterion("trans_property <", value, "transProperty");
            return (Criteria) this;
        }

        public Criteria andTransPropertyLessThanOrEqualTo(Byte value) {
            addCriterion("trans_property <=", value, "transProperty");
            return (Criteria) this;
        }

        public Criteria andTransPropertyIn(List<Byte> values) {
            addCriterion("trans_property in", values, "transProperty");
            return (Criteria) this;
        }

        public Criteria andTransPropertyNotIn(List<Byte> values) {
            addCriterion("trans_property not in", values, "transProperty");
            return (Criteria) this;
        }

        public Criteria andTransPropertyBetween(Byte value1, Byte value2) {
            addCriterion("trans_property between", value1, value2, "transProperty");
            return (Criteria) this;
        }

        public Criteria andTransPropertyNotBetween(Byte value1, Byte value2) {
            addCriterion("trans_property not between", value1, value2, "transProperty");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNull() {
            addCriterion("fee_type is null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNotNull() {
            addCriterion("fee_type is not null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeEqualTo(Byte value) {
            addCriterion("fee_type =", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotEqualTo(Byte value) {
            addCriterion("fee_type <>", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThan(Byte value) {
            addCriterion("fee_type >", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("fee_type >=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThan(Byte value) {
            addCriterion("fee_type <", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThanOrEqualTo(Byte value) {
            addCriterion("fee_type <=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIn(List<Byte> values) {
            addCriterion("fee_type in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotIn(List<Byte> values) {
            addCriterion("fee_type not in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeBetween(Byte value1, Byte value2) {
            addCriterion("fee_type between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("fee_type not between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIsNull() {
            addCriterion("payment_channel is null");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIsNotNull() {
            addCriterion("payment_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelEqualTo(String value) {
            addCriterion("payment_channel =", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotEqualTo(String value) {
            addCriterion("payment_channel <>", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelGreaterThan(String value) {
            addCriterion("payment_channel >", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelGreaterThanOrEqualTo(String value) {
            addCriterion("payment_channel >=", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLessThan(String value) {
            addCriterion("payment_channel <", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLessThanOrEqualTo(String value) {
            addCriterion("payment_channel <=", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLike(String value) {
            addCriterion("payment_channel like", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotLike(String value) {
            addCriterion("payment_channel not like", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIn(List<String> values) {
            addCriterion("payment_channel in", values, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotIn(List<String> values) {
            addCriterion("payment_channel not in", values, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelBetween(String value1, String value2) {
            addCriterion("payment_channel between", value1, value2, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotBetween(String value1, String value2) {
            addCriterion("payment_channel not between", value1, value2, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andTransAmountIsNull() {
            addCriterion("trans_amount is null");
            return (Criteria) this;
        }

        public Criteria andTransAmountIsNotNull() {
            addCriterion("trans_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTransAmountEqualTo(Integer value) {
            addCriterion("trans_amount =", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountNotEqualTo(Integer value) {
            addCriterion("trans_amount <>", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountGreaterThan(Integer value) {
            addCriterion("trans_amount >", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_amount >=", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountLessThan(Integer value) {
            addCriterion("trans_amount <", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountLessThanOrEqualTo(Integer value) {
            addCriterion("trans_amount <=", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountIn(List<Integer> values) {
            addCriterion("trans_amount in", values, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountNotIn(List<Integer> values) {
            addCriterion("trans_amount not in", values, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountBetween(Integer value1, Integer value2) {
            addCriterion("trans_amount between", value1, value2, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_amount not between", value1, value2, "transAmount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountIsNull() {
            addCriterion("payer_account is null");
            return (Criteria) this;
        }

        public Criteria andPayerAccountIsNotNull() {
            addCriterion("payer_account is not null");
            return (Criteria) this;
        }

        public Criteria andPayerAccountEqualTo(String value) {
            addCriterion("payer_account =", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountNotEqualTo(String value) {
            addCriterion("payer_account <>", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountGreaterThan(String value) {
            addCriterion("payer_account >", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountGreaterThanOrEqualTo(String value) {
            addCriterion("payer_account >=", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountLessThan(String value) {
            addCriterion("payer_account <", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountLessThanOrEqualTo(String value) {
            addCriterion("payer_account <=", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountLike(String value) {
            addCriterion("payer_account like", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountNotLike(String value) {
            addCriterion("payer_account not like", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountIn(List<String> values) {
            addCriterion("payer_account in", values, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountNotIn(List<String> values) {
            addCriterion("payer_account not in", values, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountBetween(String value1, String value2) {
            addCriterion("payer_account between", value1, value2, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountNotBetween(String value1, String value2) {
            addCriterion("payer_account not between", value1, value2, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerNameIsNull() {
            addCriterion("payer_name is null");
            return (Criteria) this;
        }

        public Criteria andPayerNameIsNotNull() {
            addCriterion("payer_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayerNameEqualTo(String value) {
            addCriterion("payer_name =", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotEqualTo(String value) {
            addCriterion("payer_name <>", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameGreaterThan(String value) {
            addCriterion("payer_name >", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("payer_name >=", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLessThan(String value) {
            addCriterion("payer_name <", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLessThanOrEqualTo(String value) {
            addCriterion("payer_name <=", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLike(String value) {
            addCriterion("payer_name like", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotLike(String value) {
            addCriterion("payer_name not like", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameIn(List<String> values) {
            addCriterion("payer_name in", values, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotIn(List<String> values) {
            addCriterion("payer_name not in", values, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameBetween(String value1, String value2) {
            addCriterion("payer_name between", value1, value2, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotBetween(String value1, String value2) {
            addCriterion("payer_name not between", value1, value2, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerInstitutionIsNull() {
            addCriterion("payer_institution is null");
            return (Criteria) this;
        }

        public Criteria andPayerInstitutionIsNotNull() {
            addCriterion("payer_institution is not null");
            return (Criteria) this;
        }

        public Criteria andPayerInstitutionEqualTo(String value) {
            addCriterion("payer_institution =", value, "payerInstitution");
            return (Criteria) this;
        }

        public Criteria andPayerInstitutionNotEqualTo(String value) {
            addCriterion("payer_institution <>", value, "payerInstitution");
            return (Criteria) this;
        }

        public Criteria andPayerInstitutionGreaterThan(String value) {
            addCriterion("payer_institution >", value, "payerInstitution");
            return (Criteria) this;
        }

        public Criteria andPayerInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("payer_institution >=", value, "payerInstitution");
            return (Criteria) this;
        }

        public Criteria andPayerInstitutionLessThan(String value) {
            addCriterion("payer_institution <", value, "payerInstitution");
            return (Criteria) this;
        }

        public Criteria andPayerInstitutionLessThanOrEqualTo(String value) {
            addCriterion("payer_institution <=", value, "payerInstitution");
            return (Criteria) this;
        }

        public Criteria andPayerInstitutionLike(String value) {
            addCriterion("payer_institution like", value, "payerInstitution");
            return (Criteria) this;
        }

        public Criteria andPayerInstitutionNotLike(String value) {
            addCriterion("payer_institution not like", value, "payerInstitution");
            return (Criteria) this;
        }

        public Criteria andPayerInstitutionIn(List<String> values) {
            addCriterion("payer_institution in", values, "payerInstitution");
            return (Criteria) this;
        }

        public Criteria andPayerInstitutionNotIn(List<String> values) {
            addCriterion("payer_institution not in", values, "payerInstitution");
            return (Criteria) this;
        }

        public Criteria andPayerInstitutionBetween(String value1, String value2) {
            addCriterion("payer_institution between", value1, value2, "payerInstitution");
            return (Criteria) this;
        }

        public Criteria andPayerInstitutionNotBetween(String value1, String value2) {
            addCriterion("payer_institution not between", value1, value2, "payerInstitution");
            return (Criteria) this;
        }

        public Criteria andRecipientAccountIsNull() {
            addCriterion("recipient_account is null");
            return (Criteria) this;
        }

        public Criteria andRecipientAccountIsNotNull() {
            addCriterion("recipient_account is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientAccountEqualTo(String value) {
            addCriterion("recipient_account =", value, "recipientAccount");
            return (Criteria) this;
        }

        public Criteria andRecipientAccountNotEqualTo(String value) {
            addCriterion("recipient_account <>", value, "recipientAccount");
            return (Criteria) this;
        }

        public Criteria andRecipientAccountGreaterThan(String value) {
            addCriterion("recipient_account >", value, "recipientAccount");
            return (Criteria) this;
        }

        public Criteria andRecipientAccountGreaterThanOrEqualTo(String value) {
            addCriterion("recipient_account >=", value, "recipientAccount");
            return (Criteria) this;
        }

        public Criteria andRecipientAccountLessThan(String value) {
            addCriterion("recipient_account <", value, "recipientAccount");
            return (Criteria) this;
        }

        public Criteria andRecipientAccountLessThanOrEqualTo(String value) {
            addCriterion("recipient_account <=", value, "recipientAccount");
            return (Criteria) this;
        }

        public Criteria andRecipientAccountLike(String value) {
            addCriterion("recipient_account like", value, "recipientAccount");
            return (Criteria) this;
        }

        public Criteria andRecipientAccountNotLike(String value) {
            addCriterion("recipient_account not like", value, "recipientAccount");
            return (Criteria) this;
        }

        public Criteria andRecipientAccountIn(List<String> values) {
            addCriterion("recipient_account in", values, "recipientAccount");
            return (Criteria) this;
        }

        public Criteria andRecipientAccountNotIn(List<String> values) {
            addCriterion("recipient_account not in", values, "recipientAccount");
            return (Criteria) this;
        }

        public Criteria andRecipientAccountBetween(String value1, String value2) {
            addCriterion("recipient_account between", value1, value2, "recipientAccount");
            return (Criteria) this;
        }

        public Criteria andRecipientAccountNotBetween(String value1, String value2) {
            addCriterion("recipient_account not between", value1, value2, "recipientAccount");
            return (Criteria) this;
        }

        public Criteria andRecipientNameIsNull() {
            addCriterion("recipient_name is null");
            return (Criteria) this;
        }

        public Criteria andRecipientNameIsNotNull() {
            addCriterion("recipient_name is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientNameEqualTo(String value) {
            addCriterion("recipient_name =", value, "recipientName");
            return (Criteria) this;
        }

        public Criteria andRecipientNameNotEqualTo(String value) {
            addCriterion("recipient_name <>", value, "recipientName");
            return (Criteria) this;
        }

        public Criteria andRecipientNameGreaterThan(String value) {
            addCriterion("recipient_name >", value, "recipientName");
            return (Criteria) this;
        }

        public Criteria andRecipientNameGreaterThanOrEqualTo(String value) {
            addCriterion("recipient_name >=", value, "recipientName");
            return (Criteria) this;
        }

        public Criteria andRecipientNameLessThan(String value) {
            addCriterion("recipient_name <", value, "recipientName");
            return (Criteria) this;
        }

        public Criteria andRecipientNameLessThanOrEqualTo(String value) {
            addCriterion("recipient_name <=", value, "recipientName");
            return (Criteria) this;
        }

        public Criteria andRecipientNameLike(String value) {
            addCriterion("recipient_name like", value, "recipientName");
            return (Criteria) this;
        }

        public Criteria andRecipientNameNotLike(String value) {
            addCriterion("recipient_name not like", value, "recipientName");
            return (Criteria) this;
        }

        public Criteria andRecipientNameIn(List<String> values) {
            addCriterion("recipient_name in", values, "recipientName");
            return (Criteria) this;
        }

        public Criteria andRecipientNameNotIn(List<String> values) {
            addCriterion("recipient_name not in", values, "recipientName");
            return (Criteria) this;
        }

        public Criteria andRecipientNameBetween(String value1, String value2) {
            addCriterion("recipient_name between", value1, value2, "recipientName");
            return (Criteria) this;
        }

        public Criteria andRecipientNameNotBetween(String value1, String value2) {
            addCriterion("recipient_name not between", value1, value2, "recipientName");
            return (Criteria) this;
        }

        public Criteria andRecipientInstitutionIsNull() {
            addCriterion("recipient_institution is null");
            return (Criteria) this;
        }

        public Criteria andRecipientInstitutionIsNotNull() {
            addCriterion("recipient_institution is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientInstitutionEqualTo(String value) {
            addCriterion("recipient_institution =", value, "recipientInstitution");
            return (Criteria) this;
        }

        public Criteria andRecipientInstitutionNotEqualTo(String value) {
            addCriterion("recipient_institution <>", value, "recipientInstitution");
            return (Criteria) this;
        }

        public Criteria andRecipientInstitutionGreaterThan(String value) {
            addCriterion("recipient_institution >", value, "recipientInstitution");
            return (Criteria) this;
        }

        public Criteria andRecipientInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("recipient_institution >=", value, "recipientInstitution");
            return (Criteria) this;
        }

        public Criteria andRecipientInstitutionLessThan(String value) {
            addCriterion("recipient_institution <", value, "recipientInstitution");
            return (Criteria) this;
        }

        public Criteria andRecipientInstitutionLessThanOrEqualTo(String value) {
            addCriterion("recipient_institution <=", value, "recipientInstitution");
            return (Criteria) this;
        }

        public Criteria andRecipientInstitutionLike(String value) {
            addCriterion("recipient_institution like", value, "recipientInstitution");
            return (Criteria) this;
        }

        public Criteria andRecipientInstitutionNotLike(String value) {
            addCriterion("recipient_institution not like", value, "recipientInstitution");
            return (Criteria) this;
        }

        public Criteria andRecipientInstitutionIn(List<String> values) {
            addCriterion("recipient_institution in", values, "recipientInstitution");
            return (Criteria) this;
        }

        public Criteria andRecipientInstitutionNotIn(List<String> values) {
            addCriterion("recipient_institution not in", values, "recipientInstitution");
            return (Criteria) this;
        }

        public Criteria andRecipientInstitutionBetween(String value1, String value2) {
            addCriterion("recipient_institution between", value1, value2, "recipientInstitution");
            return (Criteria) this;
        }

        public Criteria andRecipientInstitutionNotBetween(String value1, String value2) {
            addCriterion("recipient_institution not between", value1, value2, "recipientInstitution");
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