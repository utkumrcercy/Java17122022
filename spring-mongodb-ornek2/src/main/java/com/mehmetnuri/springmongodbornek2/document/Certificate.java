package com.mehmetnuri.springmongodbornek2.document;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "certificates")
public class Certificate extends BaseDocument{

    @Field("title")
    private String  title;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
