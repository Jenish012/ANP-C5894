package OOPs;

public class Students 
{
	//Creating variable
	private int Rollno;
	private String Name;
	private int Age;
	private String Address;
	
	//Applying Getters and Setters
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}	
}

class TestStudents
{
public static void main(String[] args)
	{
	
	Students S =new Students();
	
	//Setting the Values
	S.setRollno(12);
	S.setAge(11);
	S.setName("Jenish");
	S.setAddress("Mumbai");
	
	//Getting the values
	
	System.out.println("Roll no: "+S.getRollno());
	System.out.println("Age: "+S.getAge());
	System.out.println("Name: "+S.getName());
	System.out.println("Address: "+S.getAddress());
	}

}
