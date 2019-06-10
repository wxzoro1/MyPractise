package The_third.Exercise.HugeInteger;

public class HugeInteger {															//练习题 3										
	private static final int Numlens = 40;
	private int Nums[] = new int[Numlens];
	private boolean positive;
	private int msd = 0;															//用0占位
	
	
	public HugeInteger() {
		this.positive = false;														//默认负号
	}
	
	void inputHugeInteger(String SNums){
		if(SNums.startsWith("-")) {													//检测符号
			SNums = SNums.substring(1);
			this.positive = false;}
		else {
			this.positive  = true;
		}
		int lens = SNums.length(); 	          										//检查长度
		for(int i = 0; i<Numlens; i++) {
			if(i < SNums.length()) 
				{this.Nums[i] = Character.digit(SNums.charAt(lens-1-i), 10);}		//逆序储存
			else 
				{this.msd = i; break;}	
		}
	}
	
	void outputHugeInteger() {
		StringBuffer n = new StringBuffer();
		System.out.print("Huge Integer:");
		for (int i = Nums.length - 1 ; i >= 0; i--) {
			n.append(Nums[i]);
		}
		String n1 = n.toString();
		String n2 = n1.replaceAll("^(0+)", "");

		if(this.positive)
			System.out.println(n2);
		else 
			System.out.println("-"+n2);
	}
	
	void addHugeIntegers(HugeInteger ONums) {
		if (!this.positive && ONums.positive) {
			if(this.isCompareTo(ONums)) {
				int[] temp = new int[Numlens + 1];
				int[] fout = new int[Numlens];
				for (int i = 0; i < Nums.length - 1; i++) {
					if (Nums[i] >= ONums.Nums[i]) {
						temp[i+1] = Nums[i] - ONums.Nums[i]; 
					}
					else {
						temp[i+1] = 10 + Nums[i] - ONums.Nums[i]; 
						Nums[i+1] -= 1;
					}
				}
					temp[Numlens] = Nums[Nums.length - 1] - ONums.Nums[Nums.length - 1];
					if(temp[Numlens]<0)
					{
						System.out.println("data error");
					}
					else {
						for (int i = 0; i < Numlens; i++) {
							fout[i] = temp[i+1];
						}
						ONums.adverse();
						outputHugeAddInteger(fout, this.positive, ONums.positive);
					}
			}
			else {
				int[] max = new int[Numlens];
				for (int i = 0; i < max.length; i++) {
					max[i] = ONums.Nums[i];
					ONums.Nums[i] = Nums[i];
					Nums[i] = max[i];
				}
				int[] temp = new int[Numlens + 1];
				int[] fout = new int[Numlens];
				for (int i = 0; i < Nums.length - 1; i++) {
					if (Nums[i] >= ONums.Nums[i]) {
						temp[i+1] = Nums[i] - ONums.Nums[i]; 
					}
					else {
						temp[i+1] = 10 + Nums[i] - ONums.Nums[i]; 
						Nums[i+1] -= 1;
					}
				}
					temp[Numlens] = Nums[Nums.length - 1] - ONums.Nums[Nums.length - 1];
					if(temp[Numlens]<0)
					{
						System.out.println("data error");
					}
					else {
						for (int i = 0; i < Numlens; i++) {
							fout[i] = temp[i+1];
						}
						this.adverse();
						outputHugeAddInteger(fout, this.positive, ONums.positive);
					}
				
			}
		}
		else if (this.positive && !ONums.positive) {
			if(this.isCompareTo(ONums)) {
				int[] temp = new int[Numlens + 1];
				int[] fout = new int[Numlens];
				for (int i = 0; i < Nums.length - 1; i++) {
					if (Nums[i] >= ONums.Nums[i]) {
						temp[i+1] = Nums[i] - ONums.Nums[i]; 
					}
					else {
						temp[i+1] = 10 + Nums[i] - ONums.Nums[i]; 
						Nums[i+1] -= 1;
					}
				}
					temp[Numlens] = Nums[Nums.length - 1] - ONums.Nums[Nums.length - 1];
					if(temp[Numlens]<0)
					{
						System.out.println("data error");
					}
					else {
						for (int i = 0; i < Numlens; i++) {
							fout[i] = temp[i+1];
						}
						ONums.adverse();
						outputHugeAddInteger(fout, this.positive, ONums.positive);
					}
			}
			else {
				int[] max = new int[Numlens];
				for (int i = 0; i < max.length; i++) {
					max[i] = ONums.Nums[i];
					ONums.Nums[i] = Nums[i];
					Nums[i] = max[i];
				}
				int[] temp = new int[Numlens + 1];
				int[] fout = new int[Numlens];
				for (int i = 0; i < Nums.length - 1; i++) {
					if (Nums[i] >= ONums.Nums[i]) {
						temp[i+1] = Nums[i] - ONums.Nums[i]; 
					}
					else {
						temp[i+1] = 10 + Nums[i] - ONums.Nums[i]; 
						Nums[i+1] -= 1;
					}
				}
					temp[Numlens] = Nums[Nums.length - 1] - ONums.Nums[Nums.length - 1];
					if(temp[Numlens]<0)
					{
						System.out.println("data error");
					}
					else {
						for (int i = 0; i < Numlens; i++) {
							fout[i] = temp[i+1];
						}
						this.adverse();
						outputHugeAddInteger(fout, this.positive, ONums.positive);
					}
			}
		}
		else {
			int[] carry = new int[Numlens];
			int[] out	= new int[Numlens+2];
			int[] fout  = new int[Numlens];
			for(int i = 0; i <= Numlens - 1; i++) {
				if(i == 0) {
					carry[i] = (this.Nums[i]+ONums.Nums[i])/10;
					out[i+1] = (this.Nums[i]+ONums.Nums[i])%10;}
				else {
					carry[i] = (this.Nums[i]+ONums.Nums[i]+carry[i-1])/10;
					out[i+1] = (this.Nums[i]+ONums.Nums[i]+carry[i-1])%10;}
			}
			out[Numlens + 1] = (this.Nums[Numlens-1]+ONums.Nums[Numlens-1]+carry[Numlens-2])/10;
			if(out[Numlens + 1] == 1)
				{System.out.println("溢出错误");}
			else 
			{
				for(int j = 0; j<Numlens; j++) 
					{fout[j] = out[j+1];}
				outputHugeAddInteger(fout, this.positive, ONums.positive);
			}
		}
	}
	
