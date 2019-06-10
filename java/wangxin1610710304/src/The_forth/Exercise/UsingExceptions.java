package The_forth.Exercise;

public class UsingExceptions {						//¡∑œ∞Ã‚ 2
	public static void main(String[] args) {
		try {
			throwException();
		} catch (Exception exception) {
			System.err.println("Exception handled in main");
		}
		doesNotThrowException();
	}
	public static void throwException() throws Exception{
		try {
			System.out.println("Method throwException");
			throw new Exception();
		} catch (Exception exception) {
			System.err.println("Exception handled in method throwException");
			throw exception;
		}finally {
			System.err.println("Finally executed in throwException");
		}
	}
	public static void doesNotThrowException() {
		try {
			System.out.println("Method doesNotThrowException");
		} catch (Exception exception) {
			System.err.println(exception.toString());
		}finally {
			System.err.println("Finally executed in doesNotThrowException");
		}
		System.out.println("End of method doesNotThrowException");
	}
}
//Result:
//Method throwException
//Method doesNotThrowException
//End of method doesNotThrowException
//Exception handled in method throwException
//Finally executed in throwException
//Exception handled in main
//Finally executed in doesNotThrowException

//debug result:
//Method throwException
//Exception handled in method throwException
//Finally executed in throwException
//Exception handled in main
//Method doesNotThrowException
//Finally executed in doesNotThrowException
//End of method doesNotThrowException


