import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		float num1 = entrada.nextFloat();
		
		System.out.print("Digite outro n�mero: ");
		float num2 = entrada.nextFloat();
		
		if (num1 > num2) {
			System.out.println(num1+ " � maior que o " +num2);
		} else 
			if (num2 > num1) {
				System.out.println(num2+ " � maior que o " +num1);
			} else 
				System.out.println("S�o iguais");
		
			entrada.close();
		}
	}

