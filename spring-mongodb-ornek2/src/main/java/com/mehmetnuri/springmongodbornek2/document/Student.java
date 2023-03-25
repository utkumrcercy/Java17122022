package com.mehmetnuri.springmongodbornek2.document;

import com.mehmetnuri.springmongodbornek2.enums.EnumStatusAP;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.*;

import java.util.Set;

@Document(collection = "students")
public class Student extends BaseDocument{

    @Field("name")
    private String name;

    @Field("lastName")
    private String lastName;

    @Indexed
    @Field(targetType = FieldType.STRING)
    private EnumStatusAP status;

    @DBRef
    private Set<Certificate> certificates;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EnumStatusAP getStatus() {
        return status;
    }

    public void setStatus(EnumStatusAP status) {
        this.status = status;
    }

    public Set<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(Set<Certificate> certificates) {
        this.certificates = certificates;
    }
}
