package j2se.core.io.practise.Impl;

import j2se.core.io.practise.entity.Contact;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParser {

	public static List<Contact> parser(String filename) {

		DocumentBuilderFactory docBuilderFactory = null;
		DocumentBuilder docBuilder = null;
		Document doc = null;

		List<Contact> contacts = new ArrayList<Contact>();

		docBuilderFactory = DocumentBuilderFactory.newInstance();
		try {
			docBuilder = docBuilderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

		NodeList list = root.getElementsByTagName("contact");

		for (int index = 0; index < list.getLength(); index++) {
			Contact contact = new Contact(index, filename, filename, null);

			Node node = list.item(index);
			String id = node.getAttributes().getNamedItem("id")
					.getTextContent();
			contact.setId(Integer.parseInt(id));
			NodeList childNodes = node.getChildNodes();
			for (int i = 0; i < childNodes.getLength(); i++) {

				Node itemNode = childNodes.item(i);

				if (itemNode.getNodeName().equals("name")) {

					contact.setRealName(itemNode.getTextContent());
				} else if (itemNode.getNodeName().equals("mobile")) {

					contact.setMobile(itemNode.getTextContent());
				} else if (itemNode.getNodeName().equals("group")) {
					NodeList groupNodes = itemNode.getChildNodes();
					for (int j = 0; j < groupNodes.getLength(); j++) {
						if (groupNodes.item(j).equals("id")) {
							String groupId = groupNodes.item(j)
									.getTextContent();
							contact.getGroup().setId(Integer.parseInt(groupId));
						} else if (groupNodes.item(j).equals("name")) {
							String groupName = groupNodes.item(j)
									.getTextContent();
							contact.getGroup().setName(groupName);
						}
					}

				}

			}

			contacts.add(contact);

		}
		return contacts;

	}

}
