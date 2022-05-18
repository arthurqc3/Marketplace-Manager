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
	public static boolean NumeroInteiroValido(String menu) {
		boolean saida;
		
		try {
			Integer.parseInt(menu);
			saida = true;
		} catch (NumberFormatException e) {
			System.out.println("Digite um valor valido!");
			saida = false;
		}
		
		return saida;		
	}
		
	//ACESSO LOGIN
		public static boolean acessoUser(String login, String senha) {
			boolean saida = false;
			
			for(Usuario_Function ud : LoginUser) {
				
				if(ud.getLogin().equals(login)) {
					
					if(ud.getSenha().equals(senha)) {
						
						MenuAcess(login, senha);
						
						saida = true;
					} else {
						System.out.println("Erro na digitação da senha!\n");
					}
				} else {
					System.out.println("Usuario não encontrado\n");
				}
			}		
			return saida;
		}
	
	//CADASTRO
	public static void criarUsuarios(Usuario_Function ud){
	    LoginUser.add(ud);
	    
	    System.out.println("\nCadastro realizado com sucesso!");
	  }
	
	
	//ACESSO MENU
	public static void MenuAcess(String login, String senha) {
		
		if(acessoUser(login, senha) == true) {
			
			System.out.println("MENU ACESSADO!");
			//FALTA IMPLEMENTAR			
		}
	}
	
	
	
	//PERFIL
		public static String Perfil() {
			String saida = "";
			
			for(Usuario_Function ud : LoginUser) {
				
				saida += ud.imprimirDadosConta();
			}
			return saida;
		}
	
}
