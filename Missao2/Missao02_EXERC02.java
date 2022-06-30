package Missao2;

/*
 * 2.2 Monte um programa que imprima o valor da soma dos números de 1 até 1000.
 * 
 * */



public class Missao02_EXERC02 {
	
	public static void main(String[] args){
		
		int calc = 0;
		
		for(int i = 0; i <= 1000; i++) {
			
			calc += i;
			System.out.println(i +" : "+ calc);
		}
		
	}

}
