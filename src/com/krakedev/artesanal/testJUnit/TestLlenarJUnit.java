package com.krakedev.artesanal.testJUnit;

import com.krakedev.artesanal.Maquina;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestLlenarJUnit {

    @Test
    public void testLlenarMaquina () {
        Maquina rubia = new Maquina("Pilsener", "Cerveza", 0.02, 8000);
        rubia.llenarMaquina();

        assertEquals(7900, rubia.getCantidadActual(), 0.0001);



    }
}