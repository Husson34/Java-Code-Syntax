package Practice;

public class Square implements Shape{
	@Override 
	public void calculateArea() {
	
		int length=8;
		int width=7;
		int area=length*width;
		System.out.println("the area of a Square is "+area);
	}
@Override
	public void calculatePerimeter() {
	int length=8;
	int width=7;
	int perimeter=length+length+width+width;
	System.out.println("the perimeter of a Square is "+perimeter);
}
}