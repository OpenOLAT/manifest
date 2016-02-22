/**
 * <a href="http://www.openolat.org">
 * OpenOLAT - Online Learning and Training</a><br>
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); <br>
 * you may not use this file except in compliance with the License.<br>
 * You may obtain a copy of the License at the
 * <a href="http://www.apache.org/licenses/LICENSE-2.0">Apache homepage</a>
 * <p>
 * Unless required by applicable law or agreed to in writing,<br>
 * software distributed under the License is distributed on an "AS IS" BASIS, <br>
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. <br>
 * See the License for the specific language governing permissions and <br>
 * limitations under the License.
 * <p>
 * Initial code contributed and copyrighted by<br>
 * frentix GmbH, http://www.frentix.com
 * <p>
 */
package org.olat.imscp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Assert;
import org.junit.Test;
import org.olat.imscp.xml.manifest.ManifestMetadataType;
import org.olat.imscp.xml.manifest.ManifestType;
import org.olat.imscp.xml.manifest.MetadataType;
import org.olat.imscp.xml.manifest.OrganizationsType;
import org.olat.imscp.xml.manifest.ResourceType;
import org.olat.imscp.xml.manifest.ResourcesType;
import org.olat.imsmd.xml.manifest.GeneralType;
import org.olat.imsmd.xml.manifest.LangstringType;
import org.olat.imsmd.xml.manifest.LomType;
import org.olat.imsmd.xml.manifest.TitleType;
import org.olat.imsqti.xml.manifest.QTIMetadataType;

/**
 * 
 * @author srosse, stephane.rosse@frentix.com, http://www.frentix.com
 *
 */
public class ManifestTest {
	
	private static final org.olat.imscp.xml.manifest.ObjectFactory cpObjectFactory = new org.olat.imscp.xml.manifest.ObjectFactory();
	private static final org.olat.imsqti.xml.manifest.ObjectFactory qtiObjectFactory = new org.olat.imsqti.xml.manifest.ObjectFactory();
	private static final org.olat.imsmd.xml.manifest.ObjectFactory mdObjectFactory = new org.olat.imsmd.xml.manifest.ObjectFactory();
	
	@Test
	public void simpleManifest() {
		ManifestType manifestType = cpObjectFactory.createManifestType();
		manifestType.setIdentifier("testManifest");
		
		ManifestMetadataType metadataType = cpObjectFactory.createManifestMetadataType();
		metadataType.setSchema("QTIv2.1 Package");
		metadataType.setSchemaversion("1.0.0");
		manifestType.setMetadata(metadataType);
	        
		OrganizationsType organisationsType = cpObjectFactory.createOrganizationsType();
		manifestType.setOrganizations(organisationsType);

		ResourcesType resourcesType = cpObjectFactory.createResourcesType();
		manifestType.setResources(resourcesType);
		
		ResourceType itemResourceType = cpObjectFactory.createResourceType();
        itemResourceType.setIdentifier("ID-234");
        itemResourceType.setType("imsqti_item_xmlv2p1");
        itemResourceType.setHref("id234.xml");
        
        MetadataType metadata = cpObjectFactory.createMetadataType(); 
        QTIMetadataType qtiMetadata = qtiObjectFactory.createQTIMetadataType();
        qtiMetadata.setComposite(Boolean.FALSE);
        qtiMetadata.setItemTemplate(Boolean.FALSE);
        qtiMetadata.setSolutionAvailable(Boolean.TRUE);
        qtiMetadata.setToolName("OpenOLAT");
        qtiMetadata.setToolVendor("frentix");
        qtiMetadata.setToolVersion("11.0");
        metadata.getAny().add(qtiObjectFactory.createQtiMetadata(qtiMetadata));
        
        LomType lom = mdObjectFactory.createLomType();
        
        GeneralType general = mdObjectFactory.createGeneralType();
        
        TitleType title = mdObjectFactory.createTitleType();
        LangstringType langTitle = mdObjectFactory.createLangstringType();
        langTitle.setLang("en");
        langTitle.setValue("Hello world");
        title.getLangstring().add(langTitle);
        
        general.getContent().add(mdObjectFactory.createTitle(title));
        
        lom.setGeneral(general);

        metadata.getAny().add(mdObjectFactory.createLom(lom));
        
        itemResourceType.setMetadata(metadata);
        resourcesType.getResource().add(itemResourceType);
        
        // write -> read
        ByteArrayOutputStream out = new ByteArrayOutputStream();
		write(manifestType, out);
		ManifestType reloadedManifest = read(new ByteArrayInputStream(out.toByteArray()));
		Assert.assertNotNull(reloadedManifest);
		Assert.assertEquals(manifestType.getIdentifier(), reloadedManifest.getIdentifier());
	}
	
	public static ManifestType read(InputStream in) {
        try {
			JAXBContext context = JAXBContext.newInstance("org.olat.imscp.xml.manifest:org.olat.imsqti.xml.manifest:org.olat.imsmd.xml.manifest");
			Unmarshaller marshaller = context.createUnmarshaller();
			//marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			//marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.imsglobal.org/xsd/imscp_v1p1 http://www.imsglobal.org/xsd/qti/qtiv2p1/qtiv2p1_imscpv1p2_v1p0.xsd");

			return (ManifestType)((JAXBElement<?>)marshaller.unmarshal(in)).getValue();
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void write(ManifestType manifest, OutputStream out) {
        try {
			JAXBContext context = JAXBContext.newInstance("org.olat.imscp.xml.manifest:org.olat.imsqti.xml.manifest:org.olat.imsmd.xml.manifest");
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.imsglobal.org/xsd/imscp_v1p1 http://www.imsglobal.org/xsd/qti/qtiv2p1/qtiv2p1_imscpv1p2_v1p0.xsd");

			marshaller.marshal(cpObjectFactory.createManifest(manifest), out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	


}
