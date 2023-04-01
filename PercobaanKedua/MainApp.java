package PercobaanKedua;

import java.util.Scanner;

public class MainApp {
    static PlayerBase player1;
    static PlayerBase player2;
    static PlayerVsComputer game = null;

    public static void main(String[] args) {
        gamePlay();
    }

    public static void mainMenu() {
        // Tampilan menu utama
        System.out.println("\n================== MAIN MENU ==================");
        System.out.println("| 1. Player vs Computer                       |");
        System.out.println("| 2. Computer vs Computer                     |");
        System.out.println("| 3. Exit                                     |");
        System.out.println("===============================================");
    }

    public static void welcomeMessage() {
        System.out.println("\n===============================================");
        System.out.println("|         PERMAINAN GUNTING BATU KERTAS       |");
        System.out.println("===============================================");
    }

    public static void gamePlay() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        welcomeMessage();
        System.out.println("Masukkan nama anda: ");
        String playerName = scanner.nextLine();

        mainMenu();

        System.out.println("Hai " + playerName + ", Pilih mode permainan: ");
        choice = scanner.nextInt();

        while (true) {
            switch (choice) {
                case 1:
                    player1 = new PlayerHuman(playerName);
                    player2 = new PlayerComputer("Komputer");
                    game = new PlayerVsComputer(player1, player2);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah ronde: ");
                    int numRounds = scanner.nextInt();
                    scanner.nextLine(); // membaca karakter newline yang tersisa

                    ComputerVsComputer computerVsComputer = new ComputerVsComputer(numRounds);
                    System.out.println("Kamu memasukkan " + numRounds + " ronde untuk mode Computer vs Computer. Tekan Enter untuk bermain...");
                    scanner.nextLine();
                    computerVsComputer.playGame(scanner);
                    computerVsComputer.playAgain(scanner);
                    break;
                case 3:
                    System.out.println("Terima kasih telah bermain!");
                    System.exit(0);
                default:
                    System.out.println("PILIHAN TIDAK VALID!");
                    break;
            }

            if (game != null) {
                boolean playAgain = true;
                Scanner scanner1 = new Scanner(System.in);

                while (playAgain) {
                    game.play();
                    System.out.println("\nMain lagi? (y/n): ");
                    String input = scanner1.nextLine();

                    while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) {
                        System.out.println("PILIHAN TIDAK VALID! Main lagi? (y/n): ");
                        input = scanner1.nextLine();
                    }
                    if (input.equalsIgnoreCase("n")) {
                        playAgain = false;
                        break;
                    }
                }
            }
            mainMenu();
            System.out.println("Hai " + playerName + ", Pilih mode permainan: ");
            choice = scanner.nextInt();
        }
    }
}
