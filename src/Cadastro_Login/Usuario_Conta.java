package Cadastro_Login;

public class Usuario_Conta {
	
	private String nome_empresa;
	private String cnpj;
	private String email;
	private String celular;
	protected String login;
	private String senha;
	
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
	
	//IMPRIMI DADOS DO USUARIO CADASTRADO
		public String imprimirDadosConta() {
			
			String saida = "---------------------------" +
					"\n===> Dados Usuario " + "(" + this.nome_empresa + ")" + " <===" +
					"\nNome da empresa: " + this.nome_empresa +
					"\nCNPJ: " + this.cnpj +
					"\nEmail: " + this.email +
					"\nCelular: " + this.celular +
					"\n--------------------------\n";
			
			return saida;
		}
	
	//IMPRIMI LOGIN E SENHA
		public String imprimirConta() {
			
			String saida = "---------------------------" +
					"\n===> Dados da Conta " + " <===" +
					"\nLogin: " + this.login +
					"\nSenha: : " + this.senha +
					"\n--------------------------\n";
			
			return saida;
		}
}
