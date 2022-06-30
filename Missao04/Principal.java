package Missao04;



public class Principal {

	public static void main(String[] args) {
		
		missao04_conta_Corrente conta[] = new missao04_conta_Corrente[2]; double trans;
		Funcionario func[] = new Funcionario[2];
		
		conta[0] = new missao04_conta_Corrente(800,400,"1","Antonio"); // conta 1
		conta[1] = new missao04_conta_Corrente(800,400,"2","José"); // conta 2
		func[0]= new Funcionario("Antonio","Gerente",400);
		func[0]= new Funcionario("Jose","auditor",800);
		
		
		System.out.println(conta[0]);
		
		System.out.println();System.out.println();System.out.println();
		
		// testes
		
		conta[0].Depositar(400);
		conta[0].Sacar(1000);
		conta[0].Sacar(400);
		conta[0].Sacar(200);
		conta[0].Sacar(200);	
		conta[0].Depositar(400);
		conta[0].Depositar(400);
		conta[0].Depositar(400);
		conta[0].Depositar(400);
		
		trans = conta[0].transferir(400); // transferencia cai na variavel trans
		conta[1].Depositar(trans); // recebendo o valor da transferencia
		
		System.out.println();System.out.println();System.out.println();
		
		
		System.out.println(conta[0]);
		
		
		
		
		
		
		
		

	}

}
