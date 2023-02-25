package com.mehmetnuri.dao.impl;

import com.mehmetnuri.dao.KursDao;
import com.mehmetnuri.entity.Kurs;
import com.mehmetnuri.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class KursDaoImpl implements KursDao {



    @Override
    public Kurs saveKurs(Kurs kurs) {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(kurs);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        return kurs;
    }

    @Override
    public List<Kurs> listAllKurs() {

        List<Kurs> kursList = new ArrayList<>();

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "Select  kurs From Kurs kurs"; // Select * From kurslar
            Query query = session.createQuery(hql);
            kursList = query.list();
            session.close();

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return kursList;
    }

    @Override
    public Boolean deleteKursByKursId(Long kursId) {
        Boolean status = Boolean.FALSE;

        Kurs deletedKurs = new Kurs();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            deletedKurs = session.get(Kurs.class, kursId);
            session.delete(deletedKurs);
            status = Boolean.TRUE;
            transaction.commit();
            session.close();

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        return status;
    }

    @Override
    public Boolean deleteAllKurs() {
        Boolean status = Boolean.FALSE;

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            List<Kurs> kursList = this.listAllKurs();

            for (Kurs kurs : kursList) {
                Transaction transaction = session.beginTransaction();

                session.delete(kurs);
                transaction.commit();
            }
            status = Boolean.TRUE;
            session.close();

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        return status;
    }

    @Override
    public Kurs updateKursByKursId(Kurs kurs, Long kursId) {
        return null;
    }

    @Override
    public Kurs findKursById(Long id) {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "Select kurs From Kurs kurs where kurs.id = :id";

            Query query = session.createQuery(hql);
            query.setParameter("id", id);

            Kurs kurs = (Kurs) query.getSingleResult();
            if (kurs == null) {
                return null;
            }
            return kurs;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
