package rentalstore;

import rentalstore.impl.HtmlStatementImpl;
import rentalstore.impl.RentalStamentImpl;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {

        StatementTemplate statementTemplate = new RentalStamentImpl();
        return statementTemplate.printRental(this);
    }
    public List<Rental> getRentals() {
        return rentals;
    }


    public String htmlStatement() {
        StatementTemplate statementTemplate = new HtmlStatementImpl();
        return statementTemplate.printRental(this);
    }
}
