
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

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;

        if (totalCents > 99) {
            totalCents -= 100;
            totalEuros += 1;
        }

        return new Money(totalEuros, totalCents);
    }

    public boolean lessThan(Money compared) {
        return (100 * this.euros + this.cents) < (100 * compared.euros() + compared.cents());
    }

    // public Money minus(Money decreaser) {
    // int totalEuros = this.euros;
    // int totalCents = this.cents;
    //
    // totalCents -= decreaser.cents;
    //
    // if (totalCents < 0) {
    // totalEuros -= 1;  // borrow 1 euro
    // totalCents += 100;  // add 100 cents to make it non-negative
    // }
    //
    // totalEuros -= decreaser.euros;
    //
    // if (totalEuros < 0) {
    // totalEuros = 0;
    // totalCents = 0;
    // }
    //
    // return new Money(totalEuros, totalCents);
    // }
    public Money minus(Money decreaser) {
        int totalEuros = this.euros - decreaser.euros;
        int totalCents = this.cents - decreaser.cents;

        if (totalCents < 0) {
            totalCents += 100;
            totalEuros -= 1;
        }

        // if the value becomes negative, return zero
        if (totalEuros < 0) {
            return new Money(0, 0);
        }

        return new Money(totalEuros, totalCents);
    }

    @Override
    public String toString() {
        String zero = "";

        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
}
