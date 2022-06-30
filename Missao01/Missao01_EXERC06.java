package Missao01;

import java.util.Scanner; // importando entrada de dados Scanner

public class Missao01_EXERC06 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in); // criando o objeto
		double valor,consumo,km,gasto; // declarando as variaveis
		valor=6.50; consumo = 12; km = 0; // iniciando as variaveis

		
		System.out.println("Digite quantos Km foram andados: "); 
		km = ler.nextDouble(); // entrada de dados na variavel km
		
		gasto = (km / consumo) * valor; // Calculo do valor gasto
		
		
		
		
		System.out.println("================== resultados ==================");
		System.out.println("");
		System.out.println("O valor do litro está: R$"+valor);
		System.out.println("O consumo do carro é: "+consumo+" Km por litro de combustivel" );
		System.out.println("Os Km rodados foram de: "+km);
		System.out.println("O valor gasto para andar os "+km+" Km foi de "+gasto+" Reais" );
		System.out.println("");
		System.out.println("=================================================");
		
		
		ler.close();
	}
	

}
