package rentalstore;

public class ChildrenMovie extends Movie {


    public ChildrenMovie(String title) {
        super(title);
    }

    @Override
    public double getThisAmount(int dayRented) {
        double thisAmount = 0;
        thisAmount += 1.5;
        if (dayRented > 3) {
            thisAmount += (dayRented - 3) * 1.5;
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
