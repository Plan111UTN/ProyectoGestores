/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plan111.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Nicolas Oliva
 */
@Entity
@Table(name="tb_calle")
@Getter @Setter @NoArgsConstructor
public class Calle implements Serializable{
    @Id
    @Column(name="idCalle")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCalle;
    private String nombre;  
    @ManyToOne
    private Barrio barrio;
}
