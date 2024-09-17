package com.centralpacientes.models;

public class Paciente {
    private String id;
    private String nombre;
    private int edad;
    private String genero;
    private String direccion;
    private String telefono;
    private String historialMedico;

    public Paciente(String id, String nombre, int edad, String genero, String direccion, String telefono, String historialMedico) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.historialMedico = historialMedico;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    @Override
    public String toString() {
        return "Paciente [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", genero=" + genero +
               ", direccion=" + direccion + ", telefono=" + telefono + ", historialMedico=" + historialMedico + "]";
    }
}
