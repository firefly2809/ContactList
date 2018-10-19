package db.dao.Classes;

import db.H2DBConnection;
import db.dao.Interfaces.ContactsDAOInterface;
import db.entities.Contact;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public class DAOContact implements ContactsDAOInterface<Contact> {


    Connection connection = H2DBConnection.getConnection();

    @Override
    public List<Contact> getContactList() {
        return null;
    }

    @Override
    public Contact getContact(String name) {
        return null;
    }

    @Override
    public Object mapping(ResultSet rs) {
        return null;
    }


}
