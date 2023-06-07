package bubble.test;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BubbleFrame extends JFrame {
    private JLabel backgroundMap;
    private Player player;
    public BubbleFrame() {
        initObject();
        initSetting();
        initListener();
        setVisible(true);
    }

    private void initObject() {
        backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
        setContentPane(backgroundMap); //JPanel 자체를 설정

        player = new bubble.test.Player();
        add(player);
    }

    private void initSetting() {
        setTitle("버블버블");
        setSize(1000, 640);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initListener() {
        addKeyListener(new KeyAdapter() { //KeyAdapter 라는 추상클래스를 이용하여 구현하지 않은 것도 포함할수있게끔 도와줌.
            @Override //왼37 오38 위39 아40
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        player.left();
                        break;
                    case KeyEvent.VK_RIGHT:
                        player.right();
                        break;
                    case KeyEvent.VK_UP:
                        player.up();
                        break;
                    //하지만 보글보글 게임에서는 down이 성립하지 않으므로 지워도됨 주석처리!
//                    case KeyEvent.VK_DOWN:
//                        player.down();
//                        break;
                }
            }
        });
    }


    public static void main(String[] args) {
        new BubbleFrame();
    }
}