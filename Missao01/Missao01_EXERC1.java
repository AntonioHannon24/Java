package Missao01;
/*
  com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), 
  Rankine (Ra) e Fahrenheit(F), seguindo as 
  
 * 
 * 
 * */



public class Missao01_EXERC1 {

	public static void main(String[] args) {
		
		double c,k,re,ra,f; // criando as variaveis
		c = 22.5; // graus celsius
		k = c + 273.15;  // convertendo para k
		f = c * 1.8 + 32; // convertendo para f
		re = c * 0.8;  // convertendo para re
		ra = c * 1.8 + 32 + 459.67; // convertendo para ra
		
		System.out.println("A temperatura em Celsius está: " + c);
		System.out.println("A temperatura em Kelvin está: " + k);
		System.out.println("A temperatura em Réaumur está: "+ re);
		System.out.println("A temperatura em Rankine está: "+ ra);
		System.out.println("A temperatura em Fahrenheit está: "+ f);
		
		
		
		
		
		
		
		
	}

}
