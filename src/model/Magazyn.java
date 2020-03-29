package model;

import wyjatki.WyjatekBrakSkladnika;

public class Magazyn {
    private static Magazyn magazyn;
    Mleko mleko;
    Czekolada czekolada;
    Kawa kawa;

    private Magazyn() {
        kawa = new Kawa();
        mleko = new Mleko();
        czekolada = new Czekolada();
        fillAll();
    }

    public static Magazyn getInstance() {
        if(magazyn == null) {
            magazyn = new Magazyn();
        }
        return magazyn;
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
