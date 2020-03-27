package model;

import javafx.beans.binding.BooleanExpression;

abstract class Produkt {
    int ilosc = 0;

    boolean pobierzSkladnik(){
        if(isEmpty()) return false;
        ilosc--;
        return true;
    }

    boolean isEmpty(){
        return ilosc <= 0;
    }

    abstract void wypelnij();
}
