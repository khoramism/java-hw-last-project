package src.dao.interfaces;

import java.sql.SQLException;

import java.util.List;
import java.util.Date;
import src.models.Sader;



public interface SaderDao {
    Sader insert(Sader object) throws SQLException;
    List<Sader> all() throws SQLException;
    int deleteAll() throws SQLException;
    int delete (Sader sader) throws SQLException;
    // Sader findByTitle(String title) throws SQLException;
    Sader findById(Long id) throws SQLException;
    Sader findByDescription(String description) throws SQLException;
    // List<Sader> findByDate(Date created) throws SQLException;
    // List<Sader> findByIsActive(boolean isActive) throws SQLException;
    // List<Product> findByIsActive(boolean isDel) throws SQLException;

}


