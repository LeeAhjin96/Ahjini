package ch015;

import javax.swing.*;
import java.awt.*;

//주의...
public class JRadioButtonTest extends JFrame {
    public JRadioButtonTest() {
        setTitle("애완 동물");
        JRadioButton[] pet = new JRadioButton[3];
        String[] name = {"강아지", "고양이", "금붕어"};

        ButtonGroup bg = new ButtonGroup();
        JPanel p1 = new JPanel();
        for (int i = 0; i < pet.length; i++) {
            pet[i] = new JRadioButton(name[i]);
            bg.add(pet[i]);
            p1.add(pet[i]);
        }
        pet[0].setSelected(true);
        add(p1, BorderLayout.NORTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JRadioButtonTest();
    }
}
