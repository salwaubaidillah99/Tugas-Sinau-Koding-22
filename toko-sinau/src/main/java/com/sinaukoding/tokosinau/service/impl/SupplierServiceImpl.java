package com.sinaukoding.tokosinau.service.impl;

import com.sinaukoding.tokosinau.entity.Supplier;
import com.sinaukoding.tokosinau.repository.SupplierRepository;
import com.sinaukoding.tokosinau.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepository repository;

    @Override
    public Supplier save(Supplier param) {
        return repository.save(param);
    }

    @Override
    public List<Supplier> findAllData() {
        return repository.findAll();
    }

    @Override
    public Supplier update(Supplier param, Long id) {
        Supplier data = repository.findById(id).orElse(null);

        if (data != null) {
            data.setNama_supplier(param.getNama_supplier() == null ? data.getNama_supplier() : param.getNama_supplier());
            data.setNoTelp(param.getNoTelp() != null ? param.getNoTelp() : data.getNoTelp());
            data.setAlamat(param.getAlamat() != null ? param.getAlamat() : data.getAlamat());

            return repository.save(data);
        }

        return data;
    }

    @Override
    public Boolean delete(Long id) {
        Supplier data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public Supplier findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}

