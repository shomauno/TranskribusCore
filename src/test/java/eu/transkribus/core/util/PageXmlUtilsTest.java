package eu.transkribus.core.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.xml.bind.JAXBException;

import eu.transkribus.core.model.beans.pagecontent.PcGtsType;
import eu.transkribus.core.model.beans.pagecontent.TextRegionType;
import eu.transkribus.core.model.beans.pagecontent_trp.TrpPageType;

public class PageXmlUtilsTest {
	
	public static void testGetTextRegions() throws Exception {
		String transcriptWithTables = "https://dbis-thure.uibk.ac.at/f/Get?id=VCLTRLDSWETCXIHQNHKOPRLS";
		
		PcGtsType t = PageXmlUtils.unmarshal(new URL(transcriptWithTables));
		
		List<TextRegionType> tr = PageXmlUtils.getTextRegions(t);
		
		for (TextRegionType r : tr) {
			System.out.println("tr: "+r.getClass().getSimpleName()+" id: "+r.getId()+" n-lines: "+r.getTextLine().size());
		}
	}
	
	public static void testSth() throws Exception {
		File[] files = {
				new File("/mnt/dea_scratch/TRP/test/page_xsl_test/ocr/Mittheilungen_Perthes_1855_0009.xml"),
				new File("/mnt/dea_scratch/TRP/test/ImagesOldPageXml/page/2010-03-19_backup/035_320_001.xml"),
				new File("/mnt/dea_scratch/TRP/test/page_xsl_test/Mittheilungen_Perthes_1855_0009.xml")
				};
		
		try {
			PcGtsType t = PageXmlUtils.createEmptyPcGtsType(new URL("https://dbis-thure.uibk.ac.at/fimagestore/Get?fileType=metadata&id=YSUGXUUGAHYCUQVMEUJAYQGO"));
			JaxbUtils.marshalToSysOut(t);
		} catch (IOException | JAXBException e) {
			
			e.printStackTrace();
		}
		
//		for(File f : files){
//			try {
//				System.out.println(XmlUtils.getXmlFormat(f).toString());
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//		}
	}
	
	public static void main(String[] args) throws Exception {
		testGetTextRegions();
//		testSth();
	}
}
