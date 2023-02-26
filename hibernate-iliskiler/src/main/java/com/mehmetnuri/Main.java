package com.mehmetnuri;

import com.mehmetnuri.dao.KisiDao;
import com.mehmetnuri.dao.TelefonDao;
import com.mehmetnuri.entity.Kisiler;
import com.mehmetnuri.entity.Telefon;
import com.mehmetnuri.utils.HibernateUtil;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

        /*
        Kisiler mehmet = new Kisiler();
        mehmet.setAd("Mehmet Nuri");
        mehmet.setSoyad("Öztürk");
        mehmet.setNumara("555");
        mehmet.setTelefon(null);

        KisiDao kisiDao = new KisiDao();
        Kisiler kisiler = kisiDao.kisiKaydet(mehmet);
        System.out.println(kisiler.getId());
         */

        /*
        Telefon iphone = new Telefon();
        iphone.setMarka("Apple");
        iphone.setModel("14 Pro Max 1 TB");
        iphone.setSeriNo("ASD5646q");

        TelefonDao telefonDao = new TelefonDao();
        Telefon telefon = telefonDao.telefonKaydet(iphone);
        System.out.println(telefon.getId());

         */

       /*
        TelefonDao telefonDao = new TelefonDao();

        KisiDao kisiDao = new KisiDao();

        Telefon telefon = telefonDao.telefonBul(1L);

        Kisiler ali = new Kisiler();
        ali.setAd("Ali");
        ali.setSoyad("Öztürk");
        ali.setNumara("444444444");
        ali.setTelefon(telefon);

        Kisiler kisiler = kisiDao.kisiKaydet(ali);

        System.out.println(kisiler.getAd());
        */

        TelefonDao telefonDao = new TelefonDao();

        KisiDao kisiDao = new KisiDao();

        Telefon telefon = telefonDao.telefonBul(1L);

        for (Kisiler kisiler : telefon.getKisiler()) {
            System.out.println(kisiler);
        }

        Kisiler kisiler = kisiDao.kisiBul(1L);

        System.out.printf(kisiler.getTelefon().getMarka());

    }
}