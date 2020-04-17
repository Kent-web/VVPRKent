package com.company;

import java.time.LocalDateTime;


public abstract class Kadr implements IKadr {
    protected String FIO;
    protected int DR;
    protected boolean Pol;

    public void setFIO(String FIO) {this.FIO=FIO;}
    public void setDR(int DR) {
        int ov = LocalDateTime.now().getYear();
        if (DR < ov - 65|| DR > ov - 14) throw new IllegalArgumentException();
        this.DR=DR;
    }

    public void setPol(boolean Pol) {this.Pol=Pol;}
    public String getFIO() {return FIO;}
    public int getDR() {return DR;}
    public boolean getPol() {return Pol;}

}

