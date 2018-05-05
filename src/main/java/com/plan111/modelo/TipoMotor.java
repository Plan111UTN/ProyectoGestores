/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plan111.modelo;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Guido Cavallo
 */

@Entity
@Table(name="tb_area")
@Getter
@Setter
@NoArgsConstructor
public class TipoMotor {
    @id
    private int idTipoMotor;
    @Column(name="descripcion")
    private String descripcion;
}
