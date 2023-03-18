package com.mehmetnuri.kapbul.service;

import com.mehmetnuri.kapbul.entity.MamaKabi;
import com.mehmetnuri.kapbul.exceptions.ResourceNotFoundException;
import com.mehmetnuri.kapbul.repository.MamaKabiRepository;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@CacheConfig(cacheNames = "mamakabiCache")
public class MamaKabiService {

    private final MamaKabiRepository repository;

    public MamaKabiService(MamaKabiRepository repository) {
        this.repository = repository;
    }

    @Cacheable(cacheNames = "mamakablari")
    public ResponseEntity<List<MamaKabi>> findAll() {
        return ResponseEntity.ok(this.repository.findAll());
    }

    @Cacheable(cacheNames = "mamakablari", key = "#id", unless = "#result == null")
    public ResponseEntity<MamaKabi> findById(Long id) {
        Optional<MamaKabi> kab = this.repository.findById(id);
        if (kab.isPresent()) {
            return ResponseEntity.ok(kab.get());
        }else{
            throw new ResourceNotFoundException("Mamakabi resource has not records");
        }
    }
}
