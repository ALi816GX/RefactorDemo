package rentalstore.StrategyImpl;

import rentalstore.Rental;
import rentalstore.RentalAmountStrategy;

public class ConcreteAmountByRegularImpl implements RentalAmountStrategy {

    @Override
    public double getThisAmount(Rental rental) {
        double thisAmount = 0;
        thisAmount += 2;
        if (rental.getDayRented() > 2) {
            thisAmount += (rental.getDayRented() - 2) * 1.5;
        }
        return thisAmount;
    }

}
