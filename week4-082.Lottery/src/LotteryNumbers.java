
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        Random random = new Random();
        int i = 0;
        while (i < 7) {
            int randomNumber = random.nextInt(39) + 1;
            if (!containsNumber(randomNumber)) {
                this.numbers.add(randomNumber);
            i++;    
            }
        }
    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)) {
            return true;
        } else {
            return false;
        }
    }
}
