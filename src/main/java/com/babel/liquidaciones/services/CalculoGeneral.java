package com.babel.liquidaciones.services;

import com.babel.liquidaciones.model.Daño;
import com.babel.liquidaciones.model.Poliza;
import com.babel.liquidaciones.model.Siniestro;
import com.babel.liquidaciones.model.Warranty;

public class CalculoGeneral implements ICalculoGeneral {
    @Override
    public void calcular(Siniestro siniestro) {
        //Se comprueba si la garantía está excluida
        //a. En caso de exclusión la liquidación es 0.
        for (Daño daño : siniestro.getDaños()) {

        }
    }
}
