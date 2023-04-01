package PercobaanKedua;

import java.util.Scanner;

public class ComputerVsComputer {
    private static PlayerComputer player1;
    private static PlayerComputer player2;
    private int numRounds;

    public ComputerVsComputer(int numRounds) {
        this.numRounds = numRounds;
        player1 = new PlayerComputer("Computer 1");
        player2 = new PlayerComputer("Computer 2");
    }

    public void finalScore() {
        System.out.println("\nFinal Score:");
        System.out.println(player1.getName() + " = " + player1.getScore() + " poin");
        System.out.println(player2.getName() + " = " + player2.getScore() + " poin");
        System.out.println();
    }

    public boolean playAgain(Scanner scanner) {
        System.out.println("\nMain lagi? (y/n): ");
        String inputPlayAgain = scanner.nextLine();

        while (!inputPlayAgain.equalsIgnoreCase("y") && !inputPlayAgain.equalsIgnoreCase("n")) {
            System.out.println("PILIHAN TIDAK VALID! Main lagi? (y/n): ");
            inputPlayAgain = scanner.nextLine();
        }

        if (inputPlayAgain.equalsIgnoreCase("n")) {
            System.out.println("Terima kasih telah bermain!");
            System.exit(0);
            return false;
        } else {
            System.out.println("Kembali ke Menu Utama...");
            if (inputPlayAgain.equalsIgnoreCase("y")) {
                MainApp.gamePlay();
            }
            return true;
        }
    }

    public void playGame(Scanner scanner) {
        for (int i = 1; i <= numRounds; i++) {
            player1.setHand();
            player2.setHand();

            System.out.println("Ronde " + i);
            System.out.println(player1.getName() + " memilih " + player1.handToString(player1.getHand()));
            System.out.println(player2.getName() + " memilih " + player2.handToString(player2.getHand()));

            if (player1.getHand() == player2.getHand()) {
                System.out.println("Hasil: SERI!");
            } else if ((player1.getHand() == 1 && player2.getHand() == 2) ||
                    (player1.getHand() == 2 && player2.getHand() == 3) ||
                    (player1.getHand() == 3 && player2.getHand() == 1)) {
                System.out.println("Hasil: " + player1.getName() + " MENANG!");
                player1.addScore();
            } else {
                System.out.println("Hasil: " + player2.getName() + " MENANG!");
                player2.addScore();
            }

            if (i < numRounds) {
                System.out.print("Tekan Enter untuk melanjutkan ke ronde berikutnya...\n");
                scanner.nextLine();
            }
        }

        finalScore(); // memanggil method finalScore untuk menampilkan skor akhir
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " Memenangkan Pertandingan!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " Memenangkan Pertandingan!");
        } else {
            System.out.println("Pertandingan SERI!");
        }
    }

}