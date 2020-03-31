package controller;

import view.UserInterface;

public class ZrobMocha extends Zrob {
    public ZrobMocha(UserInterface userInterface) {
        super(userInterface);
    }

    @Override
    public void zrobKawe() {
        super.zrobKawe();
        boolean status = skladnikKawa.dodajSkladnik() && skladnikMleko.dodajSkladnik()&& skladnikCzekolada.dodajSkladnik();
        if(status) {
            userInterface.kawaGotowa("Mocha gotowa!");
        }
    }
}
