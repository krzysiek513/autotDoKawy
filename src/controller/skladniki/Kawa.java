package controller.skladniki;

import model.Magazyn;
import view.UserInterface;
import wyjatki.WyjatekBrakSkladnika;

public class Kawa extends skladnik {
    @Override
    void sprobujDodacSkladnik() throws WyjatekBrakSkladnika {
        magazyn.getKawa();
        userInterface.pokazKrok("kawa");
    }

    public Kawa(Magazyn magazyn, UserInterface userInterface) {
        super(magazyn, userInterface);
    }
}
