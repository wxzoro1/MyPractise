package The_third.Exercise.HugeInteger;

public class test {
	public static void main(String[]args) {
		String [][] testInputs = {
				{"9876543211123123124718648142", "234567890123123142142416294"},
				{"-987654321", "-234567890"},
		};
		HugeInteger h1 = new HugeInteger();
		HugeInteger h2 = new HugeInteger();
		
		h1.inputHugeInteger(testInputs[0][0]);
		h1.outputHugeInteger();
		h2.inputHugeInteger(testInputs[0][1]);
		h2.outputHugeInteger();
		h1.addHugeIntegers(h2);
		h1.substractIntegers(h2);
		h1.outputHugeInteger();
		h2.outputHugeInteger();
		
		System.out.println(h1.isCompareTo(h2));
		System.out.println(h1.isEqualTo(h2));
		System.out.println(h1.isNotEqualTo(h2));
		System.out.println(h1.isGreaterThan(h2));
		System.out.println(h1.isLessThan(h2));
		System.out.println(h1.isGreaterThanOrEqualTo(h2));
		System.out.println(h1.isLessThanOrEqualTO(h2));
	}
}
