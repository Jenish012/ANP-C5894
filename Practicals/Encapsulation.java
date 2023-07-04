package OOPs;
//Example of Encapsulation
 class Encapsulation 
{	
	//Initializing variables
	private int age;
	private String Name;
	private String Gender;
	
	//getAge method
	public int getAge() {
		return age;
	}
	//setAge method
	public void setAge(int age) {
		this.age = age;
	}
	//getName method
	public String getName() {
		return Name;
	}
	//setName method
	public void setName(String name) {
		Name = name;
	}//getGender method
	public String getGender() {
		return Gender;
	}
	//setGender method
	public void setGender(String gender) {
		Gender = gender;
	}
	
}

class TestEncapsulation
{
	public static void main(String[] agrs)
	{
		//Creating instance or object of Class Encapsulation
		Encapsulation E=new Encapsulation();
		
		//Setting the values
		E.setAge(25);
		E.setName("Jenish");
		E.setGender("Male");
		
		//Getting the values
		System.out.println("The person's name is " +E.getName()+", age is "+E.getAge()+" and gender is "+ E.getGender());
	}
}
