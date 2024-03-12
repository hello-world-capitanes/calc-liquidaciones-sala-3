package com.babel.liquidaciones.services;

import com.babel.liquidaciones.model.Daño;
import com.babel.liquidaciones.model.Siniestro;
import com.babel.liquidaciones.model.Warranty;
import org.springframework.stereotype.Service;

@Service
public class CalculoValService implements ICalculoValService {

    private Siniestro siniestro;

    public CalculoValService(Siniestro siniestro){
        this.siniestro = siniestro;
    }

    @Override
    public Double calcularPrimerRiesgo(Daño daño) {
        Double capitalInsured = daño.getWarranty().getCapitalInsured();

        Double liquidacionASumar = Math.min(capitalInsured, this.siniestro.getPolizaAsociada().getImporteCapitalesContratados());
        return liquidacionASumar;
    }

    @Override
    public Double calcularReposicion(Warranty warranty) {
        return 0.0;
    }

    @Override
    public Double calcularValorReal(Warranty warranty) {
        return 0.0;
    }
}
