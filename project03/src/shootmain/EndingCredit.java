package shootmain;

import javax.swing.*;

public class EndingCredit extends JFrame {
    private JLabel backgroundMain;

    public EndingCredit() {
        initObject();
        initSetting();
        setVisible(true);
    }
    private void initObject() {
        backgroundMain = new JLabel(new ImageIcon("image/backgroundMain3.jpg"));
        setContentPane(backgroundMain);
    }
    private void initSetting() {
        setTitle("제작진");
        setSize(1200,740);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
