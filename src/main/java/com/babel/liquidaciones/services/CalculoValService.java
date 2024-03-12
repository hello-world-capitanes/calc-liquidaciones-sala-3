package com.babel.liquidaciones.services;

import com.babel.liquidaciones.model.Daño;
import com.babel.liquidaciones.model.Siniestro;
import org.springframework.stereotype.Service;

@Service
public class CalculoValService implements ICalculoValService {

    private final Double DEPRECIACION = 0.0;
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
    public Double calcularReposicion(Daño daño) {
        return daño.getWarranty().getCapitalInsured();
    }

    @Override
    public Double calcularValorReal(Daño daño) {
        Double capitalInsured = daño.getWarranty().getCapitalInsured();

        return 0.0;
    }
}
