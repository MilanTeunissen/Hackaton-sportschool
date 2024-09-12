import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class Main extends JFrame {

    private JPanel panel;

    // Variabele om het gekozen abonnementstype op te slaan
    private String abonnementType;

    public Main(String abonnementType) {
        this.abonnementType = abonnementType;

        setTitle("Sportschool Management");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        Styling.applyPanelStyle(panel);

        JLabel titleLabel = new JLabel("Wat wil je doen?");
        Styling.applyTitleStyle(titleLabel);
        panel.add(titleLabel);

        JButton toegangButton = new JButton("Toegang sportschool");
        JButton inschrijvenCursusButton = new JButton("Inschrijven cursus");
        JButton afspraakCoachButton = new JButton("Afspraak personal coach");
        JButton annulerenButton = new JButton("Abonnement annuleren");

        Styling.applyButtonStyle(toegangButton);
        Styling.applyButtonStyle(inschrijvenCursusButton);
        Styling.applyButtonStyle(afspraakCoachButton);
        Styling.applyButtonStyle(annulerenButton);

        panel.add(toegangButton);
        panel.add(inschrijvenCursusButton);
        panel.add(afspraakCoachButton);
        panel.add(annulerenButton);

        add(panel);

        toegangButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAccessLeft();
            }
        });

        afspraakCoachButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel inputPanel = new JPanel(new GridLayout(2, 2));

                JLabel datumLabel = new JLabel("Datum (yyyy-mm-dd):");
                JTextField datumField = new JTextField();
                JLabel tijdLabel = new JLabel("Tijd (HH:mm):");
                JTextField tijdField = new JTextField();

                inputPanel.add(datumLabel);
                inputPanel.add(datumField);
                inputPanel.add(tijdLabel);
                inputPanel.add(tijdField);

                int result = JOptionPane.showConfirmDialog(Main.this, inputPanel, "Afspraak maken",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                if (result == JOptionPane.OK_OPTION) {
                    String gekozenDatum = datumField.getText();
                    String gekozenTijd = tijdField.getText();

                    try {
                        LocalDate date = LocalDate.parse(gekozenDatum, DateTimeFormatter.ISO_LOCAL_DATE);
                        LocalTime time = LocalTime.parse(gekozenTijd, DateTimeFormatter.ISO_LOCAL_TIME);
                        JOptionPane.showMessageDialog(Main.this, "Afspraak gemaakt op " + date + " om " + time);
                    } catch (DateTimeParseException ex) {
                        JOptionPane.showMessageDialog(Main.this, "Ongeldige datum of tijd! Gebruik het formaat yyyy-mm-dd voor de datum en HH:mm voor de tijd.", "Fout", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        inschrijvenCursusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] cursussen = {"Yoga", "Pilates", "Paaldansen"};
                String gekozenCursus = (String) JOptionPane.showInputDialog(
                        Main.this, "Kies een cursus:", "Cursus Keuze",
                        JOptionPane.QUESTION_MESSAGE, null, cursussen, cursussen[0]);

                if (gekozenCursus != null) {
                    JOptionPane.showMessageDialog(Main.this, "Je bent ingeschreven voor " + gekozenCursus + ".");
                }
            }
        });

        annulerenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int bevestiging = JOptionPane.showConfirmDialog(Main.this,
                        "Weet je zeker dat je je abonnement wilt annuleren?", "Abonnement Annuleren",
                        JOptionPane.YES_NO_OPTION);

                if (bevestiging == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(Main.this, "Je abonnement is geannuleerd.");
                    System.exit(0);
                }
            }
        });
    }

    private void showAccessLeft() {
        String message;
        switch (abonnementType) {
            case "1 keer per week":
                message = "Je hebt geen toegang meer na dit bezoek, Fijne dag!";
                break;
            case "2 keer per week":
                message = "Je hebt nog 1 toegang mogelijkheid deze week, Fijne dag!";
                break;
            case "Ongelimiteerd":
                message = "Je hebt ongelimiteerde toegang tot de sportschool, Fijne dag!";
                break;
            default:
                message = "Onbekend abonnementstype.";
        }
        JOptionPane.showMessageDialog(this, message);
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
