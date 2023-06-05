package prjtPizzaria;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		
		Cliente cli = new Cliente();
		Scanner in = new Scanner(System.in);
		
		
		 
		
		System.out.println("Digite seu Nome: "); 
		cli.nome = in.nextLine();
		
		System.out.println("Digite seu Endereço: ");
		cli.endereco = in.nextLine();
		
		System.out.println("Digite seu Telefone: ");
		cli.telefone = in.next();
		
		System.out.println("Nome: "+ cli.nome); 
		System.out.println("Endereço: " +cli.endereco);
		System.out.println("Telefone: " +cli.telefone);
		
		cli.fazerPedido();
	
	}
}