package controller;

import view.UserInterface;

public class ZrobEspresso extends Zrob {
    public ZrobEspresso(UserInterface userInterface) {
        super(userInterface);
    }

    @Override
    public void zrobKawe() {
        super.zrobKawe();
        boolean status = skladnikKawa.dodajSkladnik() && skladnikKawa.dodajSkladnik();
        if(status){
            userInterface.kawaGotowa("Espresso gotowe!\nWrzuc monete");
        }
    }
}
