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
 * 
 * 				Product: ALL
 * 				Description: Provides for strong-typing of the StringType CustomField.
 * 			
 * 
 * <p>Java class for StringTypeCustomFieldDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StringTypeCustomFieldDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}CustomFieldDefinition">
 *       &lt;sequence>
 *         &lt;element name="DefaultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegularExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringTypeCustomFieldDefinition", propOrder = {
    "defaultString",
    "regularExpression",
    "maxLength"
})
public class StringTypeCustomFieldDefinition
    extends CustomFieldDefinition
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DefaultString")
    protected String defaultString;
    @XmlElement(name = "RegularExpression")
    protected String regularExpression;
    @XmlElement(name = "MaxLength")
    protected Integer maxLength;

    /**
     * Gets the value of the defaultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultString() {
        return defaultString;
    }

    /**
     * Sets the value of the defaultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultString(String value) {
        this.defaultString = value;
    }

    /**
     * Gets the value of the regularExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegularExpression() {
        return regularExpression;
    }

    /**
     * Sets the value of the regularExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegularExpression(String value) {
        this.regularExpression = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLength(Integer value) {
        this.maxLength = value;
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
        final StringTypeCustomFieldDefinition that = ((StringTypeCustomFieldDefinition) object);
        {
            String lhsDefaultString;
            lhsDefaultString = this.getDefaultString();
            String rhsDefaultString;
            rhsDefaultString = that.getDefaultString();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultString", lhsDefaultString), LocatorUtils.property(thatLocator, "defaultString", rhsDefaultString), lhsDefaultString, rhsDefaultString, (this.defaultString!= null), (that.defaultString!= null))) {
                return false;
            }
        }
        {
            String lhsRegularExpression;
            lhsRegularExpression = this.getRegularExpression();
            String rhsRegularExpression;
            rhsRegularExpression = that.getRegularExpression();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regularExpression", lhsRegularExpression), LocatorUtils.property(thatLocator, "regularExpression", rhsRegularExpression), lhsRegularExpression, rhsRegularExpression, (this.regularExpression!= null), (that.regularExpression!= null))) {
                return false;
            }
        }
        {
            Integer lhsMaxLength;
            lhsMaxLength = this.getMaxLength();
            Integer rhsMaxLength;
            rhsMaxLength = that.getMaxLength();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxLength", lhsMaxLength), LocatorUtils.property(thatLocator, "maxLength", rhsMaxLength), lhsMaxLength, rhsMaxLength, (this.maxLength!= null), (that.maxLength!= null))) {
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
            String theDefaultString;
            theDefaultString = this.getDefaultString();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultString", theDefaultString), currentHashCode, theDefaultString, (this.defaultString!= null));
        }
        {
            String theRegularExpression;
            theRegularExpression = this.getRegularExpression();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "regularExpression", theRegularExpression), currentHashCode, theRegularExpression, (this.regularExpression!= null));
        }
        {
            Integer theMaxLength;
            theMaxLength = this.getMaxLength();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxLength", theMaxLength), currentHashCode, theMaxLength, (this.maxLength!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
