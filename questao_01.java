import java.util.Scanner;

public class questao_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		System.out.println("informe um número: ");
		int number = entrada.nextInt();
		String teste;
		teste = (number % 2 == 0)? "par" : "impar";
		System.out.println("o número: " + number + " é " + teste );
		
		
		
		
		
		
		
	}

}
