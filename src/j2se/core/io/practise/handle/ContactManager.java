package j2se.core.io.practise.handle;

import j2se.core.io.practise.Impl.ContactService;
import j2se.core.io.practise.dao.IContact;
import j2se.core.io.practise.entity.Contact;

import java.io.IOException;
import java.util.List;

public class ContactManager {

	private IContact dao = null;

	public ContactManager() throws IOException {

		dao = new ContactService();
	}

	public Contact getContactById(int id) {
		// TODO Auto-generated method stub
		return dao.getContactById(id);
	}

	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return dao.getAllContacts();
	}

	public void AddContact(Contact contact) {
		// TODO Auto-generated method stub
		dao.AddContact(contact);
	}
}
