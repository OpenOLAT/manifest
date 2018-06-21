# Manifest JAXB WS for OpenOLAT

This is a compiled version of several XML schemas to manage "imsmanifest.xml" files


```bash
xjc -verbose -d src/main/java -p org.olat.imscp.xml.manifest src/main/resources/imscp_v1p2.xsd
xjc -verbose -d src/main/java -p org.olat.imsmd.xml.manifest src/main/resources/imsmd_v1p2p4.xsd
xjc -verbose -d src/main/java -p org.olat.imsqti.xml.manifest src/main/resources/imsqti_metadata_v2p1.xsd
xjc -verbose -d src/main/java -p org.olat.oo.xml.manifest src/main/resources/oomd_v1p1.xsd
```


```java
@javax.xml.bind.annotation.XmlSchema(namespace = "http://www.openolat.org/xsd/oomd_v1p1",
	elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED,
	location = "http://www.openolat.org/xsd/oomd_v1p1.xsd",
	xmlns = { @javax.xml.bind.annotation.XmlNs(namespaceURI = "http://www.openolat.org/xsd/oomd_v1p1", prefix = "oomd") })
package org.olat.oo.xml.manifest;
```