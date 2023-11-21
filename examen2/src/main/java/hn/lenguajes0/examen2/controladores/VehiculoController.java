package hn.lenguajes0.examen2.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes0.examen2.modelos.Cliente;
import hn.lenguajes0.examen2.modelos.Vehiculos;
import hn.lenguajes0.examen2.servicios.impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {
    @Autowired
    public VehiculoServiceImpl vehiculoServiceImpl;

@PostMapping("/crear")
public Vehiculos crearVehiculo(@RequestBody Vehiculos nvoVehiculos){
    return this.vehiculoServiceImpl.CrearVehiculo(nvoVehiculos);
}

    @GetMapping("/todos")
public List <Vehiculos> ObtenerTodos(){
    return this.vehiculoServiceImpl.ObtenerTodos();
}

@GetMapping("/buscarID")
public Cliente BuscarVehiculoID(@RequestParam (name = "idVehiculo") int idVehiculo){
    return this.BuscarVehiculoID(idVehiculo);
}
}
