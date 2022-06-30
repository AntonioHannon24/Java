package missao05;

public class Texto_secreto {
	
	private String texto;
	
	
	public String getTexto(){
		return this.texto;
	}
	
	public void setTexto(String a){
		this.texto = a;
	}
	
	
	
	public String cript(String a) {
		String b,c,d,e,f,g,h,i,j,z,fim;
		
		b = a.replace("p", "t");
		c = b.replace("e", "g");
		d = c.replace("r", "ç");
		e = d.replace("n", "q");
		f = e.replace("a", "d");
		g = f.replace("m", "k");
		h = g.replace("b", "i");
		i = h.replace("u", "x");
		j = i.replace("c","h");
		z = j.replace("o", "v");
		
		fim = z;
		
		
		return fim;
		
		
	}
	
	public String descript(String a) {
		String b,c,d,e,f,g,h,i,j,z,fim;
		
		b = a.replace("t","p");
		c = b.replace("g","e");
		d = c.replace("ç","r");
		e = d.replace("q","n");
		f = e.replace("d","a");
		g = f.replace("k","m");
		h = g.replace("i","b");
		i = h.replace("x","u");
		j = i.replace("h","c");
		z = j.replace("v","o");
		
		fim = z;
		
		
		return fim;
		
		
	}
	
	
	
	public String encontrar(String a) {
	 int cont = 0;
		
		
		
		a.toLowerCase(); //EM LETRA MINUSCULA na var a
		
		String teste[] = texto.split(" "); // Separando em um array todas as palavras separadas por virgula
		
		for (int i=0; i<teste.length; i++) { // contador do total do tamanho da var a
           
            if(teste[i].equals(a)) { // se o indice tiver uma palavra igual a captura, ele conta mais um
            	cont +=1;
            }
            
		}
		
			if(cont > 0) { // se o contador for maior do que zero
				return ("O texto possui "+cont+ " ocorrências do termo, palavra ou nome: ("+ a +")");
			}else {// se o contador for zero do que zero
				return (" Texto não possui do termo, palavra ou nome ("+ a +")");
			}
		
	}
	
	
	
	
	

}
