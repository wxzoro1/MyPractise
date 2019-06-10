package The_third.Prac_3;


class NCPU8086{
	NCPU8086(int i){
		System.out.println("8086 constructor");
	}
}

class NCPU286 extends NCPU8086{
	NCPU286(int i){
		super(i);
		System.out.println("286 constructor");
	}
}

class NCPU386 extends NCPU286{
	NCPU386(){
		super(5);
		System.out.println("386 constructor");
	}
}

public class NCPU {
	public static void main(String[]args) {
		NCPU386 cpu386 = new NCPU386();
	}
}
