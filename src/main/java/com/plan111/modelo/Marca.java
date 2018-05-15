package com.plan111.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Matias Gomez
 */
@Entity
@Table(name="tb_marca")
@Getter @Setter @NoArgsConstructor
public class Marca implements Serializable 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMarca;
    @Column(unique = true)
    private String descripcion;

}
