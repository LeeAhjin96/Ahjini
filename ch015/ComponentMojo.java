package ch015;

import javax.swing.*;
import java.awt.*;

public class ComponentMojo extends JFrame {
    ComponentMojo() {
        setTitle("원 넓이 구하기");
        // 수평수직 간격을 10픽셀로 설정
        setLayout(new BorderLayout(10,10));
        showNorth(); showCenter(); showSouth();
        //BorderLayout의 북쪽, 중앙, 남쪽에 배치한 모든 컴포넌트를 나타내려고 105에서 220으로 수정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,220);
        setVisible(true);
    }

    void showNorth() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        //행이 2개인 패널
        JPanel panel = new JPanel(new GridLayout(2, 0));
        //2개의 레이블
        JLabel l1 = new JLabel("원의 반지름");
        JLabel l2 = new JLabel("원의 넓이");
        //2개의 텍스트필드, 두번째 텍스트 필드는 입력x
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        t2.setEnabled(false);

        p1.add(l1); p1.add(t1); p2.add(l2); p2.add(t2);
        panel.add(p1);
        panel.add(p2);

        add(panel, BorderLayout.NORTH);
    }

    void showCenter() {
        JPanel panel = new JPanel();

        JTextArea area = new JTextArea(30, 20);
        area.setText("이 영역에 원의 넓이를\n계산하는 과정이 나타남.");
        //텍스트 영역에 입력 못하게 막고, 문자열을 red로 설정
        area.setEditable(false);
        area.setForeground(Color.RED);

        panel.add(area);

        add(panel, BorderLayout.CENTER);
    }

    void showSouth() {
        String[] color = {"red", "blue"};

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton cal = new JButton("계산");
        JComboBox<String> cb = new JComboBox<>(color);
        JButton reset = new JButton("리셋");

        panel.add(cal); panel.add(cb); panel.add(reset);

        add(panel, BorderLayout.SOUTH);
    }


    public static void main(String[] args) {
        new ComponentMojo();
    }
}
