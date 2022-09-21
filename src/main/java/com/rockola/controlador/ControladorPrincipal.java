/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rockola.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControladorPrincipal {
    
    @GetMapping("/")
    public String cargarIndex() {
        return "index";
    }
    
    @GetMapping("/login")
    public String iniciarSesion() {
        return "login";
    }
}
