package rentalstore.StrategyImpl;

import rentalstore.Rental;
import rentalstore.RentalAmountStrategy;

public class ConcreteAmountByChildrenImpl implements RentalAmountStrategy {
    @Override
    public double getThisAmount(Rental rental) {
        double thisAmount = 0;
        thisAmount += rental.getDayRented() * 3;
        return thisAmount;
    }




}
