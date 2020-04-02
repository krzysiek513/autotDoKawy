package controller.skladniki;

import model.Magazyn;
import view.UserInterface;
import wyjatki.WyjatekBrakSkladnika;

public class Czekolada extends skladnik {

    public Czekolada(Magazyn magazyn, UserInterface userInterface) {
        super(magazyn, userInterface);
    }

    @Override
    void sprobujDodacSkladnik() throws WyjatekBrakSkladnika {
        magazyn.getCzekolada();
        userInterface.pokazKrok("czekolada");

    }
}
