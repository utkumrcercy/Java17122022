package com.mehmetnuri;

import com.mehmetnuri.dao.impl.KursDaoImpl;
import com.mehmetnuri.entity.Kurs;
import com.mehmetnuri.service.KursService;

import java.util.List;

public class App {
    public static void main(String[] args) {

//        Kurs kurs = new Kurs();
//        kurs.setEgitmen("Ali");
//        kurs.setKursAdi("Python");
//        kurs.setKursSaati(96L);

//        KursDaoImpl kursDao = new KursDaoImpl();

//        kursDao.saveKurs(kurs);

//        List<Kurs> kursList = kursDao.listAllKurs();
//        for (Kurs kurs : kursList) {
//            System.out.println(kurs.getKursAdi());
//        }

//        Kurs kurs = kursDao.findKursById(44L);
//        System.out.println(kurs.getKursAdi());
//        System.out.println(kursDao.deleteKursByKursId(2L));
//        System.out.println(kursDao.deleteAllKurs());

        KursService service = new KursService();
        Kurs kurs = new Kurs();
        kurs.setEgitmen("Ali");
        kurs.setKursAdi("Go");
        kurs.setKursSaati(96L);

        Kurs kurs1 = service.saveKurs(kurs);
        System.out.println(kurs1.getKursAdi());

    }
}
