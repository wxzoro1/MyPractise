package cd;

public class Item {
	private String title;						//private�� 		protected �Լ���ͬһ���������ࣻ������Է���
	private int 	playingTime;
	private boolean gotIt = false;				//Ĭ���г�ʼֵ
	private String	comment;


	public Item(String title, int playingTime, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}
	
	public void setTitle(String title) {
		this.title = title; 
	}

	public static void main(String[] args) {
		
	}

	public void print() {
		System.out.println(title);
	}

}										//����Ķ�����Ը�ֵ������ı��� ����Ķ�����Դ��ݸ���Ҫ�������ĺ��� ����Ķ�����Է��ڴ�Ÿ�������������
										//java�Ķ�������Ƕ�̬�ģ� �������������͵Ķ��󣬻���������������Ķ��� ������Ķ��󸳸�����ı�����ʱ�򣬾ͷ������������ͣ�����ת�� ��Զ��ȫ��		�������� ��̬����
										//����cast ����Ķ����������ı����� java�����ڶ��������ĸ�ֵ�� ����Ķ����ܸ�ֵ������ı���
