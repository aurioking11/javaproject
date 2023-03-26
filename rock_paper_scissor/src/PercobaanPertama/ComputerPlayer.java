package PercobaanPertama;

import java.util.Random;

public class ComputerPlayer extends Player{

    public ComputerPlayer(String name){
        super(name);
    }
    @Override
    public String chooseMove() {
        String[] moves = {"rock", "paper", "scissors"};
        Random random = new Random();
        int index = random.nextInt(3);
        String move = moves[index];

        return move;
    }

    @Override
    public void learn(String move) {

    }
}
