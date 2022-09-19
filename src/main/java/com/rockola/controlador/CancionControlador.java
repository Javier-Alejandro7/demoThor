/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rockola.controlador;

import com.rockola.model.Cancion;
import com.rockola.service.CancionService;
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
@RequestMapping("/cancion")
public class CancionControlador {

    @Autowired
    private CancionService cancionservice;

    @PostMapping(value = "/")
    public ResponseEntity<Cancion> agregar(@RequestBody Cancion cancion) {
        Cancion obj = cancionservice.save(cancion);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Cancion> eliminar(@PathVariable Integer id) {
        Cancion obj = cancionservice.findById(id);
        if (obj != null) {
            cancionservice.delete(id);
        } else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @PutMapping(value = "/")
    public ResponseEntity<Cancion> editar(@RequestBody Cancion cancion) {
        Cancion obj = cancionservice.findById(cancion.getId());
        if (obj != null) {
            obj.setGenero(cancion.getGenero());
            cancionservice.save(obj);
        } else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @GetMapping("/list")
    public List<Cancion> consultarTodo() {
        return cancionservice.findAll();
    }

    @GetMapping("/list/{id}")
    public Cancion consultaPorId(@PathVariable Integer id) {
        return cancionservice.findById(id);
    }
    
}
