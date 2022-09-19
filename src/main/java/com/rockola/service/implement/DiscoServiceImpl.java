/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rockola.service.implement;

import com.rockola.dao.DiscoDao;
import com.rockola.model.Disco;
import com.rockola.service.DiscoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author garciamvasquez
 */

@Service
public class DiscoServiceImpl implements DiscoService{

    @Autowired
    private DiscoDao discoDao;

    @Override
    @Transactional(readOnly = false)
    public Disco save(Disco disco) {
        return discoDao.save(disco);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        discoDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Disco findById(Integer id) {
        return discoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Disco> findAll() {
        return (List<Disco>) discoDao.findAll();
    }
    
}
