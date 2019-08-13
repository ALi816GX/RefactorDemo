package rentalstore;

public class RegularMovie extends Movie {


    public RegularMovie(String title) {
        super(title);
    }

    @Override
    public double getThisAmount(int dayRented) {
        double thisAmount = 0;
        thisAmount += 2;
        if (dayRented > 2) {
            thisAmount += (dayRented - 2) * 1.5;
        }
        return thisAmount;
    }

    @Override
    public int getFrequentRenterPoints(int dayRented) {
        //add frequent renter points
        int frequentRenterPoints = 1;
        return frequentRenterPoints;
    }

}
