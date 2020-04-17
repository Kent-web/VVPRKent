package com.company;


public class Sotrudnik extends Kadr implements IKadr {
    protected String Spec;
    protected int Stag;
    protected String Position;
public Sotrudnik(){}
    public void setSpec(String Spec) {this.Spec=Spec;}
    public void setStag(int Stag) {
        if (Stag < 0) throw new IllegalArgumentException();
        this.Spec=Spec;
    }
    public void setPosition(String Position) {this.Position=Position;}

    public String getSpec() {return Spec;}
    public int getStag() {return Stag;}
    public String getPosition() {return Position;}
    public int getZP() {return 10000 + Stag * 2000;}
    public String getProfession(){return "Сотрудник";}

    public String toString (){
        String str = "";
        str +=" Сотрудник "+FIO+" "+DR+" года рождения ";
        if (Pol) str+=" Мужчина "; else str+=" Женщина ";
        str+=" работает уже "+ Stag+" лет ";
        str+=" имеет должность " + Position + " работает по специальности "+Spec;
    return str;
    }

    public String toString2() {
        return " Сотрудник " + FIO + "\t" + DR + "\t" + Pol + "\t" + Spec + "\t" + Stag + "\t" + Position;
    }

    public Sotrudnik(String FIO, int DR, boolean Pol, String Spec, int Stag, String Position) {
        this.FIO = FIO; this.DR = DR; this.Pol = Pol;
        this.Spec = Spec; this.Stag = Stag; this.Position = Position;
    }
}
