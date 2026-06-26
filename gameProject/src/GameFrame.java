import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    private JButton[] buttons;
    private GameLogic gameLogic;
    private Player currentPlayer;
    private PlayerService playerService;

    public GameFrame(Player player) {

        currentPlayer = player;

        gameLogic = new GameLogic();
        playerService = new PlayerService();

        setTitle("Tic Tac Toe");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new GridLayout(3, 3));

        buttons = new JButton[9];

        for (int i = 0; i < 9; i++) {

            buttons[i] = new JButton("");
            buttons[i].setFont(
                    new Font("Arial", Font.BOLD, 40)
            );

            int index = i;

            buttons[i].addActionListener(e -> handlePlayerMove(index));

            add(buttons[i]);
        }

        setVisible(true);
    }

    private void handlePlayerMove(int index) {

        if (!gameLogic.makeMove(index, 'X')) {
            return;
        }

        buttons[index].setText("X");
        buttons[index].setEnabled(false);

        if (gameLogic.checkWinner('X')) {
            finishGame("WIN");
            return;
        }

        if (gameLogic.isDraw()) {
            finishGame("DRAW");
            return;
        }

        int computerIndex = gameLogic.computerMove();

        if (computerIndex != -1) {

            buttons[computerIndex].setText("O");
            buttons[computerIndex].setEnabled(false);

        }

        if (gameLogic.checkWinner('O')) {
            finishGame("LOSE");
            return;
        }

        if (gameLogic.isDraw()) {
            finishGame("DRAW");
        }
    }

    private void finishGame(String result) {

        playerService.updateStatistics(currentPlayer, result);

        currentPlayer =
                playerService.getPlayerById(currentPlayer.getId());

        JOptionPane.showMessageDialog(
                this,
                "Game Result : " + result
        );

        dispose();

        MainMenuFrame menu = new MainMenuFrame(currentPlayer);
        menu.setVisible(true);
        dispose();
    }

}