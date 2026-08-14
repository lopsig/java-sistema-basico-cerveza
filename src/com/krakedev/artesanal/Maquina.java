package com.krakedev.artesanal;

public class Maquina {
    //ATRIBUTOS
    private String nombreCerveza;
    private String descripcionCerveza;
    private double precioPorMl;
    private double capacidadMaxima;
    private double cantidadActual;
    private String codigo;

    //GETTERS AND SETTERS
    public String getCodigo() {
        return codigo;
    }

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
    public Maquina (String codigo, String nombreCerveza, String descripcionCerveza, double precioPorMl, double capacidadMaxima) {
        this.codigo = codigo;
        this.nombreCerveza = nombreCerveza;
        this.descripcionCerveza = descripcionCerveza;
        this.precioPorMl = precioPorMl;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = 0; //valor por defecto
    }

    public Maquina (String codigo, String nombreCerveza, String descripcionCerveza, double precioPorMl) {
        this.codigo = codigo;
        this.nombreCerveza = nombreCerveza;
        this.descripcionCerveza = descripcionCerveza;
        this.precioPorMl = precioPorMl;
        this.capacidadMaxima = 10000;
        this.cantidadActual = 0;

    }


    //METODOS
    public void imprimir () {
        String mensaje = "Código: " + codigo +
                "Nombre de Cerveza: " + nombreCerveza +
                ", Descripción: " + descripcionCerveza +
                ", Precio por ml: " + precioPorMl +
                ", Capacidad Máxima: " + capacidadMaxima +
                ", Cantidad Actual: " + cantidadActual;

        System.out.println(mensaje);
    }

    public void llenarMaquina () {
        this.cantidadActual = this.capacidadMaxima - 100;
    }

    public boolean recargarCerveza (double cantidad) {
        double limitePermitido = capacidadMaxima - 100;

        if (cantidadActual + cantidad <= limitePermitido) {
            cantidadActual = cantidad + cantidadActual;
            return true;
        } else {
          return false;
        }
    }

    public double servirCerveza (double cantidad) {
        if (cantidadActual >= cantidad ) {
            cantidadActual = cantidadActual - cantidad;
            double valor = cantidad * precioPorMl;
            return valor;
        } else {
            return 0;
        }
    }


}
