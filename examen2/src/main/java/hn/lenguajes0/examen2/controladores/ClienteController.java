package hn.lenguajes0.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import hn.lenguajes0.examen2.modelos.Cliente;
import hn.lenguajes0.examen2.modelos.TipoCliente;
import hn.lenguajes0.examen2.servicios.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
  @Autowired
  public ClienteServiceImpl clienteServiceImpl;


@PostMapping("/crear")
public Cliente crearCliente(@RequestBody Cliente nvoCliente){
    return this.clienteServiceImpl.CrearCliente(nvoCliente);

}

@GetMapping("/todos")
public List <Cliente> ObtenerTodos(){
    return this.clienteServiceImpl.ObtenerTodos();
}

@GetMapping("/buscarID")
public Cliente BuscarClienteId(@RequestParam (name = "codigoCliente") int codigoCliente){
    return this.clienteServiceImpl.BuscarClienteId(codigoCliente);
}


}


