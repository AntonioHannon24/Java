package Missao01;
import java.util.Scanner;

public class Missao01_EXERC03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		double trans,alim,media_s,sun,media_t,media_a,mes;
		mes = 30;
		
		System.out.print("Digite o valor gasto em transporte no mês: ");
		trans = ler.nextDouble();	
		System.out.print("Digite o valor gasto em alimentação no mês: ");
		alim = ler.nextDouble();
		
		sun = trans + alim;
		media_s = sun / mes;
		media_t = trans / mes;
		media_a = alim/mes;
		
		System.out.println("======================================Resultados =================");
		System.out.println("");
		System.out.println("Você gasta R$"+ trans+" em transporte, e R$" +alim+" em alimentação em um mês somando o valor de R$" + sun + " Reais");
		System.out.println("O valor diario em transporte é de : " + media_t);
		System.out.println("O valor diario em alimentação é de : "+ media_a);
		System.out.println("A soma entre transporte e alimentação gera um gasto diario de: "+ media_s);
		System.out.println("");
		System.out.println("==================================================================");
		
		
		
		
		
		ler.close();

	}

}
