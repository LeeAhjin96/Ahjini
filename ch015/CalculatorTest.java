package ch015;

import javax.swing.*;

public class CalculatorTest extends JFrame {

    CalculatorTest() {
        setTitle("계산기");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        p1.add(new JTextField(15));
        add("North", p1);

        JPanel p11 = new JPanel();
        p11.add(new JButton("on"));
        p11.add(new JButton("off"));

        JPanel p12 = new JPanel();
        p12.add(new JButton("7"));
        p12.add(new JButton("8"));
        p12.add(new JButton("9"));
        p12.add(new JButton("+"));

        JPanel p13 = new JPanel();
        p13.add(new JButton("4"));
        p13.add(new JButton("5"));
        p13.add(new JButton("6"));
        p13.add(new JButton("-"));

        JPanel p14 = new JPanel();
        p14.add(new JButton("1"));
        p14.add(new JButton("2"));
        p14.add(new JButton("3"));
        p14.add(new JButton("*"));

        JPanel p15 = new JPanel();
        p15.add(new JButton("0"));
        p15.add(new JButton("."));
        p15.add(new JButton("="));
        p15.add(new JButton("%"));

        p2.add(p11);
        p2.add(p12);
        p2.add(p13);
        p2.add(p14);
        p2.add(p15);

        add("Center", p2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorTest();
    }
}
