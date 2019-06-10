package The_third.Exercise.NShape;

public class NRectangle extends NShape{
	double length;
	double width;
	public NRectangle(double l,double w) {
		length = l;
		width = w;
	}
	public double getNArea(){
		System.out.println("长为："+length+"宽为："+width+"的矩形的面积为：");
		area = length * width;
		return area;
	}
}
