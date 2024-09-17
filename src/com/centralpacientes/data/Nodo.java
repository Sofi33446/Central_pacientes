package com.centralpacientes.data;

import com.centralpacientes.models.Paciente;

public class Nodo {
    private Paciente paciente;
    private Nodo siguiente;

    public Nodo(Paciente paciente) {
        this.paciente = paciente;
        this.siguiente = null;  // Al crearse, el nodo no apunta a otro nodo.
    }

    // Getters y setters
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
