package fundamentos;

public class temperatura {

	public static void main(String[] args) {
		//( °F - 32) * 5/9 = °C
		final double div = 5/9.0;
		final double e = 32;
		
		double F = 86;
		double c= (F - e)* div;
		System.out.println("O resultado é: " + c +"°C.");
		
		F = 150;
		c= (F - e)* div;
		System.out.println("O resultado é: " + c +"°C.");
	}

}
