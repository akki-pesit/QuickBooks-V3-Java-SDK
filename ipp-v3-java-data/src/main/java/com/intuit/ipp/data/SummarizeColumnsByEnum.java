//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.10 at 04:44:35 PM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummarizeColumnsByEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SummarizeColumnsByEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Total"/>
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="Quarter"/>
 *     &lt;enumeration value="FiscalYear"/>
 *     &lt;enumeration value="FiscalQuarter"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="Days"/>
 *     &lt;enumeration value="Customers"/>
 *     &lt;enumeration value="Vendors"/>
 *     &lt;enumeration value="Employees"/>
 *     &lt;enumeration value="Departments"/>
 *     &lt;enumeration value="Classes"/>
 *     &lt;enumeration value="ProductsAndServices"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SummarizeColumnsByEnum")
@XmlEnum
public enum SummarizeColumnsByEnum {

    @XmlEnumValue("Total")
    TOTAL("Total"),
    @XmlEnumValue("Year")
    YEAR("Year"),
    @XmlEnumValue("Quarter")
    QUARTER("Quarter"),
    @XmlEnumValue("FiscalYear")
    FISCAL_YEAR("FiscalYear"),
    @XmlEnumValue("FiscalQuarter")
    FISCAL_QUARTER("FiscalQuarter"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("Days")
    DAYS("Days"),
    @XmlEnumValue("Customers")
    CUSTOMERS("Customers"),
    @XmlEnumValue("Vendors")
    VENDORS("Vendors"),
    @XmlEnumValue("Employees")
    EMPLOYEES("Employees"),
    @XmlEnumValue("Departments")
    DEPARTMENTS("Departments"),
    @XmlEnumValue("Classes")
    CLASSES("Classes"),
    @XmlEnumValue("ProductsAndServices")
    PRODUCTS_AND_SERVICES("ProductsAndServices");
    private final String value;

    SummarizeColumnsByEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SummarizeColumnsByEnum fromValue(String v) {
        for (SummarizeColumnsByEnum c: SummarizeColumnsByEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
