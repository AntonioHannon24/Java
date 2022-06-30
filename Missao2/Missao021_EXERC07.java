package Missao2;

public class Missao021_EXERC07 {
	
	public static void main(String[] args) {
		int y = 0 , x = 13;
		
		
		for(int i = 0; i <= y; i++) { // quando entra no loop, i chega com o valor de 2,
			//somente sairá do loop se y for menor que 2
		
		if(x % 2 == 0) {
			y = x /2;
			x = y;
			System.out.print(y+" -> ");
			i = 1; // inseri o valor 1 em i
		}else {
			y = 3* x + 1;
			x = y; 
			System.out.print(y+" -> ");
			i = 1; //inseri o valor 1 em i
		}
		
	  }
	}

}
