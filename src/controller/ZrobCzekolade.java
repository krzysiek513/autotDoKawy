package controller;

import view.UserInterface;

public class ZrobCzekolade extends Zrob {
    public ZrobCzekolade(UserInterface userInterface) { super(userInterface); }

    @Override
    public void zrobKawe() {
        super.zrobKawe();
        boolean status = skladnikCzekolada.dodajSkladnik() && skladnikMleko.dodajSkladnik();
        if(status){
            userInterface.kawaGotowa("Czekolada gotowa\nWrzuc monete");
        }
    }

}
