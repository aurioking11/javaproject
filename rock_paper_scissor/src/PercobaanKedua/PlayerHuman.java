package PercobaanKedua;

import java.util.Scanner;

public class PlayerHuman extends PlayerBase{

    private Scanner scanner;

    public PlayerHuman(String name) {
        super(name);
        scanner = new Scanner(System.in);
    }

    @Override
    public void setHand() {
        System.out.println("Pilihan: ");
        System.out.println("1. Batu");
        System.out.println("2. Gunting");
        System.out.println("3. Kertas");

        int input = scanner.nextInt();

        while (input < 1 || input > 3) {
            System.out.println("INPUT SALAH! Pilihan: ");
            System.out.println("1. Batu");
            System.out.println("2. Gunting");
            System.out.println("3. Kertas");

            input = scanner.nextInt();
        }

        hand = input;
    }

    public void showScore (){
        System.out.println(getName() + " : " + getScore());
    }
}
