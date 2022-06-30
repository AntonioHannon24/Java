package missao05;
import java.util.Scanner;


public class Missao5_principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		escreva a = new escreva(); // criei uma classe de funções para facilitar
		Texto_secreto crip = new Texto_secreto();
		
		
	
		
		
		Scanner ler = new Scanner(System.in);
		
		
		
		
		
		crip.setTexto("teste de cozinha para verificar se deu certo, teste");
		System.out.println( crip.encontrar("teste"));
		
		
		
		
		
		
		
		
		/*                    Desafio 01
		 
		String Msg_inicial = "Inicio da Missão 4"; 
		a.esc(Msg_inicial);
		
		*/
		
		
		/*					Desafio 02
		
		String nomeAutor = "Antonio Feranando Alves De Souza";
		String dataAtual = "08/05/2022";
		a.esc("Este codigo foi desenvolvido pelo autor:" + nomeAutor);
		a.escl(" Na data de " + dataAtual);
		
		*/
		
		/*					Desafio 03 parte 1
		String dados; int tamanho;
		a.escl("Qual é o seu nome?");
		dados = ler.nextLine();
		tamanho = dados.length();
		
		
		System.out.println("O nome digitado ("+dados+") tem " +tamanho+" letras");
		 */
		
		/*					Desafio 03 parte 2
		String nomeCadastrado = "Antonio Fernando",nomeDigitado;
		
		a.escl("Digite seu nome: ");
		nomeDigitado = ler.nextLine();
		
		if(nomeCadastrado.equals(nomeDigitado)) {
			a.escl("Os nomes são iguais!");
		}else {
			a.escl("Os nomes são diferentes!");
		}
		
		*/
		
		/*				desafio 04  parte 1
		String textoSecreto = "anton",login;
		a.escl("Qual é seu login? ");
		login = ler.nextLine();
		if(login.length() > 5) {
			a.escl("Seu login não pode ter mais que 5 caracteres!!");
		}else {
			if(login.equals(textoSecreto)) {
				a.escl("Login efetuado com sucesso!!");
			}else {
				a.escl("Os dados não conferem!!");
			}
		}
		*/
		
		/*				desafio 05 parte 1
		String textoSecreto = "anton",login;
		a.escl("Qual é seu login? ");
		login = ler.nextLine();
		if(login.length() > 5) {
			a.escl("Seu login não pode ter mais que 5 caracteres!!");
		}else {
			if(login.equalsIgnoreCase(textoSecreto)) {                   // aqui está aceitando tanto anton com letras maiusculas, qaunto minusculas ou mistas
				a.escl("Login efetuado com sucesso!!");
			}else {
				a.escl("Os dados não conferem!!");
			}
		}
		*/
		
		/*				desafio 5 parte 2
		String nome= "Antonio ",sobrenome="Fernando",nomeCompleto1,nomeCompleto2;
		
		nomeCompleto1 = nome + sobrenome;
		nomeCompleto2 = nome.concat(sobrenome);
		a.escl(nomeCompleto1);
		a.escl(nomeCompleto2);
		
		*/
		
		/*				desafio 5 parte 3
		String nome = "Antonio";
		a.escl(" A primeira letra do nome "+nome+" é : " + nome.charAt(2));
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		*/
		
		/*  			desafio 6 e 7 ===== Fiz tudo no exercicio 6 entao nao vou repetir

		String textoSecreto = "Esse texto é um exemplo  no seu dia dia apos a pandemia do hamburguer de frango A",letra;
		int cont = 0;boolean res=false;
		System.out.println("Qual letra deseja verificar? ");
		letra = ler.nextLine();
		
		for(int i = 0; i < textoSecreto.length(); i++){
			
				if(textoSecreto.codePointAt(i) == letra.codePointAt(0)) {
					cont +=1;
					res = true;
				}
		}
		
		if(res == true) {
			System.out.println("A letra ("+ letra + ") foi encontrada no texto "+cont+" vezes");
		}else {
			System.out.println("A letra ("+ letra + ") não foi encontrada!!");
		}
		*/
		
		/*				desafio 7 parte 2
		String nomeCurso = "Curso de java";
		System.out.println(nomeCurso);
		//
		String subTexto1=nomeCurso.substring(9);
		System.out.println(subTexto1);
		//
		String subTexto2=nomeCurso.substring(0,5);
		System.out.println(subTexto2);
		*/
		
		
		 
		/*				desafio 8 perrengue
		String textoSecreto1, textoSecreto2,captura,total; int cont = 0;
		
		textoSecreto1 = "teste de frequencia de quantos alunos são subordinados ";
		textoSecreto2 = "não acredito que o fim da maria se deu por uma queda dentro do banheiro unisex teste";
		
		System.out.println("Digite uma palavra/nome na qual você deseja encontrar nos textos secretos: ");
		captura = ler.nextLine().toLowerCase();  // ENTRADA DE DADOS, SENDO CONVERTIDA PARA LETRAS MINUSCULAS
		
		
		total = textoSecreto1.toLowerCase() + textoSecreto2.toLowerCase();//colocando os dois textos EM LETRA MINUSCULA na var total	
		String teste[] = total.split(" "); // Separando em um array todas as palavras separadas por virgula
		
		for (int i=0; i<teste.length; i++) { // contador do total do tamanho da var total
           
            if(teste[i].equals(captura)) { // se o indice tiver uma palavra igual a captura, ele conta mais um
            	cont +=1;
            }
            
		}
		
			if(cont > 0) { // se o contador for maior do que zero
				System.out.println("O texto possui "+cont+ " ocorrências do termo, palavra ou nome: ("+ captura+")");
			}else {// se o contador for zero do que zero
				System.out.println(" Texto não possui do termo, palavra ou nome ("+ captura+")");
			}
			
		*/
		
		/*                 Desafio 8 parte 2
		String nome = "Antonio",nomeAlterado;
		System.out.println("O nome original é: " + nome);
		nomeAlterado = nome.replace("o", "ô");
		System.out.println("Primeira alteração foi : " + nomeAlterado);
		nomeAlterado = nomeAlterado.replace("i", "í");
		System.out.println("Segunda alteração foi : " + nomeAlterado);
		*/
		
		
		/*					Desafio 9
		String texto = "polar",textoSecreto,textoSecreto2,textoSecreto3,textoSecreto4,textoSecreto5;

		textoSecreto = texto.replace("p", "z");
		textoSecreto2 = textoSecreto.replace("o","e");
		textoSecreto3 = textoSecreto2.replace("l","n");
		textoSecreto4 = textoSecreto3.replace("a","i");
		textoSecreto5=textoSecreto4.replace("r","t");
		
		System.out.println(textoSecreto5);
		*/
		
		
		/*					Desafio 10
		
		String texto = "",textoSecreto,textoSecreto2,textoSecreto3,textoSecreto4,textoSecreto5;

		textoSecreto = texto.replace("z", "p");
		textoSecreto2 = textoSecreto.replace("e","o");
		textoSecreto3 = textoSecreto2.replace("n","l");
		textoSecreto4 = textoSecreto3.replace("i","a");
		textoSecreto5=textoSecreto4.replace("t","r");
		
		System.out.println(textoSecreto5);
		
		*/
		
		
		
		
		
		
		ler.close();
		
		
		
		
		
	}

}
