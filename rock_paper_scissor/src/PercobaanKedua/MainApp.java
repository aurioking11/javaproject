package PercobaanKedua;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Nama Anda: ");
        String playerName = scanner.nextLine();
        System.out.println("");

        PlayerHuman player1 = new PlayerHuman(playerName);
        PlayerComputer player2 = new PlayerComputer("Komputer");

        Game game = new Game(player1, player2);

        boolean playAgain = true;

        while (playAgain) {
            game.play();

            System.out.println("\nMain lagi? (y/n): ");
            String input = scanner.nextLine();

            while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")){
                System.out.println("Input Salah! Main lagi? (y/n): ");
                input = scanner.nextLine();
            }

            if (input.equalsIgnoreCase("n")){
                playAgain = false;
            }
        }
    }
}
