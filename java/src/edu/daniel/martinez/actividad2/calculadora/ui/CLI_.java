package edu.daniel.martinez.actividad2.calculadora.ui;

/**
 *  CLI se encarga de interactuar con el usuario que corra el programa dejandole ver los resultados y realizar las distintas operaciones
 * */

import edu.daniel.martinez.actividad2.calculadora.process.*;

import java.util.Scanner;

public class CLI_ {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("Bienvenid@ a tu calculadora");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Modulo");
            System.out.println("6 Potencia");
            System.out.println("7. Raiz");
            System.out.println("8. Logaritmo");
            System.out.println("9. salir");

            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese número positivo entero 1: ");
                    int a = scanner.nextInt();
                    System.out.print("Ingrese número positivo entero 2: ");
                    int b = scanner.nextInt();
                    System.out.println("Resultado: " + new Suma().realizarOperacion(a, b));
                }
                case 2 -> {
                    System.out.print("Ingrese número positivo entero 1: ");
                    int a = scanner.nextInt();
                    System.out.print("Ingrese número positivo entero 2: ");
                    int b = scanner.nextInt();
                    System.out.println("Resultado: " + new Resta().realizarOperacion(a, b));
                }
                case 3 -> {
                    System.out.print("Ingrese número positivo entero 1: ");
                    int a = scanner.nextInt();
                    System.out.print("Ingrese número positivo entero 2: ");
                    int b = scanner.nextInt();
                    System.out.println("Resultado: " + new Multiplicación().realizarOperacion(a, b));
                }
                case 4 -> {
                    System.out.print("Ingrese número positivo entero 1: ");
                    int a = scanner.nextInt();
                    System.out.print("Ingrese número positivo entero 2: ");
                    int b = scanner.nextInt();
                    System.out.println("Resultado: " + new División().realizarOperacion(a, b));
                }
                case 5 -> {
                    System.out.print("Ingrese número positivo entero 1: ");
                    int a = scanner.nextInt();
                    System.out.print("Ingrese número positivo entero 2: ");
                    int b = scanner.nextInt();
                    System.out.println("Resultado: " + new Modulo().realizarOperacion(a, b));
                }
                case 6 -> {
                    System.out.print("Ingrese número base: ");
                    int a = scanner.nextInt();
                    System.out.print("Ingrese número exponente: ");
                    int b = scanner.nextInt();
                    System.out.println("Resultado: " + new Potencia().realizarOperacion(a, b));
                }
                case 7 -> {
                    System.out.print("Ingrese número positivo entero: ");
                    int a = scanner.nextInt();
                    System.out.println("Resultado: " + new Raiz().realizarOperacion(a));
                }
                case 8 -> {
                    System.out.print("Ingrese número positivo entero: ");
                    int a = scanner.nextInt();
                    System.out.println("Resultado: " + new Logaritmo().realizarOperacion(a));
                }
                case 9 -> System.out.println("Adiós, vuelve pronto");
                default -> System.out.println("Opción inválida");
            }

        } while (opcion != 9);
    }
}
