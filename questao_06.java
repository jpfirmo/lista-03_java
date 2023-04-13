import java.util.Scanner;

public class questao_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("digite seu nome: ");
		String name = entrada.nextLine();
		System.out.println("informe o turno do seu curso: ");
		String turno = entrada.nextLine();
		switch(turno) {
		case "matutino":
			System.out.println("bom dia");
			break;
		case "vespertino":
			System.out.println("boa tarde");
			break;
		case "noturno":
			System.out.println("boa noite");
			break;
		default:
			System.out.println("turno invalido");
		}
		
		entrada.close();
		
	}

}
