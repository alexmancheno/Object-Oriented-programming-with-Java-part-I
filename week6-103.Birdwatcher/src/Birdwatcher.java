import java.util.ArrayList;

public class Birdwatcher {
    
    private ArrayList<Bird> Birds;

    public Birdwatcher() {
        this.Birds = new ArrayList<Bird>();
    }
    
    public void addBird (String name, String latinName) {
        this.Birds.add(new Bird(name, latinName));
    }
    
    public ArrayList<Bird> birds() {
        return this.Birds;
    }
    
    public void statistics() {
        for (Bird b : Birds) {
            System.out.println(b);
        }
    }
}