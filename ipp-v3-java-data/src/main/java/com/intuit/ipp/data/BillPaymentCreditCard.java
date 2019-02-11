//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.10 at 04:44:35 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for BillPaymentCreditCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPaymentCreditCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="CCDetail" type="{http://schema.intuit.com/finance/v3}CreditCardPayment" minOccurs="0"/>
 *         &lt;element name="BillPaymentCreditCardEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPaymentCreditCard", propOrder = {
    "ccAccountRef",
    "ccDetail",
    "billPaymentCreditCardEx"
})
public class BillPaymentCreditCard implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CCAccountRef")
    protected ReferenceType ccAccountRef;
    @XmlElement(name = "CCDetail")
    protected CreditCardPayment ccDetail;
    @XmlElement(name = "BillPaymentCreditCardEx")
    protected IntuitAnyType billPaymentCreditCardEx;

    /**
     * Gets the value of the ccAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCCAccountRef() {
        return ccAccountRef;
    }

    /**
     * Sets the value of the ccAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCCAccountRef(ReferenceType value) {
        this.ccAccountRef = value;
    }

    /**
     * Gets the value of the ccDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardPayment }
     *     
     */
    public CreditCardPayment getCCDetail() {
        return ccDetail;
    }

    /**
     * Sets the value of the ccDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardPayment }
     *     
     */
    public void setCCDetail(CreditCardPayment value) {
        this.ccDetail = value;
    }

    /**
     * Gets the value of the billPaymentCreditCardEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getBillPaymentCreditCardEx() {
        return billPaymentCreditCardEx;
    }

    /**
     * Sets the value of the billPaymentCreditCardEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setBillPaymentCreditCardEx(IntuitAnyType value) {
        this.billPaymentCreditCardEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BillPaymentCreditCard that = ((BillPaymentCreditCard) object);
        {
            ReferenceType lhsCCAccountRef;
            lhsCCAccountRef = this.getCCAccountRef();
            ReferenceType rhsCCAccountRef;
            rhsCCAccountRef = that.getCCAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ccAccountRef", lhsCCAccountRef), LocatorUtils.property(thatLocator, "ccAccountRef", rhsCCAccountRef), lhsCCAccountRef, rhsCCAccountRef, (this.ccAccountRef!= null), (that.ccAccountRef!= null))) {
                return false;
            }
        }
        {
            CreditCardPayment lhsCCDetail;
            lhsCCDetail = this.getCCDetail();
            CreditCardPayment rhsCCDetail;
            rhsCCDetail = that.getCCDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ccDetail", lhsCCDetail), LocatorUtils.property(thatLocator, "ccDetail", rhsCCDetail), lhsCCDetail, rhsCCDetail, (this.ccDetail!= null), (that.ccDetail!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsBillPaymentCreditCardEx;
            lhsBillPaymentCreditCardEx = this.getBillPaymentCreditCardEx();
            IntuitAnyType rhsBillPaymentCreditCardEx;
            rhsBillPaymentCreditCardEx = that.getBillPaymentCreditCardEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billPaymentCreditCardEx", lhsBillPaymentCreditCardEx), LocatorUtils.property(thatLocator, "billPaymentCreditCardEx", rhsBillPaymentCreditCardEx), lhsBillPaymentCreditCardEx, rhsBillPaymentCreditCardEx, (this.billPaymentCreditCardEx!= null), (that.billPaymentCreditCardEx!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            ReferenceType theCCAccountRef;
            theCCAccountRef = this.getCCAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ccAccountRef", theCCAccountRef), currentHashCode, theCCAccountRef, (this.ccAccountRef!= null));
        }
        {
            CreditCardPayment theCCDetail;
            theCCDetail = this.getCCDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ccDetail", theCCDetail), currentHashCode, theCCDetail, (this.ccDetail!= null));
        }
        {
            IntuitAnyType theBillPaymentCreditCardEx;
            theBillPaymentCreditCardEx = this.getBillPaymentCreditCardEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billPaymentCreditCardEx", theBillPaymentCreditCardEx), currentHashCode, theBillPaymentCreditCardEx, (this.billPaymentCreditCardEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
