package rentalstore;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void should_return_statement_when_call_statement_given_customer () {
        Customer customer = new Customer("Jerry");

        String result = customer.statement();
        String expected = "Rental Record for Jerry\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void should_return_statement_when_call_statement_given_customer_REGULAR_2 () {
        Customer customer = new Customer("Jerry");
        Movie movie = new RegularMovie("Titanic");
        Rental rental = new Rental(movie, 2);
        customer.addRental(rental);

        String result = customer.statement();
        String expected = "Rental Record for Jerry\n" +
                "\tTitanic\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void should_return_statement_when_call_statement_given_customer_two_REGULAR_2 () {
        Customer customer = new Customer("Jerry");
        Movie movie = new RegularMovie("Titanic");
        Movie movie2  = new RegularMovie("Titanic2");
        Rental rental = new Rental(movie, 2);
        customer.addRental(rental);

        Rental rental2 = new Rental(movie2, 2);
        customer.addRental(rental2);

        String result = customer.statement();
        String expected = "Rental Record for Jerry\n" +
                "\tTitanic\t2.0\n" +
                "\tTitanic2\t2.0\n" +
                "Amount owed is 4.0\n" +
                "You earned 2 frequent renter points";

        Assert.assertEquals(expected, result);
    }


    @Test
    public void should_return_statement_when_call_statement_given_customer_REGULAR_3 () {
        Customer customer = new Customer("Jerry");
        Movie movie = new RegularMovie("Titanic");
        Rental rental = new Rental(movie, 3);
        customer.addRental(rental);

        String result = customer.statement();
        String expected = "Rental Record for Jerry\n" +
                "\tTitanic\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void should_return_statement_when_call_statement_given_customer_CHILDRENS_2 () {
        Customer customer = new Customer("Jerry");
        Movie movie = new ChildrenMovie("Titanic");
        Rental rental = new Rental(movie, 2);
        customer.addRental(rental);

        String result = customer.statement();
        String expected = "Rental Record for Jerry\n" +
                "\tTitanic\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void should_return_statement_when_call_statement_given_customer_CHILDRENS_4 () {
        Customer customer = new Customer("Jerry");
        Movie movie = new ChildrenMovie("Titanic");
        Rental rental = new Rental(movie, 4);
        customer.addRental(rental);

        String result = customer.statement();
        String expected = "Rental Record for Jerry\n" +
                "\tTitanic\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void should_return_statement_when_call_statement_given_customer_NEW_RELEASE_2 () {
        Customer customer = new Customer("Jerry");
        Movie movie = new ReleaseMovie("Titanic");
        Rental rental = new Rental(movie, 2);
        customer.addRental(rental);

        String result = customer.statement();
        String expected = "Rental Record for Jerry\n" +
                "\tTitanic\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void should_return_statement_when_call_statement_given_customer_NEW_RELEASE_0 () {
        Customer customer = new Customer("Jerry");
        Movie movie = new ReleaseMovie("Titanic");
        Rental rental = new Rental(movie, 0);
        customer.addRental(rental);

        String result = customer.statement();
        String expected = "Rental Record for Jerry\n" +
                "\tTitanic\t0.0\n" +
                "Amount owed is 0.0\n" +
                "You earned 1 frequent renter points";

        Assert.assertEquals(expected, result);
    }

    //html-statement--
    @Test
    public void should_return_statement_when_call_html_statement_given_customer () {
        Customer customer = new Customer("Jerry");

        String result = customer.htmlStatement();
        String expected = "<H1>Rental Record for <EM>Jerry</EM></H1><P>\n" +
                "Amount owed is 0.0<BR>\n" +
                "You earned 0 frequent renter points<BR>";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void should_return_statement_when_call_html_statement_given_customer_REGULAR_2 () {
        Customer customer = new Customer("Jerry");
        Movie movie = new RegularMovie("Titanic");
        Rental rental = new Rental(movie, 2);
        customer.addRental(rental);

        String result = customer.htmlStatement();
        String expected = "<H1>Rental Record for <EM>Jerry</EM></H1><P>\n" +
                "\tTitanic\t2.0<BR>\n" +
                "Amount owed is 2.0<BR>\n" +
                "You earned 1 frequent renter points<BR>";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void should_return_statement_when_call_html_statement_given_customer_two_REGULAR_2 () {
        Customer customer = new Customer("Jerry");
        Movie movie = new RegularMovie("Titanic");
        Movie movie2  = new RegularMovie("Titanic2");
        Rental rental = new Rental(movie, 2);
        customer.addRental(rental);

        Rental rental2 = new Rental(movie2, 2);
        customer.addRental(rental2);

        String result = customer.htmlStatement();
        String expected = "<H1>Rental Record for <EM>Jerry</EM></H1><P>\n" +
                "\tTitanic\t2.0<BR>\n" +
                "\tTitanic2\t2.0<BR>\n" +
                "Amount owed is 4.0<BR>\n" +
                "You earned 2 frequent renter points<BR>";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void should_return_statement_when_call_html_statement_given_customer_REGULAR_3 () {
        Customer customer = new Customer("Jerry");
        Movie movie = new RegularMovie("Titanic");
        Rental rental = new Rental(movie, 3);
        customer.addRental(rental);

        String result = customer.htmlStatement();
        String expected = "<H1>Rental Record for <EM>Jerry</EM></H1><P>\n" +
                "\tTitanic\t3.5<BR>\n" +
                "Amount owed is 3.5<BR>\n" +
                "You earned 1 frequent renter points<BR>";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void should_return_statement_when_call_html_statement_given_customer_CHILDRENS_2 () {
        Customer customer = new Customer("Jerry");
        Movie movie = new ChildrenMovie("Titanic");
        Rental rental = new Rental(movie, 2);
        customer.addRental(rental);

        String result = customer.htmlStatement();
        String expected = "<H1>Rental Record for <EM>Jerry</EM></H1><P>\n" +
                "\tTitanic\t1.5<BR>\n" +
                "Amount owed is 1.5<BR>\n" +
                "You earned 1 frequent renter points<BR>";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void should_return_statement_when_call_html_statement_given_customer_CHILDRENS_4 () {
        Customer customer = new Customer("Jerry");
        Movie movie = new ChildrenMovie("Titanic");
        Rental rental = new Rental(movie, 4);
        customer.addRental(rental);

        String result = customer.htmlStatement();
        String expected = "<H1>Rental Record for <EM>Jerry</EM></H1><P>\n" +
                "\tTitanic\t3.0<BR>\n" +
                "Amount owed is 3.0<BR>\n" +
                "You earned 1 frequent renter points<BR>";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void should_return_statement_when_call_html_statement_given_customer_NEW_RELEASE_2 () {
        Customer customer = new Customer("Jerry");
        Movie movie = new ReleaseMovie("Titanic");
        Rental rental = new Rental(movie, 2);
        customer.addRental(rental);

        String result = customer.htmlStatement();
        String expected = "<H1>Rental Record for <EM>Jerry</EM></H1><P>\n" +
                "\tTitanic\t6.0<BR>\n" +
                "Amount owed is 6.0<BR>\n" +
                "You earned 2 frequent renter points<BR>";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void should_return_statement_when_call_html_statement_given_customer_NEW_RELEASE_0 () {
        Customer customer = new Customer("Jerry");
        Movie movie = new ReleaseMovie("Titanic");
        Rental rental = new Rental(movie, 0);
        customer.addRental(rental);

        String result = customer.htmlStatement();
        String expected = "<H1>Rental Record for <EM>Jerry</EM></H1><P>\n" +
                "\tTitanic\t0.0<BR>\n" +
                "Amount owed is 0.0<BR>\n" +
                "You earned 1 frequent renter points<BR>";

        Assert.assertEquals(expected, result);
    }

}