package eu.transkribus.core.io;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import eu.transkribus.core.model.beans.pagecontent.PcGtsType;
import eu.transkribus.core.util.JaxbUtils;
import eu.transkribus.core.util.PageXmlUtils;

public class XslTransformTest {
	private static final String ABBY_TO_PAGE_XSLT = "xslt/Abbyy10ToPage2013.xsl";
	
	public static void main(String[] args){
		final File abbyyXml = new File("C:/tmp/Alto2PageTest/ocr/177907.xml");
		
		File pageOutFile = new File("C:/tmp/Alto2PageTest/abbyyToPageTest.xml");
		
		final String TEXT_STYLE_PARAM_NAME = "preserveTextStyles";
		Map<String, Object> params = new HashMap<>();
		params.put(TEXT_STYLE_PARAM_NAME, Boolean.FALSE);
		
		PcGtsType pc;
		try {
			pc = JaxbUtils.transformToObject(abbyyXml, ABBY_TO_PAGE_XSLT, params, PcGtsType.class);
		
			pc.getPage().setImageFilename("177907.JPG");
			File pageXml = JaxbUtils.marshalToFile(pc, pageOutFile);
			
			PcGtsType result = PageXmlUtils.unmarshal(pageOutFile);
		} catch (TransformerException | SAXException | IOException | ParserConfigurationException
				| JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
