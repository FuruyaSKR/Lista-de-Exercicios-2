import java.util.Scanner;

public class Ex26 {

	static Scanner entrada;

	public static void main(String[] args) {
	
		entrada = new Scanner(System.in);
						
		float n;
		
		System.out.println("Digite um numero: ");
		n = entrada.nextFloat();
		
		if (Math.floor(n) != n)
			System.out.println("� um n�mero decimal");
		else
			System.out.println("� um n�mero inteiro");
		
		entrada.close();
	}
}
