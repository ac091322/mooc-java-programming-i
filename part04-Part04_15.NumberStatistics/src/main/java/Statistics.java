
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        if (number != -1) {
            this.count += 1;
            this.sum += number;
        }
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return (this.count > 0) ? (double) this.sum / this.count : 0;
    }

    @Override
    public String toString() {
        return String.format("Count: %d, Sum: %d, Average: %f", this.count, this.sum, average());
    }
}
