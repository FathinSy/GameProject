import javax.swing.*;
import java.awt.*;

public class MainMenuFrame extends JFrame {
    private Player player;
    public MainMenuFrame(Player player) {
        this.player = player;

        setTitle("Main Menu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(5, 1, 10, 10));

        JLabel welcomeLabel =
                new JLabel("Welcome, " + player.getUsername(),
                        SwingConstants.CENTER);

        JButton startGameButton =
                new JButton("Start Game");

        JButton statisticsButton =
                new JButton("My Statistics");

        JButton topScorersButton =
                new JButton("Top 5 Scorers");

        JButton exitButton =
                new JButton("Exit");

        add(welcomeLabel);
        add(startGameButton);
        add(statisticsButton);
        add(topScorersButton);
        add(exitButton);

        startGameButton.addActionListener(e -> {
            dispose();
            new GameFrame(player);
        });

        statisticsButton.addActionListener(e -> {
            new StatisticsFrame(player);
        });

        topScorersButton.addActionListener(e -> {
            new TopScorersFrame();
        });

        exitButton.addActionListener(e -> {
            System.exit(0);
        });
        setVisible(true);
    }
}