package Login;

public class Usuario_cadastro extends Usuario_pessoa {
	
	private String nome_empresa;
	private String cnpj;
	private String email;
	private String celular;
	//private User_endereco endereco;
	
	public Usuario_cadastro(String nome_empresa, String cnpj,
			String email, String celular, String login, String senha) {
		super(login, senha);
		this.nome_empresa = nome_empresa;
		this.cnpj = cnpj;
		this.email = email;
		this.celular = celular;
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
	
	public String imprimirDados() {
		
		return "---------------------------" +
				"\n===> Dados Usuario " + this.nome_empresa + " <===" +
				"\nNome da empresa: " + nome_empresa +
				"\nCNPJ: " + cnpj +
				"\nEmail: " + email +
				"\nCelular: " + celular +
				"\nLogin: " + login +
				"\n--------------------------";
	}
}
