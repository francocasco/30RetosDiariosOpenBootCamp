package com.segcom.manejo.string.nombres;

public class Principal {
    
    
    

    public static void main(String[] args) {
        String nombre1 = "José Martínez Pérez";
        String nombre2 = "José Maria Pérez";
        String nombre3 = "José";
        String[] nombresDePila= {"José","Maria","Pablo","Ricardo"};
        
        Nombre nombreCompleto1 = new Nombre(nombre1,nombresDePila);
        nombreCompleto1.mostrarNombreCompleto();
        System.out.println("--------");
        Nombre nombreCompleto2 = new Nombre(nombre2,nombresDePila);
        nombreCompleto2.mostrarNombreCompleto();
        System.out.println("--------");
        Nombre nombreCompleto3 = new Nombre(nombre3,nombresDePila);
        nombreCompleto3.mostrarNombreCompleto();
    }
}
