package j2se.core.io.practise.page;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import j2se.core.io.practise.Impl.PetSAXParser;
import j2se.core.io.practise.entity.Dog;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class TestPetSAXParser {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();

		try {
			SAXParser parser = factory.newSAXParser();

			PetSAXParser petsaxparser = new PetSAXParser();

			/*
			 * URL url = new URL("http://rss.sina.com.cn/news/"); 
			 * InputSource is = new InputSource(url.openStream());
			 * parser.parse(is,rssHandler));//开始解析 生成一个具体的SAX解析器 local parse
			 */

			parser.parse("xml/pet.xml", petsaxparser); //开始解析
			List<Dog> dogs = petsaxparser.getDogs();
			for (Dog dog:dogs){
				
				System.out.println(dog);
			}

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
