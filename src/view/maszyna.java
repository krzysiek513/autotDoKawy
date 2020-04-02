package view;

import controller.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class maszyna {
    AutomatDoKawy automatDoKawy;
    private String wyswil;
    private int typKawy;
    private int cukier;
    private boolean czyMozna;
    private boolean moneta;
    private boolean wybor;

    private Zamowienie zamowienie;
    private JButton ZrobKawe;
    private JButton WrzucMonete;
    private JTextArea TextArea;
    private JButton Americano;
    private JButton Latte;
    private JButton Espresso;
    private JButton DodajCukier;
    private JButton OdejmijCukier;
    private JTextField dodajCukierTextField;
    public JPanel maszyna;
    private JButton Czekolada;
    private JButton Cappuccino;
    private JButton Mocha;

    public maszyna() {

        zamowienie = new Zamowienie(this);
        WrzucMonete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                zamowienie.start();
            }
        });
        Espresso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                zamowienie.espresso();
            }
        });
        ZrobKawe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                zamowienie.zrobKawe();
            }
        });
        DodajCukier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (moneta&&wybor) {
                    if(cukier<5) cukier++;
                    if(!czyMozna) wyswil = TextArea.getText();
                    czyMozna = true;
                    TextArea.setText(wyswil + String.valueOf(cukier));

                }
            }
        });
        OdejmijCukier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (moneta&&wybor) {
                    if(cukier>0) cukier--;
                    if(!czyMozna) wyswil = TextArea.getText();
                    czyMozna = true;
                    TextArea.setText(wyswil + String.valueOf(cukier));

                }
            }
        });
        Czekolada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                zamowienie.czekolada();
            }
        });
        Cappuccino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                zamowienie.cappuccino();
            }
        });
        Latte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                zamowienie.latte();
            }
        });
        Mocha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                zamowienie.mocha();
            }
        });
        Americano.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                zamowienie.americano();
            }
        });
    }

    void wyswietl(String msg){
        TextArea.setText(msg);
    }
    void dodaj(String msg){
        TextArea.append(msg);
    }

}
