package com.pc;

import java.util.logging.Logger;

public class Main {
    static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        BioAlert bioAlertsystem = new BioAlert();
        Libro libro = new Libro();
        libro.setNombre("Paco Yunque");
        Lector lector = new Lector();
        lector.setName("Lucas");
        bioAlertsystem.ingresarusuario(lector, libro);
        bioAlertsystem.informarusuario(libro);

    }
}
