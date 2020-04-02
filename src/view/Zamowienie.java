package view;

import controller.*;

public class Zamowienie {
    maszyna maszyna;
    UserInterface userInterface;
    AutomatDoKawy automatDoKawy;
    String wyswil;
    int typKawy;
    int cukier;
    boolean czyMozna;
    boolean moneta;
    boolean wybor;

    Zamowienie(maszyna maszyna){
        this.maszyna = maszyna;
    }

    public void zrobKawe() {
        if (moneta&&czyMozna) {
            switch (typKawy){
                case 1:
                    moneta=!moneta;
                    czyMozna=!czyMozna;
                    wybor=!wybor;
                    automatDoKawy = new ZrobEspresso(new View());
                    automatDoKawy.zrobKawe();
                    maszyna.wyswietl("Espresso gotowe!\nWrzuc monete");
                    typKawy = 0;
                    break;
                case 2:
                    moneta = !moneta;
                    czyMozna=!czyMozna;
                    wybor=!wybor;
                    automatDoKawy = new ZrobCzekolade(new View());
                    automatDoKawy.zrobKawe();
                    maszyna.wyswietl("Czekolada gotowa!\nWrzuc monete");
                    typKawy = 0;
                    break;
                case 3:
                    moneta = !moneta;
                    czyMozna=!czyMozna;
                    wybor=!wybor;
                    automatDoKawy = new ZrobCappuccino(new View());
                    automatDoKawy.zrobKawe();
                    maszyna.wyswietl("Cappuccino gotowe!\nWrzuc monete");
                    typKawy = 0;
                    break;
                case 4:
                    moneta = !moneta;
                    czyMozna=!czyMozna;
                    wybor=!wybor;
                    automatDoKawy = new ZrobELatte(new View());
                    automatDoKawy.zrobKawe();
                    maszyna.wyswietl("Latte gotowe!\nWrzuc monete");
                    typKawy = 0;
                    break;
                case 5:
                    moneta = !moneta;
                    czyMozna=!czyMozna;
                    wybor=!wybor;
                    automatDoKawy = new ZrobMocha(new View());
                    automatDoKawy.zrobKawe();
                    maszyna.wyswietl("Mocha gotowe!\nWrzuc monete");
                    typKawy = 0;
                    break;
                case 6:
                    moneta = !moneta;
                    czyMozna= !czyMozna;
                    wybor=!wybor;
                    automatDoKawy = new ZrobAmericano(new View());
                    automatDoKawy.zrobKawe();
                    maszyna.wyswietl("Americano gotowe!\nWrzuc monete");
                    typKawy = 0;
                    break;
                default:
                    maszyna.wyswietl("Błąd ");
            }
        }
    }

    void start(){
        if(!moneta){
            moneta = true;
            maszyna.wyswietl("wybierz kawe: ");
        }
    }

    public void espresso() {
        if (moneta&&!wybor) {
            cukier = 3;
            maszyna.dodaj("Espresso \n Cukier: ");
            typKawy = 1;
            wybor=!wybor;
        }
    }

    public void czekolada() {
        if (moneta&&!wybor) {
            cukier = 3;
            maszyna.dodaj("Czekolada \n Cukier: ");
            typKawy = 2;
            wybor=!wybor;
        }
    }

    public void cappuccino() {
        if (moneta&&!wybor) {
            cukier = 3;
            maszyna.dodaj("Cappuccino \n Cukier: ");
            typKawy = 3;
            wybor=!wybor;
        }
    }

    public void latte() {
        if (moneta&&!wybor) {
            cukier = 3;
            maszyna.dodaj("Latte \n Cukier: ");
            typKawy = 4;
            wybor=!wybor;
        }
    }

    public void mocha() {
        if (moneta&&!wybor) {
            cukier = 3;
            maszyna.dodaj("Mocha \n Cukier: ");
            typKawy = 5;
            wybor=!wybor;
        }
    }

    public void americano() {
        if (moneta&&!wybor) {
            cukier = 3;
            maszyna.dodaj("Americano \n Cukier: ");
            typKawy = 6;
            wybor=!wybor;
        }
    }
}
