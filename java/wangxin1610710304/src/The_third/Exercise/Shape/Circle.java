package The_third.Exercise.Shape;

public class Circle implements Shape{
	double r;
	Circle(double r){
		this.r = r;
	}
	
	public double getArea() {
		return PI * r * r;
	}
	
}
