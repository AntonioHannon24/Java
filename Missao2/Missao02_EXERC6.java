package Missao2;
/*
 	0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
 */
public class Missao02_EXERC6 {

	public static void main(String[] args) {
		
	int a = 1,b = 0,c;
	
	for(int i = 0; i < 2000;) {
		
		c = a + b;
		System.out.println(c);
		b = a; // b recebe o valor de a
		a = c; // a recebe o valor de c
		i = c; // contador recebe o valor de c
	}
	}

}
