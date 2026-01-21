package edu.daniel.martinez.actividad2.calculadora;

import edu.daniel.martinez.actividad2.calculadora.ui.CLI;

import java.util.Scanner;

/**
 *  Este Main corre el programa
 * */

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        CLI cli = new CLI();
        cli.start();

    }
}
