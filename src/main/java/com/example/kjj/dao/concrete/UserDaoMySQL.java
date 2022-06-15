package com.example.kjj.dao.concrete;

import com.example.kjj.models.Sader;
import com.example.kjj.models.User;
import com.example.kjj.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;




public class UserDaoMySQL {


    Session ss = null;
    Transaction tx = null;

    public User update(User object) throws SQLException {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        ss.update(object);
        tx.commit();
        return object;
    }

    public User insert(User object) throws SQLException {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        ss.save(object);
        tx.commit();
        return object;
    }

    public List<User> all() throws SQLException {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        Query q = ss.createQuery("From User");
        List<User> sl = q.list();
        ss.getTransaction().commit();
        return sl;
    }

    public void delete(User user) throws SQLException {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        ss.delete(user);
        tx.commit();
    }

    public List<User> find(User user) throws SQLException {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        Query q = ss.createQuery("From User ");
        List<User> all = q.list();
        all = all.stream().filter(s->
            ((user.getId() == null || user.getId().equals(s.getId()))
                    && ( user.getUsername() == null || user.getUsername().equals(s.getUsername()))
                    && (user.getEmail() == null || user.getEmail().equals(s.getEmail()))
                    && (user.getPassword() == null || user.getPassword().equals(s.getPassword())))
        ).collect(Collectors.toList());
        tx.commit();
        return all;
    }
}
