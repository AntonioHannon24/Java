package Missao01;

/*
 Fazer um programa (Miss�o1_EXERC08) que imprima a m�dia aritm�tica dos n�meros 
8,9 e 7. A m�dia dos n�meros 4, 5 e 6. A soma das duas m�dias. A m�dia das m�dias
*/

public class Missao01_EXER08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1,n2,n3,n4,n5,media1,media2,somaMedias,mediaF;
		
		n1 = 8.9; n2 = 7;
		n3 = 4; n4 = 5; n5 = 6;
		media1 = (n1+n2)/2;
		media2 = (n3+n4+n5)/3;
		somaMedias = media1 + media2;
		mediaF = somaMedias / 2;
		
		System.out.println("A m�dia entre o valor "+n1+ " e "+n2+ " �: " + media1);
		System.out.println("A m�dia entre o valor "+n3+ " o valor "+n4+" e o valor  "+n5+ " �: " + media2);
		System.out.println("A soma das duas m�dias �: " + somaMedias);
		System.out.println("A m�dia entre "+media1+ " e "+media2+" �: "+ mediaF);
		

	}

}
