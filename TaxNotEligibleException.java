package TaxCalculator;

public class TaxNotEligibleException extends Exception
{

	public TaxNotEligibleException() // Default Constructor
	{
		super();
	}

	public TaxNotEligibleException(String message) // Parameterized Constructor
	{
		super(message);
	}

}
