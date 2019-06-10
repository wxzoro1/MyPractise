package The_third.Exercise.NShape;

public class NShapeTest {
	public static void main(String[] args) {
	//单个对象
	NCircle s1 = new NCircle(5);
	System.out.println(s1.getNArea());

	//数组化
	NShape[] thNShapes = new NShape[4];
	thNShapes[0] = new NCircle(2);
	thNShapes[1] = new NRectangle(2,4);
	thNShapes[2] = new NCircle(21);
	thNShapes[3] = new NRectangle(211,23);
	for (int i = 0; i < thNShapes.length; i++) {
		System.out.println(thNShapes[i].getNArea());
	}
	//参数化
	NCircle circle = new NCircle(4);
	NRectangle rectangle = new NRectangle(123, 121);
	getAl(circle);
	getAl(rectangle);
	
	}
	public static void getAl(NShape a) {
		System.out.println(a.getNArea());
	}
}
