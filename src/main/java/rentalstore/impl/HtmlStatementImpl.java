package rentalstore.impl;

import rentalstore.Customer;
import rentalstore.Rental;
import rentalstore.StatementTemplate;

public class HtmlStatementImpl extends StatementTemplate {
    @Override
    public String printHeader(Customer customer) {
        return "<H1>Rental Record for <EM>" + customer.getName() + "</EM></H1><P>" + "\n";
    }

    @Override
    public String printBody(Customer customer) {
        String result = "";

        for (Rental each : customer.getRentals()) {
            double thisAmount = each.getThisAmount();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "<BR>" + "\n";

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

        result += "Amount owed is " + String.valueOf(totalAmount) + "<BR>" + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points<BR>";
        return result;
    }
}
