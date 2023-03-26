package PercobaanPertama;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(String name){
        super(name);
    }
    @Override
    public String chooseMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your move (rock/paper/scissor)");
        String move = scanner.nextLine();

        return move;
    }

    @Override
    public void learn(String move) {

    }
}
