package Login;

import java.util.Scanner;

public class MainTesteLogin {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    Scanner entradaString = new Scanner(System.in);
	    
	    int menu = 0;
	    int vezes_loop = 1;
	    
	    //Referencia para a classe Usuario_cadastro
	    Usuario_cadastro objUser;
	    
	    String nome_empresa = "", cnpj = "", email = "", celular = "";
	    String login = "", senha = "";
	    
	    do {
	    	
	    	//Tratando erro de digita��o
	    	try {
	    		MenuInicial();
	    		menu = entrada.nextInt();
	    	} catch(Exception e) {
	    		System.out.println("Digito invalido! Digite uma das op��es sugeridas!");
	    	}
	    		    	
	    	switch(menu) {
	    		case 1:	    			
	    			do {
	    				TelaLogin();
	    				
	    				System.out.println("Login: ");
		    			login = entradaString.nextLine();
		    			System.out.println("Senha: ");
		    			senha = entradaString.nextLine();
		    			
		    			 if(Login_Usuario.getLoginUser() == null || Login_Usuario.getLoginUser().isEmpty()){
		    		          System.out.println("N�o existem contas cadastradas!\n");
		    		          System.out.println("===> Cadastre uma conta na op��o 2 <===");
		    		        } else if(Login_Usuario.acessoUser(login, senha) == false) {
		    		        	
		    		        	Login_Usuario.acessoUser(login, senha);
		    		        	
		    		        	do {
		    		        		System.out.println("===> Tela de Login <===");
		    		        		System.out.println("===> Escolha o que quer fazer agora <===");
		    		        		System.out.println("------------------------------------");
		    		        		System.out.println("1 - Tentar novamente");
		    		        		System.out.println("2 - Voltar");
		    		        		System.out.println("------------------------------------");
		    		        		
		    		        		menu = entrada.nextInt();
		    		        		
		    		        		switch(menu) {
		    		        		
		    		        		case 1:
		    		        			vezes_loop = 1;
		    		        			
		    		        			break;
		    		        		case 2:
		    		        			vezes_loop = 2;
		    		        			
		    		        			break;
		    		        		}
		    		        		
		    		        	} while(vezes_loop == 1);
		    		        	
		    		        } else if(Login_Usuario.acessoUser(login, senha) == true) {		    		        	
		    		        	Login_Usuario.acessoUser(login, senha);		    		        	
		    		        }
	    					    				
	    			} while(vezes_loop == 1);
	    				
	    			break;
	    		case 2:
	    			TelaCadastro();
	    			
	    			System.out.println("Nome da empresa: ");
	    			nome_empresa = entradaString.nextLine();
	    			System.out.println("CNPJ: ");
	    			cnpj = entradaString.nextLine();
	    			System.out.println("Email: ");
	    			email = entradaString.nextLine();
	    			System.out.println("Celular: ");
	    			celular = entradaString.nextLine();
	    			System.out.println("Login: ");
	    			login = entradaString.nextLine();
	    			System.out.println("Senha: ");
	    			senha = entradaString.nextLine();
	    			
	    			//Criando objeto da classe Usuario_cadastro
	    			objUser = new Usuario_cadastro(nome_empresa,
	    					cnpj, email, celular, login, senha);
	    			 //Guarda no ArrayList
	    	        Login_Usuario.criarUsuarios(objUser);
	    	        System.out.println(Login_Usuario.Perfil());
	    	        
	    	        break;
	    		case 3:
	    			System.out.println("Saindo ...");
	    	        
	    			break;
	    		}//Fim switch
	    	
	    } while (menu != 3);
	    
	}//FIm main
	
	public static void MenuInicial() {
		System.out.println("===> Bem vindo ao Gerenciador de Lojas online <===");
		System.out.println("===> Escolha o que quer fazer para iniciar o programa <===");
		System.out.println("------------------------------------");
		System.out.println("1 - Login");
		System.out.println("2 - Cadastro");
		System.out.println("3 - Sair");
	}
	
	public static void TelaLogin() {
		System.out.println("===> Tela de Login <===");
		System.out.println("===> Digite seu login e senha corretamente <===");
		System.out.println("------------------------------------");
	}
	
	public static void TelaCadastro() {
		System.out.println("===> Tela de Cadastro <===");
		System.out.println("===> Preencha os campos corretamente para realizar seu cadastro <===");
		System.out.println("------------------------------------");
	}
}
