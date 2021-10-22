package com.pc;

public class LibroPrestado {
    int diaspretado;
    Libro libro;
    public int deudactual(){
        if (diaspretado>30) return 0;
        else return (diaspretado-30)/2;
    }

    public int getDiaspretado() {
        return diaspretado;
    }

    public void setDiaspretado(int diaspretado) {
        this.diaspretado = diaspretado;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
