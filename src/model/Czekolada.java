package model;

class Czekolada extends Skladnik {
    private static final int MAX_CZEKOLADA = 10;

    @Override
    void wypelnij() {
        ilosc = MAX_CZEKOLADA;
    }
}
