package com.mehmetnuri.dao;

import com.mehmetnuri.entity.Telefon;
import com.mehmetnuri.utils.HibernateUtil;
import org.hibernate.NonUniqueResultException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TelefonDao {

    private Session session;

    public TelefonDao() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    public Telefon telefonKaydet(Telefon telefon) {
        try {

            Transaction transaction = session.beginTransaction();
            session.save(telefon);
            transaction.commit();
            session.close();
            return telefon;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public Telefon telefonBul(Long id) {
        try {

            String hql = "select telefon from  Telefon  telefon   Left join fetch telefon.kisiler    " +
                    " where telefon.id = :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);

            Telefon telefon = (Telefon) query.uniqueResult();
            session.close();
            return telefon;


        } catch (NonUniqueResultException uniqueResultException) {
            throw new RuntimeException("Birden fazla kayıt geldi");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
