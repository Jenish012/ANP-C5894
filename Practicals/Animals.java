package OOPs;
//Example of Multilevel Inheritance
class Animals 
{	//Fields of Class Animals
	String Name;
	//Method of Class Animals
	public void eat()
	{
		System.out.println("Animals Eats...");
	}
}
class Dogs extends Animals  
{
	//Dogs class has Fields and Method of Class Animals has it Inherits Animals Class
	//Fields and Method of Class Dogs
	public void sounds()
	{
		System.out.println("Dogs Barks...");
	}
	
}
class Puppy extends Dogs 
{
	//Methods of puppy
	public void colors()
	{
		System.out.println("Black and White...");
	}
}
	
	
class TestAnimals
{
	public static void main(String[] args) 
	{
		Puppy p=new Puppy();
		p.Name="Cutie";
		System.out.println("Name is "+p.Name);
		p.eat();
		p.sounds();
		p.colors();
		
	}

}
