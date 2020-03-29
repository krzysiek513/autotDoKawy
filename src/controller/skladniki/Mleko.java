package controller.skladniki;

import model.Magazyn;
import view.UserInterface;
import wyjatki.WyjatekBrakSkladnika;

public class Mleko extends skladnik {
    @Override
    void sprobujDodacSkladnik() throws WyjatekBrakSkladnika {
        magazyn.getMleko();
        userInterface.pokazKrok("--mleko");
    }

    public Mleko(Magazyn magazyn, UserInterface userInterface) {
        super(magazyn, userInterface);
    }
}

