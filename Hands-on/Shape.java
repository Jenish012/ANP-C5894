package OOPs;
//Create a class called Shape with a method calculateArea() that prints "Calculating area of the shape." Create a child class Rectangle that inherits from Shape and overrides the calculateArea() method to calculate and print the area of a rectangle.
public class Shape //Parent Class
{
	//Fields
	public void calculateArea()
	{
		System.out.println("Calculating area of shape...");
	}
}

class Rectangle extends Shape //Child Class
{
	public void calculateArea()
	{
		System.out.println("Area of a rectangle");
	}
}
class TestShape
{
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		r.calculateArea();
	}
}
