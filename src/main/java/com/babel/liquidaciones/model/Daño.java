package com.babel.liquidaciones.model;

import lombok.Data;

@Data
public class Daño {
    private Integer valorActual;
    private Integer valorAnterior;
    private Poliza poliza;

}
