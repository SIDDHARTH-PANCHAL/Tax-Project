package TaxCalculator;

public class CountryNotValidException extends Exception {

	public CountryNotValidException() // Default Constructor
	{
		super();
	}

	public CountryNotValidException(String message) // Parameterized Constructor
	{
		super(message);
	}
    
}
