
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money added) {
        Money newSum = new Money(this.euros + added.euros, this.cents + added.cents);
        return newSum;
    }

    public Money minus(Money decremented) {
        int newEuros = this.euros - decremented.euros;
        int newCents = 0;
        if (this.cents >= decremented.cents) {
            newCents = this.cents - decremented.cents;
        } else if (this.cents < decremented.cents) {
            newCents = this.cents + 100 - decremented.cents;
            newEuros--;            
        }
        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }            
        Money newSum = new Money (newEuros, newCents);
        return newSum;
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
