package model;

import wyjatki.WyjatekBrakSkladniku;

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

    public void getKawa() throws WyjatekBrakSkladniku {
        if(!kawa.pobierzSkladnik()){
            throw new WyjatekBrakSkladniku("kawa");
        }
    }

    public void getMleko() throws WyjatekBrakSkladniku {
        if(!kawa.pobierzSkladnik()){
            throw new WyjatekBrakSkladniku("mleko");
        }
    }

    public void getCzekolada() throws WyjatekBrakSkladniku {
        if(!kawa.pobierzSkladnik()){
            throw new WyjatekBrakSkladniku("czekolada");
        }
    }
}
