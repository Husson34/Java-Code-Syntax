package Practice;

public class Circle implements Shape {
@Override 
		public void calculateArea() {
		
			double pi=3.14;
			double r=7;
			double area=pi*(r*r);
			System.out.println("the area of a cirle is "+area);
		}
@Override
		public void calculatePerimeter() {
			double pi=3.14;
			double r=7;
			double perimeter=2*(pi*r);
			System.out.println("Perimeter of a circle is "+perimeter);
		}
}
