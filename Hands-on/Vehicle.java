package OOPs;
//Create a class called Vehicle with attributes brand and year. Implement a method displayInfo() in the Vehicle class that prints the brand and year of the vehicle. Create a child class Car that inherits from Vehicle and adds an attribute model. Create another child class SportsCar that inherits from Car and adds an attribute topSpeed. Override the displayInfo() method in the SportsCar class to display the brand, model, year, and top speed of the sports car.
public class Vehicle 
{
	//Fields
	String brand;
	int year;
	//Methods
	public void displayInfo()
	{		
		System.out.println("Brand and year of Vehicle");
	}
}
class Car extends Vehicle
{	
	//Fields of class Car
	String model;
	
}
class SportCar extends Car
{	//Fields of SportCar
	String topSpeed;

}
class TestVehicle
{
	
	public static void main(String[] agrs)
	{
		//Assigning the value
		SportCar sc=new SportCar();
		sc.brand="BMW";
		sc.year=2010;
		sc.model="A2H";
		sc.topSpeed="300 kmph";
		//Printing the values
		System.out.println("Brand is: "+sc.brand);
		System.out.println("Year of Manufacture is: "+sc.year);
		System.out.println("Model of car is: "+sc.model);
		System.out.println("Top Speed of Car is: "+sc.topSpeed);
		
				
	}
	
}
