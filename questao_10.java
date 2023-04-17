import java.util.Scanner;

public class questao_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		System.out.println("informe seu nome: ");
		String cliente = entrada.nextLine();
		System.out.println("informe a categoria do produto: (A), (B), (C), (D), (E)");
	    String categoria = entrada.next().toUpperCase();
		System.out.println("informe o preço do produto: ");
		double preco = entrada.nextDouble();
		double a = preco - (preco * 0.20);
		double b = preco - (preco * 0.17);
		double c = preco - (preco * 0.12);
		double d = preco - (preco * 0.08);
		double e = preco - (preco * 0.05);
		switch(categoria) {
		case "A":
			System.out.println("valor do reajuste: " + a + "R$");
			break;
		case "B":
			System.out.println("valor do reajuste: " + b + "R$");
			break;
		case "C":
			System.out.println("valor do reajuste: " + c + "R$");
			break;
		case "D":
			System.out.println("valor do reajuste: " + d + "R$");
			break;
		case "E":
			System.out.println("valor do reajuste: " + a + "R$");
			break;
		default:
			System.out.println("valor sem o reajuste: " + preco + "R$");
		}
		
		
		
		
		
	}

}
