package hn.lenguajes0.examen2.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipocliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoCliente {
@Id 
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int idTipoCliente;

private String descripcion;

@JsonIgnore
@OneToMany (mappedBy = "tipoCliente", cascade = CascadeType.ALL)
private List<Cliente> cliente = new ArrayList<>();

    
}
