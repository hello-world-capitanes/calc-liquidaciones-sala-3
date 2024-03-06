package com.babel.liquidaciones.services;

import com.babel.liquidaciones.model.Warranty;
import org.springframework.stereotype.Service;

@Service
public class CalculoValService implements ICalculoValService {

    @Override
    public int calcularPrimerRiesgo(Warranty warranty) {
        return 0;
    }

    @Override
    public int calcularReposicion(Warranty warranty) {
        return 0;
    }

    @Override
    public int calcularValorReal(Warranty warranty) {
        return 0;
    }
}
