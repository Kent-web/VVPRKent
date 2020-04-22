package com.company;

public class MainBugh  extends Rukovodstvo implements IKadr {
    protected boolean OneC ;
    protected String Otdel ;
    protected String FinanceControl;
    public MainBugh(){}
    public void setOneC (boolean OneC ) {this.OneC =OneC ;}
    public void setOtdel (String Otdel) {this.Otdel=Otdel;}
    public void setFinanceControl(String FinanceControl) {this.FinanceControl=FinanceControl;}

    public boolean getOneC() {return OneC;}
    public String getOtdel() {return Otdel;}
    public String getFinanceControl() {return FinanceControl;}
    public String getProfession(){return "Главбух";}

    public int getZP(){ if (OneC) return 40000  + Premia; else return 50000  + Premia;}

    public String toString () {
        String str = "";
        str += " Главбух " + FIO + " " + DR + " года рождения ";
        if (Pol) str += " Мужчина ";
        else str += " Женщина ";
        str += " время работы " + TimeWork + " премия: "+ Premia ;
        str += " работа способность коллектива: "+WorkStaffAbility;
        if(OneC) str+=" Знает 1C ";
        else str +=" Не знает 1C ";
        str += " работает в отделе: "+ Otdel;
        str +=" отдел выполняет работу на "+FinanceControl;
        return str;
    }

    public String toString2(){
        return " Главбух " + FIO + "\t" + DR+ "\t"+ Pol+ "\t"+ TimeWork+ "\t"+ Premia+ "\t"+WorkStaffAbility+ "\t"+ OneC+ "\t"+ Otdel+ "\t"+FinanceControl;
    }
    public MainBugh(String FIO, int DR, boolean Pol, int TimeWork, int Premia, String WorkStaffAbility,
                    boolean OneC, String Otdel, String FinanceControl) {
        this.FIO = FIO; this.DR = DR; this.Pol = Pol; this.TimeWork = TimeWork; this.Premia = Premia;
        this.WorkStaffAbility = WorkStaffAbility; this.OneC = OneC; this.Otdel = Otdel; this.FinanceControl = FinanceControl;
    }
}
