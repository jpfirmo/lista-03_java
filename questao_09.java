import java.util.Scanner;

public class questao_09 {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite a operação aritmetica desejada: ");
		String operacao = entrada.nextLine();
		
		System.out.println("digite um número: ");
		double n1 = entrada.nextDouble();
		
		System.out.println("digite um número: ");
		double n2 = entrada.nextDouble();
		
		double multiplicacao = n1 * n2;
		double divisao = n1 / n2;
		double adicao = n1 + n2;
		double subtracao = n1 - n2;
		
		switch(operacao) {
		case "multiplicação":
			System.out.println("o resultado é: " + multiplicacao);
			break;
		case "divisao":
			System.out.println("o resultado é: " + divisao);
			break;
		case "adição":
			System.out.println("o resultado é: " + adicao);
			break;
		case "subtração":
			System.out.println("o resultado é: " + subtracao);
			break;
		default:
			System.out.println("operação indisponivel");
		}
	}
}
