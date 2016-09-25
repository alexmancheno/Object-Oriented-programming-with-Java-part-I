public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(0, 0, 0);

        int i = 0;
        while (i < 20) {
            System.out.println(clock);
            clock.tick();
            i++;
        }
    }
}
