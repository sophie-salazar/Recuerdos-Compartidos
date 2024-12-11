/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recuerdoscompartidos;

import java.util.ArrayList;
import java.util.Scanner;

public class RecuerdosCompartidos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos del chico
        System.out.println("Nombre del chico: ");
        String participante1 = scanner.nextLine();
        System.out.println("Ingrese sus recuerdos " + participante1 + " (separados por comas):");
        String[] recuerdos1 = scanner.nextLine().split(",");
        
        // Limpiar espacios en blanco
        for (int i = 0; i < recuerdos1.length; i++) {
            recuerdos1[i] = recuerdos1[i].trim();
        }

        // Ingreso de datos de la chica
        System.out.println("Nombre de la chica: ");
        String participante2 = scanner.nextLine();
        System.out.println("Ingrese sus recuerdos " + participante2 + " (separados por comas):");
        String[] recuerdos2 = scanner.nextLine().split(",");

        // Limpiar espacios en blanco
        for (int i = 0; i < recuerdos2.length; i++) {
            recuerdos2[i] = recuerdos2[i].trim();
        }

        // Mostrar los recuerdos de cada participante
        System.out.println("\nRecuerdos de " + participante1 + ":");
        mostrarRecuerdos(recuerdos1);

        System.out.println("\nRecuerdos de " + participante2 + ":");
        mostrarRecuerdos(recuerdos2);

        // Crear una lista para almacenar los recuerdos combinados
        ArrayList<String> recuerdosCombinados = new ArrayList<>();

        // Selección de recuerdos a combinar
        System.out.println("\nElige los recuerdos que deseas combinar:");
        System.out.println("Selecciona los recuerdos de " + participante1 + " (separados por comas):");
        String[] seleccionados1 = scanner.nextLine().split(",");
        
        for (int i = 0; i < seleccionados1.length; i++) {
            seleccionados1[i] = seleccionados1[i].trim();
        }

        System.out.println("Selecciona los recuerdos de " + participante2 + " (separados por comas):");
        String[] seleccionados2 = scanner.nextLine().split(",");
        
        for (int i = 0; i < seleccionados2.length; i++) {
            seleccionados2[i] = seleccionados2[i].trim();
        }

        // Agregar recuerdos seleccionados a la lista de recuerdos combinados
        for (String recuerdo : seleccionados1) {
            if (!recuerdosCombinados.contains(recuerdo)) {
                recuerdosCombinados.add(recuerdo);
            }
        }
        
        for (String recuerdo : seleccionados2) {
            if (!recuerdosCombinados.contains(recuerdo)) {
                recuerdosCombinados.add(recuerdo);
            }
        }

        // Mostrar los recuerdos combinados
        System.out.println("\nRecuerdos combinados:");
        if (recuerdosCombinados.isEmpty()) {
            System.out.println("No se combinaron recuerdos.");
        } else {
            for (String recuerdo : recuerdosCombinados) {
                System.out.println("- " + recuerdo);
            }
        }

        scanner.close();
    }

    // Método para mostrar los recuerdos
    public static void mostrarRecuerdos(String[] recuerdos) {
        for (String recuerdo : recuerdos) {
            System.out.println("- " + recuerdo);
        }
    }
}