package rentalstore;

public abstract class Movie {

    private String title;
    private int priceCode;

    public Movie(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public abstract double getThisAmount(int dayRented);

    public abstract int getFrequentRenterPoints(int dayRented) ;
}
