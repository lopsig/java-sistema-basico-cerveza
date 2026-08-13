package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestRecargar {
    public static void main(String[] args) {
        boolean resultado;

        Maquina rubia = new Maquina("Club", "Excelente sabor", 0.02, 8000);
        System.out.println("--------ESTADO INICIAL---------");
        rubia.imprimir();

        System.out.println("--------RECARGA 1---------");
        resultado = rubia.recargarCerveza(3000);
        System.out.println("Se recargó correctamente? " + resultado);
        rubia.imprimir();

        System.out.println("--------RECARGA 2---------");
        resultado = rubia.recargarCerveza(2000);
        System.out.println("Se recargó correctamente? " + resultado);
        rubia.imprimir();

        System.out.println("--------RECARGA 3---------");
        resultado = rubia.recargarCerveza(3000);
        System.out.println("Se recargó correctamente? " + resultado);
        rubia.imprimir();


    }
}
