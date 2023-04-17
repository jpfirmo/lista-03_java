import java.util.Scanner;

public class questao_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		System.out.println("informe o seu nome: ");
		String name = entrada.nextLine();
		int contadorname = 0;
		while(contadorname < 5) {
			contadorname++;
			System.out.println(contadorname + ": " + name);
			
		}
		
		
		
		
	}

}
