package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class GoodGame extends JFrame implements ActionListener {
    private JLabel backgroundLabel;

    GoodGame() {
        setTitle("아이작");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        // 배경 이미지를 넣을 수 있는 JLabel 생성
        backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, getWidth(), getHeight());
        add(backgroundLabel);

        makeMenu(); // 배경 이미지를 설정하기 전에 호출

        setVisible(true);
    }

    private void setBackgroundLabel() {
        ImageIcon backgroundImage = new ImageIcon("game/map.jpg");
        Image scaledImage = backgroundImage.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        backgroundImage = new ImageIcon(scaledImage);
        backgroundLabel.setIcon(backgroundImage);
    }

    private void makeMenu() {
        JMenuItem item;
        KeyStroke key;

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("새 게임");
        m1.setMnemonic(KeyEvent.VK_F);  //단축키 설정. ALT+F 누르면 켜짐
        JMenu m2 = new JMenu("설정");
        m2.setMnemonic(KeyEvent.VK_C);

        item = new JMenuItem("Easy", KeyEvent.VK_N);
        item.addActionListener(this);
        m1.add(item);
        item = new JMenuItem("Normal");
        m1.add(item);
        m1.add(new JMenuItem("Hard"));
        m1.addSeparator();

        item = new JMenuItem("음량");
        item.addActionListener(this);
        m2.add(item);
        item = new JMenuItem("크기");
        // item.setAccelerator(key);
        item.addActionListener(this);
        m2.add(item);
        item = new JMenuItem("바보");
        item.addActionListener(this);
        m2.add(item);
        mb.add(m1);
        mb.add(m2);
        setJMenuBar(mb);

        setBackgroundLabel(); // 배경 이미지 설정

        // pack(); // 만약 컴포넌트 크기에 따라 프레임 크기를 자동 조정하려면 pack()을 호출할 수 있습니다.
        setVisible(true);
    }

    public static void main(String[] args) {
        new GoodGame();
    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem mi = (JMenuItem) (e.getSource());

        switch (mi.getText()) {
            // case " Easy" -> System.out.println("Easy");
            // case "Normal" -> System.out.println("Normal");
        }
    }
}