	void outputHugeAddInteger(int[] fout, boolean a, boolean b) {
		StringBuffer n = new StringBuffer();
		System.out.print("Huge Integer Addresult:");
		for (int i = fout.length - 1 ; i >= 0; i--) {
			n.append(fout[i]);
		}
		String n1 = n.toString();
		String n2 = n1.replaceAll("^(0+)", "");
	
		if(a && b) {
			System.out.println(n2);}
		else if(!a && !b) {
			System.out.println("-"+n2);}
	}

	void substractIntegers(HugeInteger ONums) {
		ONums.adverse();
		this.addHugeIntegers(ONums);
	}
	
	void outputSubHugeInteger(int[] fout, boolean a, boolean b, boolean c) {
		StringBuffer n = new StringBuffer();
		System.out.print("Huge Integer Subresult:");
		for (int i = fout.length - 1 ; i > 0; i--) {
			n.append(fout[i]);
		}	
		String n1 = n.toString();
		String n2 = n1.replaceAll("^(0+)", "");
		if(a && b) {
			if (c) {
				System.out.println(n2);}
			else {
				System.out.println("-"+n2);}
			}
		else if (!a && !b) {
			if(c) {
				System.out.println(n2);}
			else {
				System.out.println("-"+n2);}
		}
		else if (!a && b) {
			
		}
		else if(a && !b) {
			
		}
	}
		
	void adverse() {
		this.positive = !this.positive;
	}
	
	boolean isEqualTo(HugeInteger ONums){
		for(int i = 0; i < Numlens; i++) {
			if(this.Nums[i] != ONums.Nums[i])
			return false;
		}
		if(this.positive = ONums.positive) {
			return true;}
		else {
			return false;}
		}
	
	boolean isNotEqualTo(HugeInteger ONums){
		return !isEqualTo(ONums);
		}
	
	boolean isGreaterThan(HugeInteger ONums){
		boolean flag = false;
		if(this.positive == true && ONums.positive == false)
			flag = true;
		else if (this.positive == false && ONums.positive == true) {
			flag = false;
		}
		else if (this.positive == true && ONums.positive == true) {
			for(int i = Nums.length-1; i >= 0; i--) {
				if(Nums[i] > ONums.Nums[i]) {
					flag = true;
					break;}
				else {
					flag = false;}
			}
		}
		else {
			for(int i = Nums.length-1; i >= 0; i--) {
				if(Nums[i] < ONums.Nums[i]) {
					flag = true;
					break;}
				else {
					flag = false;
				}
			}
		}
		return flag;
	}
	
	boolean isLessThan(HugeInteger ONums){
		boolean flag = false;
		if(this.positive == true && ONums.positive == false)
			flag = false;
		else if (this.positive == false && ONums.positive == true)
			flag = true;
		else if (this.positive == true && ONums.positive == true) {
			for (int i = Nums.length-1; i >= 0; i--) {
				if(Nums[i] < ONums.Nums[i]) {
					flag = true;
					break;}
				else {
					flag = false;}
			}
		}
		else {
			for(int i = Nums.length-1; i >= 0; i--) {
				if(Nums[i] > ONums.Nums[i]) {
					flag = true;
					break;}
				else {
					flag = false;
				}
			}
		}
		return flag;
	}
	
	boolean isGreaterThanOrEqualTo(HugeInteger ONums){
		return !isLessThan(ONums);
	}
	
	boolean isLessThanOrEqualTO(HugeInteger ONums){
		return !isGreaterThan(ONums);
	}

	boolean isCompareTo(HugeInteger ONums) {										//绝对值比较
		boolean flag = false;
		for(int i = Nums.length -1; i >= 0; i--) {
			if(Nums[i] > ONums.Nums[i]) {
				flag = true;
				break;}
			else {
				flag = false;}
		}
		return flag;
	}
}
