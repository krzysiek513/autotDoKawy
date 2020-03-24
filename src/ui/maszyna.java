package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class maszyna {
    private String wyswil;
    private int typKawy;
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
                    TextArea.append("espresso");
                    typKawy = 1;
                    wybor=!wybor;
                }
            }
        });
        ZrobKawe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (moneta) {
                    switch (typKawy){
                        case 1:
                            moneta = !moneta;
                            wybor=!wybor;
                            TextArea.setText("Gotowe!\nWrzuc monete");
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
                wyswil = TextArea.toString();
            }
        });
        OdejmijCukier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

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
}
