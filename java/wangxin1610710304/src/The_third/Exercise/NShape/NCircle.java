package The_third.Exercise.NShape;

public class NCircle extends NShape{
	double radius;
	public NCircle(double r){
		radius = r;
	}
	public double getNArea() {
		System.out.println("半径为"+radius+"圆的面积为：");
		area = Math.PI*radius*radius;
		return area;
	}
}
