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
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Guido Cavallo
 */

@Entity
@Table(name="tb_tipoMotor")
@Getter @Setter @NoArgsConstructor
public class TipoMotor {
    @Id
    private int idTipoMotor;
    @Column(name="descripcion")
    private String descripcion;

    public int getIdTipoMotor() {
        return idTipoMotor;
    }

    public void setIdTipoMotor(int idTipoMotor) {
        this.idTipoMotor = idTipoMotor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
