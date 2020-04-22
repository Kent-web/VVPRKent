package com.company;

public abstract class Rukovodstvo extends Kadr implements IKadr {
    protected int TimeWork;
    protected int Premia;
    protected String WorkStaffAbility;

    public void setTimeWork(int TimeWork) {
        if (TimeWork < 0) throw new IllegalArgumentException();
        this.TimeWork=TimeWork;
    }
    public void setPremia(int Premia) {
        if (Premia < 0) throw new IllegalArgumentException();
        this.Premia=Premia;
    }
    public void setWorkStaffAbility(String WorkStaffAbility) {this.WorkStaffAbility=WorkStaffAbility;}

    public int getTimeWork() {return TimeWork;}
    public int getPremia() {return Premia;}
    public String getWorkStaffAbility() {return WorkStaffAbility;}

}
