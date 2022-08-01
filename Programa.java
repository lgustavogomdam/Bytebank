import java.util.Scanner;

/*
 	SINTAXE--------------
 	
	public = torna o elemento público
	protected = concede acesso apenas aos filhos das Classes Mãe
	private = torna o elemento privado ( ou seja, só pode ser acessado por meio de métodos

	static = torna o elemento estático ou de uso comum para toda a classe(se definido na classe) ou de uso comum a todos
	
	get = função de captura o elemento
	set = função de inserir no elemento	
	Construtor = método incluso de construir ou iniciar uma classe. O construtor pode ou não ter parâmetros de inicialização
	
	this = usado para se referenciar a um atributo local
	class = usado para definir uma classe
	super = referencia-se a Super Class (origem da classse de herança)
	
	Scanner(System.in) = leitura de dados no teclado
	Scanner(System.in).nextLine = leitura de strings
					  .nextInt  = leitura de inteiros
					  .nextDouble = leitura de pontos flutuantes
	
	DIFERENÇA ENTRE CLASSE E OBJETO-------
	
	Classe é o código e objeto é o resultado ou representação desse código como um todo no mundo "real"
	
	VARIÁVEIS------------
	
	long = numero inteiro extenso
	short = numero inteiro curto
	double = normalmente usado para definir ponto flutuante / < int
	int = numeros inteiros
	char = caracteres únicos
	String = palavra ou frase
	boolean = numero booleano (1 ou 0 / true or false)
	
	
*/

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("\n======|SOBRE A CONTA|======\n");
		
		System.out.println("Por favor, digite o numero da Agencia a qual a nova conta pertencerah: ");
		int numeroAgencia = new Scanner(System.in).nextInt();
		
		System.out.println("Por favor, digite o numero da nova conta a ser criada: ");
		int numeroNovaConta = new Scanner(System.in).nextInt();
		
		System.out.println("\n======|SOBRE O CLIENTE|======\n");
		
		System.out.println("Por favor, digite o Nome da pessoa cuja conta pertencerá: ");
		String cliente = new Scanner(System.in).nextLine();
		
		System.out.println("Por favor, digite o CPF da pessoa cuja conta pertencerá (com acentuação): ");
		String cpfCliente = new Scanner(System.in).nextLine();
		
		System.out.println("Por favor, digite o RG da pessoa cuja conta pertencerá (com acentuação): ");
		String rgCliente = new Scanner(System.in).nextLine();
		
		System.out.println("Por favor, digite a idade  da pessoa cuja conta pertencerá: ");
		int idadeCliente = new Scanner(System.in).nextInt();
		
		System.out.println("\n======|ENDERECO DO CLIENTE|======\n");
		
		System.out.println("Por favor, digite a Rua: ");
		String ruaEndereco = new Scanner(System.in).nextLine();
		
		System.out.println("Por favor, digite o numero: ");
		int numeroEndereco = new Scanner(System.in).nextInt();
		
		System.out.println("Por favor, digite o Bairro: ");
		String bairroEndereco = new Scanner(System.in).nextLine();
		
		System.out.println("Por favor, digite o CEP (com acentuação): ");
		String cepEndereco = new Scanner(System.in).nextLine();
		
		System.out.println("Por favor, digite a Cidade: ");
		String cidadeEndereco = new Scanner(System.in).nextLine();
		
		Conta x = new Conta(numeroAgencia, numeroNovaConta, cliente,cpfCliente,rgCliente,idadeCliente,ruaEndereco,
				numeroEndereco, bairroEndereco, cepEndereco, cidadeEndereco); //chamada de construtor para iniciar uma conta já com os dados
		
		//Sequencia de prints
		
		System.out.println("======|CONTA|======\n");
		System.out.println("Sua Agencia eh: " +x.getAgencia() + "\n");
		System.out.println("O Numero de sua Conta eh: " +x.getNumeroConta() + "\n");
		System.out.println("Seu saldo eh: " +x.getSaldo() + "\n");
		
		System.out.println("======|CLIENTE|======\n");
		System.out.println("Nome do titular da conta eh: " + x.getCliente().getNome());
		System.out.println("Seu CPF eh: " + x.getCliente().getCpf());
		System.out.println("Seu RG eh: " + x.getCliente().getRg());
		System.out.println("Sua idade eh: " + x.getCliente().getIdade() + "\n");
		
		System.out.println("======|ENDERECO|======\n");
		System.out.println("Rua: " + x.getCliente().getEndereco().logradouro + ", Numero: " + x.getCliente().getEndereco().numero
							+ ", Bairro: " + x.getCliente().getEndereco().bairro + "\nCEP: " + x.getCliente().getEndereco().cep
							+ ", Cidade: " + x.getCliente().getEndereco().cidade);
		
		//Printando o total estático de contas da Classe Conta
		
		System.out.println("\nTotal de Contas ativas no banco:" + Conta.getTotalContas());
	}

}