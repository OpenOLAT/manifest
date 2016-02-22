//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.02.22 à 10:45:38 AM CET 
//


package org.olat.imsmd.xml.manifest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour generalType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="generalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}identifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}title" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}catalogentry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}language" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}keyword" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}coverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}structure" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}aggregationlevel" minOccurs="0"/>
 *         &lt;group ref="{http://www.imsglobal.org/xsd/imsmd_v1p2}grp.any"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalType", propOrder = {
    "content"
})
public class GeneralType {

    @XmlElementRefs({
        @XmlElementRef(name = "description", namespace = "http://www.imsglobal.org/xsd/imsmd_v1p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "structure", namespace = "http://www.imsglobal.org/xsd/imsmd_v1p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "catalogentry", namespace = "http://www.imsglobal.org/xsd/imsmd_v1p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "language", namespace = "http://www.imsglobal.org/xsd/imsmd_v1p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "coverage", namespace = "http://www.imsglobal.org/xsd/imsmd_v1p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "identifier", namespace = "http://www.imsglobal.org/xsd/imsmd_v1p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "title", namespace = "http://www.imsglobal.org/xsd/imsmd_v1p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "aggregationlevel", namespace = "http://www.imsglobal.org/xsd/imsmd_v1p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "keyword", namespace = "http://www.imsglobal.org/xsd/imsmd_v1p2", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    @XmlAnyElement(lax = true)
    protected List<Object> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link String }
     * {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}
     * {@link JAXBElement }{@code <}{@link StructureType }{@code >}
     * {@link JAXBElement }{@code <}{@link CatalogentryType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link CoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link TitleType }{@code >}
     * {@link JAXBElement }{@code <}{@link AggregationlevelType }{@code >}
     * {@link JAXBElement }{@code <}{@link KeywordType }{@code >}
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
