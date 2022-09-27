package com.sinaukoding.tokosinau.service;

import com.sinaukoding.tokosinau.entity.Pembeli;
import com.sinaukoding.tokosinau.entity.Supplier;

import java.util.List;

public interface PembeliService {

    Pembeli save(Pembeli param);

    List<Pembeli> findAllData();

    Pembeli update(Pembeli param, Long id);

    Boolean delete(Long id);

    Pembeli findById(Long id);

}
