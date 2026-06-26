import javax.swing.*;
import java.awt.*;

public class StatisticsFrame extends JFrame {

    public StatisticsFrame(Player player) {
        setTitle("My Statistics");
        setSize(350, 250);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Username:"));
        add(new JLabel(player.getUsername()));

        add(new JLabel("Wins:"));
        add(new JLabel(String.valueOf(player.getWins())));

        add(new JLabel("Losses:"));
        add(new JLabel(String.valueOf(player.getLosses())));

        add(new JLabel("Draws:"));
        add(new JLabel(String.valueOf(player.getDraws())));

        add(new JLabel("Score:"));
        add(new JLabel(String.valueOf(player.getScore())));

        setVisible(true);
    }
}