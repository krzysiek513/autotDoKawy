package skladniki;

import model.Magazyn;
import view.UserInterface;
import wyjatki.WyjatekBrakSkladnika;

public class skladnik {
    Magazyn magazyn;
    UserInterface userInterface;

    public skladnik(Magazyn magazyn, UserInterface userInterface) {
        this.magazyn = magazyn;
        this.userInterface = userInterface;
    }

    public final boolean dodajSkladnik(){
        boolean status = false;
        try {
            sprobujDodacSkladnik();
            status = true;
        } catch (WyjatekBrakSkladnika wbs) {
            userInterface.pokazBlad("Brak produktu " + wbs.getMessage());
        }
        return status;

    }

    abstract void sprobujDodacSkladnik() throws WyjatekBrakSkladnika;
}
