package bubble.test;

import javax.swing.*;
// class Player -> new 가능 ! 추상메서드는 가질수없다.
public class Player extends JLabel implements Moveable {
    // 위치 상태
    private int x;
    private int y;

    // 움직임 상태
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    private ImageIcon playerR, playerL;
    public Player() {
        initObject();
        initSetting();
    }

    private void initObject() {
        playerR = new ImageIcon("image/playerR.png");
        playerL = new ImageIcon("image/playerL.png");
    }

    private void initSetting() {
        x = 55;
        y = 535;

        left = false;
        right = false;
        up = false;
        down = false;

        setIcon(playerR);
        setSize(50, 50);
        setLocation(x, y);
    }

    @Override
    public void left() {
        new Thread(()-> { //new Runnable을 람다식으로 변경
            x = x - 1;
            setLocation(x, y);
            setIcon(playerL);
        }).start();
    }

    @Override
    public void right() {
        new Thread(()-> { //new Runnable을 람다식으로 변경
            x = x + 1;
            setLocation(x, y);
            setIcon(playerR);
        }).start();
    }

    @Override
    public void up() {
        System.out.println("점프");
    }

    @Override
    public void down() {
    }
}