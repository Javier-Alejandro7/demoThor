/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rockola.dao;

import com.rockola.model.Artista;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author garciamvasquez
 */
public interface ArtistaDao extends CrudRespository<Artista, Integer> {
    
}
