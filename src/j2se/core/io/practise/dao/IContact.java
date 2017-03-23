package j2se.core.io.practise.dao;

import java.util.List;

import j2se.core.io.practise.entity.Contact;

public interface IContact {
    public Contact getContactById(int id);
    public List<Contact> getAllContacts();
    public void AddContact (Contact contact);
}
