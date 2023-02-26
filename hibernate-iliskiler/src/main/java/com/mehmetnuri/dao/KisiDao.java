package com.mehmetnuri.dao;

import com.mehmetnuri.entity.Kisiler;
import com.mehmetnuri.entity.Telefon;
import com.mehmetnuri.utils.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.NonUniqueResultException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class KisiDao {

    private Session session;

    public KisiDao() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    public Kisiler kisiKaydet(Kisiler kisiler) {
        try {

            Transaction transaction = session.beginTransaction();
            session.save(kisiler);
            transaction.commit();
            session.close();
            return kisiler;

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Kisiler kisiBul(Long id) {
        try {

            String hql = "select kisi from  Kisiler  kisi " +
                    " where kisi.id = :id  ";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);

            Kisiler kisiler = (Kisiler) query.uniqueResult();
            session.close();
            return kisiler;

        } catch (NonUniqueResultException uniqueResultException) {
            throw new RuntimeException("Birden fazla kayıt geldi");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
