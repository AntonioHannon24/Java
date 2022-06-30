package Missao04;

public class Funcionario {
	private String nome,cargo;private double salario;
	
		//Construtor
	public Funcionario(String nome, String cargo, double salario) {
		
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		System.out.println("=========================");
		System.out.println("Funcionario Instanciado!! \nnome: "+nome+"\nFuncao: "+cargo+ "\nsalario R$: "+salario);
		System.out.println("=========================");
	}
	
	
	//

	public String getNome(){return this.nome;}
	public String getFuncao(){return this.cargo;}
	public double getSalario(){return this.salario;}
	
	
	
	
	
	
	
}
