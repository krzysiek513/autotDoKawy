package model;

import model.wyjatki.brakSkladniku;

public class Magazyn {
    Mleko mleko;
    Czekolada czekolada;
    Kawa kawa;

    public Magazyn() {
        kawa = new Kawa();
        mleko = new Mleko();
        czekolada = new Czekolada();
        fillAll();
    }

    private void fillAll() {
        kawa.wypelnij();
        mleko.wypelnij();
        czekolada.wypelnij();
    }

    public void getKawa() throws brakSkladniku {
        if(!kawa.pobierzSkladnik()){
            throw new brakSkladniku("kawa");
        }
    }

    public void getMleko() throws brakSkladniku {
        if(!kawa.pobierzSkladnik()){
            throw new brakSkladniku("mleko");
        }
    }

    public void getCzekolada() throws brakSkladniku {
        if(!kawa.pobierzSkladnik()){
            throw new brakSkladniku("czekolada");
        }
    }
}
