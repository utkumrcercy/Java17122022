package com.mehmetnuri.restapigiris.converter;

import com.mehmetnuri.restapigiris.domain.Bolum;
import com.mehmetnuri.restapigiris.dto.BolumDto;
import org.springframework.stereotype.Component;

@Component
public class BolumConverter {


    public BolumDto convertToBolumDto(Bolum bolum) {
        BolumDto dto = new BolumDto();

        dto.setId(bolum.getId());
        dto.setAd(bolum.getAd());
        dto.setDurum(bolum.getDurum().getDurum());
        dto.setFakulte(bolum.getFakulte());
        return dto;
    }
}
