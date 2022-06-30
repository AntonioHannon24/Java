package clone5;

import java.util.Scanner;



public class Missao5_principal {

	public static void main(String[] args) {
		
		
		Texto_secreto crip = new Texto_secreto();
		
		
		String b,a;
		
		
		Scanner ler = new Scanner(System.in);
		
		
		
		
		
		crip.setTexto("teste de cozinha para verificar se deu certo, teste");
		System.out.println( crip.encontrar("teste"));
		
		
		a = crip.cript("pernambuco");
		b = crip.descript(a);
		
		
		System.out.println("======================== crip");
		System.out.println(a);
		System.out.println(b);
		
		ler.close();

	}

}
