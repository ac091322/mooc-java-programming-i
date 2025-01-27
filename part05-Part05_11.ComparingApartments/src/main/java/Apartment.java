
public class Apartment {

    private final int rooms;
    private final int squares;
    private final int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getSquares() {
        return this.squares;
    }

    public int getPricePerSquare() {
        return this.pricePerSquare;
    }

    public int getTotalPrice() {
        return this.pricePerSquare * this.squares;
    }

    public boolean largerThan(Apartment apartment) {
        return this.squares > apartment.getSquares();
    }

    public int priceDifference(Apartment apartment) {
        return Math.abs(this.getTotalPrice() - apartment.getTotalPrice());
    }

    public boolean moreExpensiveThan(Apartment apartment) {
        return this.getTotalPrice() > apartment.getTotalPrice();
    }
}
