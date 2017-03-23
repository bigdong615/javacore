dpackage j2se.core.xmlParse;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class PetDomParser {
	public static List<Dog> parse(String filename)
			throws ParserConfigurationException {

		List<Dog> dogs = new ArrayList<Dog>();
		DocumentBuilderFactory docBuilderFactory = null;

		DocumentBuilder docBuilder = null;

		Document doc = null;

		docBuilderFactory = DocumentBuilderFactory.newInstance();

		docBuilder = docBuilderFactory.newDocumentBuilder();

		try {
			doc = docBuilder.parse(new File(filename));
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Element root = doc.getDocumentElement();
		
		root.getElementsByTagName("Dog");
		
		return dogs;

	}
}
