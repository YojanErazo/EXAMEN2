package hn.lenguajes0.examen2.servicios.impl;

import org.springframework.stereotype.Service;

import hn.lenguajes0.examen2.modelos.TipoCliente;
import hn.lenguajes0.examen2.repositorios.TipoClienteRepositorio;
import hn.lenguajes0.examen2.servicios.TipoClienteService;
@Service
public class TipoClienteServiceImpl implements TipoClienteService {

private TipoClienteRepositorio tipoClienteRepositorio;
    @Override
    public TipoCliente CrearTipoCliente(TipoCliente nvoTipoCliente) {
        // TODO Auto-generated method stu
        TipoCliente tipocliente= this.tipoClienteRepositorio.save(nvoTipoCliente);
        return tipocliente;
    }
    
}
