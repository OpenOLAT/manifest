//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.02.22 à 10:45:49 AM CET 
//


package org.olat.imsqti.xml.manifest;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.olat.imsqti.xml.manifest package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QtiMetadata_QNAME = new QName("http://www.imsglobal.org/xsd/imsqti_metadata_v2p1", "qtiMetadata");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.olat.imsqti.xml.manifest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QTIMetadataType }
     * 
     */
    public QTIMetadataType createQTIMetadataType() {
        return new QTIMetadataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QTIMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imsglobal.org/xsd/imsqti_metadata_v2p1", name = "qtiMetadata")
    public JAXBElement<QTIMetadataType> createQtiMetadata(QTIMetadataType value) {
        return new JAXBElement<QTIMetadataType>(_QtiMetadata_QNAME, QTIMetadataType.class, null, value);
    }

}
