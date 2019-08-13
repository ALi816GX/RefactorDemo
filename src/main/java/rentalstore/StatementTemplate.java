package rentalstore;

public abstract class StatementTemplate {


    public abstract String printHeader(Customer customer);
    public abstract String printBody(Customer customer);
    public abstract String printFooter(Customer customer);


    public String printRental(Customer customer){

        String result = "";

        result += printHeader(customer);
        result += printBody(customer);
        result += printFooter(customer);

        return result;

    }



}
