package j2se.core.io.practise.Impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import j2se.core.io.practise.dao.IContact;
import j2se.core.io.practise.entity.Contact;
import j2se.core.io.practise.util.FileUtil;

public class ContactService implements IContact {

	private FileUtil fileUtil = null;
	private static final String FILENAME = "xml/contact.xml";
	private DomParser domParser =null;
	private List<Contact> contacts=null;

	public ContactService() throws IOException {
		fileUtil = new FileUtil(FILENAME);
		fileUtil.writeLine("test");//("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		contacts = new ArrayList<Contact>();
		domParser = new DomParser();
	}

	public Contact getContactById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return domParser.parser(FILENAME);
	}

	public void AddContact(Contact contact) {
		// TODO Auto-generated method stub

		// fileUtil.writeLine("<contacts>");
		// fileUtil.writeLine(String.format("<contact id= \"%s\">",
		// contact.getId()));
		StringBuilder sb = new StringBuilder();

		sb.append("<contacts>");
		sb.append(String.format("<contact id= \"%s\">", contact.getId()));
		sb.append(String.format("<name>%s</name>", contact.getRealName()));
		sb.append(String.format("<mobile>%s</mobile>", contact.getMobile()));

		fileUtil.writeLine(sb.toString());

	}

}
