package shootmain;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class EndingCredit extends JFrame {
    private JLabel backgroundMain;
    private List<String> credits;
    private JLabel creditsLabel;

    public EndingCredit() {
        initObject();
        initSetting();
        setVisible(true);
        startCreditsAnimation();
    }

    private void initObject() {
        backgroundMain = new JLabel(new ImageIcon("image/backgroundMain2.jpg"));
        setContentPane(backgroundMain);

        credits = new ArrayList<>();
        credits.add("Name 1");
        credits.add("Name 2");
        credits.add("Name 3");
        // 제작진들의 이름을 credits 리스트에 추가합니다.

        creditsLabel = new JLabel();
        creditsLabel.setFont(new Font("Arial", Font.BOLD, 20));
        creditsLabel.setForeground(Color.WHITE);
        creditsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(creditsLabel);
    }

    private void initSetting() {
        setTitle("엔딩 크레딧");
        setSize(1200, 740);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void startCreditsAnimation() {
        SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (String credit : credits) {
                    publish(credit);
                    Thread.sleep(1000); // 각 이름을 표시한 후 1초 대기합니다.
                }
                return null;
            }

            @Override
            protected void process(List<String> chunks) {
                String latestCredit = chunks.get(chunks.size() - 1);
                creditsLabel.setText(latestCredit);
            }

            @Override
            protected void done() {
                // 크레딧 애니메이션 종료 후 필요한 동작을 수행할 수 있습니다.
            }
        };

        worker.execute();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EndingCredit::new);
    }
}
