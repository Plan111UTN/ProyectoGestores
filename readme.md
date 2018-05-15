```java
@Entity
@Table(name="tb_area")
@Getter @Setter @NoArgsConstructor

public class Area implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idArea;
    
    @Column(name="Nombre")
    private String nombre;
}
```

`@Entity` Indica a hibernate que es una entidad.

`@Table(name="tb_area")` Indica el nombre de la tabla en la base de datos

`@Getter @Setter` Son anotaciones de lombok, que generan los getters and setter automaticamente 

`@NoArgsConstructor` No se especifíca un constructor.

`@Id` Indica el identificador del objeto en la base de datos.

`@GeneratedValue(strategy = GenerationType.AUTO)` Genera los Id de forma autoincremental en la base de datos.

`@Column(name="Nombre")` Nombre de la columna en la base de datos. Si no ingresa el parametro `name`, toma por defecto el nombre del atributo.