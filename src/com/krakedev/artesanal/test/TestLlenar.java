package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestLlenar {
    public static void main(String[] args) {
        //INSTANCIA
        Maquina rubia = new Maquina("Club", "Excelente sabor", 0.02, 8000);
        Maquina negra = new Maquina("Minotauro", "Cerveza Stout", 0.03);
        rubia.imprimir();


        // LLAMAR METODOS
        rubia.llenarMaquina();
        rubia.imprimir();

        negra.imprimir();
        negra.llenarMaquina();
        negra.imprimir();


    }
}
