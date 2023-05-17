package ch015;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutTest extends JFrame {
    BoxLayoutTest() {
        setTitle("박스 레이아웃");

        JPanel p1 = new JPanel();
        BoxLayout box = new BoxLayout(p1, BoxLayout.X_AXIS);
        p1.setLayout(box);
        for (int i = 1; i <= 20; i++) {
            p1.add(new JButton("버튼" + i));
        }

        add(p1, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pack(); 크기에 맞게 설정
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutTest();
    }
}
