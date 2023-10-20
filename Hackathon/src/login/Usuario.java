package login;

public class Usuario {

	private String nomeCompleto;
	private String cpf;
	private String senha;
	
	@Override
	public String toString() {
		return "Nome Completo: " + nomeCompleto + "\nCpf: " + cpf + "\nSenha: " + senha;
	}

	public Usuario(String nomeCompleto, String cpf, String senha) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.senha = senha;
	}
	
	public Usuario() {
		
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
