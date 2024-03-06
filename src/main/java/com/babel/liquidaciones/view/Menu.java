package com.babel.liquidaciones.view;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Menu {

    private Scanner scanner;
    private boolean isInSession;

    public Menu(){
        this.scanner = new Scanner(System.in);
        this.isInSession = true;
    }

    public void startSession(){
        inicioMenu();

        while(isInSession){
            inicioMenu();
        }
    }

    private void inicioMenu(){
        System.out.println("Bienvenido, elija la acción que desea realizar: ");
        System.out.println("1. Acción 1");
        System.out.println("2. Salir");
        creacionAcciones();
    }

    private void creacionAcciones(){
        String option = scanner.nextLine();
        switch (option){
            case "1":
                break;
            case "2":
                this.isInSession = false;
                break;
            default:
                break;
        }
    }

}
