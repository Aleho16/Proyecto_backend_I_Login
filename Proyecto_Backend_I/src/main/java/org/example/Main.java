package org.example;

import java.sql.ResultSet;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;


        System.out.println("1. Registrar\n2. Login");
        opcion = sc.nextInt();
        sc.nextLine();


        if (opcion == 1) {
            System.out.print("Usuario: ");
            String u = sc.nextLine();
            System.out.print("Password: ");
            String p = sc.nextLine();
            UsuarioCrud.registrar(new Usuario(u, p));
        } else {
            System.out.print("Usuario: ");
            String u = sc.nextLine();
            System.out.print("Password: ");
            String p = sc.nextLine();


            ResultSet rs = UsuarioCrud.login(u);
            if (rs.next() && rs.getBoolean("activo") && rs.getString("password").equals(p)) {
                System.out.println("Login correcto");
                ProductoCrud.listar();
            } else {
                System.out.println("Login incorrecto");
            }
        }
    }
}