package com.babel.liquidaciones.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Siniestro {
    private Poliza polizaAsociada;
    private Date fechaDeOcurrencia;
    private String causa;
    private List<Daño> daños;

    public Daño getDaño(int index){
        return daños.get(index);
    }

}
