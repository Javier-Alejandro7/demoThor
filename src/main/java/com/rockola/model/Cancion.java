/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rockola.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author garciamvasquez
 */
@Entity
@Table (name="cancion")
public class Cancion implements Serializable {
    
    @Id
    @Column (name="id")
    private Integer id;
    
    @Column (name="nombre")
    private String nombre;
    
    @Column (name="vinculo")
    private String vinculo;
    
    @ManyToOne
    @JoinColumn (name="id_artista")
    private Artista artista;
    
    @ManyToOne
    @JoinColumn (name="id_disco")
    private Disco disco;
    
    @ManyToOne
    @JoinColumn (name="id_genero")
    private Genero genero;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Disco getDisco() {
        return disco;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
