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


        WrzucMonete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!moneta){
                    moneta = true;
                    TextArea.setText("wybierz kawe: ");
                }
            }
        });
        Espresso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (moneta&&!wybor) {
                    cukier = 3;
                    TextArea.append("Espresso \n Cukier: ");
                    typKawy = 1;
                    wybor=!wybor;
                }
            }
        });
        ZrobKawe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (moneta&&czyMozna) {
                    switch (typKawy){
                        case 1:
                            moneta=!moneta;
                            czyMozna=!czyMozna;
                            wybor=!wybor;
                            automatDoKawy = new ZrobEspresso(new View());
                            automatDoKawy.zrobKawe();
                            TextArea.setText("Espresso gotowe!\nWrzuc monete");
                            typKawy = 0;
                            break;
                        case 2:
                            moneta = !moneta;
                            czyMozna=!czyMozna;
                            wybor=!wybor;
                            automatDoKawy = new ZrobCzekolade(new View());
                            automatDoKawy.zrobKawe();
                            TextArea.setText("Czekolada gotowa!\nWrzuc monete");
                            typKawy = 0;
                            break;
                        case 3:
                            moneta = !moneta;
                            czyMozna=!czyMozna;
                            wybor=!wybor;
                            automatDoKawy = new ZrobCappuccino(new View());
                            automatDoKawy.zrobKawe();
                            TextArea.setText("Cappuccino gotowe!\nWrzuc monete");
                            typKawy = 0;
                            break;
                        case 4:
                            moneta = !moneta;
                            czyMozna=!czyMozna;
                            wybor=!wybor;
                            automatDoKawy = new ZrobELatte(new View());
                            automatDoKawy.zrobKawe();
                            TextArea.setText("Latte gotowe!\nWrzuc monete");
                            typKawy = 0;
                            break;
                        case 5:
                            moneta = !moneta;
                            czyMozna=!czyMozna;
                            wybor=!wybor;
                            automatDoKawy = new ZrobMocha(new View());
                            automatDoKawy.zrobKawe();
                            TextArea.setText("Mocha gotowe!\nWrzuc monete");
                            typKawy = 0;
                            break;
                        case 6:
                            moneta = !moneta;
                            czyMozna= !czyMozna;
                            wybor=!wybor;
                            automatDoKawy = new ZrobAmericano(new View());
                            automatDoKawy.zrobKawe();
                            TextArea.setText("Americano gotowe!\nWrzuc monete");
                            typKawy = 0;
                            break;
                        default:
                            TextArea.setText("Błąd ");

                    }
                }
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
                if (moneta&&!wybor) {
                    cukier = 3;
                    TextArea.append("Czekolada \n Cukier: ");
                    typKawy = 2;
                    wybor=!wybor;
                }
            }
        });
        Cappuccino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (moneta&&!wybor) {
                    cukier = 3;
                    TextArea.append("Cappuccino \n Cukier: ");
                    typKawy = 3;
                    wybor=!wybor;
                }
            }
        });
        Latte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (moneta&&!wybor) {
                    cukier = 3;
                    TextArea.append("Latte \n Cukier: ");
                    typKawy = 4;
                    wybor=!wybor;
                }
            }
        });
        Mocha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (moneta&&!wybor) {
                    cukier = 3;
                    TextArea.append("Mocha \n Cukier: ");
                    typKawy = 5;
                    wybor=!wybor;
                }
            }
        });
        Americano.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (moneta&&!wybor) {
                    cukier = 3;
                    TextArea.append("Americano \n Cukier: ");
                    typKawy = 6;
                    wybor=!wybor;
                }
            }
        });
    }



}
