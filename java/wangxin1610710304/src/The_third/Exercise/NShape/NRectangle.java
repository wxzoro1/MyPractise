package The_third.Exercise.NShape;

public class NRectangle extends NShape{
	double length;
	double width;
	public NRectangle(double l,double w) {
		length = l;
		width = w;
	}
	public double getNArea(){
		System.out.println("��Ϊ��"+length+"��Ϊ��"+width+"�ľ��ε����Ϊ��");
		area = length * width;
		return area;
	}
}
