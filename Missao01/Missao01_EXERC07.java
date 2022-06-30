package Missao01;
import java.util.Scanner;

public class Missao01_EXERC07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner ler = new Scanner(System.in);
		
		int ano,mes,dd, aa,mm,sum;
		
		System.out.print("Digite o numero de anos: ");
		aa = ler.nextInt();
		System.out.print("Digite o numero de meses: ");
		mm = ler.nextInt();
		System.out.print("Digite o numero de dias: ");
		dd = ler.nextInt();
		
		ano = aa * 365;
		mes = mm * 30;
		sum = ano + mes + dd;
		
		
		System.out.println("========================= Resultado ==============");
		System.out.println("");
		System.out.println("A quantidade de dias que " + aa + " anos tem: " + ano);
		System.out.println("A quantidade de dias que " + mm + " mes tem: " + mes);
		System.out.println("A quantidade de dias que foi digitado: " + dd);
		System.out.println("O resultado da soma de dias vai ser: "+ sum);
		System.out.println("");
		System.out.println("==================================================");
		
		ler.close();
		
		
		
	}

}
