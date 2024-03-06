package com.babel.liquidaciones.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class SiniestrosService implements ISiniestrosService {
    @Override
    public void generarSiniestro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca a continuación los datos del siniestro: ");
        System.out.println("Código de Poliza: ");
        String codigoPoliza = sc.nextLine();
        System.out.println("Fecha de ocurrencia (dd/MM/YYYY): ");
        String fecha = sc.nextLine();
        Date fechaSiniestro = null;
        try {
            fechaSiniestro = procesarFecha(fecha);
        } catch (ParseException e) {
            throw new RuntimeException("Formato de fecha incorrecto");
        }

        System.out.println("Cause de origen del siniestro: ");
        String causaSiniestro = sc.nextLine();
        System.out.println("Listado de daños (código de productos separados por ';'): ");
        String listaDeDaños = sc.nextLine();
        // TODO procesar daños

    }

    private Date procesarFecha(String fecha) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.GERMAN);
        return formatter.parse(fecha);
    }
}
