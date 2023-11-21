package hn.lenguajes0.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes0.examen2.modelos.TipoVehiculo;
import hn.lenguajes0.examen2.repositorios.TipoVehiculoRepositorio;
import hn.lenguajes0.examen2.servicios.TipoVehiculoService;
@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService {

    @Autowired
    private TipoVehiculoRepositorio tipoVehiculoRepositorio;
    @Override
    public TipoVehiculo CrearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        // TODO Auto-generated method stub
        TipoVehiculo nTipoVehiculo= this.tipoVehiculoRepositorio.save(tipoVehiculo);
     return nTipoVehiculo;   
    }
    
}
