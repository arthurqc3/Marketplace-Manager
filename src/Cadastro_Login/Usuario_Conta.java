package Cadastro_Login;

public class Usuario_Conta {
	
	private static String nome_empresa;
	private static String cnpj;
	private static String email;
	private static String celular;
	protected static String login;
	private static String senha;
	
	public Usuario_Conta(String nome_empresa, String cnpj, String email,
			String celular, String login, String senha) {
		this.nome_empresa = nome_empresa;
		this.cnpj = cnpj;
		this.email = email;
		this.celular = celular;
		this.login = login;
		this.senha = senha;
	}
	
	public static String getNome_empresa() {
		return nome_empresa;
	}
	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}
	public static String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public static String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public static String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public static String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/*//IMPRIMI DADOS DO USUARIO CADASTRADO
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
		public String imprimirLoginSenha() {
			
			String saida = "---------------------------" +
					"\n===> Dados da Conta " + " <===" +
					"\nLogin: " + this.login +
					"\nSenha: : " + this.senha +
					"\n--------------------------\n";
			
			return saida;
		}*/
}
