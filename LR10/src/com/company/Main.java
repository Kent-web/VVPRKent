package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InterfaceFactory ifactory  = new ZPSotrudnikov();
        InterfaceDirector dir= ifactory.getDirector();
        System.out.println(dir.getDirectorRate());
        System.out.println();

        ArrayList<IKadr> mas = new ArrayList<IKadr>();

        FileReader fr = new FileReader("out.txt");
        Scanner s = new Scanner(fr);
        s.nextLine();


        while (s.hasNextLine()) {
            String[] str = s.nextLine().split("\t");



            if (str[0].equals("Сотрудник")) {
                mas.add((IKadr) ifactory.getSotrudnik());
                mas.set(mas.size() - 1, new Sotrudnik(str[1], Integer.parseInt(str[2]), Boolean.parseBoolean(str[3]),
                        str[4], Integer.parseInt(str[5]), str[6]));
            }

            if (str[0].equals("Главбух")) {
                mas.add((IKadr) ifactory.getMainBugh());
                mas.set(mas.size() - 1, new MainBugh(str[1], Integer.parseInt(str[2]), Boolean.parseBoolean(str[3]),
                        Integer.parseInt(str[4]), Integer.parseInt(str[5]), str[6],
                        Boolean.parseBoolean(str[7]), str[8], str[9]));
            }

            if (str[0].equals("Директор")) {
                mas.add((IKadr) ifactory.getDirector());
                mas.set(mas.size() - 1, new Director(str[1], Integer.parseInt(str[2]), Boolean.parseBoolean(str[3]),
                        Integer.parseInt(str[4]), Integer.parseInt(str[5]), str[6],
                        Boolean.parseBoolean(str[7]), str[8], Boolean.parseBoolean(str[9])));
            }
             // System.out.println(str[0]);
             //System.out.println(mas.get(mas.size()-1).getProfession());
        }
        fr.close();

        for (int i = 0; i < mas.size(); i++) System.out.println(mas.get(i).toString());
    }
}


