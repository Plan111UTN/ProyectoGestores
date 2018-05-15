package com.plan111.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idAuto")    
    private int idAuto;    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idMotor")
    private TipoMotor motor;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idModelo")
    private Modelo modelo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idMarca")
    private Marca marca;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicioFabricacion;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFinFabricacion;
    
}
