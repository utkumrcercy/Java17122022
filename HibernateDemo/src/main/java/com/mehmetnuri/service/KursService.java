package com.mehmetnuri.service;

import com.mehmetnuri.dao.impl.KursDaoImpl;
import com.mehmetnuri.entity.Kurs;

public class KursService {

    KursDaoImpl impl = new KursDaoImpl();

    public Kurs saveKurs(Kurs kurs) {
        return impl.saveKurs(kurs);
    }


}
