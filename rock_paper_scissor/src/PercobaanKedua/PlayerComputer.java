package PercobaanKedua;

import java.util.Random;

public class PlayerComputer extends PlayerBase{
    private Random random;

    public PlayerComputer (String name) {
        super(name);
        random = new Random();
    }
    public void showScore (){
        System.out.println(getName() + " : " + getScore());
    }
    @Override
    public void setHand() {
        hand = random.nextInt(3) + 1;
    }
}
