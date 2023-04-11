import java.util.Scanner;

public class questao_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
	    System.out.println("digite um número: ");	
		int number = entrada.nextInt();
		String test;
		test = (number < 0)? "negativo": "positivo";
		System.out.println("o numero: "+ number + " é " + test);
		
		
		
	}

}
