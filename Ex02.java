import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		
		float num1 = entrada.nextFloat();
		
		if (num1 > 0) {
			
			System.out.println(" � um n�mero positivo!");
			
		}else if( num1 < 0 ) {
				
				System.out.println("� um n�mero negativo!");
		
			}else 
				
				System.out.println("Zero");
		}

	}