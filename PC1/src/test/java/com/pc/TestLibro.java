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
        Assert.assertEquals(libro.getAnio(), 2010);
        Assert.assertEquals(libro.getNombre(), "Lucas");
        Assert.assertEquals(libro.getAutornombre(), "Marquez");
        Assert.assertEquals(libro.getEstado(), "prestada");
        Assert.assertEquals(libro.getIdentificador(), "12345");
        Assert.assertEquals(libro.getAutorfechanacimiento(), "12-03-1993");
    }

}
