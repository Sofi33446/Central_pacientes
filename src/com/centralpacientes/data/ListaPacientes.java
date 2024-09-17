package com.centralpacientes.data;

import com.centralpacientes.models.Paciente;

public class ListaPacientes {
    private Nodo cabeza;

    public ListaPacientes() {
        this.cabeza = null;
    }

    // Método para agregar paciente al final de la lista
    public void agregarPaciente(Paciente paciente) {
        Nodo nuevoNodo = new Nodo(paciente);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    // Método para eliminar paciente por ID
    public boolean eliminarPaciente(String id) {
        if (cabeza == null) {
            return false;
        }

        if (cabeza.getPaciente().getId().equals(id)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }

        Nodo actual = cabeza;
        while (actual.getSiguiente() != null && !actual.getSiguiente().getPaciente().getId().equals(id)) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            return true;
        }
        return false;
    }

    // Método para buscar un paciente por ID
    public Paciente buscarPaciente(String id) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getPaciente().getId().equals(id)) {
                return actual.getPaciente();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    // Método para mostrar todos los pacientes
    public void mostrarPacientes() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getPaciente());
            actual = actual.getSiguiente();
        }
    }
}
