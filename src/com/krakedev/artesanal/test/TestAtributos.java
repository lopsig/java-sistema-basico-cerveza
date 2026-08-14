package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestAtributos {
    public static void main(String[] args) {
        //INSTANCIAS
        Maquina rubia = new Maquina("001", "Pilsener", "La cerveza del pueblo", 0.02, 9000);

        rubia.imprimir();

        rubia.setNombreCerveza("Golden Ale");
        rubia.setDescripcionCerveza("Cerveza Artesanal");
        rubia.imprimir();
    }
}
