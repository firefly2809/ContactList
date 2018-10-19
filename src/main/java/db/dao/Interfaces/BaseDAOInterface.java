package db.dao.Interfaces;

import java.sql.ResultSet;

public interface BaseDAOInterface<T> {

    T mapping(ResultSet rs);
}