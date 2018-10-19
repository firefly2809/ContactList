package db.dao.Interfaces;

import db.entities.Contact;

import java.util.Date;
import java.util.List;

public interface ContactsDAOInterface<T> extends BaseDAOInterface {

    List<Contact> getContactList();

    Contact getContact(String name);

    createContact(String name, String phoneNumber, Date birthDay, String address);

    updateContact(String name);

    deleteContact(String name);
}
