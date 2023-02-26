package com.mehmetnuri.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "telefonlar")
public class Telefon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marka;

    private String model;

    private String seriNo;

    @OneToMany(mappedBy = "telefon")
    private Set<Kisiler> kisiler;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeriNo() {
        return seriNo;
    }

    public void setSeriNo(String seriNo) {
        this.seriNo = seriNo;
    }

    public Set<Kisiler> getKisiler() {
        return kisiler;
    }

    public void setKisiler(Set<Kisiler> kisiler) {
        this.kisiler = kisiler;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", seriNo='" + seriNo +

                '}';
    }
}
