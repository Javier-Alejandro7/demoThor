/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rockola.service;

import com.rockola.model.Disco;
import java.util.List;

/**
 *
 * @author garciamvasquez
 */
public interface DiscoService {
    
    public Disco save(Disco disco);
    
    public void delete(Integer id);
    
    public Disco findById (Integer id);
    
    public List<Disco> findAll();
    
}
