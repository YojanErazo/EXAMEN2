package hn.lenguajes0.examen2.servicios;

import hn.lenguajes0.examen2.modelos.Cliente;
import hn.lenguajes0.examen2.modelos.TipoCliente;
import java.util.List;
public interface ClienteService {

    public Cliente  CrearCliente(Cliente cliente);
    
    public List<Cliente> ObtenerTodos();

    public Cliente BuscarClienteId(int codigoCliente);

}
