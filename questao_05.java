import java.util.Scanner;

public class questao_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		System.out.println("informe seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("informe o sexo: ");
		String sexo = entrada.nextLine();
		switch(sexo) {
		case "feminino": 
			System.out.println(sexo);
			break;
		case "masculino":
			System.out.println(sexo);
			break;
		default:
			System.out.println("sexo invalido");
			break;
		}
		
		
		
		
		
		
		
		
		
	}

}
