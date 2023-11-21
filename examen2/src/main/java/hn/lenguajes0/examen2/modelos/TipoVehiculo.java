package hn.lenguajes0.examen2.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table (name = "tipovehiculo")
@AllArgsConstructor
@NoArgsConstructor
public class TipoVehiculo {
@Id 
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int idTipoVehiculo;

private String descripcion;

private double precioXhora;
}
