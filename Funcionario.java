
public class Funcionario {
	
	private String nome;
	private String cpf;
	private String rg;
	private int idade;
	private Endereco endereco;
	private double salario;
	private double bonificacao;
	
	public Funcionario(String nome,String cpf, String rg, int idade, double salario, double bonificacao, String logradouro, int numero, String bairro, String cep, String cidade) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.idade = idade;
		this.salario = salario;
		this.bonificacao = this.salario * bonificacao;
		setEndereco(new Endereco(logradouro, numero, bairro, cep, cidade));
	}
	
	public double getBonificacao() {
		return this.bonificacao;
	}
	
	public void setBonificacao(double novaBonificacao) {
		this.bonificacao = this.salario * novaBonificacao;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		
		this.endereco = endereco;
		
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}

