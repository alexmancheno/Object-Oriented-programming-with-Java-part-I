import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int roll() {
        return (int) (double) this.random.nextInt(this.numberOfSides) + 1;
    }
}
