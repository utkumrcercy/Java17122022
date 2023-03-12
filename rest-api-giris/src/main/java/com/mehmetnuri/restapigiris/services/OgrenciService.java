package com.mehmetnuri.restapigiris.services;

import com.mehmetnuri.restapigiris.commons.service.BaseService;
import com.mehmetnuri.restapigiris.domain.Ogrenci;
import com.mehmetnuri.restapigiris.repository.OgrenciRepository;
import org.springframework.stereotype.Service;

@Service
public class OgrenciService extends BaseService<Ogrenci, OgrenciRepository> {
}
