/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rockola.service;

import com.rockola.model.Genero;
import java.util.List;

/**
 *
 * @author garciamvasquez
 */

public interface GeneroService {
    
    public Genero save(Genero genero);
    
    public void delete(Integer id);
    
    public Genero findById (Integer id);
    
    public List<Genero> findAll();
    
}
