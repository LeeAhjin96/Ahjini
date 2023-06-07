package shootmain;

import bubble.test.BubbleFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {
    private JButton startButton; //스타트 버튼
    private JButton recordButton; //기록보기 버튼
    private JButton exitButton; //나가기 버튼
    private JLabel backgroundMain;
    private ImageIcon startIcon;  //스타트 아이콘
    private ImageIcon sthoverIcon;  //스타트 호버
    private ImageIcon recordIcon; //기록보기 아이콘
    private ImageIcon rchoverIcon; //기록보기 호버
    private ImageIcon exitIcon; //나가기 아이콘
    private ImageIcon exhoverIcon; //나가기 호버

    public MainFrame() {
        initObject();
        initSetting();
        setVisible(true);
    }

    private void initObject() {
        backgroundMain = new JLabel(new ImageIcon("image/backgroundMain.jpg"));
        setContentPane(backgroundMain);

        //타이틀 이미지

        //스타트 버튼
        startIcon = new ImageIcon("image/start1.png");
        Image startImage = startIcon.getImage().getScaledInstance(startIcon.getIconWidth() * 2, startIcon.getIconHeight() * 2, Image.SCALE_SMOOTH);
        startIcon = new ImageIcon(startImage);

        sthoverIcon = new ImageIcon("image/start2.png");
        Image sthoverImage = sthoverIcon.getImage().getScaledInstance(sthoverIcon.getIconWidth() * 2, sthoverIcon.getIconHeight() * 2, Image.SCALE_SMOOTH);
        sthoverIcon = new ImageIcon(sthoverImage);

        startButton = new JButton(startIcon);
        startButton.setBounds(450, 250, startIcon.getIconWidth(), startIcon.getIconHeight());
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setFocusPainted(false);
        startButton.setOpaque(false);

        // Add mouse listener to change the button's icon on hover
        startButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                startButton.setIcon(sthoverIcon);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                startButton.setIcon(startIcon);
            }
        });

        //기록 보기 버튼
        recordIcon = new ImageIcon("image/record1.png");
        Image recordButtonImage = recordIcon.getImage().getScaledInstance(recordIcon.getIconWidth() * 2, recordIcon.getIconHeight() * 2, Image.SCALE_SMOOTH);
        recordIcon = new ImageIcon(recordButtonImage);

        rchoverIcon = new ImageIcon("image/record2.png");
        Image rchoverImage = rchoverIcon.getImage().getScaledInstance(rchoverIcon.getIconWidth() * 2, rchoverIcon.getIconHeight() * 2, Image.SCALE_SMOOTH);
        rchoverIcon = new ImageIcon(rchoverImage);

        recordButton = new JButton(recordIcon);
        recordButton.setBounds(450, 400, recordIcon.getIconWidth(), recordIcon.getIconHeight());
        recordButton.setBorderPainted(false);
        recordButton.setContentAreaFilled(false);
        recordButton.setFocusPainted(false);
        recordButton.setOpaque(false);

        recordButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                recordButton.setIcon(rchoverIcon);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                recordButton.setIcon(recordIcon);
            }
        });

        //나가기 버튼
        exitIcon = new ImageIcon("image/exit1.png");
        Image exitButtonImage = exitIcon.getImage().getScaledInstance(exitIcon.getIconWidth() * 2, exitIcon.getIconHeight() * 2, Image.SCALE_SMOOTH);
        exitIcon = new ImageIcon(exitButtonImage);

        exhoverIcon = new ImageIcon("image/exit2.png");
        Image exhoverImage = exhoverIcon.getImage().getScaledInstance(exhoverIcon.getIconWidth() * 2, exhoverIcon.getIconHeight() * 2, Image.SCALE_SMOOTH);
        exhoverIcon = new ImageIcon(exhoverImage);

        exitButton = new JButton(exitIcon);
        exitButton.setBounds(450, 550, exitIcon.getIconWidth(), exitIcon.getIconHeight());
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setFocusPainted(false);
        exitButton.setOpaque(false);

        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                exitButton.setIcon(exhoverIcon);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                exitButton.setIcon(exitIcon);
            }
        });

        // Button click action listener
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BubbleFrame();
                setVisible(false);
            }
        });

        getContentPane().add(startButton);
        getContentPane().add(recordButton);
        getContentPane().add(exitButton);
    }

    private void initSetting() {
        setTitle("보스피하기");
        setSize(1200, 740);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}