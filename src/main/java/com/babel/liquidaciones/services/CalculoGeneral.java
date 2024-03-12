package com.babel.liquidaciones.services;

import com.babel.liquidaciones.model.*;
import org.springframework.stereotype.Service;

@Service
public class CalculoGeneral implements ICalculoGeneral {

    private ICalculoValService calculoValService;

    public CalculoGeneral(ICalculoValService calculoValService) {
        this.calculoValService = calculoValService;
    }

    @Override
    public void calcular(Siniestro siniestro) {
        //Se comprueba si la garantía está excluida
        //a. En caso de exclusión la liquidación es 0.
        double liquidación = 0;
        for (Daño daño : siniestro.getDaños()) {
            for (ProductWarranty productWarranty : daño.getProducto().getProductWarranties()) {
                Warranty warranty = productWarranty.getWarranty();
                if (!productWarranty.isExcluded()) {
                    liquidación += productWarranty.getCapitalInsured();
                }
                //2.	Se calcula el importe a liquidar en función del tipo de valoración
                if (productWarranty.getPaymentType().equals(PaymentType.PRIMER_RIESGO)) {
                    liquidación += this.calculoValService.calcularPrimerRiesgo(siniestro);
                } else if (productWarranty.getPaymentType().equals(PaymentType.REPOSICION_NUEVO)) {
                    liquidación += this.calculoValService.calcularReposicion(siniestro);
                } else {
                    liquidación += this.calculoValService.calcularValorReal(siniestro);
                }
                //3.	Se calcula el importe a liquidar en función del tipo de aseguramiento (tomando como entrada el importe calculado en punto 2)
                if (warranty.getWarrantyType().equals(WarrantyType.BUILDING)) {

                } else if (warranty.getWarrantyType().equals(WarrantyType.CONTENT)) {

                }
                //4.	Se aplica la regla de infraseguro
            }

        }

    }
}
