package Cadastro_Login;

import java.util.ArrayList;

public class Usuario_Function extends Usuario_Conta {
	
	public Usuario_Function(String nome_empresa, String cnpj, String email, String celular, String login,
			String senha) {
		super(nome_empresa, cnpj, email, celular, login, senha);
	}
	
	private static ArrayList<Usuario_Function> LoginUser = new ArrayList<>();
	
	//GET ARRAYLIST <LOGINUSER>
	public static ArrayList<Usuario_Function> getLoginUser(){
	    return LoginUser;
	  }
	
	//METODO PARA TRATAMENTO DE ERRO EM MENUS
	public static boolean NumeroInteiroValido(String menuLogin, String menuTelaInicial, String menuConfig) {
		boolean saida;
		
		try {
			Integer.parseInt(menuLogin);
			saida = true;
		} catch (NumberFormatException e) {
			saida = false;
		}
		
		try {
			Integer.parseInt(menuTelaInicial);
			saida = true;
		} catch (NumberFormatException e) {
			saida = false;
		}
		
		return saida;		
	}
		
	//ACESSO LOGIN
		public static boolean acessoUser(String login, String senha) {
			boolean saida = false;							
			
			for(Usuario_Function ud : LoginUser) {				
				if(ud.getLogin().equals(login) && ud.getSenha().equals(senha)) {
					
					
					saida = true;
					break;
				}
			}		
			return saida;
		}
	
	//CADASTRO
	public static void criarUsuarios(Usuario_Function ud){
		
	    LoginUser.add(ud);
	    
	    System.out.println("\nCadastro realizado com sucesso!");
	}
	
	//EXCLUIR CONTA CADASTRADA
	public static void excluirConta() {
		
	    for(Usuario_Conta ud : LoginUser){
	      LoginUser.remove(ud);	  
	    }
	}
	
	//COMPARAR DADOS DO USUARIO
	public static boolean ComparaNome(String nome_empresa) {
		boolean saida = true;
		
		for(Usuario_Function ud : LoginUser) {
			if(ud.getNome_empresa().equals(nome_empresa)) {
				System.out.println("Nome ja utilizado, crie um novo!");
				
				saida = false;
			}	
		}
		return saida;
	}
	public static boolean ComparaCnpj(String cnpj) {
		boolean saida = true;
		
		for(Usuario_Function ud : LoginUser) {
			if(ud.getCnpj().equals(cnpj)) {
				System.out.println("CNPJ ja cadastrado!");
				
				saida = false;
			}
		}
		return saida;
	}
	public static boolean ComparaEmail(String email) {
		boolean saida = true;
		
		for(Usuario_Function ud : LoginUser) {
			if(ud.getEmail().equals(email)) {
				System.out.println("Email já cadastrado!");	
				
				saida = false;
			}
		}
		return saida;
	}
	public static boolean ComparaCelular(String celular) {
		boolean saida = true;
		
		for(Usuario_Function ud : LoginUser) {
			if(ud.getCelular().equals(celular)) {
				System.out.println("Celular já cadastrado!");	
				
				saida = false;
			}
		}
		return saida;
	}
	public static boolean ComparaLogin(String login) {
		boolean saida = true;
		
		for(Usuario_Function ud : LoginUser) {
			if(ud.getLogin().equals(login)) {
				System.out.println("Login ja cadastrado, crie um novo!");
				
				saida = false;
			}
		}
		return saida;
	}
	
	//IMPRIMI DADOS DO USUARIO CADASTRADO
	public static String imprimirDadosConta(String nome_empresa, String cnpj, String email, String celular) {
		String saida = "";
		
		for(Usuario_Function ud: LoginUser) {
			saida = "---------------------------" +
					"\n===> Dados Usuario " + "(" + nome_empresa + ")" + " <===" +
					"\nNome da empresa: " + nome_empresa +
					"\nCNPJ: " + cnpj +
					"\nEmail: " + email +
					"\nCelular: " + celular +
					"\n--------------------------\n";		
		}
		
		return saida;
	}
		
	//IMPRIMI LOGIN E SENHA
	public static String imprimirLoginSenha(String login, String senha) {
		String saida = "";
		
		for(Usuario_Function ud : LoginUser) {
			saida = "---------------------------" +
					"\n===> Dados da Conta " + " <===" +
					"\nLogin: " + login +
					"\nSenha: " + senha +
					"\n--------------------------\n";			
		}
		
		return saida;
	}
}
