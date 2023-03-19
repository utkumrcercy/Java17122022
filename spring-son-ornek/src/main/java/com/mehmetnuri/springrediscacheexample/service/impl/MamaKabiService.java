package com.mehmetnuri.springrediscacheexample.service.impl;

import com.mehmetnuri.springrediscacheexample.entity.MamaKabi;
import com.mehmetnuri.springrediscacheexample.enums.EnumDurumAP;
import com.mehmetnuri.springrediscacheexample.enums.EnumKapTuru;
import com.mehmetnuri.springrediscacheexample.exceptions.ResourceNotFoundException;
import com.mehmetnuri.springrediscacheexample.repository.MamaKabiRepository;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Service
@CacheConfig(cacheNames = "mamakabiCache")
public class MamaKabiService {

    private final MamaKabiRepository repository;
    private final EntityManager entityManager;

    public MamaKabiService(MamaKabiRepository repository, EntityManager entityManager) {
        this.repository = repository;
        this.entityManager = entityManager;
    }

    @Cacheable(cacheNames = "mamakablari")
    public List<MamaKabi> findAll() {
        return this.repository.findAll();

    }

    @CacheEvict(cacheNames = "mamakablari", allEntries = true)
    public MamaKabi add(MamaKabi mamaKabi) {
        return this.repository.save(mamaKabi);
    }

    @Caching(evict = {@CacheEvict(cacheNames = "mamakabi", key = "#id"),
            @CacheEvict(cacheNames = "mamakablari", allEntries = true)})
    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    @Cacheable(cacheNames = "mamakablari", key = "#id", unless = "#result == null")
    public MamaKabi findById(Long id) {
        Optional<MamaKabi> kab = this.repository.findById(id);
        if (kab.isPresent()) {
            return kab.get();
        }else{
            throw new ResourceNotFoundException("Mamakabi resource has not records");
        }
    }

    public List<MamaKabi> findAllAktif(){
        String hql = "Select mamakabi From MamaKabi mamakabi where mamakabi.durum = :durum";
        return entityManager.createQuery(hql).setParameter("durum", EnumDurumAP.AKTIF).getResultList();
    }

    public List<MamaKabi> findAllWithParam(EnumDurumAP durumAP, EnumKapTuru turu) {
        String hql = "Select mamakabi From MamaKabi mamakabi where mamakabi.durum = :durum and mamakabi.turu = :turu";
        return entityManager.createQuery(hql).setParameter("durum", durumAP).setParameter("turu", turu).getResultList();
    }
}
