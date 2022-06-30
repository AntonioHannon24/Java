package Missao03;
import java.util.Scanner;
public class Missao03_principal {

	public static void main(String[] args) {
		
		double r_soma,r_sub,r_mult,r_div,n1,n2;
		Missao03_Calculadora obj_Calculadora = new Missao03_Calculadora();
		Scanner ler = new Scanner(System.in);
		
		
		
		
		System.out.println("Inicio da Missão 3");
		
		
		System.out.println("Operação de soma: ");
		System.out.println("Digite o primeiro numero: ");
		n1 = ler.nextDouble();
		System.out.println("Digite o segundo numero: ");
		n2 = ler.nextDouble();
		r_soma = obj_Calculadora.Somar(n1,n2);
		System.out.println("O resultado da soma é: " + r_soma);
		
		
		
		System.out.println("Operação de subtração: ");
		System.out.println("Digite o primeiro numero: ");
		n1 = ler.nextDouble();
		System.out.println("Digite o segundo numero: ");
		n2 = ler.nextDouble();
		r_sub = obj_Calculadora.Subtrair(n1, n2);
		System.out.println("O resultado da subtração é " + r_sub);
		
		
		System.out.println("Operação de multiplicação: ");
		System.out.println("Digite o primeiro numero: ");
		n1 = ler.nextDouble();
		System.out.println("Digite o segundo numero: ");
		n2 = ler.nextDouble();
		r_mult = obj_Calculadora.Multiplicar(n1, n2);
		System.out.println("O resultado da multiplicação é " + r_mult);
		
		
		System.out.println("Operação de divisão: ");
		System.out.println("Digite o primeiro numero: ");
		n1 = ler.nextDouble();
		System.out.println("Digite o segundo numero: ");
		n2 = ler.nextDouble();
		r_div = obj_Calculadora.Dividir(n1, n2);
		System.out.println("O resultado da divisão é " + r_div);
		
		
		System.out.println("Fim das operações!!!!!!!!!!");
		
		
		
		ler.close();
		
		
	}

}
