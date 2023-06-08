package shootmain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndingCredit {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Popup Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Open Popup");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(frame, "Popup Dialog", true);
                dialog.setSize(300, 200);
                dialog.setLayout(new FlowLayout());

                JLabel label = new JLabel("This is a popup dialog.");
                dialog.add(label);

                dialog.setLocationRelativeTo(null);

                dialog.setVisible(true);
            }
        });

        frame.add(button);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
