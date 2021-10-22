package com.pc;

import java.util.List;
public class BioAlert {
    List<UserBioAlert> lectoressuscritos;

    public void ingresarusuario(Lector lector, Libro libro){
        UserBioAlert user = new UserBioAlert();
        user.solicitalibro(lector, libro);
        lectoressuscritos.add(user);
    }

    public String informarusuario(Libro libronuevo){
        for (UserBioAlert lectorsuscrito : lectoressuscritos) {
            if (lectorsuscrito.getLibro() == libronuevo){
                return lectorsuscrito.getLector().getName() + " el libro " + lectorsuscrito.getLibro().getNombre() + " "+ lectorsuscrito.getLibro().getEdicion() + " edicion esta disponible";
            }
        }
        return "";
    }
}
