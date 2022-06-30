package Missao01;

public class Missao01_EXERC09 {

	public static void main(String[] args) {
		
		
		double car,depre,porc,invest,correc,dif; int anos, i; // declarando variaveis e seus tipos
		porc = 0.07; anos = 9;car = 10.000; // declarando as variaveis e seus valores
		depre = 0; invest = car; correc = 0; // iniciando variaveis
		
		for(i = 0; i <= anos; i++) { // laço de repetição
		
		depre = (car*porc); //  calculando o valor do carro pela porcentagem ao ano
		car -= depre; // diminuindo do valor do carro a nova depreciação
		
		correc =(invest*porc); // calculando o valor do investimento pela porcentagem ao ano
		invest+= correc; // somando o valor do investimento com a correção
		}
		
		dif =invest - car; // diferença entre o investimento e o valor do carro
		
		System.out.println("====================== Resultados ===============================================");
		System.out.println("");
		System.out.println("O valor final do carro após 10 anos ficou R$: "+ car);
		System.out.println("O valor final do investimento feito após 10 anos ficou R$: "+ invest);
		System.out.println("A diferença entre o carro e o investimento durante 10 anos foi de R$: " + dif );
		System.out.println("");
		System.out.println("==================================================================================");
		
	}

}
