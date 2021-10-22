package com.pc;

public class Libro {
    private String nombre = "";
    private String autornombre = "";
    private String autorfechanacimiento = "";
    private int anio = 0;
    private String edicion = "";
    private String estado = "";
    private String identificador = "";

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if ( (!estado.equals("reservada")) && (!estado.equals("prestada")) && (!estado.equals("retraso"))){
            return ;
        }
        this.estado = estado;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutornombre() {
        return autornombre;
    }

    public void setAutornombre(String autornombre) {
        this.autornombre = autornombre;
    }

    public String getAutorfechanacimiento() {
        return autorfechanacimiento;
    }

    public void setAutorfechanacimiento(String autorfechanacimiento) {
        this.autorfechanacimiento = autorfechanacimiento;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
