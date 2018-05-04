/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plan111.modelo;

import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Nicolas Oliva
 */
@Getter @Setter @NoArgsConstructor
public class Auto 
{
    private int idAuto;
    private TipoMotor motor;
    private Modelo modelo;
    private Marca marca;
    private Date fechaInicioFabricacion;
    private Date fechaFinFabricacion;
    
}
