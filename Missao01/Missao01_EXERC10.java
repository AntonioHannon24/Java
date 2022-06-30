package Missao01;
import java.util.Scanner;

public class Missao01_EXERC10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sal,min,calc;
		min = 1210.00;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("");
		System.out.print("Digite o seu salario: ");
		System.out.print("");
		sal = ler.nextDouble();
		calc = sal / min; 
		
		
		System.out.print("==================================== Resultado ======================");
		System.out.println();
		System.out.print("O seu salario de "+ sal+ " representa " +calc + " Salario(s) minimos");
		System.out.println();
		System.out.print("=====================================================================");
		
		ler.close();
		

	}

}
