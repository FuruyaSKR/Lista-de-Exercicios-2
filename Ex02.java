import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		
		float num1 = entrada.nextFloat();
		
		if (num1 > 0) {
			
			System.out.println(" É um número positivo!");
			
		}else if( num1 < 0 ) {
				
				System.out.println("É um número negativo!");
		
			}else 
				
				System.out.println("Zero");
		}

	}