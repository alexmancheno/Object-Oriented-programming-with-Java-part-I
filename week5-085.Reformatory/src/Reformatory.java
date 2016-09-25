
public class Reformatory {

    private int weightsMeasured = 0;

    public Reformatory() {
        this.weightsMeasured = 0;
    }

    public int weight(Person person) {
        weightsMeasured++;
        return person.getWeight();

    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured() {
        return weightsMeasured;
    }
}
