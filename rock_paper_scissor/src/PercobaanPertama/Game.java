package PercobaanPertama;

public class Game {

    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void Play() {
        while (true) {
            String move1 = player1.chooseMove();
            String move2 = player2.chooseMove();

            System.out.println(player1.getName() + " choose " + move1);
            System.out.println(player2.getName() + " choose " + move2);

            if (move1.equals("rock") && move2.equals("scissors") ||
                    move1.equals("scissors") && move2.equals("paper") ||
                    move1.equals("paper") && move2.equals("rock")) {
                System.out.println(player1.getName() + " wins!");
                player1.incrementScore();
            } else if (move2.equals("rock") && move1.equals("scissors") ||
                    move2.equals("scissors") && move1.equals("paper") ||
                    move2.equals("paper") && move1.equals("rock")) {
                System.out.println(player2.getName() + " wins!");
                player2.incrementScore();
            } else {
                System.out.println("It's a tie!");
            }
            player1.learn(move2);
            player2.learn(move1);

            System.out.println(player1.getName() + "'s score: " + player1.getScore());
            System.out.println(player2.getName() + "'s score: " + player2.getScore());
            System.out.println("----------------------------------------");

            if (player1.getScore() == 3) {
                System.out.println(player1.getName() + " win the game!");
                break;
            } else if (player2.getScore() == 3) {
                System.out.println(player2.getName() + " win the game!");
                break;
            }
        }
    }
}
