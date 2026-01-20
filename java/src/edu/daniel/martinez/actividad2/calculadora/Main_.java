package edu.daniel.martinez.actividad2.calculadora;

import edu.daniel.martinez.actividad2.calculadora.ui.CLI_;

import java.util.Scanner;

/**
 *  Este Main corre el programa
 * */

public class Main_ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        CLI_ cli = new CLI_();
        cli.start();

    }
}
