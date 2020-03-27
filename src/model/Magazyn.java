package model;

import wyjatki.WyjatekBrakSkladnika;

public class Magazyn {
    Mleko mleko;
    Czekolada czekolada;
    Kawa kawa;

    private Magazyn() {
        kawa = new Kawa();
        mleko = new Mleko();
        czekolada = new Czekolada();
        fillAll();
    }

    public void fillAll() {
        kawa.wypelnij();
        mleko.wypelnij();
        czekolada.wypelnij();
    }

    public void getKawa() throws WyjatekBrakSkladnika {
        if(!kawa.pobierzSkladnik()){
            throw new WyjatekBrakSkladnika("kawa");
        }
    }

    public void getMleko() throws WyjatekBrakSkladnika {
        if(!kawa.pobierzSkladnik()){
            throw new WyjatekBrakSkladnika("mleko");
        }
    }

    public void getCzekolada() throws WyjatekBrakSkladnika {
        if(!kawa.pobierzSkladnik()){
            throw new WyjatekBrakSkladnika("czekolada");
        }
    }
}
