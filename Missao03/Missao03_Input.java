package Missao03;
import java.util.Scanner;

public class Missao03_Input {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String Texto = entrada.nextLine();
		
		System.out.println("Digite um numero inteiro: ");
		int n_int = entrada.nextInt();
		
		
		System.out.println("Digite um numero real: ");
		double n_real = entrada.nextDouble();
		
		System.out.println("Digite uma letra ou um numero: ");
		String Palavra = entrada.next();
		
		
		System.out.println("A frase digitada foi: "+Texto);
		System.out.println("O numero inteiro digitado foi: " + n_int);
		System.out.println("O numero real digitado foi: " + n_real);
		System.out.println("A letra ou numero digitado foi: "+Palavra);
		
		entrada.close();
		
		
		
	}

}
