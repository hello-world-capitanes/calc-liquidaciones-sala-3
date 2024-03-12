package com.babel.liquidaciones.services;

import com.babel.liquidaciones.model.Daño;
import com.babel.liquidaciones.model.Siniestro;
import com.babel.liquidaciones.model.Warranty;

public interface ICalculoValService {
    public Double calcularPrimerRiesgo(Daño daño);
    public Double calcularReposicion(Daño daño);
    public Double calcularValorReal(Daño daño);
}
