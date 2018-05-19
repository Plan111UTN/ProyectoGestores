package com.plan111.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author User
 */
@Entity
@Table(name="tb_modelo")
@Getter @Setter @NoArgsConstructor
public class Modelo implements Serializable
{
    @Id
    @Column(name="idModelo")
    private int idModelo;
    @Column(name="Descripcion")
    private String descripcion;
    
}
