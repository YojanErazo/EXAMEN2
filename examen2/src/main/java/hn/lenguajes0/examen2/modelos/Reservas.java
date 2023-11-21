package hn.lenguajes0.examen2.modelos;

import java.sql.Date;

import jakarta.annotation.Generated;
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
@Table(name="reserva")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservas {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idReserva;

    private int dias;
    private Date fecha;
    private double total;

    private Cliente cliente;
    private Vehiculos vehiculo;


}
