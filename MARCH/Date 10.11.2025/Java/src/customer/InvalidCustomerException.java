package customer;

public class InvalidCustomerException extends Exception{
    public String message() {
    	return "Invalid Input! try again";
    }
}
