package hn.lenguajes0.examen2.modelos;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name="cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int codigoCliente;

    private String nombre;
        private String apellido;
       private Date fechaIngreso;
@JsonIgnore
@ManyToOne
@JoinColumn(name = "idTipoCliente", referencedColumnName="idTipoCliente")
private TipoCliente tipoCliente;    





}
