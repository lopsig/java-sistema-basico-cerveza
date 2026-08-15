package com.krakedev.artesanal.testJUnit;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Negocio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAsignarCodigoCliente {
    @Test
    public void asignarCodigo(){
        Negocio barDeMoe = new Negocio();
        Cliente jonathan = new Cliente("Jonathan", "17014768188");
        Cliente nataly = new Cliente("Nataly", "17016568181");

        barDeMoe.asignarCodigoCliente(jonathan);
        barDeMoe.asignarCodigoCliente(nataly);

        assertEquals(100, jonathan.getCodigo());
        assertEquals(101, nataly.getCodigo());
    }
}
