//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.10 at 04:44:35 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * Bill is an AP transaction representing a
 * 				request-for-payment from a third party for goods/services rendered
 * 				and/or received
 * 
 * <p>Java class for VendorCredit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorCredit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}PurchaseByVendor">
 *       &lt;sequence>
 *         &lt;element name="VendorCreditEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorCredit", propOrder = {
    "vendorCreditEx",
    "balance"
})
public class VendorCredit
    extends PurchaseByVendor
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VendorCreditEx")
    protected IntuitAnyType vendorCreditEx;
    @XmlElement(name = "Balance")
    protected BigDecimal balance;

    /**
     * Gets the value of the vendorCreditEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getVendorCreditEx() {
        return vendorCreditEx;
    }

    /**
     * Sets the value of the vendorCreditEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setVendorCreditEx(IntuitAnyType value) {
        this.vendorCreditEx = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final VendorCredit that = ((VendorCredit) object);
        {
            IntuitAnyType lhsVendorCreditEx;
            lhsVendorCreditEx = this.getVendorCreditEx();
            IntuitAnyType rhsVendorCreditEx;
            rhsVendorCreditEx = that.getVendorCreditEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendorCreditEx", lhsVendorCreditEx), LocatorUtils.property(thatLocator, "vendorCreditEx", rhsVendorCreditEx), lhsVendorCreditEx, rhsVendorCreditEx, (this.vendorCreditEx!= null), (that.vendorCreditEx!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBalance;
            lhsBalance = this.getBalance();
            BigDecimal rhsBalance;
            rhsBalance = that.getBalance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balance", lhsBalance), LocatorUtils.property(thatLocator, "balance", rhsBalance), lhsBalance, rhsBalance, (this.balance!= null), (that.balance!= null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            IntuitAnyType theVendorCreditEx;
            theVendorCreditEx = this.getVendorCreditEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorCreditEx", theVendorCreditEx), currentHashCode, theVendorCreditEx, (this.vendorCreditEx!= null));
        }
        {
            BigDecimal theBalance;
            theBalance = this.getBalance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "balance", theBalance), currentHashCode, theBalance, (this.balance!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
