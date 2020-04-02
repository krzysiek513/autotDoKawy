package view;

public class UserInterface {
    public maszyna maszyna;

    public UserInterface(view.maszyna maszyna) {
        this.maszyna = maszyna;
    }

    public void pokazKrok(String msg) {
        System.out.println("+ " + msg);
        maszyna.dodaj("\n" + msg);
    }

    public void pokazBlad(String msg) {
        System.out.println("- " + msg);
        maszyna.dodaj("\n" + msg);
    }

    public void kawaGotowa(String msg) {
        System.out.println("-- " + msg + " --");
        maszyna.wyswietl(msg);
    }
}
