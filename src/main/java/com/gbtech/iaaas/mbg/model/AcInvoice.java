package com.gbtech.iaaas.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class AcInvoice implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.id
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.fee_order_id
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Integer feeOrderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.user_id
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.username
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.machine_code
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String machineCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.invoice_code
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String invoiceCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.invoice_number
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String invoiceNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.check_code
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String checkCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.entry
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String entry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.unit
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.quantity
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.price
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.invoice_fee
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Integer invoiceFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.tax_rate
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Float taxRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.tax_fee
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Integer taxFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.amount
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Integer amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.capitalized_amout
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String capitalizedAmout;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.remark
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.payee_name
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String payeeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.reviewer
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String reviewer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.invoice_person_name
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String invoicePersonName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.billing_party_name
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String billingPartyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.taxpayer_identify_number
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String taxpayerIdentifyNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.billing_party_address_and_telephone
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String billingPartyAddressAndTelephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.account_bank_and_phone_number
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String accountBankAndPhoneNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.status
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.create_time
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_invoice.invoice_file_url
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String invoiceFileUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ac_invoice
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.id
     *
     * @return the value of ac_invoice.id
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.id
     *
     * @param id the value for ac_invoice.id
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.fee_order_id
     *
     * @return the value of ac_invoice.fee_order_id
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Integer getFeeOrderId() {
        return feeOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.fee_order_id
     *
     * @param feeOrderId the value for ac_invoice.fee_order_id
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setFeeOrderId(Integer feeOrderId) {
        this.feeOrderId = feeOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.user_id
     *
     * @return the value of ac_invoice.user_id
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.user_id
     *
     * @param userId the value for ac_invoice.user_id
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.username
     *
     * @return the value of ac_invoice.username
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.username
     *
     * @param username the value for ac_invoice.username
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.machine_code
     *
     * @return the value of ac_invoice.machine_code
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getMachineCode() {
        return machineCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.machine_code
     *
     * @param machineCode the value for ac_invoice.machine_code
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.invoice_code
     *
     * @return the value of ac_invoice.invoice_code
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getInvoiceCode() {
        return invoiceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.invoice_code
     *
     * @param invoiceCode the value for ac_invoice.invoice_code
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.invoice_number
     *
     * @return the value of ac_invoice.invoice_number
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.invoice_number
     *
     * @param invoiceNumber the value for ac_invoice.invoice_number
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.check_code
     *
     * @return the value of ac_invoice.check_code
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getCheckCode() {
        return checkCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.check_code
     *
     * @param checkCode the value for ac_invoice.check_code
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.entry
     *
     * @return the value of ac_invoice.entry
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getEntry() {
        return entry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.entry
     *
     * @param entry the value for ac_invoice.entry
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setEntry(String entry) {
        this.entry = entry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.unit
     *
     * @return the value of ac_invoice.unit
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.unit
     *
     * @param unit the value for ac_invoice.unit
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.quantity
     *
     * @return the value of ac_invoice.quantity
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.quantity
     *
     * @param quantity the value for ac_invoice.quantity
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.price
     *
     * @return the value of ac_invoice.price
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.price
     *
     * @param price the value for ac_invoice.price
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.invoice_fee
     *
     * @return the value of ac_invoice.invoice_fee
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Integer getInvoiceFee() {
        return invoiceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.invoice_fee
     *
     * @param invoiceFee the value for ac_invoice.invoice_fee
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setInvoiceFee(Integer invoiceFee) {
        this.invoiceFee = invoiceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.tax_rate
     *
     * @return the value of ac_invoice.tax_rate
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Float getTaxRate() {
        return taxRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.tax_rate
     *
     * @param taxRate the value for ac_invoice.tax_rate
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setTaxRate(Float taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.tax_fee
     *
     * @return the value of ac_invoice.tax_fee
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Integer getTaxFee() {
        return taxFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.tax_fee
     *
     * @param taxFee the value for ac_invoice.tax_fee
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setTaxFee(Integer taxFee) {
        this.taxFee = taxFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.amount
     *
     * @return the value of ac_invoice.amount
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.amount
     *
     * @param amount the value for ac_invoice.amount
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.capitalized_amout
     *
     * @return the value of ac_invoice.capitalized_amout
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getCapitalizedAmout() {
        return capitalizedAmout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.capitalized_amout
     *
     * @param capitalizedAmout the value for ac_invoice.capitalized_amout
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setCapitalizedAmout(String capitalizedAmout) {
        this.capitalizedAmout = capitalizedAmout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.remark
     *
     * @return the value of ac_invoice.remark
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.remark
     *
     * @param remark the value for ac_invoice.remark
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.payee_name
     *
     * @return the value of ac_invoice.payee_name
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.payee_name
     *
     * @param payeeName the value for ac_invoice.payee_name
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.reviewer
     *
     * @return the value of ac_invoice.reviewer
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getReviewer() {
        return reviewer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.reviewer
     *
     * @param reviewer the value for ac_invoice.reviewer
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.invoice_person_name
     *
     * @return the value of ac_invoice.invoice_person_name
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getInvoicePersonName() {
        return invoicePersonName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.invoice_person_name
     *
     * @param invoicePersonName the value for ac_invoice.invoice_person_name
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setInvoicePersonName(String invoicePersonName) {
        this.invoicePersonName = invoicePersonName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.billing_party_name
     *
     * @return the value of ac_invoice.billing_party_name
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getBillingPartyName() {
        return billingPartyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.billing_party_name
     *
     * @param billingPartyName the value for ac_invoice.billing_party_name
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setBillingPartyName(String billingPartyName) {
        this.billingPartyName = billingPartyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.taxpayer_identify_number
     *
     * @return the value of ac_invoice.taxpayer_identify_number
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getTaxpayerIdentifyNumber() {
        return taxpayerIdentifyNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.taxpayer_identify_number
     *
     * @param taxpayerIdentifyNumber the value for ac_invoice.taxpayer_identify_number
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setTaxpayerIdentifyNumber(String taxpayerIdentifyNumber) {
        this.taxpayerIdentifyNumber = taxpayerIdentifyNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.billing_party_address_and_telephone
     *
     * @return the value of ac_invoice.billing_party_address_and_telephone
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getBillingPartyAddressAndTelephone() {
        return billingPartyAddressAndTelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.billing_party_address_and_telephone
     *
     * @param billingPartyAddressAndTelephone the value for ac_invoice.billing_party_address_and_telephone
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setBillingPartyAddressAndTelephone(String billingPartyAddressAndTelephone) {
        this.billingPartyAddressAndTelephone = billingPartyAddressAndTelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.account_bank_and_phone_number
     *
     * @return the value of ac_invoice.account_bank_and_phone_number
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getAccountBankAndPhoneNumber() {
        return accountBankAndPhoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.account_bank_and_phone_number
     *
     * @param accountBankAndPhoneNumber the value for ac_invoice.account_bank_and_phone_number
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setAccountBankAndPhoneNumber(String accountBankAndPhoneNumber) {
        this.accountBankAndPhoneNumber = accountBankAndPhoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.status
     *
     * @return the value of ac_invoice.status
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.status
     *
     * @param status the value for ac_invoice.status
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.create_time
     *
     * @return the value of ac_invoice.create_time
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.create_time
     *
     * @param createTime the value for ac_invoice.create_time
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_invoice.invoice_file_url
     *
     * @return the value of ac_invoice.invoice_file_url
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getInvoiceFileUrl() {
        return invoiceFileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_invoice.invoice_file_url
     *
     * @param invoiceFileUrl the value for ac_invoice.invoice_file_url
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setInvoiceFileUrl(String invoiceFileUrl) {
        this.invoiceFileUrl = invoiceFileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_invoice
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", feeOrderId=").append(feeOrderId);
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", machineCode=").append(machineCode);
        sb.append(", invoiceCode=").append(invoiceCode);
        sb.append(", invoiceNumber=").append(invoiceNumber);
        sb.append(", checkCode=").append(checkCode);
        sb.append(", entry=").append(entry);
        sb.append(", unit=").append(unit);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", invoiceFee=").append(invoiceFee);
        sb.append(", taxRate=").append(taxRate);
        sb.append(", taxFee=").append(taxFee);
        sb.append(", amount=").append(amount);
        sb.append(", capitalizedAmout=").append(capitalizedAmout);
        sb.append(", remark=").append(remark);
        sb.append(", payeeName=").append(payeeName);
        sb.append(", reviewer=").append(reviewer);
        sb.append(", invoicePersonName=").append(invoicePersonName);
        sb.append(", billingPartyName=").append(billingPartyName);
        sb.append(", taxpayerIdentifyNumber=").append(taxpayerIdentifyNumber);
        sb.append(", billingPartyAddressAndTelephone=").append(billingPartyAddressAndTelephone);
        sb.append(", accountBankAndPhoneNumber=").append(accountBankAndPhoneNumber);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", invoiceFileUrl=").append(invoiceFileUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}