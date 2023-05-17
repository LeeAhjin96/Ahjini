package ch016;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloEventMojo extends JFrame {
    HelloEventMojo() {
        setTitle("이벤트 맛보기");
        //예제와 같은 코드
        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼을 클릭함.");
            }
        };
        JButton b = new JButton("클릭");
        b.addActionListener(l);
        //람다식으로 간단히 표현
//        JButton b = new JButton("클릭");
//        b.addActionListener(e -> System.out.println("버튼을 클릭함."));

        add(b);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(260, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HelloEventMojo();
    }
}
