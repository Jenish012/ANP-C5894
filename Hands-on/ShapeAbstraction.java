package OOPs;

abstract class ShapeAbstraction 
{
	public abstract void calculateArea();
	
	public abstract void calculatePerimeter();
}
class Rectangles extends ShapeAbstraction
{
	public void calculateArea()
	{
		System.out.println("The area of rectangle is length*breath");	
	}
	public void calculatePerimeter()
	{
		System.out.println("The Perimeter of Rectangle is 2(l+w)");
	}
}
class Circle extends ShapeAbstraction
{
	public void calculateArea()
	{
		System.out.println("The area of Circle is 3.14*r*r");	
	}
	public void calculatePerimeter()
	{
		System.out.println("The Perimeter of Circle is 2πr");
	}
}
class Triangle extends ShapeAbstraction
{
	public void calculateArea()
	{
		System.out.println("The area of Triangle is length*breath*height");	
	}
	public void calculatePerimeter()
	{
		System.out.println("The Triangle of Triangle is 1/2 b × h");
	}
}

class TestShapeAbstraction	
{
	public static void main(String[] args) 
	{
		Rectangles r=new Rectangles();
		r.calculateArea();
		r.calculatePerimeter();
		Circle c=new Circle();
		c.calculateArea();
		c.calculatePerimeter();
		Triangle t=new Triangle();
		t.calculateArea();
		t.calculatePerimeter();
	}

}
	
