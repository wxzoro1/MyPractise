package cd;

public class DVD extends Item{
	private String director;

	
	public static void main(String[] args) {
		DVD dvd = new DVD("ͷ����D","jayzhou", 123, "cool");
		dvd.print();
	}

	public DVD(String title, String director, int playingTime, String comment) {
		super(title, playingTime, false, comment);		//���Ҹ����޲����Ĺ����� Ȼ�����Լ��Ķ����ʼ�� Ȼ�����Լ��Ĺ��캯�� false��ʼ��gotIt
//		this.title = title;								//����������ͬ ��������
		setTitle("b");									//""�ַ��� ''char
		this.director = director;

	}

	public void print() {
		System.out.println("DVD:");
		super.print();							//���ø���print	���ʹ��
		System.out.println(director);		
	}
}