package controller;

import view.UserInterface;

public class ZrobAmericano extends Zrob {
    public ZrobAmericano(UserInterface userInterface) {
        super(userInterface);
    }

    @Override
    public void zrobKawe() {
        super.zrobKawe();
        boolean status = skladnikKawa.dodajSkladnik() && skladnikKawa.dodajSkladnik() && skladnikMleko.dodajSkladnik();
        if (status){
            userInterface.kawaGotowa("Ameticano gotowe!");
        }
    }
}
