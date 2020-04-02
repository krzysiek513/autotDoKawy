package controller;


import view.UserInterface;

public class ZrobCappuccino extends Zrob {
    public ZrobCappuccino(UserInterface userInterface) {
        super(userInterface);
    }

    @Override
    public void zrobKawe() {
        super.zrobKawe();
        boolean status = skladnikMleko.dodajSkladnik() && skladnikKawa.dodajSkladnik() && skladnikKawa.dodajSkladnik();
        if(status){
            userInterface.kawaGotowa("Cappuccino gotowe!\nWrzuc monete");
        }
    }
}
