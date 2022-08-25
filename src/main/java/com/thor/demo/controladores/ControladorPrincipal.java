/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thor.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author javor
 */
@Controller
public class ControladorPrincipal {
    
    @GetMapping("/")
    public String cargarPaginaPrincipal()    {
        return "index";
    } 
}
