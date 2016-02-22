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

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Assert;
import org.junit.Test;
import org.olat.imscp.xml.manifest.ManifestType;

/**
 * 
 * @author srosse, stephane.rosse@frentix.com, http://www.frentix.com
 *
 */
public class UmarshalManifestTest {
	
	@Test
	public void unmarshal() {
		ManifestType manifest =  read("imsmanifest_1.xml");
		Assert.assertNotNull(manifest);
	}
	
	@Test
	public void unmarshal_2() {
		ManifestType manifest =  read("imsmanifest_2.xml");
		Assert.assertNotNull(manifest);
		Object lom = manifest.getResources().getResource().get(0).getMetadata().getAny().get(1);
		Assert.assertNotNull(lom);
	}
	
	public static ManifestType read(String manifestFile) {
        try(InputStream in = UmarshalManifestTest.class.getResourceAsStream(manifestFile)) {
			JAXBContext context = JAXBContext.newInstance("org.olat.imscp.xml.manifest:org.olat.imsqti.xml.manifest:org.olat.imsmd.xml.manifest");
			Unmarshaller marshaller = context.createUnmarshaller();
			//marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			//marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.imsglobal.org/xsd/imscp_v1p1 http://www.imsglobal.org/xsd/qti/qtiv2p1/qtiv2p1_imscpv1p2_v1p0.xsd");

			return (ManifestType)((JAXBElement<?>)marshaller.unmarshal(in)).getValue();
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
