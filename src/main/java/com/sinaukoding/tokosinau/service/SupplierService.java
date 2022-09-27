package com.sinaukoding.tokosinau.service;

import com.sinaukoding.tokosinau.entity.Supplier;

import java.util.List;

public interface SupplierService {
    Supplier save(Supplier param);

    List<Supplier>findAllData();

    Supplier update(Supplier param, Long id);

    Boolean delete(Long id);

    Supplier findById(Long id);
}
