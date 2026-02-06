package edu.daniel.martinez.actividad2.v2.calculadora.ui;

import edu.daniel.martinez.actividad2.v2.calculadora.calculadora.Calculadora;
import java.util.Scanner;

public class CLI {
    private Scanner scanner;
    private Calculadora calculadora;

    public CLI() {
        scanner = new Scanner(System.in);
        calculadora = new Calculadora();
    }

    public void iniciar() {
        int opcion;

        do {
            System.out.println("Bienvenid@ a su calculadora");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Modulo");
            System.out.println("6. Potencia");
            System.out.println("7. Logaritmo");
            System.out.println("8. Raiz");
            System.out.println("0. Salir");
            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();
            if (opcion == 0) {
                System.out.println("Bye, vuelva pronto");
                break;
            }
            System.out.print("Ingrese el primer numero entero: ");
            int a = scanner.nextInt();

            System.out.print("Ingrese el segundo numero entero: ");
            int b = scanner.nextInt();

            calculadora.setOperacion(opcion);
            int resultado = calculadora.calcular(a, b);

            System.out.println("Resultado: " + resultado);
        } while (true);
    }
}