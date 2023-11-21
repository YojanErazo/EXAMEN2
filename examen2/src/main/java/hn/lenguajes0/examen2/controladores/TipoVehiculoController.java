package hn.lenguajes0.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import hn.lenguajes0.examen2.modelos.TipoVehiculo;
import hn.lenguajes0.examen2.servicios.impl.TipoClienteServiceImpl;
import hn.lenguajes0.examen2.servicios.impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/api/tipovehiculo")
public class TipoVehiculoController {
    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/crear")
    public TipoVehiculo crearTipo(@RequestBody TipoVehiculo nvoTipo ) {
        //TODO: process POST request
     return this.tipoVehiculoServiceImpl.CrearTipoVehiculo(nvoTipo);
    
}
}
