import java.util.Scanner;

public class questao_16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero para tabuada: ");
		int number = entrada.nextInt();
		for(int i = 1; i <= 10; i++) {
		int	resultado = number * i;
		System.out.println(number + " x " + i + " = " + resultado);
		}
		
		
		
		
		
		
	}
}
