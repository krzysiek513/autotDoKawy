package view;

class View implements UserInterface {

    @Override
    public void pokazKrok(String msg) {
        System.out.println("- " + msg);
    }

    @Override
    public void pokazBlad(String msg) {
        System.out.println("- " + msg);
    }

    @Override
    public void kawaGotowa(String msg) {
        System.out.println("-- " + msg + " --");

    }
}

