package com.krakedev.artesanal.testJUnit;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.Negocio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConsumoCliente {
    @Test
    public void probarConsumo () {
        Maquina maquinaA = new Maquina("0112","Red Ipa", "Cerveza Roja", 0.002, 8000);
        Negocio barDeMoe =  new Negocio("Bar de Moe", maquinaA);
        Cliente jonathan = new Cliente("Jonathan", "1721476818");
        Cliente nataly = new Cliente("Nataly", "178746818");

        barDeMoe.cargarMaquinaA();
        barDeMoe.consumirCervezaMaquinaA(jonathan, 100);

        assertEquals(7700, maquinaA.getCantidadActual());
        assertEquals(0.2, jonathan.getTotalConsumido());

        barDeMoe.consumirCervezaMaquinaA(jonathan, 200);
        assertEquals(7500, maquinaA.getCantidadActual(), 0.0001);
        assertEquals(0.6, jonathan.getTotalConsumido(), 0.0001);


    }
}
