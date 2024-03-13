package com.babel.liquidaciones.services;

import com.babel.liquidaciones.model.Dano;

public interface ICalculoValService {
    public Double calcularPrimerRiesgo(Dano daño);
    public Double calcularReposicion(Dano daño);
    public Double calcularValorReal(Dano daño);
}
