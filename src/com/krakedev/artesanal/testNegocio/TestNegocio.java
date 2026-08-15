package com.krakedev.artesanal.testNegocio;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.Negocio;

public class TestNegocio {
    public static void main(String[] args) {
        //INSTANCIA
        Maquina nueva = new Maquina("1537","Red Ipa", "Cerveza artesanal roja", 0.02, 8000);
        Negocio negocio1 = new Negocio("Mi Negocio", nueva);

        System.out.println("Nombre: " +negocio1.getNombre() );
        System.out.println("Máquina: " +negocio1.getMaquinaA() );

        Maquina m1 = negocio1.getMaquinaA();
        double capacidad = m1.getCapacidadMaxima();

    }
}
