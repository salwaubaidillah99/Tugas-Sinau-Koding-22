package com.sinaukoding.tokosinau.service.impl;

import com.sinaukoding.tokosinau.entity.Pembeli;
import com.sinaukoding.tokosinau.entity.Supplier;
import com.sinaukoding.tokosinau.repository.PembeliRepository;
import com.sinaukoding.tokosinau.service.PembeliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PembeliServiceImpl implements PembeliService {

    @Autowired
    private PembeliRepository repository;

    @Override
    public Pembeli save(Pembeli param)
    {
        return repository.save(param);
    }

    @Override
    public List<Pembeli> findAllData()
    {
       return  repository.findAll();

    }
    @Override
    public Pembeli update(Pembeli param, Long id) {
        Pembeli data = repository.findById(id).orElse(null);

        if (data != null){
            data.setNama_pembeli(param.getNama_pembeli()== null ? data.getNama_pembeli() : param.getNama_pembeli());
            data.setJenis_kelamin(param.getJenis_kelamin()== null ? data.getJenis_kelamin() : param.getJenis_kelamin());
            data.setNo_telp(param.getNo_telp()== null ? data.getNo_telp() : param.getNo_telp());
            data.setAlamat(param.getAlamat()== null ? data.getAlamat() : param.getAlamat());

            return  repository.save(data);
        }
            return data;

    }
    @Override
    public Boolean delete(Long id) {
        Pembeli data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public Pembeli findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}


