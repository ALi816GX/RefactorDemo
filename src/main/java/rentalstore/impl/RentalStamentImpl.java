package rentalstore.impl;

import rentalstore.Customer;
import rentalstore.Rental;
import rentalstore.StatementTemplate;

public class RentalStamentImpl extends StatementTemplate {
    @Override
    public String printHeader(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    @Override
    public String printBody(Customer customer) {
        String result = "";

        for (Rental each : customer.getRentals()) {
            double thisAmount = each.getThisAmount();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n";

        }

        return result;
    }

    @Override
    public String printFooter(Customer customer) {

        double totalAmount = 0;
        int frequentRenterPoints = 0;
        for (Rental each : customer.getRentals()) {
            totalAmount += each.getThisAmount();
            frequentRenterPoints += each.getFrequentRenterPoints();
        }
        String result = "";

        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }
}
