package Missao01;

public class Missao01_EXERC09 {

	public static void main(String[] args) {
		
		
		double car,depre,porc,invest,correc,dif; int anos, i; // declarando variaveis e seus tipos
		porc = 0.07; anos = 9;car = 10.000; // declarando as variaveis e seus valores
		depre = 0; invest = car; correc = 0; // iniciando variaveis
		
		for(i = 0; i <= anos; i++) { // la�o de repeti��o
		
		depre = (car*porc); //  calculando o valor do carro pela porcentagem ao ano
		car -= depre; // diminuindo do valor do carro a nova deprecia��o
		
		correc =(invest*porc); // calculando o valor do investimento pela porcentagem ao ano
		invest+= correc; // somando o valor do investimento com a corre��o
		}
		
		dif =invest - car; // diferen�a entre o investimento e o valor do carro
		
		System.out.println("====================== Resultados ===============================================");
		System.out.println("");
		System.out.println("O valor final do carro ap�s 10 anos ficou R$: "+ car);
		System.out.println("O valor final do investimento feito ap�s 10 anos ficou R$: "+ invest);
		System.out.println("A diferen�a entre o carro e o investimento durante 10 anos foi de R$: " + dif );
		System.out.println("");
		System.out.println("==================================================================================");
		
	}

}
