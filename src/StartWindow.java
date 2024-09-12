import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindow extends JFrame {

    public StartWindow() {
        setTitle("Abonnement Keuze");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel titleLabel = new JLabel("Welkom tester! Kies je abonnementstype:");


        JButton toegangButton = new JButton("1 keer per week");
        JButton toegang2Button = new JButton("2 keer per week");
        JButton toegangOnbeperktButton = new JButton("Ongelimiteerd");

        Styling.applyStartWindowStyles(panel, titleLabel, toegangButton, toegang2Button, toegangOnbeperktButton);

        panel.add(titleLabel);
        panel.add(toegangButton);
        panel.add(toegang2Button);
        panel.add(toegangOnbeperktButton);

        add(panel);

        toegangButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startMain("1 keer per week");
            }
        });

        toegang2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startMain("2 keer per week");
            }
        });

        toegangOnbeperktButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startMain("Ongelimiteerd");
            }
        });
    }

    private void startMain(String abonnementType) {
        this.dispose();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main app = new Main(abonnementType);
                app.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                StartWindow startWindow = new StartWindow();
                startWindow.setVisible(true);
            }
        });
    }
}
