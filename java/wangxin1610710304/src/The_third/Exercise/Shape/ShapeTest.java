package The_third.Exercise.Shape;

public class ShapeTest {
	public static void main(String[] args) {
		Square s1 = new Square(5);
		Circle s2 = new Circle(5);
		System.out.println("正方形面积:"+s1.getArea());
		System.out.println("圆形面积:"+s2.getArea());	
	}
}
