package hn.lenguajes0.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes0.examen2.modelos.Cliente;
import hn.lenguajes0.examen2.modelos.TipoCliente;
import hn.lenguajes0.examen2.servicios.impl.TipoClienteServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/tipocliente")
public class TipoClienteController {
    
    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/crear")
    public TipoCliente crearTipo(@RequestBody TipoCliente nvoTipo ) {
        //TODO: process POST request
        if(nvoTipo.getCliente()!=null){
            for( Cliente cliente : nvoTipo.getCliente()){
                cliente.setTipoCliente(nvoTipo);
            }
       
    }
     return this.tipoClienteServiceImpl.CrearTipoCliente(nvoTipo);
    
}
}