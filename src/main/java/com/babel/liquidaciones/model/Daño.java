package com.babel.liquidaciones.model;

import lombok.Data;

@Data
public class Daño {
    private Product producto;
    private Integer valorActual;
    private Integer valorAnterior;
    private Poliza poliza;

}
