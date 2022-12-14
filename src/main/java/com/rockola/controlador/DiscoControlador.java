/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rockola.controlador;

import com.rockola.model.Disco;
import com.rockola.service.DiscoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author garciamvasquez
 */

@RestController
@CrossOrigin("*")
@RequestMapping("/disco")
public class DiscoControlador {

    @Autowired
    private DiscoService discoservice;

    @PostMapping(value = "/")
    public ResponseEntity<Disco> agregar(@RequestBody Disco artista) {
        Disco obj = discoservice.save(artista);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Disco> eliminar(@PathVariable Integer id) {
        Disco obj = discoservice.findById(id);
        if (obj != null) {
            discoservice.delete(id);
        } else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @PutMapping(value = "/")
    public ResponseEntity<Disco> editar(@RequestBody Disco disco) {
        Disco obj = discoservice.findById(disco.getId());
        if (obj != null) {
            obj.setNombre(disco.getNombre());
            discoservice.save(obj);
        } else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @GetMapping("/list")
    public List<Disco> consultarTodo() {
        return discoservice.findAll();
    }

    @GetMapping("/list/{id}")
    public Disco consultaPorId(@PathVariable Integer id) {
        return discoservice.findById(id);
    }
    
}
