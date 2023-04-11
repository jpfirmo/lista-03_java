import java.util.Scanner;

public class questao_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		System.out.println("digite um numero: ");
		int number1 = entrada.nextInt();
		System.out.println("digite um numero: ");
		int number2 = entrada.nextInt();
		int soma = number1 + number2;
		int operadorternario;
		operadorternario = (soma >= 20)? (soma + 8) : (soma - 5);
		System.out.println("resultado é: " + operadorternario);
	}

}
