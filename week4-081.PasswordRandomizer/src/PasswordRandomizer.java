
import java.util.Random;

public class PasswordRandomizer {

    private int passwordLength;
    private String password;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.passwordLength = length;
    }

    public String createPassword() {
        this.password = "";
        int i = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        while (i < this.passwordLength) {
            this.password += alphabet.charAt(random.nextInt(25));
            i++;
        }
        return this.password;
    }
}
