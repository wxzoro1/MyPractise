package cd;

public class CD extends Item {
	private String 	artist;
	private int 	numofTracks;
	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title, playingTime, false, comment);							//���в����ĸ��๹����    Ĭ�ϸ���false
//		this.title = title;													//�ȸ����ʼ�� Ȼ�����Լ��Ķ����ʼ�� Ȼ������캯��
		this.artist = artist;
		this.numofTracks = numofTracks;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}
	
	@Override				//	����
	public String toString() {
		return "CD [artist=" + artist + ", numofTracks=" + numofTracks + ", toString()=" + super.toString() + "]";
	}//toString ��Item��toString

	@Override
	public boolean equals(Object obj) {
 		CD cc = (CD)obj;				//��������
		return artist.equals(cc.artist);//CD�ж����
	}

	public static void main(String[] args) {
		CD cd1 = new CD("��Ȼ������","jayzhou", 11, 129, "real good");
		CD cd = new CD("��Ȼ������","jayzhou", 11, 129, "real good");
		System.out.println(cd1.equals(cd));			//��������˵ ��ʱequalsֻ���ж��������Ƿ���ͬ
		cd.print();
		CD cc = new CD("abc","abcc", 1,23,"nice");
		cc.print();
		System.out.println(cc);				//object�� ���������ԭ�� 
		System.out.println(cc.toString());	
		String s = ""+cc;
		System.out.println(s);

	}

//	public void print() {
//		System.out.println(title+":"+artist);
//	}

	
}
