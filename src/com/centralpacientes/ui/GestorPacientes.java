package com.centralpacientes.ui;

import java.util.Scanner;
import com.centralpacientes.models.Paciente;
import com.centralpacientes.data.ListaPacientes;

public class GestorPacientes {
    private ListaPacientes listaPacientes;
    private Scanner scanner;

    public GestorPacientes() {
        listaPacientes = new ListaPacientes();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion = -1;
        while (opcion != 0) {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            switch (opcion) {
                case 1:
                    agregarPaciente();
                    break;
                case 2:
                    mostrarPacientes();
                    break;
                case 3:
                    buscarPaciente();
                    break;
                case 4:
                    eliminarPaciente();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("1. Agregar Paciente");
        System.out.println("2. Mostrar Pacientes");
        System.out.println("3. Buscar Paciente");
        System.out.println("4. Eliminar Paciente");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void agregarPaciente() {
        System.out.print("ID del Paciente: ");
        String id = scanner.nextLine();
        System.out.print("Nombre del Paciente: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad del Paciente: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Género del Paciente: ");
        String genero = scanner.nextLine();
        System.out.print("Dirección del Paciente: ");
        String direccion = scanner.nextLine();
        System.out.print("Teléfono del Paciente: ");
        String telefono = scanner.nextLine();
        System.out.print("Historial Médico del Paciente: ");
        String historialMedico = scanner.nextLine();
        
        Paciente nuevoPaciente = new Paciente(id, nombre, edad, genero, direccion, telefono, historialMedico);
        listaPacientes.agregarPaciente(nuevoPaciente);
        System.out.println("Paciente agregado exitosamente.");
    }

    private void mostrarPacientes() {
        System.out.println("Lista de Pacientes:");
        listaPacientes.mostrarPacientes();
    }

    private void buscarPaciente() {
        System.out.print("Ingrese el ID del paciente: ");
        String id = scanner.nextLine();
        Paciente paciente = listaPacientes.buscarPaciente(id);
        if (paciente != null) {
            System.out.println("Paciente encontrado: " + paciente);
        } else {
            System.out.println("Paciente no encontrado.");
        }
    }

    private void eliminarPaciente() {
        System.out.print("Ingrese el ID del paciente que desea eliminar: ");
        String id = scanner.nextLine();
        if (listaPacientes.eliminarPaciente(id)) {
            System.out.println("Paciente eliminado exitosamente.");
        } else {
            System.out.println("Paciente no encontrado.");
        }
    }
}
