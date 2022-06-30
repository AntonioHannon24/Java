package Missao2;

public class Missao02_Desafio4 {

	public static void main(String[] args) {
		
		System.out.println("Missão 2 - Desafio 4 - WHILE");
		
		int num = 0;
		
		while(num <= 40) {
			
			if(num % 2 != 0){// se num for mod de 2 == 0
				System.out.println(num);
			}
			num +=3 ; // incremento
		}

		System.out.println("Missão 2 - Desafio 4 Concluído");
	}
	
	
}
