package model.wyjatki;

public class brakSkladniku extends Exception {
    public brakSkladniku(String message) {
        super("brak składniuka " + message);
    }
}
