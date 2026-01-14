package edu.daniel.martinez.actividad1.ui;

import edu.daniel.martinez.actividad1.process.Switch;

public class CLI {
    public static void start(){
        Switch switch_wifi = new Switch();
        System.out.println("bienvenido al programa");
        System.out.println("el switch esta"+switch_wifi.is0n());
        if(switch_wifi.is0n()){
            System.out.println("desea apagar el switch");
        }else {
            System.out.println("desea prender el switch");
        }
        System.out.println("el switch esta "+switch_wifi.is0n());
    }
}