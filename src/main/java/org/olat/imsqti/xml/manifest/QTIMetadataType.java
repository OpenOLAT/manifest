//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.02.22 à 10:45:49 AM CET 
//


package org.olat.imsqti.xml.manifest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.imsglobal.org/xsd/imsqti_metadata_v2p1" xmlns:xs="http://www.w3.org/2001/XMLSchema" align="left"&gt;This is the container for QTI-specific meta-data. This structure is designed to be used as an extension to the top-level categories within the IEEE LOM. All of its child elements are defined as local.&lt;/p&gt;
 * </pre>
 * 
 *             
 * 
 * <p>Classe Java pour QTIMetadata.Type complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="QTIMetadata.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="timeDependent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="composite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="interactionType" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="associateInteraction"/>
 *               &lt;enumeration value="choiceInteraction"/>
 *               &lt;enumeration value="customInteraction"/>
 *               &lt;enumeration value="drawingInteraction"/>
 *               &lt;enumeration value="endAttemptInteraction"/>
 *               &lt;enumeration value="extendedTextInteraction"/>
 *               &lt;enumeration value="gapMatchInteraction"/>
 *               &lt;enumeration value="graphicAssociateInteraction"/>
 *               &lt;enumeration value="graphicGapMatchInteraction"/>
 *               &lt;enumeration value="graphicOrderInteraction"/>
 *               &lt;enumeration value="hotspotInteraction"/>
 *               &lt;enumeration value="hottextInteraction"/>
 *               &lt;enumeration value="inlineChoiceInteraction"/>
 *               &lt;enumeration value="matchInteraction"/>
 *               &lt;enumeration value="orderInteraction"/>
 *               &lt;enumeration value="positionObjectInteraction"/>
 *               &lt;enumeration value="selectionPointInteraction"/>
 *               &lt;enumeration value="sliderInteraction"/>
 *               &lt;enumeration value="textEntryInteraction"/>
 *               &lt;enumeration value="uploadInteraction"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="feedbackType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="adaptive"/>
 *               &lt;enumeration value="nonadaptive"/>
 *               &lt;enumeration value="none"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="solutionAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="toolName" type="{http://www.imsglobal.org/xsd/imsqti_metadata_v2p1}String256.Type" minOccurs="0"/>
 *         &lt;element name="toolVersion" type="{http://www.imsglobal.org/xsd/imsqti_metadata_v2p1}String256.Type" minOccurs="0"/>
 *         &lt;element name="toolVendor" type="{http://www.imsglobal.org/xsd/imsqti_metadata_v2p1}String256.Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTIMetadata.Type", propOrder = {
    "itemTemplate",
    "timeDependent",
    "composite",
    "interactionType",
    "feedbackType",
    "solutionAvailable",
    "toolName",
    "toolVersion",
    "toolVendor"
})
public class QTIMetadataType {

    protected Boolean itemTemplate;
    protected Boolean timeDependent;
    protected Boolean composite;
    protected List<String> interactionType;
    protected String feedbackType;
    protected Boolean solutionAvailable;
    protected String toolName;
    protected String toolVersion;
    protected String toolVendor;

    /**
     * Obtient la valeur de la propriété itemTemplate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemTemplate() {
        return itemTemplate;
    }

    /**
     * Définit la valeur de la propriété itemTemplate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemTemplate(Boolean value) {
        this.itemTemplate = value;
    }

    /**
     * Obtient la valeur de la propriété timeDependent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeDependent() {
        return timeDependent;
    }

    /**
     * Définit la valeur de la propriété timeDependent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeDependent(Boolean value) {
        this.timeDependent = value;
    }

    /**
     * Obtient la valeur de la propriété composite.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComposite() {
        return composite;
    }

    /**
     * Définit la valeur de la propriété composite.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComposite(Boolean value) {
        this.composite = value;
    }

    /**
     * Gets the value of the interactionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interactionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteractionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInteractionType() {
        if (interactionType == null) {
            interactionType = new ArrayList<String>();
        }
        return this.interactionType;
    }

    /**
     * Obtient la valeur de la propriété feedbackType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackType() {
        return feedbackType;
    }

    /**
     * Définit la valeur de la propriété feedbackType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackType(String value) {
        this.feedbackType = value;
    }

    /**
     * Obtient la valeur de la propriété solutionAvailable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolutionAvailable() {
        return solutionAvailable;
    }

    /**
     * Définit la valeur de la propriété solutionAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolutionAvailable(Boolean value) {
        this.solutionAvailable = value;
    }

    /**
     * Obtient la valeur de la propriété toolName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolName() {
        return toolName;
    }

    /**
     * Définit la valeur de la propriété toolName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolName(String value) {
        this.toolName = value;
    }

    /**
     * Obtient la valeur de la propriété toolVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolVersion() {
        return toolVersion;
    }

    /**
     * Définit la valeur de la propriété toolVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolVersion(String value) {
        this.toolVersion = value;
    }

    /**
     * Obtient la valeur de la propriété toolVendor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolVendor() {
        return toolVendor;
    }

    /**
     * Définit la valeur de la propriété toolVendor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolVendor(String value) {
        this.toolVendor = value;
    }

}
