package model;

public class Mleko extends Skladnik {
    private static final int MAX_MLEKO = 20;

    @Override
    void wypelnij() {
        ilosc = MAX_MLEKO;
    }
}
