package Login;

import java.util.ArrayList;

public class Login_Usuario {
	
	private static ArrayList<Usuario_cadastro> LoginUser = new ArrayList<>();
	
	public static ArrayList<Usuario_cadastro> getLoginUser(){
	    return LoginUser;
	  }
	
	public static void criarUsuarios(Usuario_cadastro ud){
	    LoginUser.add(ud);
	    
	    System.out.println("Cadastro realizado com sucesso!\n");
	  }
	
	//Acesso login
	public static boolean acessoUser(String login, String senha) {
		boolean check = false;
		
		for(Usuario_cadastro ud : LoginUser) {
			if(ud.getLogin().equals(login)) {
				if(ud.getSenha().equals(senha)) {
					System.out.println("Acesso permitido!\n");
					
					check = true;
				} else {
					System.out.println("Erro na digita��o da senha!\n");
				}
			} else {
				System.out.println("Usuario n�o encontrado\n");
			}
		}
		
		return check;
	}
	
	//Perfil
	public static String Perfil() {
		String saida = "";
		
		for(Usuario_cadastro ud : LoginUser) {
			
			saida += ud.imprimirDados();
		}
		return saida;
	}
	
	
	
}//Fim class
