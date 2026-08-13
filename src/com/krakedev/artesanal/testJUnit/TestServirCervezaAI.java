package com.krakedev.artesanal.testJUnit;

import com.krakedev.artesanal.Maquina;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServirCervezaAI {

    // Tolerancia para la comparación de números decimales (double)
    private static final double DELTA = 0.001;

    @Test
    public void testServirCervezaSuficienteCervezaConstructor4Parametros() {
        // Valida que cuando la máquina tiene suficiente cerveza disponible:
        // 1. Descuente la cantidad servida de la cantidad actual.
        // 2. Retorne el valor a pagar correcto (cantidad * precioPorMl).
        // Se utiliza el constructor de 4 parámetros.

        // Configuración
        Maquina maquina = new Maquina("IPA", "Cerveza artesanal IPA", 0.05, 5000.0);
        maquina.recargarCerveza(1000.0); // Cantidad actual = 1000.0 ml

        double cantidadAServir = 300.0;
        double precioEsperado = 300.0 * 0.05; // 15.0
        double cantidadActualEsperada = 1000.0 - 300.0; // 700.0

        // Ejecución
        double valorPagado = maquina.servirCerveza(cantidadAServir);

        // Verificación
        assertEquals(precioEsperado, valorPagado, DELTA, "El valor a pagar retornado debe ser cantidad * precioPorMl");
        assertEquals(cantidadActualEsperada, maquina.getCantidadActual(), DELTA, "La cantidad actual debe disminuir en la cantidad servida");
    }

    @Test
    public void testServirCervezaSuficienteCervezaConstructor3Parametros() {
        // Valida el funcionamiento correcto al servir cerveza cuando se utiliza el constructor de 3 parámetros.

        // Configuración
        Maquina maquina = new Maquina("Stout", "Cerveza artesanal negra", 0.04);
        maquina.llenarMaquina(); // Carga la máquina con capacidadMaxima - 100 (9900.0 ml)

        double cantidadInicial = maquina.getCantidadActual();
        double cantidadAServir = 500.0;
        double precioEsperado = 500.0 * 0.04; // 20.0
        double cantidadActualEsperada = cantidadInicial - 500.0;

        // Ejecución
        double valorPagado = maquina.servirCerveza(cantidadAServir);

        // Verificación
        assertEquals(precioEsperado, valorPagado, DELTA, "El valor a pagar retornado debe ser correcto para el constructor de 3 parámetros");
        assertEquals(cantidadActualEsperada, maquina.getCantidadActual(), DELTA, "La cantidad actual debe descontar los ml servidos");
    }

    @Test
    public void testServirCervezaInsuficienteCerveza() {
        // Valida que si la máquina no tiene suficiente cerveza para cubrir la solicitud:
        // 1. No debe modificar la cantidad actual.
        // 2. Debe retornar 0 como valor a pagar.

        // Configuración
        Maquina maquina = new Maquina("Pilsner", "Cerveza rubia", 0.03, 3000.0);
        maquina.recargarCerveza(200.0); // Cantidad actual = 200.0 ml

        double cantidadAServir = 500.0; // Se solicitan más ml de los disponibles
        double cantidadActualInicial = maquina.getCantidadActual();

        // Ejecución
        double valorPagado = maquina.servirCerveza(cantidadAServir);

        // Verificación
        assertEquals(0.0, valorPagado, DELTA, "Debe retornar 0 cuando la máquina no tiene suficiente cerveza");
        assertEquals(cantidadActualInicial, maquina.getCantidadActual(), DELTA, "La cantidad actual de la máquina no debe ser modificada");
    }

    @Test
    public void testServirCervezaCantidadExactaDisponible() {
        // Valida el caso límite donde la cantidad a servir es exactamente igual a la cantidad actual disponible.

        // Configuración
        Maquina maquina = new Maquina("Red Ale", "Cerveza roja", 0.06, 2000.0);
        maquina.recargarCerveza(400.0); // Cantidad actual = 400.0 ml

        double cantidadAServir = 400.0;
        double precioEsperado = 400.0 * 0.06; // 24.0

        // Ejecución
        double valorPagado = maquina.servirCerveza(cantidadAServir);

        // Verificación
        assertEquals(precioEsperado, valorPagado, DELTA, "Debe permitir servir si la cantidad a servir es exactamente igual a la cantidad disponible");
        assertEquals(0.0, maquina.getCantidadActual(), DELTA, "La cantidad actual debe quedar en 0.0 ml");
    }

    @Test
    public void testServirCervezaConMaquinaVacia() {
        // Valida que al intentar servir en una máquina con 0 ml de cerveza:
        // 1. Retorne 0.
        // 2. Mantenga la cantidad actual en 0.

        // Configuración
        Maquina maquina = new Maquina("Wheat", "Cerveza de trigo", 0.05, 1000.0);
        // No se realiza recarga, por defecto cantidadActual es 0.0

        // Ejecución
        double valorPagado = maquina.servirCerveza(100.0);

        // Verificación
        assertEquals(0.0, valorPagado, DELTA, "Debe retornar 0 al intentar servir de una máquina vacía");
        assertEquals(0.0, maquina.getCantidadActual(), DELTA, "La cantidad actual debe mantenerse en 0");
    }
}


//PROMPT IA
/*
Te voy a compartir un clase Java llamada Maquina.

Quiero que generes una clase de pruebas unitarias con JUnit 5 para el método:

public double servirCerveza (double cantidad)



IMPORTANTE:

No construyas la prueba basandote en el codigo interno del método.

Construye los casos de prueba basandote en esta descripcion funcional:

        - el metodo recibe la cantidad en mililitros que el cliente quiere servir

- si la maquina tiene suficiente cerveza disponible, debe restar esa cantidad de la cantidad actual

- si logra servir correctamente debe retornar el valor a pagar

- el valor a pagar se calcula multiplicando la cantidad servida por el precio por mililitro

- si la maquina no tiene suficiente cerveza, no debe servir nada

- si no sirve nada, no debe modificar la cantidad actual

- si no sirve nada, deber retornar 0



REQUISITOS:

        - usa los dos constructores de la clase

- construye todos los casos de prueba importantes

- incluye comentarios explicando que valida cada caso

- usa unicamente los constructores, getters y metodos realmente disponibles en la clase

- no inventes metodos que no existen

- usa assertEquals cuando corresponda

- como se trabaja con valores double, usa una tolerancia en los asserts

- nombra la clase de prueba como TestServirCervezaAI



Aqui esta la clase Maquina:*/
