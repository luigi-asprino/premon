//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.15 at 02:35:27 PM CET 
//


package eu.fbk.dkm.premon.premonitor.verbnet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "examples",
    "syntax",
    "semantics"
})
@XmlRootElement(name = "FRAME")
public class FRAME {

    @XmlElement(name = "DESCRIPTION", required = true)
    protected DESCRIPTION description;
    @XmlElement(name = "EXAMPLES", required = true)
    protected EXAMPLES examples;
    @XmlElement(name = "SYNTAX", required = true)
    protected SYNTAX syntax;
    @XmlElement(name = "SEMANTICS", required = true)
    protected SEMANTICS semantics;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link DESCRIPTION }
     *     
     */
    public DESCRIPTION getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DESCRIPTION }
     *     
     */
    public void setDESCRIPTION(DESCRIPTION value) {
        this.description = value;
    }

    /**
     * Gets the value of the examples property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMPLES }
     *     
     */
    public EXAMPLES getEXAMPLES() {
        return examples;
    }

    /**
     * Sets the value of the examples property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMPLES }
     *     
     */
    public void setEXAMPLES(EXAMPLES value) {
        this.examples = value;
    }

    /**
     * Gets the value of the syntax property.
     * 
     * @return
     *     possible object is
     *     {@link SYNTAX }
     *     
     */
    public SYNTAX getSYNTAX() {
        return syntax;
    }

    /**
     * Sets the value of the syntax property.
     * 
     * @param value
     *     allowed object is
     *     {@link SYNTAX }
     *     
     */
    public void setSYNTAX(SYNTAX value) {
        this.syntax = value;
    }

    /**
     * Gets the value of the semantics property.
     * 
     * @return
     *     possible object is
     *     {@link SEMANTICS }
     *     
     */
    public SEMANTICS getSEMANTICS() {
        return semantics;
    }

    /**
     * Sets the value of the semantics property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEMANTICS }
     *     
     */
    public void setSEMANTICS(SEMANTICS value) {
        this.semantics = value;
    }

}
