package rentalstore;

public class ReleaseMovie extends Movie {


    public ReleaseMovie(String title) {
        super(title);
    }

    @Override
    public double getThisAmount(int dayRented) {
        double thisAmount = 0;
        thisAmount += dayRented * 3;
        return thisAmount;
    }

    @Override
    public int getFrequentRenterPoints(int dayRented) {
        //add frequent renter points
        int frequentRenterPoints = 1;
        //add bonus for a two day new release rental
        if ( dayRented > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
}
