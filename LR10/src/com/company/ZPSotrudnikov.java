package com.company;

public class ZPSotrudnikov implements InterfaceFactory {

    @Override
    public InterfaceMainBugh getMainBugh() {
        return new MainBugh();
    }

    @Override
    public InterfaceSotrudnik getSotrudnik() {
        return new Sotrudnik();
    }

    @Override
    public InterfaceDirector getDirector() {
        return new Director();
    }
}
