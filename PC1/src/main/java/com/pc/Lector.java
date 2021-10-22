package com.pc;

import java.util.List;

public class Lector {
    String name = "";
    int cantidadlibros = 0;
    List<LibroPrestado> libros;
    int deuda;

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantidadlibros() {
        return cantidadlibros;
    }

    public void setCantidadlibros(int cantidadlibros) {
        this.cantidadlibros = cantidadlibros;
    }

}
