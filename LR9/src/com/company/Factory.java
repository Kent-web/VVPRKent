package com.company;

public class Factory {
    public IKadr getCurrentKadr(String input) {
        IKadr kadr = null;
        if (input.equals("Сотрудник")) {
            kadr = new Sotrudnik();
        } else if (input.equals("Главбух")) {
            kadr = new MainBugh();
        } else if (input.equals("Директор")) {
            kadr = new Director();
        }
        return kadr;
    }
}