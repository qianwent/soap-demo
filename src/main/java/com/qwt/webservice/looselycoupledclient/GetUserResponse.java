
package com.qwt.webservice.looselycoupledclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userResult" type="{http://server.webservice.qwt.com/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserResponse", propOrder = {
    "userResult"
})
public class GetUserResponse {

    protected User userResult;

    /**
     * Gets the value of the userResult property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUserResult() {
        return userResult;
    }

    /**
     * Sets the value of the userResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUserResult(User value) {
        this.userResult = value;
    }

}
