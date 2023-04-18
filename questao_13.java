import java.util.Scanner;

public class questao_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		System.out.println("insira o valor da tabuada: ");
		int number = entrada.nextInt();
		int contador = 0;
		int contadormultiplicacao;
		while (contador <= 10) {
			contadormultiplicacao = number * contador;
			System.out.println("tabuada do: " + contadormultiplicacao);
			System.out.println( number + "x" + contador + "=" + contadormultiplicacao );
			contador++;
		}
		
		
		
		
		
		
	}

}
