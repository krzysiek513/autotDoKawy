package model;

class Czekolada extends Produkt {
    private static final int MAX_CZEKOLADA = 1;

    @Override
    void wypelnij() {
        ilosc = MAX_CZEKOLADA;
    }
}
