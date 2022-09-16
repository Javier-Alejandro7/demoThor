/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rockola.service;

import com.rockola.model.Cancion;
import java.util.List;

/**
 *
 * @author garciamvasquez
 */
public interface CancionService {
    
    public Cancion save(Cancion cancion);
    
    public void delete(Integer id);
    
    public Cancion findById (Integer id);
    
    public List<Cancion> findAll();
    
}
