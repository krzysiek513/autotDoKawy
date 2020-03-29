package controller;

import controller.skladniki.Kawa;
import model.Magazyn;
import view.UserInterface;

abstract class Zrob implements AutomatDoKawy {
    UserInterface userInterface;

    //SkladnikCzekolada skladnikCzekolada;
    Kawa skladnikKawa;
    //SkladnikMleko skladnikMleko;
    private String cukier;

    Zrob(UserInterface userInterface){
        this.userInterface =userInterface;
    }

    @Override
    public void zrobKawe() {
        Magazyn magazyn = Magazyn.getInstance();
      //  skladnikCzekolada = new SkladnikCzekolada(magazyn, widokUzytkownika);
        skladnikKawa = new Kawa(magazyn, userInterface);
       // skladnikMleko = new SkladnikMleko(magazyn, widokUzytkownika);
    }

    @Override
    public void dodajCukier() {

    }
}
