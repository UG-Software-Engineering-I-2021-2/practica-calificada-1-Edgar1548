package com.pc;

public class UserBioAlert {
    Lector lector;
    Libro libro;

    public void solicitalibro(Lector lectorsuscrito, Libro librosolitado){
        lector = lectorsuscrito;
        libro = librosolitado;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

}
