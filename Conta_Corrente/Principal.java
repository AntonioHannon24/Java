package Conta_Corrente;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		
		
		
		Conta_Banco v[] = new Conta_Banco[4];
		Scanner ler = new Scanner(System.in);
		
		
		v[0] = new Conta_Banco(800,400,"1"); // conta 1
		v[1] = new Conta_Banco(800,400,"2"); // conta 2
		v[2] = new Conta_Banco(800,400,"3"); // conta 3
		v[3] = new Conta_Banco(800,400,"4"); // conta 4
		
		
		
		System.out.println(v[0]);
		

				ler.close();
				

	}

}
