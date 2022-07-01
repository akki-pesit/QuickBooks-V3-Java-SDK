//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.28 at 02:49:33 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QboEntityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QboEntityTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSTOMER"/&gt;
 *     &lt;enumeration value="VENDOR"/&gt;
 *     &lt;enumeration value="EMPLOYEE"/&gt;
 *     &lt;enumeration value="CREDIT_CARD"/&gt;
 *     &lt;enumeration value="CHECK"/&gt;
 *     &lt;enumeration value="INVOICE"/&gt;
 *     &lt;enumeration value="RECEIVED_PAYMENT"/&gt;
 *     &lt;enumeration value="GENERAL_JOURNAL"/&gt;
 *     &lt;enumeration value="BILL"/&gt;
 *     &lt;enumeration value="CREDIT_CARD_CREDIT"/&gt;
 *     &lt;enumeration value="BILL_CREDIT"/&gt;
 *     &lt;enumeration value="CHARGE_CREDIT"/&gt;
 *     &lt;enumeration value="BILL_CHECK"/&gt;
 *     &lt;enumeration value="BILL_CREDIT_CARD"/&gt;
 *     &lt;enumeration value="CHARGE"/&gt;
 *     &lt;enumeration value="TRANSFER"/&gt;
 *     &lt;enumeration value="RECEIVED_MONEY"/&gt;
 *     &lt;enumeration value="STATEMENT"/&gt;
 *     &lt;enumeration value="REIMB_CHARGE"/&gt;
 *     &lt;enumeration value="CASH_PURCHASE"/&gt;
 *     &lt;enumeration value="CASH_SALE"/&gt;
 *     &lt;enumeration value="CREDIT_MEMO"/&gt;
 *     &lt;enumeration value="CREDIT_REFUND"/&gt;
 *     &lt;enumeration value="ESTIMATE"/&gt;
 *     &lt;enumeration value="INVENTORY_QUANTITY_ADJUSTMENT"/&gt;
 *     &lt;enumeration value="PURCHASE_ORDER"/&gt;
 *     &lt;enumeration value="PAYROLL_CHECK"/&gt;
 *     &lt;enumeration value="TAX_PAYMENT"/&gt;
 *     &lt;enumeration value="PAYROLL_ADJUSTMENT_V2"/&gt;
 *     &lt;enumeration value="PAYROLL_REFUND"/&gt;
 *     &lt;enumeration value="GLOBAL_TAX_PAYMENT"/&gt;
 *     &lt;enumeration value="GLOBAL_TAX_ADJUSTMENT"/&gt;
 *     &lt;enumeration value="JOB_INVOICE"/&gt;
 *     &lt;enumeration value="ITEM"/&gt;
 *     &lt;enumeration value="GENERIC_EXPENSE"/&gt;
 *     &lt;enumeration value="TIME_ACTIVITY"/&gt;
 *     &lt;enumeration value="DEPARTMENT"/&gt;
 *     &lt;enumeration value="USERS"/&gt;
 *     &lt;enumeration value="KLASS"/&gt;
 *     &lt;enumeration value="PAYMENT_METHOD"/&gt;
 *     &lt;enumeration value="MEMORIZED_TRANSACTION"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *     &lt;enumeration value="BUDGET"/&gt;
 *     &lt;enumeration value="TAX_CODE"/&gt;
 *     &lt;enumeration value="TAX_CODE_RATE"/&gt;
 *     &lt;enumeration value="TAX_AGENCY"/&gt;
 *     &lt;enumeration value="ATTACHABLE"/&gt;
 *     &lt;enumeration value="ACCOUNT"/&gt;
 *     &lt;enumeration value="PREFERENCES"/&gt;
 *     &lt;enumeration value="JOURNAL_CODE"/&gt;
 *     &lt;enumeration value="DISCOUNT_RATE"/&gt;
 *     &lt;enumeration value="BANKING_TRANSACTIONS"/&gt;
 *     &lt;enumeration value="BUSINESS_TERMS"/&gt;
 *     &lt;enumeration value="LIABILITY_CHECK"/&gt;
 *     &lt;enumeration value="LIABILITY_CREDIT_CARD"/&gt;
 *     &lt;enumeration value="LIABILITY_REFUND"/&gt;
 *     &lt;enumeration value="PRIOR_LIABILITY_PAYMENTS"/&gt;
 *     &lt;enumeration value="LIABILITY_EPAY"/&gt;
 *     &lt;enumeration value="LIABILITY_MMAP"/&gt;
 *     &lt;enumeration value="TAX_CREDIT_UTILISE"/&gt;
 *     &lt;enumeration value="TAX_CREDIT_DEFER"/&gt;
 *     &lt;enumeration value="TAX_CREDIT_REVERSE"/&gt;
 *     &lt;enumeration value="TAX_CREDIT_REFUND"/&gt;
 *     &lt;enumeration value="GROSS_ADJUSTMENT"/&gt;
 *     &lt;enumeration value="REVERSE_CHARGE"/&gt;
 *     &lt;enumeration value="DD_CHECK"/&gt;
 *     &lt;enumeration value="PAYCHECK"/&gt;
 *     &lt;enumeration value="PAYROLL_ADJUSTMENT"/&gt;
 *     &lt;enumeration value="PAYROLL_YTD"/&gt;
 *     &lt;enumeration value="SDK_USERS"/&gt;
 *     &lt;enumeration value="PAYROLL_ITEMS"/&gt;
 *     &lt;enumeration value="PAY_GROUPS"/&gt;
 *     &lt;enumeration value="PAID_TIME_OFF_ENTRIES"/&gt;
 *     &lt;enumeration value="TAX_JURISDICTIONS"/&gt;
 *     &lt;enumeration value="MEMORIZED_REPORTS"/&gt;
 *     &lt;enumeration value="OLB_FINANCIAL_INSTITUTIONS"/&gt;
 *     &lt;enumeration value="DIRECT_DEPOSIT_BANK_INFO"/&gt;
 *     &lt;enumeration value="REMINDERS"/&gt;
 *     &lt;enumeration value="PAYROLL_FORMS"/&gt;
 *     &lt;enumeration value="EPAY_BANK_ACCOUNT_INFO"/&gt;
 *     &lt;enumeration value="EPAY_AGENCY_CREDENTIALS"/&gt;
 *     &lt;enumeration value="EFILE_ENROLLMENT"/&gt;
 *     &lt;enumeration value="TAXRETURNLINES"/&gt;
 *     &lt;enumeration value="NOTES"/&gt;
 *     &lt;enumeration value="PRINT_PREF"/&gt;
 *     &lt;enumeration value="MANAGEMENT_REPORT"/&gt;
 *     &lt;enumeration value="OLB_RULES"/&gt;
 *     &lt;enumeration value="DESKTOPIMPORT_SEED_QOH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QboEntityTypeEnum")
