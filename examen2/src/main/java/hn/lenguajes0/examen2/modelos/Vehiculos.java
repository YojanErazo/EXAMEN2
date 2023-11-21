package hn.lenguajes0.examen2.modelos;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "vehiculo")
@NoArgsConstructor
@AllArgsConstructor
public class Vehiculos {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idVehiculo;

    private String marca;
    private int anio;
    private boolean disponible;

@ManyToOne
 @JoinColumn(name = "idTipoVehiculo", referencedColumnName="idTipoVehiculo")
    private TipoVehiculo tipoVehiculo;

}
