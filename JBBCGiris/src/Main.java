import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /**
         * JDBC(Java Data Base Connectivity)
         *
         *
         * Bağlantı URL
         * jdbc:db_sistem_adi://sunucu_adresi:port/db_adi
         *
         * "jdbc:postgresql://kandula.db.elephantsql.com:5432/nnpdtyax"
         *
         */




        UserDao dao = new UserDao();

//        User user = dao.kullaniciEkle(ali);
//        System.out.println(user);
//
//        List<User> kullaniciListesi = dao.tumKullanicilariGetir();
//
//        for (User user : kullaniciListesi) {
//            System.out.println(user);
//        }

//        Boolean kullaniciSilindimi = dao.kullaniciSil(10L);
//        if (kullaniciSilindimi) {
//            System.out.println("Kullanıcı silindi");
//        } else {
//            System.out.println("Kullanıcı silinemedi");
//        }
//        User ali = new User();
//        ali.setId(4L);
//        ali.setUsername("ali");
//        ali.setPassword("alişifre");
//
//        dao.kullaniciGuncelle(ali);

        User aliyiBul = dao.kullaniciyiBul(4L);
        System.out.println(aliyiBul);



    }
}