package com.sinaukoding.tokosinau.controller;

import com.sinaukoding.tokosinau.entity.Supplier;
import com.sinaukoding.tokosinau.service.impl.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {
    @Autowired
    private SupplierServiceImpl service;

    @GetMapping("/find-all")
    public ResponseEntity<?> findAllData(){
        return new ResponseEntity<>(service.findAllData(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public  ResponseEntity<?>saveData(@RequestBody Supplier param){
        return new ResponseEntity<>(service.save(param), HttpStatus.OK);

    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?>updateData(@PathVariable Long id,
                                       @RequestBody Supplier param){
        Supplier data = service.update(param, id);

        if (data != null){
            return  new ResponseEntity<>(data, HttpStatus.OK);
        }
        else
        {
            return  new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }
    }
    @GetMapping("/find-by-id/{id}")
    public ResponseEntity<?>findById(@PathVariable Long id){
        return  new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?>deleteData(@PathVariable Long id){
        if (service.delete(id)){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }
    }
}
