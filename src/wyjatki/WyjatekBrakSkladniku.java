package wyjatki;

public class WyjatekBrakSkladniku extends Exception {
    public WyjatekBrakSkladniku(String message) {
        super("brak składniuka " + message);
    }
}
