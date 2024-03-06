package com.babel.liquidaciones.services;

import com.babel.liquidaciones.model.Warranty;

public interface ICalculoValService {
    public int calcularPrimerRiesgo(Warranty warranty);
    public int calcularReposicion(Warranty warranty);
    public int calcularValorReal(Warranty warranty);
}
