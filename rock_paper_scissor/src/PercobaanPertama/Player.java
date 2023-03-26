package PercobaanPertama;

public abstract class Player {
    private String name;
    private int score;
    private String move;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public void incrementScore() {
        score++;
    }

    /*
        chooseMove() adalah method abstrak yang nantinya akan diimplementasikan oleh kelas turunan
        PercobaanPertama.HumanPlayer dan PercobaanPertama.ComputerPlayer untuk memilih gerakan yang akan dilakukan.
    */

    public abstract String chooseMove(); //method chooseMove()

    /*
        learn() adalah method abstrak yang nantinya akan diimplementasikan oleh kelas turunan
        PercobaanPertama.HumanPlayer dan PercobaanPertama.ComputerPlayer untuk mempelajari gerakan lawan.
    */
    public abstract void learn(String move); //method learn()

}
