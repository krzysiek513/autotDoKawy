package model;

public class Mleko extends Produkt {
    private static final int MAX_MLEKO = 2;

    @Override
    void wypelnij() {
        ilosc = MAX_MLEKO;
    }
}
