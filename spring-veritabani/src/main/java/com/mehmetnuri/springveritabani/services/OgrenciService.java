package com.mehmetnuri.springveritabani.services;

import com.mehmetnuri.springveritabani.converter.OgrenciConverter;
import com.mehmetnuri.springveritabani.dao.OgrenciRepository;
import com.mehmetnuri.springveritabani.domain.Ogrenci;
import com.mehmetnuri.springveritabani.dto.OgrenciDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OgrenciService extends BaseService<Ogrenci, OgrenciRepository> {

    private final OgrenciRepository ogrenciRepository;
    private final ModelMapper modelMapper;

    private final OgrenciConverter ogrenciConverter;

    public OgrenciService(OgrenciRepository ogrenciRepository, ModelMapper modelMapper, OgrenciConverter ogrenciConverter) {
        this.ogrenciRepository = ogrenciRepository;
        this.modelMapper = modelMapper;
        this.ogrenciConverter = ogrenciConverter;
    }

    public OgrenciDto findOgrenciByOgrenciNo(Long ogrenciNo) {

        Optional<Ogrenci> ogrenci = this.ogrenciRepository.findOgrenciByOgrenciNo(ogrenciNo);

        return ogrenci.map(value -> modelMapper.map(value, OgrenciDto.class)).orElse(null);


//        return ogrenci.map(ogrenciConverter::convertToOgrenciDto).orElse(null);

    }
}
