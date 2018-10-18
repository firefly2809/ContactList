package db.dao.Classes;

import db.dao.Interfaces.ContactsDAOInterface;
import db.entities.Contact;

import java.sql.ResultSet;

public class DAOContact implements ContactsDAOInterface<Contact> {
    @Override
    public Object mapping(ResultSet rs) {
        return null;
    }
}
