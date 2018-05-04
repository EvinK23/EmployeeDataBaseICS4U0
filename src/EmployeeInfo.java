
public class EmployeeInfo {
	//attributes
	private int age;
	private int empNumber;
	private int sex;
	private int workLocation;
	
	private double deductionsRate;
	
	private String firstName;
	private String lastName;
	
	//Constructor
	public EmployeeInfo(int age, int empNumber, int sex, int workLocation, double deductionsRate, String firstName, String lastName) {
		this.age = age;
		this.empNumber = empNumber;
		this.sex = sex;
		this.workLocation = workLocation;
		this.deductionsRate = deductionsRate;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	//methods
	//get
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public int getSex() {
		return sex;
	}
	public int getWorkLocation() {
		return workLocation;
	}
	public int getEmployeeNumber() {
		return empNumber;
	}
	
	//set
	public void getFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void getLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public void setWorkLocation(int workLocation) {
		this.workLocation = workLocation;
	}
	public void setEmployeeNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	
	//meant to be overridden
	public double calcAnnualGrossIncome() {
		return -1;
	}
	
	
	
}
