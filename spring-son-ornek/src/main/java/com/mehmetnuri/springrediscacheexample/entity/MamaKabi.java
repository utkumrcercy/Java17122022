package com.mehmetnuri.springrediscacheexample.entity;



import com.mehmetnuri.springrediscacheexample.enums.EnumDurumAP;
import com.mehmetnuri.springrediscacheexample.enums.EnumKapTuru;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mama_kabi")
@ApiModel(value= "MamaKabi", description = "MamaKabi  Modeli")
public class MamaKabi implements Serializable {
    @Id
    @SequenceGenerator(name = "mamakabi_id_seq", sequenceName = "mamakabi_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "mamakabi_id_seq", strategy = GenerationType.SEQUENCE)
    @ApiModelProperty(value = "MamaKabi Id", required = true, example = "1")
    private Long id;

    @Column(length = 100)
    @ApiModelProperty(value = "MamaKabi Id", required = true, example = "Example Category")
    private String ad;

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    @ApiModelProperty(value = "MamaKabi Id", required = true, example = "AKTIF")
    private EnumDurumAP durum;


    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    @ApiModelProperty(value = "MamaKabi Id", required = true, example = "MAMA")
    private EnumKapTuru turu;

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

    public EnumKapTuru getTuru() {
        return turu;
    }

    public void setTuru(EnumKapTuru turu) {
        this.turu = turu;
    }
}
