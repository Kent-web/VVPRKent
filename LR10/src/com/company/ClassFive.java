package com.company;

import org.junit.Test;

public class ClassFive {
    public static int calculateSotrudnikZP(int staj)
    {
        Sotrudnik ds = new Sotrudnik("", 0, false, "", 0,
                "") ;
        return  ds.getZP();
    }

    public static int calculateMainBughOneC(Boolean OneC)
    {
        MainBugh dr = new MainBugh("", 0, false, 0, 0,
                "",  OneC, "", "");
        return  dr.getZP();
    }

    public static int calculateDirectorPremia(int Premia)
    {
        Director dr = new Director("", 0, false, 0, Premia,
                "",  false, "", false);
        return  dr.getZP();
    }
}
