package com.mehmetnuri.springveritabani.converter;

import com.mehmetnuri.springveritabani.domain.Ogrenci;
import com.mehmetnuri.springveritabani.dto.OgrenciDto;
import org.springframework.stereotype.Component;

@Component
public class OgrenciConverter {

    public OgrenciDto convertToOgrenciDto(Ogrenci ogrenci) {

        OgrenciDto ogrenciDto = new OgrenciDto();
        ogrenciDto.setAd(ogrenci.getAd());
        ogrenciDto.setSoyad(ogrenci.getSoyad());
        ogrenciDto.setOgrenciNo(ogrenci.getOgrenciNo());

        return ogrenciDto;
    }
}
