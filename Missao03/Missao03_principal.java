package Missao03;
import java.util.Scanner;
public class Missao03_principal {

	public static void main(String[] args) {
		
		double r_soma,r_sub,r_mult,r_div,n1,n2;
		Missao03_Calculadora obj_Calculadora = new Missao03_Calculadora();
		Scanner ler = new Scanner(System.in);
		
		
		
		
		System.out.println("Inicio da Miss�o 3");
		
		
		System.out.println("Opera��o de soma: ");
		System.out.println("Digite o primeiro numero: ");
		n1 = ler.nextDouble();
		System.out.println("Digite o segundo numero: ");
		n2 = ler.nextDouble();
		r_soma = obj_Calculadora.Somar(n1,n2);
		System.out.println("O resultado da soma �: " + r_soma);
		
		
		
		System.out.println("Opera��o de subtra��o: ");
		System.out.println("Digite o primeiro numero: ");
		n1 = ler.nextDouble();
		System.out.println("Digite o segundo numero: ");
		n2 = ler.nextDouble();
		r_sub = obj_Calculadora.Subtrair(n1, n2);
		System.out.println("O resultado da subtra��o � " + r_sub);
		
		
		System.out.println("Opera��o de multiplica��o: ");
		System.out.println("Digite o primeiro numero: ");
		n1 = ler.nextDouble();
		System.out.println("Digite o segundo numero: ");
		n2 = ler.nextDouble();
		r_mult = obj_Calculadora.Multiplicar(n1, n2);
		System.out.println("O resultado da multiplica��o � " + r_mult);
		
		
		System.out.println("Opera��o de divis�o: ");
		System.out.println("Digite o primeiro numero: ");
		n1 = ler.nextDouble();
		System.out.println("Digite o segundo numero: ");
		n2 = ler.nextDouble();
		r_div = obj_Calculadora.Dividir(n1, n2);
		System.out.println("O resultado da divis�o � " + r_div);
		
		
		System.out.println("Fim das opera��es!!!!!!!!!!");
		
		
		
		ler.close();
		
		
	}

}
