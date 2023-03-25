package com.mehmetnuri.springmongodbornek2.listeners;

import com.mehmetnuri.springmongodbornek2.document.BaseDocument;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MongoListener extends AbstractMongoEventListener<BaseDocument> {

    @Override
    public void onBeforeConvert(BeforeConvertEvent<BaseDocument> event) {
        super.onBeforeConvert(event);
        Date dateNow = new Date();
        if (event.getSource().getId() != null) {
            event.getSource().setUpdatedAt(new Date());
        } else {
            event.getSource().setCreatedAt(dateNow);
            event.getSource().setUpdatedAt(dateNow);
        }


    }


}
