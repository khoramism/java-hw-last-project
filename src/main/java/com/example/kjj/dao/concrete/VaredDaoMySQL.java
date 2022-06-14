package com.example.kjj.dao.concrete;

import com.example.kjj.models.Sader;
import com.example.kjj.models.Vared;
import com.example.kjj.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;


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

public class VaredDaoMySQL {


    Session ss = null;
    Transaction tx = null;

    public Vared update(Vared object) throws SQLException {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        ss.update(object);
        tx.commit();
        return object;
    }

    public Vared insert(Vared object) throws SQLException {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        ss.save(object);
        tx.commit();
        return object;
    }

    public List<Vared> all() throws SQLException {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        Query q = ss.createQuery("From Vared");
        List<Vared> sl = q.list();
        ss.getTransaction().commit();
        return sl;
    }

    public void delete(Vared vared) throws SQLException {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        ss.delete(vared);
        tx.commit();
    }

    public List<Vared> find(Vared vared) throws SQLException {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        Query q = ss.createQuery("From Vared");
        List<Vared> all = q.list();
        all = all.stream().filter(s->
             ((vared.getId() == null || vared.getId().equals(s.getId()))
                    && ( vared.getUser() == null || vared.getUser().equals(s.getUser())))
        ).collect(Collectors.toList());
        tx.commit();
        return all;
    }
}
