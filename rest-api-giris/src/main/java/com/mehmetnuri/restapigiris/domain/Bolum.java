package com.mehmetnuri.restapigiris.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.mehmetnuri.restapigiris.enums.EnumDurumAP;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bolumler")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Bolum  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ad;

    @Enumerated(EnumType.STRING)
    private EnumDurumAP durum;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_fakulte")
    private Fakulte fakulte;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public EnumDurumAP getDurum() {
        return durum;
    }

    public void setDurum(EnumDurumAP durum) {
        this.durum = durum;
    }

    public Fakulte getFakulte() {
        return fakulte;
    }

    public void setFakulte(Fakulte fakulte) {
        this.fakulte = fakulte;
    }

    @Override
    public String toString() {
        return this.ad.toString();
    }
}
