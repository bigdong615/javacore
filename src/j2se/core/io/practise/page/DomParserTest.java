package j2se.core.io.practise.page;

import java.util.ArrayList;

import j2se.core.io.practise.Impl.DomParser;
import j2se.core.io.practise.entity.Contact;

public class DomParserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DomParser domParser = new DomParser();
		
		 domParser.parser("xml/contact.xml");
		 
		 
		
		System.out.print(domParser);
	}

}
