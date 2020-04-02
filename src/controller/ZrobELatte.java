package controller;


import view.UserInterface;

public class ZrobELatte extends Zrob {
    public ZrobELatte(UserInterface userInterface) {
        super(userInterface);
    }

    @Override
    public void zrobKawe() {
        super.zrobKawe();
        boolean status = skladnikMleko.dodajSkladnik() && skladnikKawa.dodajSkladnik();
        if(status){
            userInterface.kawaGotowa("Latte gotowe!\nWrzuc monete");
        }
    }
}
