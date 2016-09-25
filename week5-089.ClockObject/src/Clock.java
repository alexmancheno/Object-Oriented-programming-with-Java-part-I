
public class Clock {

    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        hours = new BoundedCounter(23);
        minutes = new BoundedCounter(59);
        seconds = new BoundedCounter(59);
        hours.setValue(hoursAtBeginning);
        minutes.setValue(minutesAtBeginning);
        seconds.setValue(secondsAtBeginning);
    }

    public void tick() {
        this.seconds.next();
        if (seconds.getValue() == 0) {
            minutes.next();
            if (minutes.getValue() == 0) {
                hours.next();
            }
        }

    }

    public String toString() {
        return hours.toString() + ':' + minutes.toString()
                + ':' + seconds.toString();
    }
}
