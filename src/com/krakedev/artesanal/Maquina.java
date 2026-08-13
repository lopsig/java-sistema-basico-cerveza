package com.krakedev.artesanal;

public class Maquina {
    //ATRIBUTOS
    private String nombreCerveza;
    private String descripcionCerveza;
    private double precioPorMl;
    private double capacidadMaxima;
    private double cantidadActual;

    //GETTERS AND SETTERS
    public String getNombreCerveza() {
        return nombreCerveza;
    }

    public void setNombreCerveza(String nombreCerveza) {
        this.nombreCerveza = nombreCerveza;
    }

    public String getDescripcionCerveza() {
        return descripcionCerveza;
    }

    public void setDescripcionCerveza(String descripcionCerveza) {
        this.descripcionCerveza = descripcionCerveza;
    }

    public double getPrecioPorMl() {
        return precioPorMl;
    }

    public void setPrecioPorMl(double precioPorMl) {
        this.precioPorMl = precioPorMl;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    //CONSTRUCTORES
    public Maquina (String nombreCerveza, String descripcionCerveza, double precioPorMl, double capacidadMaxima) {
        this.nombreCerveza = nombreCerveza;
        this.descripcionCerveza = descripcionCerveza;
        this.precioPorMl = precioPorMl;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = 0; //valor por defecto
    }

    public Maquina (String nombreCerveza, String descripcionCerveza, double precioPorMl) {
        this.nombreCerveza = nombreCerveza;
        this.descripcionCerveza = descripcionCerveza;
        this.precioPorMl = precioPorMl;
        this.capacidadMaxima = 10000;
        this.cantidadActual = 0;

    }


    //METODOS
    public void imprimir () {
        String mensaje = "Nombre de Cerveza: " + nombreCerveza +
                ", Descripción: " + descripcionCerveza +
                ", Precio por ml: " + precioPorMl +
                ", Capacidad Máxima: " + capacidadMaxima +
                ", Cantidad Actual: " + cantidadActual;

        System.out.println(mensaje);
    }
}
