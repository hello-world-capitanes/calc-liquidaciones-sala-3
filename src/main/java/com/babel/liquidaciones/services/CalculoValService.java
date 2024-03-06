package com.babel.liquidaciones.services;

import org.springframework.stereotype.Service;

@Service
public class CalculoValService implements ICalculoValService {

    @Override
    public int calcularPrimerRiesgo() {
        return 0;
    }

    @Override
    public int calcularReposicion() {
        return 0;
    }

    @Override
    public int calcularValorReal() {
        return 0;
    }
}
