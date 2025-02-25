package TaxCalculator;

import java.util.Scanner;

public class CalculatorSimulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name :");
		final String empname = sc.nextLine(); // Taking Input Employee Name
		
		System.out.println("Enter (true/false) for Employee is Indian :");
		final boolean isIndian = sc.nextBoolean(); // Taking Input Employee Nationality (true/false)
		
		System.out.println("Enter Employee Salary :");
		final double empSal = sc.nextDouble();// Taking Input Employee Salary
		
		
		
		TaxCalculator tc = new TaxCalculator();// Creating object of TexCalculator Class
		
		try {
           double tax = tc.calculateTax(empname, isIndian, empSal);// Calling Function
           System.out.println("Tax amount is: " + tax);
           
		}catch(CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e)//Exception Catch
		{
			System.out.println("Exception : " + e.getMessage());// Output Exception
			e.printStackTrace();
		}
		sc.close();	
		}

}