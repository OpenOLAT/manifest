//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.02.22 à 10:45:38 AM CET 
//


package org.olat.imsmd.xml.manifest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour lomType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}general" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}lifecycle" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}metametadata" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}technical" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}educational" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}rights" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}relation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}classification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lomType", propOrder = {
    "general",
    "lifecycle",
    "metametadata",
    "technical",
    "educational",
    "rights",
    "relation",
    "annotation",
    "classification"
})
public class LomType {

    protected GeneralType general;
    protected LifecycleType lifecycle;
    protected MetametadataType metametadata;
    protected TechnicalType technical;
    protected EducationalType educational;
    protected RightsType rights;
    protected List<RelationType> relation;
    protected List<AnnotationType> annotation;
    protected List<ClassificationType> classification;

    /**
     * Obtient la valeur de la propriété general.
     * 
     * @return
     *     possible object is
     *     {@link GeneralType }
     *     
     */
    public GeneralType getGeneral() {
        return general;
    }

    /**
     * Définit la valeur de la propriété general.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralType }
     *     
     */
    public void setGeneral(GeneralType value) {
        this.general = value;
    }

    /**
     * Obtient la valeur de la propriété lifecycle.
     * 
     * @return
     *     possible object is
     *     {@link LifecycleType }
     *     
     */
    public LifecycleType getLifecycle() {
        return lifecycle;
    }

    /**
     * Définit la valeur de la propriété lifecycle.
     * 
     * @param value
     *     allowed object is
     *     {@link LifecycleType }
     *     
     */
    public void setLifecycle(LifecycleType value) {
        this.lifecycle = value;
    }

    /**
     * Obtient la valeur de la propriété metametadata.
     * 
     * @return
     *     possible object is
     *     {@link MetametadataType }
     *     
     */
    public MetametadataType getMetametadata() {
        return metametadata;
    }

    /**
     * Définit la valeur de la propriété metametadata.
     * 
     * @param value
     *     allowed object is
     *     {@link MetametadataType }
     *     
     */
    public void setMetametadata(MetametadataType value) {
        this.metametadata = value;
    }

    /**
     * Obtient la valeur de la propriété technical.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalType }
     *     
     */
    public TechnicalType getTechnical() {
        return technical;
    }

    /**
     * Définit la valeur de la propriété technical.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalType }
     *     
     */
    public void setTechnical(TechnicalType value) {
        this.technical = value;
    }

    /**
     * Obtient la valeur de la propriété educational.
     * 
     * @return
     *     possible object is
     *     {@link EducationalType }
     *     
     */
    public EducationalType getEducational() {
        return educational;
    }

    /**
     * Définit la valeur de la propriété educational.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationalType }
     *     
     */
    public void setEducational(EducationalType value) {
        this.educational = value;
    }

    /**
     * Obtient la valeur de la propriété rights.
     * 
     * @return
     *     possible object is
     *     {@link RightsType }
     *     
     */
    public RightsType getRights() {
        return rights;
    }

    /**
     * Définit la valeur de la propriété rights.
     * 
     * @param value
     *     allowed object is
     *     {@link RightsType }
     *     
     */
    public void setRights(RightsType value) {
        this.rights = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getRelation() {
        if (relation == null) {
            relation = new ArrayList<RelationType>();
        }
        return this.relation;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnotationType }
     * 
     * 
     */
    public List<AnnotationType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<AnnotationType>();
        }
        return this.annotation;
    }

    /**
     * Gets the value of the classification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationType }
     * 
     * 
     */
    public List<ClassificationType> getClassification() {
        if (classification == null) {
            classification = new ArrayList<ClassificationType>();
        }
        return this.classification;
    }

}
