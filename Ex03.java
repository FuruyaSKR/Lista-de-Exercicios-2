import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu sexo: F - Feminino M - Masculino");
		String sexo = entrada.next();
		
		switch (sexo) {
			
		case "f":
				System.out.println("Sexo: Feminino");
				break;
		case "m":
				System.out.println("Sexo: Masculino");
				break;			
		}
			
	entrada.close();	
			
	}

}
