package PercobaanKedua;

public abstract class PlayerBase {
    protected String name;
    protected int hand;
    private int score;

    public PlayerBase(String name){
        this.name = name;
        score = 0;
    }

    public abstract void setHand();

    public String getName() {
        return name;
    }

    public int getHand() {
        return hand;
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        score++;
    }

    public String handToString (int hand) {
        switch (hand) {
            case 1:
                return "Batu";
            case 2:
                return "Gunting";
            case 3:
                return "Kertas";
            default:
                return "";
        }
    }

    public abstract void showScore();
}
