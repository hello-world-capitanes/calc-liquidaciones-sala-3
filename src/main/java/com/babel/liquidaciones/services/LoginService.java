package com.babel.liquidaciones.services;

import com.babel.liquidaciones.model.example.BaseData;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class LoginService {

    private BaseData data;

    public LoginService(BaseData baseData){
        this.data = baseData;
    }

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Contraseña: ");
        String contraseña = sc.nextLine();

    }

    private boolean isUserPasswordCorrect(){

    }

}
