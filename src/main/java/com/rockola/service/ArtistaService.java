/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rockola.service;

import com.rockola.model.Artista;
import java.util.List;

/**
 *
 * @author garciamvasquez
 */
public interface ArtistaService {
    
    public Artista save(Artista artista);
    
    public void delete(Integer id);
    
    public Artista findById (Integer id);
    
    public List<Artista> findAll();
    
}
