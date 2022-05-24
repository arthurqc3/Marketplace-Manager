package Cadastro_Login;

public class Usuario_Conta {
	
	protected String nome_empresa;
	protected String cnpj;
	protected String email;
	protected String celular;
	protected String login;
	protected String senha;
	
	public Usuario_Conta(String nome_empresa, String cnpj, String email,
			String celular, String login, String senha) {
		this.nome_empresa = nome_empresa;
		this.cnpj = cnpj;
		this.email = email;
		this.celular = celular;
		this.login = login;
		this.senha = senha;
	}
	
	public String getNome_empresa() {
		return nome_empresa;
	}
	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
