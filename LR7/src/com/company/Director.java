package com.company;

public class Director extends Rukovodstvo implements IKadr {
    protected boolean OwnCar ;
    protected String StatRabot;
    protected boolean Seal;

    public void setOwnCar (boolean OwnCar ) {this.OwnCar =OwnCar ;}
    public void setStatRabot(String StatRabot) {this.StatRabot=StatRabot;}
    public void setSeal(Boolean Seal) {this.Seal=Seal;}

    public boolean getOwnCar() {return OwnCar;}
    public String getStatRabot() {return StatRabot;}
    public Boolean getSeal() {return Seal;}

    public int getZP() {return 75000 + Premia;}
    public String getProfession(){return "Директор";}
    public Director(){}
    public String toString () {
        String str = " ";
        str += " Директор " + FIO + " " + DR + " года рождения ";
        if (Pol) str += " Мужчина ";
        else str += " Женщина ";
        str += " время работы " + TimeWork + " премия: " + Premia;
        str += " работа способность коллектива: " + WorkStaffAbility;
        if (OwnCar) str+= " Да ";
        else str +=  " нет ";
        str+=" Персонал работает на " + StatRabot;
        if (Seal) str+= " печать поставлена ";
        else str += " печать не поставлена ";
        return str;
    }
    public String toString2() {
        return " Директор " + FIO + "\t" + DR + "\t" + Pol + "\t" + TimeWork + "\t" + Premia + "\t" + WorkStaffAbility + "\t" + OwnCar + "\t" + StatRabot + "\t" + Seal;
    }
    public Director(String FIO, int DR, boolean Pol, int TimeWork, int Premia, String WorkStaffAbility,
                    boolean OwnCar, String StatRabot, boolean Seal) {
        this.FIO = FIO; this.DR = DR; this.Pol = Pol; this.TimeWork = TimeWork; this.Premia = Premia;
        this.WorkStaffAbility = WorkStaffAbility; this.OwnCar = OwnCar; this.StatRabot = StatRabot; this.Seal = Seal;
    }
}
