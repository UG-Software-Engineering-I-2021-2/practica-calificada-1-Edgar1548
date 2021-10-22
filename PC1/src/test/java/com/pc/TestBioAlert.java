package com.pc;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestBioAlert {

    @Test()
    public void test01(){
        BioAlert bioAlertsystem = new BioAlert();
        Libro libro = new Libro();
        libro.setNombre("Paco Yunque");
        libro.setEdicion("decima");
        Lector lector = new Lector();
        lector.setName("Lucas");


    }
}
