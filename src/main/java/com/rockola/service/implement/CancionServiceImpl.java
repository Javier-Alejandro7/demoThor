/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rockola.service.implement;

import com.rockola.dao.CancionDao;
import com.rockola.model.Cancion;
import com.rockola.service.CancionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author garciamvasquez
 */

@Service
public class CancionServiceImpl implements CancionService {

    @Autowired
    private CancionDao cancionDao;

    @Override
    @Transactional(readOnly = false)
    public Cancion save(Cancion cancion) {
        return cancionDao.save(cancion);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        cancionDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Cancion findById(Integer id) {
        return cancionDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cancion> findAll() {
        return (List<Cancion>) cancionDao.findAll();
    }
    
}
