package hn.lenguajes0.examen2.servicios;

import java.util.List;

import hn.lenguajes0.examen2.modelos.Cliente;
import hn.lenguajes0.examen2.modelos.Vehiculos;

public interface VehiculoService {
    
    public Vehiculos CrearVehiculo(Vehiculos vehiculo);

    public List<Vehiculos> ObtenerTodos();

    public List <Vehiculos> BuscarClienteId(int codigoCliente);
}
