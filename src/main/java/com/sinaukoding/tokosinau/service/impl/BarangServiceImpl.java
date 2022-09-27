package com.sinaukoding.tokosinau.service.impl;

import com.sinaukoding.tokosinau.entity.Barang;
import com.sinaukoding.tokosinau.entity.Pembeli;
import com.sinaukoding.tokosinau.repository.BarangRepository;
import com.sinaukoding.tokosinau.repository.PembeliRepository;
import com.sinaukoding.tokosinau.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarangServiceImpl implements BarangService {

    @Autowired
    private BarangRepository repository;

    @Override
    public Barang save(Barang param)
    {
        return repository.save(param);
    }

    @Override
    public List<Barang> findAllData()
    {
        return  repository.findAll();

    }
    @Override
    public Barang update(Barang param, Long id) {
        Barang data = repository.findById(id).orElse(null);

        if (data != null){
            data.setNama_barang(param.getNama_barang()== null ? data.getNama_barang() : param.getNama_barang());
            data.setHarga(param.getHarga()== null ? data.getHarga() : param.getHarga());
            data.setStok(param.getStok()== null ? data.getStok() : param.getStok());



            return  repository.save(data);
        }
        return data;

    }
    @Override
    public Boolean delete(Long id) {
        Barang data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public Barang findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}



