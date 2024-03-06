package com.babel.liquidaciones.services;

import com.babel.liquidaciones.model.Daño;
import com.babel.liquidaciones.model.Poliza;
import com.babel.liquidaciones.model.Siniestro;

import java.util.Date;
import java.util.List;

public interface IAltaSiniestro {

    public Siniestro altaSiniestro(String causaSiniestro, Date fechaOcurrencia, List<Daño> dañosAfectados,
                                   String nombreCliente, Poliza poliza);

}
