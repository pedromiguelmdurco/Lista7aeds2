package a3;

public class Cliente {

	private String nome,endereco;
	private int cpf,telefone;
	
	public Cliente(String nome, String endereco, int cpf, int telefone) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	
	
}
