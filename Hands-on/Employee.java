package OOPs;

public class Employee 
{
	//Creating variables
	private int EmployeeID;
	private String EmployeeName;
	private int EmployeeaAge;
	private String EmployeeAddress;
	private String EmployeePhoneNo;
	
	//Getters and Setters
	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public int getEmployeeaAge() {
		return EmployeeaAge;
	}

	public void setEmployeeaAge(int employeeaAge) {
		EmployeeaAge = employeeaAge;
	}

	public String getEmployeeAddress() {
		return EmployeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}

	public String getEmployeePhoneNo() {
		return EmployeePhoneNo;
	}

	public void setEmployeePhoneNo(String employeePhoneNo) {
		EmployeePhoneNo = employeePhoneNo;
	}

}

class TestEmployee
{
	public static void main(String []agrs)
	{
		//Creating Object of class Employee
		Employee E=new Employee();
		
		//Setting values
		E.setEmployeeID(1);
		E.setEmployeeName("Ram");
		E.setEmployeeaAge(30);
		E.setEmployeeAddress("Mumbai");
		E.setEmployeePhoneNo("7548855664");
		
		//Getting values
		System.out.println("ID: "+E.getEmployeeID());
		System.out.println("Name: "+E.getEmployeeName());
		System.out.println("Age: "+E.getEmployeeaAge());
		System.out.println("Address: "+E.getEmployeeAddress());
		
	}
}