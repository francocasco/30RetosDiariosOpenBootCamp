package com.segcom.manejo.string.nombres;

import java.util.Arrays;

public class Nombre {

    String nombre;
    String apellido1;
    String apellido2;

    public Nombre(String nombreCompleto, String[] nombresDePila) {
        String[] nombreCompuesto = nombreCompleto.split(" ");
        for (String parteNombre : nombreCompuesto) {
            if (Arrays.asList(nombresDePila).contains(parteNombre)) {
                if (nombre!=null) {
                    nombre+=" ";
                    nombre += parteNombre;
                } else {
                    nombre = parteNombre;
                }
            } else if (apellido1==null) {
                apellido1 = parteNombre;
            } else {
                apellido2 = parteNombre;
            }
        }
    }

    public String[] getNombreCompleto() {
        String[] nombreCompleto = {this.nombre, this.apellido1, this.apellido2};
        return nombreCompleto;
    }

    public void mostrarNombreCompleto() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido1: "+apellido1);
        System.out.println("Apellido2: "+apellido2);
    }
}
