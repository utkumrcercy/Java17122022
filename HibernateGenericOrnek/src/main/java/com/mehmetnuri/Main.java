package com.mehmetnuri;

import com.mehmetnuri.core.service.GenericService;
import com.mehmetnuri.core.utils.HibernateUtil;
import com.mehmetnuri.entity.Sehir;
import com.mehmetnuri.entity.Ulke;

public class Main {
    public static void main(String[] args) {

        HibernateUtil.getSession();

        GenericService<Sehir> sehirGenericService = new GenericService<Sehir>(
                Sehir.class, HibernateUtil.getSessionFactory()
        );

//        Sehir sehir = new Sehir();
//        sehir.setAd("İstanbul");
//        sehir.setPlaka("34");
//
//        sehirGenericService.save(sehir);

        GenericService<Ulke> ulkeGenericService = new GenericService<Ulke>(Ulke.class, HibernateUtil.getSessionFactory());

//        Ulke ulke = new Ulke();
//        ulke.setAd("Amerika");
//
//        ulkeGenericService.save(ulke);
//    }


        for (Ulke ulke : ulkeGenericService.getAll()) {
            System.out.println(ulke.getAd());
        }


    }
}