import javax.swing.*;
import java.awt.*;

public class Styling {

    public static void applyPanelStyle(JPanel panel) {
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    }

    public static void applyTitleStyle(JLabel label) {
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
    }

    public static void applyButtonStyle(JButton button) {
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setMaximumSize(new Dimension(200, 40));
        button.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    public static void applyStartWindowStyles(JPanel panel, JLabel titleLabel, JButton... buttons) {
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        for (JButton button : buttons) {
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
            button.setMaximumSize(new Dimension(200, 40));
            button.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        }
    }
}
