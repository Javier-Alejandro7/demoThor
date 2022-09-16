/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rockola.service.implement;

import com.rockola.dao.ArtistaDao;
import com.rockola.model.Artista;
import com.rockola.service.ArtistaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author garciamvasquez
 */
@Service
public class ArtistaServiceImpl implements ArtistaService {

    @Autowired
    private ArtistaDao artistaDao;

    @Override
    @Transactional(readOnly = false)
    public Artista save(Artista artista) {
        return artistaDao.save(artista);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        artistaDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Artista findById(Integer id) {
        return artistaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Artista> findAll() {
        return (List<Artista>) artistaDao.findAll();
    }

}
