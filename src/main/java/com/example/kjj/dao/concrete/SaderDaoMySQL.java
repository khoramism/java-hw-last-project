package com.example.kjj.dao.concrete;

import com.example.kjj.dao.interfaces.SaderDao;
import com.example.kjj.models.Sader;
import com.example.kjj.DaoFactory.daoFactory;
import java.sql.*;
import java.util.*;
import org.hibernate.*;

import com.example.kjj.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;

/*
        String title,
        String description ,
        Integer price,
        Boolean isActive,
        Date created,
        Date updated,
        Date deleted,
        String createdBy,
        String updatedBy,
        String deletedBy,
*/

public class SaderDaoMySQL implements SaderDao {

    @Override
    public Sader save(Sader object) throws SQLException {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        ss.save(st);
        tx.commit();
        ss.close();
        return st;
    }

    @Override
    public Sader insert(Sader object) throws SQLException {
        return null;
    }

    @Override
    public ArrayList<Sader> all() throws SQLException {
        return null;
    }

    @Override
    public int deleteAll() throws SQLException {
        return 0;
    }

    @Override
    public int delete(Sader sader) throws SQLException {
        return 0;
    }

    @Override
    public Sader findById(Long id) throws SQLException {
        return null;
    }
}
