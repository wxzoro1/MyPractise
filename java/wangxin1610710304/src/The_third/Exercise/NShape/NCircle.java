package The_third.Exercise.NShape;

public class NCircle extends NShape{
	double radius;
	public NCircle(double r){
		radius = r;
	}
	public double getNArea() {
		System.out.println("�뾶Ϊ"+radius+"Բ�����Ϊ��");
		area = Math.PI*radius*radius;
		return area;
	}
}
