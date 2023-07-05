package OOPs;
//Example of Single Level Inheritance
class Animal     // This is SuperClass or BaseClass or ParentClass 
{
	//Fields and Method of Class Animal
	int ID;
	String Name;
	
	public void eats()
	{
		System.out.println("Animal Eats...");
	}
}

class Dog extends Animal   //This is SubClass or DerivedClass or ChildClass
{
	//Dog class has Fields and Method of Class Animal has it Inherits Animal Class
	//Fields and Method of Class Dog
	public void sound()
	{
		System.out.println("Dog Barks...");
	}
	
}

class TestAnimal
{
	public static void main(String[] args) 
	{
		//Creating object of dog class
		Dog d=new Dog();
		d.Name = "Moti";
		System.out.println("Animal's Name is "+d.Name);
		d.sound();
		d.eats();
	}

}
