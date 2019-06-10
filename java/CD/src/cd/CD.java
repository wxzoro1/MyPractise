package cd;

public class CD extends Item {
	private String 	artist;
	private int 	numofTracks;
	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title, playingTime, false, comment);							//找有参数的父类构造器    默认给个false
//		this.title = title;													//先父类初始化 然后在自己的定义初始化 然后进构造函数
		this.artist = artist;
		this.numofTracks = numofTracks;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}
	
	@Override				//	覆盖
	public String toString() {
		return "CD [artist=" + artist + ", numofTracks=" + numofTracks + ", toString()=" + super.toString() + "]";
	}//toString 是Item的toString

	@Override
	public boolean equals(Object obj) {
 		CD cc = (CD)obj;				//向下造型
		return artist.equals(cc.artist);//CD判断相等
	}

	public static void main(String[] args) {
		CD cd1 = new CD("依然范特西","jayzhou", 11, 129, "real good");
		CD cd = new CD("依然范特西","jayzhou", 11, 129, "real good");
		System.out.println(cd1.equals(cd));			//对子类来说 此时equals只能判定管理者是否相同
		cd.print();
		CD cc = new CD("abc","abcc", 1,23,"nice");
		cc.print();
		System.out.println(cc);				//object类 是所有类的原类 
		System.out.println(cc.toString());	
		String s = ""+cc;
		System.out.println(s);

	}

//	public void print() {
//		System.out.println(title+":"+artist);
//	}

	
}
