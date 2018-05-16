
public class PartTimeEmployee extends EmployeeInfo{
	private double hourlyWage;
	private double hoursPerWeek;
	private double weeksPerYear;
	
	public PartTimeEmployee(int age, int empNumber, int sex, int workLocation, double deductionsRate, String firstName, String lastName, double hourlyWage, double hoursPerWeek, double weeksPerYear) {
		super(age, empNumber, sex, workLocation, deductionsRate, firstName, lastName);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
		this.weeksPerYear = weeksPerYear;
	}
	
	public double calcAnnualGrossIncome() {
		return hourlyWage*hoursPerWeek*weeksPerYear;
	}
	
}
