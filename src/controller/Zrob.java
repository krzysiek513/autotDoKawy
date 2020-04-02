package controller;

import controller.skladniki.Czekolada;
import controller.skladniki.Kawa;
import controller.skladniki.Mleko;
import model.Magazyn;
import view.UserInterface;

abstract class Zrob implements AutomatDoKawy {
    UserInterface userInterface;

    Czekolada skladnikCzekolada;
    Kawa skladnikKawa;
    Mleko skladnikMleko;

    Zrob(UserInterface userInterface){
        this.userInterface = userInterface;
    }

    @Override
    public void zrobKawe() {
        Magazyn magazyn = Magazyn.getInstance();
        skladnikCzekolada = new Czekolada(magazyn, userInterface);
        skladnikKawa = new Kawa(magazyn, userInterface);
        skladnikMleko = new Mleko(magazyn, userInterface);
    }

    @Override
    public void dodajCukier(boolean i) {
    }
}
