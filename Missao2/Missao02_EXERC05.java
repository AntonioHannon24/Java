package Missao2;

/*
 * 
Dará respostas erradas por que chegou no limite de tamanho do tipo de variavel, no caso int. 
alterando para doble resolverá a situação

 * 
 * */



public class Missao02_EXERC05 {

	public static void main(String[] args) {
	
	double c = 1;
	
	
	for(int i = 1; i <= 40; i++) {
		
		c *=i;
		System.out.println(i +" : "+c);
		
	}
		

	}

}
