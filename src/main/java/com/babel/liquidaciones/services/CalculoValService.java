package com.babel.liquidaciones.services;

import com.babel.liquidaciones.model.Siniestro;
import com.babel.liquidaciones.model.Warranty;
import org.springframework.stereotype.Service;

@Service
public class CalculoValService implements ICalculoValService {

    @Override
    public int calcularPrimerRiesgo(Siniestro siniestro) {
        int importeDamage = 0;
        for(int i=0; i < siniestro.getDaños().size(); i++){
            importeDamage += siniestro.getDaño(i).getValorAnterior();
        }

        return 0;
    }

    @Override
    public int calcularReposicion(Siniestro siniestro) {
        int importeDamage = 0;
        for(int i=0; i < siniestro.getDaños().size(); i++){
            importeDamage += siniestro.getDaño(i).getValorActual();
        }

        return importeDamage;
    }

    @Override
    public int calcularValorReal(Siniestro siniestro) {
        return 0;
    }
}
