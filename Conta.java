

public class Conta {
	
	private Cliente cliente;
	private int agencia;
	private int numeroConta;
	private double saldo;
	private static int totalContas;
	
	public Conta(int agencia, int numeroConta, String nome, String cpf, String rg, int idade,String logradouro, int numero, String bairro, String cep, String cidade) {
		Conta.totalContas++;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = 0.0;
		
		setCliente(new Cliente(nome, cpf, rg, idade));
		getCliente().setEndereco(new Endereco(logradouro, numero, bairro, cep, cidade));
		//System.out.println("Qntd de Contas: " +totalContas);
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(valor <= this.saldo) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}else {
			System.out.println("Você não possui saldo na conta"
					+ "para realizar essa transferência");
			return false;
		}
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public boolean setAgencia(int numeroAgencia) {
		if(numeroAgencia > 0) {
			this.agencia = numeroAgencia;
			return true;
		}else {
			System.out.println("ERRO: Numero invalido!");
			System.out.println("Numero de Agencia nao inserido");
			return false;
		}
		
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public boolean setNumeroConta(int numero) {
		if(numero > 0) {
			this.numeroConta = numero;
			return true;
		}else {
			System.out.println("ERRO: Numero invalido!");
			System.out.println("Numero da Conta nao inserido");
			return false;
		}
		
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public static int getTotalContas() {
		return Conta.totalContas;
	}
}
