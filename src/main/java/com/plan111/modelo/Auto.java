/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plan111.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Nicolas Oliva
 */
@Entity
@Table(name="tb_auto")
@Getter @Setter @NoArgsConstructor
public class Auto implements Serializable
{
    
    @Id
    @Column(name="idAuto")    
    private int idAuto;    
    @OneToOne
    @JoinColumn(name="idMotor")
    private TipoMotor motor;
    @OneToOne
    @JoinColumn(name="idModelo")
    private Modelo modelo;
    @OneToOne
    @JoinColumn(name="idMarca")
    private Marca marca;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicioFabricacion;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFinFabricacion;
    
}
