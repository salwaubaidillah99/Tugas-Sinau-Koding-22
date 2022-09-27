package com.sinaukoding.tokosinau.service;

import com.sinaukoding.tokosinau.entity.Barang;
import com.sinaukoding.tokosinau.entity.Pembeli;

import java.util.List;

public interface BarangService {
    Barang save(Barang param);

    List<Barang> findAllData();

    Barang update(Barang param, Long id);

    Boolean delete(Long id);

    Barang findById(Long id);
}
