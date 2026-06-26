import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class TopScorersFrame extends JFrame {

    public TopScorersFrame() {

        setTitle("Top 5 Scorers");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] columns = {
                "Rank",
                "Username",
                "Wins",
                "Losses",
                "Draws",
                "Score"
        };

        DefaultTableModel model = new DefaultTableModel(columns, 0);

        PlayerService service = new PlayerService();
        List<Player> players = service.getTopScorers();

        int rank = 1;

        for (Player player : players) {

            model.addRow(new Object[]{
                    rank++,
                    player.getUsername(),
                    player.getWins(),
                    player.getLosses(),
                    player.getDraws(),
                    player.getScore()
            });

        }

        JTable table = new JTable(model);
        add(new JScrollPane(table));

        setVisible(true);
    }
}