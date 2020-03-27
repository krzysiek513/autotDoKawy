package model;

class Kawa extends Produkt {
    private static final int MAX_KAWA = 30;

    @Override
    void wypelnij() {
        ilosc = MAX_KAWA;
    }
}
