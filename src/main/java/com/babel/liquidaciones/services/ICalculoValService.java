package com.babel.liquidaciones.services;

import com.babel.liquidaciones.model.Siniestro;
import com.babel.liquidaciones.model.Warranty;

public interface ICalculoValService {
    public int calcularPrimerRiesgo(Siniestro siniestro);
    public int calcularReposicion(Siniestro siniestro);
    public int calcularValorReal(Siniestro siniestro);
}
