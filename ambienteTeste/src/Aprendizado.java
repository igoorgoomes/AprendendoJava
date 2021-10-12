
public class Aprendizado {

	public static void main (String[] args) {
		System.out.println("Aprendendo a linguagem Java");
		/*System.out.println("Alterando o código pelo Github");
		System.out.println("Fazendo mais uma alteração da IDE para o Github");*/
		
		//Usando Variaveis int e double:
		
		/*int ano = 1996;
		int idade = 24;
		
		System.out.println("Igor nasceu em "+ano+" ou seja, Igor tem "+idade+" anos.");
		
		double salario = 3.756;
		
		System.out.println("O salário de Igor é de R$"+salario+" reais.");
		System.out.println("Igor pretende ganhar muito mais que RS"+salario+" trabalhando com desenvolvimento em Java!");*/
		
		// Usando Variaveis char e String:
		/*char valor = 'a';
		System.out.println(valor);
		//quando utilizamos a variavel char usamos aspas simples, deferente de quando usamos a variavel String vamos usar as aspas normais. 
		
		String nomeAluno  = "Igor";
		System.out.println(nomeAluno);*/
		
		// Usando a condicional if:
		
		System.out.println("Club Dev");
		int idade = 18;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >=2;
				
		if (idade>=18 && acompanhado) {
			System.out.println("Você é maior de idade.");
			System.out.println("Seja bem vindo ao club Dev!");
		} else {
			System.out.println("Infelizmento vocẽ é menor de idade, retorne acompanhado de um maior de idade para entrar no clube Dev!");
		}
	}
}
