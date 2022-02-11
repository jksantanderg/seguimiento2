package exception;

public class NegativeNumberException extends Exception {
	
	public NegativeNumberException(String name,String weight) {
		super("Esta intentando usar un número negativo "+weight+" para el ingrediente");
	}

}
