package com.example.kjj.dao.concrete;

import com.example.kjj.dao.interfaces.SaderDao;
import com.example.kjj.models.Sader;
import com.example.kjj.util.HibernateUtil;

import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;

import org.hibernate.*;
import org.hibernate.internal.CriteriaImpl;


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

public class SaderDaoMySQL {


    Session ss = null;
    Transaction tx = null;

    public Sader update(Sader object) throws SQLException {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        ss.update(object);
        tx.commit();
        return object;
    }

    public Sader insert(Sader object) throws SQLException {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        ss.save(object);
        tx.commit();
        return object;
    }

    public List<Sader> all() throws SQLException {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        Query q = ss.createQuery("From Sader");
        List<Sader> sl = q.list();
        ss.getTransaction().commit();
        return sl;
    }

    public void delete(Sader sader) throws SQLException {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        ss.delete(sader);
        tx.commit();
    }

    public List<Sader> find(Sader sader) throws SQLException {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        Query q = ss.createQuery("From Sader");
        List<Sader> all = q.list();
        all = all.stream().filter(s-> ((sader.getId() == null || sader.getId().equals(s.getId()))
                    && ( sader.getUser() == null || sader.getUser().equals(s.getUser())))
        ).collect(Collectors.toList());
        tx.commit();
        return all;
    }
}
