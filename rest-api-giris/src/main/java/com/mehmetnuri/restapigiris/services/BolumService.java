package com.mehmetnuri.restapigiris.services;

import com.mehmetnuri.restapigiris.commons.service.BaseService;
import com.mehmetnuri.restapigiris.converter.BolumConverter;
import com.mehmetnuri.restapigiris.domain.Bolum;
import com.mehmetnuri.restapigiris.dto.BolumDto;
import com.mehmetnuri.restapigiris.repository.BolumRespository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BolumService extends BaseService<Bolum, BolumRespository> {

    @Autowired
    private BolumRespository bolumRespository;

    @Autowired
    private BolumConverter bolumConverter;

    public BolumDto findByIdCustom(Long id) {
        Optional<Bolum> byId = this.bolumRespository.findById(id);
        return this.bolumConverter.convertToBolumDto(byId.get());
    }
}
