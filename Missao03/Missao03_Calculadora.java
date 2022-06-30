package Missao03;

public class Missao03_Calculadora {

	private double r;
	
	public double Somar(double n1, double n2)
	{
		
		r = n1 + n2;
		return r;
	}
	public double Subtrair(double n1, double n2) 
	{
	
		r = n1 - n2;	
		return r;
		
	}
	public double Multiplicar(double n1, double n2) 
	{
		r = n1 * n2;
		return r;
	}
	public double Dividir(double n1, double n2)
	{
		if(n2 == 0) 
		{
			System.out.println("O denominador não pode ser zero!!");
			r = 0;
			
		}else {
		
		r = n1 / n2; 
		
		}
		return r;
	}
	
}
