package hn.lenguajes0.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes0.examen2.modelos.Reservas;

public interface ReservaRepositorio extends JpaRepository<Reservas, Integer> {
    
}