@XmlEnum
public enum QboEntityTypeEnum {

    CUSTOMER("CUSTOMER"),
    VENDOR("VENDOR"),
    EMPLOYEE("EMPLOYEE"),
    CREDIT_CARD("CREDIT_CARD"),
    CHECK("CHECK"),
    INVOICE("INVOICE"),
    RECEIVED_PAYMENT("RECEIVED_PAYMENT"),
    GENERAL_JOURNAL("GENERAL_JOURNAL"),
    BILL("BILL"),
    CREDIT_CARD_CREDIT("CREDIT_CARD_CREDIT"),
    BILL_CREDIT("BILL_CREDIT"),
    CHARGE_CREDIT("CHARGE_CREDIT"),
    BILL_CHECK("BILL_CHECK"),
    BILL_CREDIT_CARD("BILL_CREDIT_CARD"),
    CHARGE("CHARGE"),
    TRANSFER("TRANSFER"),
    RECEIVED_MONEY("RECEIVED_MONEY"),
    STATEMENT("STATEMENT"),
    REIMB_CHARGE("REIMB_CHARGE"),
    CASH_PURCHASE("CASH_PURCHASE"),
    CASH_SALE("CASH_SALE"),
    CREDIT_MEMO("CREDIT_MEMO"),
    CREDIT_REFUND("CREDIT_REFUND"),
    ESTIMATE("ESTIMATE"),
    INVENTORY_QUANTITY_ADJUSTMENT("INVENTORY_QUANTITY_ADJUSTMENT"),
    PURCHASE_ORDER("PURCHASE_ORDER"),
    PAYROLL_CHECK("PAYROLL_CHECK"),
    TAX_PAYMENT("TAX_PAYMENT"),
    @XmlEnumValue("PAYROLL_ADJUSTMENT_V2")
    PAYROLL_ADJUSTMENT_V_2("PAYROLL_ADJUSTMENT_V2"),
    PAYROLL_REFUND("PAYROLL_REFUND"),
    GLOBAL_TAX_PAYMENT("GLOBAL_TAX_PAYMENT"),
    GLOBAL_TAX_ADJUSTMENT("GLOBAL_TAX_ADJUSTMENT"),
    JOB_INVOICE("JOB_INVOICE"),
    ITEM("ITEM"),
    GENERIC_EXPENSE("GENERIC_EXPENSE"),
    TIME_ACTIVITY("TIME_ACTIVITY"),
    DEPARTMENT("DEPARTMENT"),
    USERS("USERS"),
    KLASS("KLASS"),
    PAYMENT_METHOD("PAYMENT_METHOD"),
    MEMORIZED_TRANSACTION("MEMORIZED_TRANSACTION"),
    TERM("TERM"),
    BUDGET("BUDGET"),
    TAX_CODE("TAX_CODE"),
    TAX_CODE_RATE("TAX_CODE_RATE"),
    TAX_AGENCY("TAX_AGENCY"),
    ATTACHABLE("ATTACHABLE"),
    ACCOUNT("ACCOUNT"),
    PREFERENCES("PREFERENCES"),
    JOURNAL_CODE("JOURNAL_CODE"),
    DISCOUNT_RATE("DISCOUNT_RATE"),
    BANKING_TRANSACTIONS("BANKING_TRANSACTIONS"),
    BUSINESS_TERMS("BUSINESS_TERMS"),
    LIABILITY_CHECK("LIABILITY_CHECK"),
    LIABILITY_CREDIT_CARD("LIABILITY_CREDIT_CARD"),
    LIABILITY_REFUND("LIABILITY_REFUND"),
    PRIOR_LIABILITY_PAYMENTS("PRIOR_LIABILITY_PAYMENTS"),
    LIABILITY_EPAY("LIABILITY_EPAY"),
    LIABILITY_MMAP("LIABILITY_MMAP"),
    TAX_CREDIT_UTILISE("TAX_CREDIT_UTILISE"),
    TAX_CREDIT_DEFER("TAX_CREDIT_DEFER"),
    TAX_CREDIT_REVERSE("TAX_CREDIT_REVERSE"),
    TAX_CREDIT_REFUND("TAX_CREDIT_REFUND"),
    GROSS_ADJUSTMENT("GROSS_ADJUSTMENT"),
    REVERSE_CHARGE("REVERSE_CHARGE"),
    DD_CHECK("DD_CHECK"),
    PAYCHECK("PAYCHECK"),
    PAYROLL_ADJUSTMENT("PAYROLL_ADJUSTMENT"),
    PAYROLL_YTD("PAYROLL_YTD"),
    SDK_USERS("SDK_USERS"),
    PAYROLL_ITEMS("PAYROLL_ITEMS"),
    PAY_GROUPS("PAY_GROUPS"),
    PAID_TIME_OFF_ENTRIES("PAID_TIME_OFF_ENTRIES"),
    TAX_JURISDICTIONS("TAX_JURISDICTIONS"),
    MEMORIZED_REPORTS("MEMORIZED_REPORTS"),
    OLB_FINANCIAL_INSTITUTIONS("OLB_FINANCIAL_INSTITUTIONS"),
    DIRECT_DEPOSIT_BANK_INFO("DIRECT_DEPOSIT_BANK_INFO"),
    REMINDERS("REMINDERS"),
    PAYROLL_FORMS("PAYROLL_FORMS"),
    EPAY_BANK_ACCOUNT_INFO("EPAY_BANK_ACCOUNT_INFO"),
    EPAY_AGENCY_CREDENTIALS("EPAY_AGENCY_CREDENTIALS"),
    EFILE_ENROLLMENT("EFILE_ENROLLMENT"),
    TAXRETURNLINES("TAXRETURNLINES"),
    NOTES("NOTES"),
    PRINT_PREF("PRINT_PREF"),
    MANAGEMENT_REPORT("MANAGEMENT_REPORT"),
    OLB_RULES("OLB_RULES"),
    DESKTOPIMPORT_SEED_QOH("DESKTOPIMPORT_SEED_QOH");
    private final String value;

    QboEntityTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QboEntityTypeEnum fromValue(String v) {
        for (QboEntityTypeEnum c: QboEntityTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
