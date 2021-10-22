package com.pc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLibro {
    @Test()
    public void test01(){
        Libro libro = new Libro();
        libro.setNombre("Lucas");
        libro.setEdicion("decima");
        libro.setAnio(2010);
        libro.setIdentificador("12345");
        libro.setAutornombre("Marquez");
        libro.setAutorfechanacimiento("12-03-1993");
        libro.setEstado("prestada");

    }

}
