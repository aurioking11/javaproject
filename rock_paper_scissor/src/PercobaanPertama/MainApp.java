package PercobaanPertama;

public class MainApp {
    public static void main(String[] args) {
        Player player1 = new HumanPlayer("Rio");
        Player player2 = new ComputerPlayer("King");

        Game game = new Game(player1, player2);
        game.Play();
    }
}
