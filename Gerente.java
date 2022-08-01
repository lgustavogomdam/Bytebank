
public class Gerente extends Funcionario{
	
	private int senha;
	
	public Gerente(String nome, String cpf, String rg, int idade, double salario, double bonificacao, String logradouro, int numero, String bairro, String cep, String cidade) {
		
		super(nome, cpf, rg, idade, salario, bonificacao, logradouro, numero, bairro, cep, cidade);
		
	}
	
	public int getSenha() {
		return this.senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
