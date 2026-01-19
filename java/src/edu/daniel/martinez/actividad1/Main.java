package edu.daniel.martinez.actividad1;

import edu.daniel.martinez.actividad1.ui.CLI;
import java.util.Scanner;

/**
 * En este Main es donde se va a correr el código
 * */

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        CLI cli = new CLI();
        cli.start();
    }
}
