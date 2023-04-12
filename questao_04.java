import java.util.Scanner;

public class questao_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		System.out.println("digite um número: ");
		int number = entrada.nextInt();
		String multiplo; 
		multiplo = (number % 3 == 0 )? "multplo de 3": "não multiplo de 3";
		System.out.println("o número " + number + " é " + multiplo);
		entrada.close();
		
		
		
		
	}

}
