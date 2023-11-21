package hn.lenguajes0.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes0.examen2.modelos.TipoCliente;

public interface TipoClienteRepositorio extends JpaRepository<TipoCliente, Integer> {
    
}
