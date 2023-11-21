package hn.lenguajes0.examen2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import hn.lenguajes0.examen2.modelos.Cliente;
import hn.lenguajes0.examen2.repositorios.ClienteRepositorio;
import hn.lenguajes0.examen2.servicios.ClienteService;
@Service
public class ClienteServiceImpl implements ClienteService{
@Autowired
private ClienteRepositorio clienteRepositorio;
    @Override
    public Cliente CrearCliente(Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CrearCliente'");
    }

    @Override
    public List<Cliente> ObtenerTodos() {
        // TODO Auto-generated method stub
        return this.clienteRepositorio.findAll();
    }

    @Override
    public Cliente BuscarClienteId(int codigoCliente) {
        // TODO Auto-generated method stub

        return this.clienteRepositorio.findById(codigoCliente).get();
    }

 


    
}
