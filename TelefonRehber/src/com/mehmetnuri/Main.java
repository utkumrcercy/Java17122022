package com.mehmetnuri;

import com.mehmetnuri.dao.TelefonDao;
import com.mehmetnuri.entity.TelefonEntity;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TelefonDao telefonDao = new TelefonDao();

        List<TelefonEntity> telefonEntityList = telefonDao.findAllTelefon();
        for (TelefonEntity entity : telefonEntityList) {
            System.out.println(entity);

        }
    }
}