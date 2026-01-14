package edu.daniel.martinez.actividad1.process;

public class Switch {
    private boolean is0n;

    public void prenderSwitch() {
        this.is0n = true;
    }

    public void apagarSwitch(){
        this.is0n = false;
    }

    public boolean is0n(){
        return this.is0n;
    }
}
