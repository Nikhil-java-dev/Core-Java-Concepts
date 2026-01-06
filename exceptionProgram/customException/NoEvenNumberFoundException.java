package exceptionProgram.customException;

@SuppressWarnings("serial")
public class NoEvenNumberFoundException extends Exception {
	
	public NoEvenNumberFoundException() {
		
	}
	public NoEvenNumberFoundException(String message) {
		super(message);
	}
}
