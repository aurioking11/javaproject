package PercobaanKedua;

public class Game {
    private PlayerBase player1;
    private PlayerBase player2;

    public Game(PlayerBase player1, PlayerBase player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        player1.setHand();
        player2.setHand();

        System.out.println("--------------------");

        System.out.println(player1.getName() + " memilih " + player1.handToString(player1.getHand()));
        System.out.println(player2.getName() + " memilih " + player2.handToString(player2.getHand()));

        if (player1.getHand() == player2.getHand()) {
            System.out.println("Hasil: SERI!");
        } else if (player1.getHand() == 1 && player2.getHand() == 2
                || player1.getHand() == 2 && player2.getHand() == 3
                || player1.getHand() == 3 && player2.getHand() == 1) {
            System.out.println("Hasil: " + player1.getName() + " MENANG!");
            player1.addScore();
        } else {
            System.out.println("Hasil: " + player2.getName() + " MENANG!");
            player2.addScore();
        }

        System.out.println("\n------------SCORE------------");

        player1.showScore();
        player2.showScore();
    }
}
