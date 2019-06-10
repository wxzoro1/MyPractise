package The_third.Exercise.Shape;

public class Square implements Shape{
	double a;
	Square(double a) {
		this.a = a;
	}
	public double getArea(){
		return a*a;
	}
}
