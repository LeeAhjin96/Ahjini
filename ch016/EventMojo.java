package ch016;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// 패키지 ch015의 ComponentMojo와 같은 내용에서 이벤트만 추가한것

public class EventMojo extends JFrame {
    JTextField t1,t2;
    JTextArea area;
    JButton cal, reset;
    JComboBox cb;

    EventMojo() {
        setTitle("원 넓이 구하기");
        setLayout(new BorderLayout(10,10));
        showNorth(); showCenter(); showSouth();
        //BorderLayout의 북쪽, 중앙, 남쪽에 배치한 모든 컴포넌트를 나타내려고 105에서 220으로 수정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,220);
        setVisible(true);

        //이벤트의 종류나 좌표 화면에 나타내어 보기
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("마우스 클릭");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("마우스 버튼 누르기");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("마우스 버튼 놓기");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("마우스 입장");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("마우스 퇴장");
            }
        });

        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("마우스 드래그(" + e.getX() + "," + e.getY() + ").");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("마우스 이동(" + e.getX() + "," + e.getY() + ").");
            }
        });
    }

    void showNorth() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(2, 0));

        JLabel l1 = new JLabel("원의 반지름");
        JLabel l2 = new JLabel("원의 넓이");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t2.setEnabled(false);

        p1.add(l1); p1.add(t1); p2.add(l2); p2.add(t2);
        panel.add(p1);
        panel.add(p2);

        add(panel, BorderLayout.NORTH);

        //키값 나타내기 실행창에 내가 적은 숫자 계속 띄우기
        KeyListener listener2 = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar() + "를 입력했삼.");
            }
            //밑의 두 메서드는 추상메서드 이므로 사용안해도 필요함!
            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        //텍스트 필드에 생성된 KeyListener 객체를 등록
        t1.addKeyListener(listener2);
    }

    void showCenter() {
        JPanel panel = new JPanel();

        area = new JTextArea(30, 20);
        area.setText("이 영역에 원의 넓이를\n계산하는 과정이 나타납니다.");
        area.setEditable(false);
        area.setForeground(Color.RED);

        panel.add(area);

        add(panel, BorderLayout.CENTER);
    }

    void showSouth() {
        String[] color = {"red", "blue"};

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        cal = new JButton("계산");
        cb = new JComboBox<>(color);
        reset = new JButton("리셋");

        panel.add(cal); panel.add(cb); panel.add(reset);

        add(panel, BorderLayout.SOUTH);

        //이벤트추가
        ActionListener listener1 = e -> {
            if (e.getSource() == cal) {
                if (t1.getText().isEmpty())
                    area.setText("반지름을 입력하세요!!!");
                else {
                    String s = t1.getText();
                    double radius = Double.parseDouble(s);
                    double result = radius * radius * 3.14;
                    t2.setText("" + result);
                    area.setText(radius + "*" + radius + "*3.14=" + result);
                }
            } else {
                t1.setText("");
                t2.setText("");
                area.setText("");
            }
        };

        cal.addActionListener(listener1);
        reset.addActionListener(listener1);
        //글씨 색 바꾸기
        cb.addItemListener(e-> {
            int index = ((JComboBox) cb).getSelectedIndex();
            if (index == 0)
                area.setForeground(Color.RED);
            else
                area.setForeground(Color.BLUE);
        });
    }

    public static void main(String[] args) {
            new EventMojo();
    }
}
