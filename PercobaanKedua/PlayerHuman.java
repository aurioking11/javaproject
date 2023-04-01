package PercobaanKedua;

import java.util.Scanner;

public class PlayerHuman extends PlayerBase{

    private Scanner scanner;

    public PlayerHuman(String name) {
        super(name);
        scanner = new Scanner(System.in);
    }

    public void optionMessage() {
        System.out.println("\nPilihan:");
        System.out.println("1. Batu");
        System.out.println("2. Gunting");
        System.out.println("3. Kertas");
        System.out.println("");
    }

    @Override
    public void setHand() {
        optionMessage();
        int input = scanner.nextInt();

        while (input < 1 || input > 3) {
            System.out.println("INPUT SALAH!");
            optionMessage();

            input = scanner.nextInt();
        }

        hand = input;
    }

    public void showScore (){
        System.out.println(getName() + " : " + getScore());
    }
}
