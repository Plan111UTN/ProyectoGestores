/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plan111.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Nicolas Oliva
 */
@Entity
@Table(name = "tb_localidad")
@Getter
@Setter
@NoArgsConstructor
public class Localidad implements Serializable
{        
    @Id
    @Column(name = "idLocalidad")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLocalidad;
    private String nombre;
    @OneToMany(mappedBy = "localidad")
    private Set<Barrio> listaBarrio = new HashSet<>();
}
