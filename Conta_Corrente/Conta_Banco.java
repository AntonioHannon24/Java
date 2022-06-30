package Conta_Corrente;

public class Conta_Banco {
	
	private String numConta; private double saldo,limite,tot_limite;
	
			// metodos get and set
	
	
	private double getSaldo() {
		return saldo;
	}
	private void setSaldo(double a) {
		this.saldo = a;
	}
	
	private double getLimite() {
		return limite;
	}
	private void setLimite(double a) {
		this.limite = a;
	}

	private double getTot_Limite() {
		return this.tot_limite;
	}
	
	
			//construtor de conta
	public Conta_Banco(double limd, double limc,String num) {
		this.numConta = num;
		this.saldo=limd;
		this.limite = limc;
		this.setLimite(limc);
	}
	
	
			// funções 
	
	public void Sacar(double valor) {
		
		
		
		if(this.getSaldo() >= valor) {// se o saldo for maior que o saque
			
			this.setSaldo(this.getSaldo() - valor); // saque tira valor do saldo
		
			
		}else if(this.getSaldo() == 0 && this.getLimite() >= valor) { // se o saldo for == 0 e limite for maior ou igual a valor
			
			this.setLimite(this.getLimite()-valor); // saque tira valor do limite
			
			
		}else if (this.getSaldo() + this.getLimite() >= valor) { // se o saldo + o limite for maior ou igual a valor
			
			double val;
			
			val = this.getSaldo() - valor; // tira o total do saldo
			this.setSaldo(0);
			this.setLimite(this.getLimite() + val); // tira o total do limite
			
			
		}else {
			System.out.println("Impossivel fazer essa operação");
			
		}
		
		
	}
	
	public void Depositar(double valor) {
		double a;
		
		if(this.getLimite() < this.getTot_Limite()) { // se o limite é menor que o total de limite/ ex: limite 0 totlim= 400
				if(valor > this.getTot_Limite()) { // se o valor for maior que o total do limite/ ex valor 600 totlim 400
						
						a =	 valor -this.getTot_Limite() ; // a = valor -  total de limite
						this.setSaldo(a); // resto fica para o saldo
						this.setLimite(this.getTot_Limite()); // o limite volta ao total
						
						
				}else { // se o valor for menor que o total limite/ ex: valor 300 limite 400
						
						if((this.getLimite() + valor) >= this.getTot_Limite()) {// se o valor + getlimite for maior que o total limite./ex: valor + limite = 600; tot limite = 400
							
							a =	valor - (this.getTot_Limite()  -this.getLimite()); // a = tot limite - limite
							this.setSaldo(a); // resto fica para o saldo
							this.setLimite(this.getTot_Limite()); // o limite volta ao total
							
						}
						else {
							this.setLimite(this.getLimite() + valor); // o valor entra no credito
							
						}
				}
		
		}else // o valor entra no debito
			this.setSaldo(this.getSaldo() + valor);	
		

	}
	
	public void verificarSaldo() {
		System.out.println( this.getSaldo());
	}
	
	
	public void transferir(double valor) {
		
		if(valor <= this.getSaldo()) { // se o valor for menor ou igual ao saldo
			this.setSaldo(this.getSaldo()-valor);// tira o valor do saldo
			System.out.println("foi tranferido o valor de R$: "+ valor);
		}else {// se o valor for maior que o saldo ele nega a operação
			System.out.println("Você não possui saldo para efetuar essa transferencia!!");
		}	
	}
	
	public String toString() {
return "Conta_Banco \n{" + "\n Numero da conta: " + numConta + "\n Saldo: "+ saldo + "\n Limite= " + limite + "\n }" ;
	}
	
	
	
}
