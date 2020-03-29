package view;

import controller.AutomatDoKawy;
import controller.ZrobEspresso;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class maszyna implements UserInterface {
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
    private JPanel maszyna;
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
                    TextArea.append("espresso \n Cukier: ");
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
                            moneta = !moneta;
                            wybor=!wybor;
                            automatDoKawy = new ZrobEspresso(new View());
                            automatDoKawy.zrobKawe();
                            TextArea.setText("Espresso gotowe!\nWrzuc monete");
                            typKawy = 0;
                            break;
                        default:
                            TextArea.setText("wybierz kawe: ");

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
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("maszyna");
        frame.setContentPane(new maszyna().maszyna);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void pokazKrok(String msg) {

    }

    @Override
    public void pokazBlad(String msg) {

    }

    @Override
    public void kawaGotowa(String msg) {

    }
}
