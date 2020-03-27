package wyjatki;

public class WyjatekBrakSkladnika extends Exception {
    public WyjatekBrakSkladnika(String message) {
        super("brak składniuka " + message);
    }
}
