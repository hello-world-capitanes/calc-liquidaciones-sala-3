package com.babel.liquidaciones.services;

import com.babel.liquidaciones.model.Poliza;
import com.babel.liquidaciones.model.Siniestro;

import java.util.Date;
import java.util.List;

public class AltaSiniestro implements IAltaSiniestro {
    public Siniestro altaSiniestro(String causaSiniestro, Date fechaOcurrencia,
                                   List<String> dañosAfectados, String nombreCliente, Poliza poliza) {
        Siniestro siniestro = new Siniestro();
        siniestro.setCausa(causaSiniestro);
        siniestro.setFechaDeOcurrencia(fechaOcurrencia);
        siniestro.setDaños(dañosAfectados);
        siniestro.setPolizaAsociada(poliza);
        return siniestro;
    }

}
