package TaxCalculator;

public class EmployeeNameInvalidException extends Exception
{

	public EmployeeNameInvalidException() // Default Constructor
	{
		super();	
	}

	public EmployeeNameInvalidException(String message) // Parameterized Constructor
	{
		super(message);
	}
	
}
