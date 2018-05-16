
public class FullTimeEmployee extends EmployeeInfo{
	
	private double yearlySalary;
	
	public FullTimeEmployee(int age, int empNumber, int sex, int workLocation, double deductionsRate, String firstName, String lastName, double yearlySalary) {
		super(age, empNumber, sex, workLocation, deductionsRate, firstName, lastName);
		this.yearlySalary = yearlySalary;
	}

	public double calcAnnualGrossIncome() {
		return this.yearlySalary;
	}
	
}
