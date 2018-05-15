package com.plan111.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Guido
 */

@Entity
@Table(name="tb_tipoMotor")
@Getter @Setter @NoArgsConstructor
public class TipoMotor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTipoMotor;

    @Column(name="descripcion")
    private String descripcion;
}
