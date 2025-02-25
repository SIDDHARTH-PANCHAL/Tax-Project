package TaxCalculator;

public class TaxCalculator {
    // Method for Calculate Tax 
	public double calculateTax(String empName,boolean isIndian,double empSal) throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException{
		double taxAmount=0;
		
		if(isIndian==false)//Check Condition
		{
			// Throw Exception
			throw new CountryNotValidException("The Employee should be an Indian Citizen for Calculating Tax.");
		}
		if(empName==null||empName.isEmpty()) //Check Condition
		{
			// Throw Exception
			throw new EmployeeNameInvalidException("The Employee name cannot be Empty.");
			
		}
		if(empSal>100000 && isIndian)//Check Condition
		{
			taxAmount = empSal*8/100;
		}
		else if(empSal>50000 && empSal<=100000 && isIndian) //Check Condition
		{
			taxAmount = empSal*6/100;
		}
		else if(empSal>30000 && empSal<=50000 && isIndian)//Check Condition
		{
			taxAmount = empSal*5/100;
		}
		else if(empSal>10000 && empSal<=30000 && isIndian) //Check Condition
		{
			taxAmount = empSal*4/100;
		}
		else {
			// Throw Exception
			throw new TaxNotEligibleException("The employee does not need to pay tax.");
		}
		
		return taxAmount;
	}

}
