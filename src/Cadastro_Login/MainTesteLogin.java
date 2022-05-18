package Cadastro_Login;

import java.util.Scanner;

public class MainTesteLogin {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    Scanner entradaString = new Scanner(System.in);
	    
	    String menu = "";
	    int vezes_loop = 1;
	    
	    //REFERENCIA PARA O OBJETO
	    Usuario_Function objUser;
	    
	    String nome_empresa = "", cnpj = "", email = "", celular = "";
	    String login = "", senha = "";
	    
	    do {	    	
	    		MenuInicial();
	    		menu = entrada.nextLine();
	    		Usuario_Function.NumeroInteiroValido(menu);
	    		    	
	    	switch(menu) {
	    		case "1":		    			    			 
	    			
	    			do {	    					    					
	    					MenuLogin();
		    				
		    				System.out.println("Login: ");
		    				login = entradaString.nextLine();
		    				System.out.println("Senha: ");
		    				senha = entradaString.nextLine();
		    				
		    				if(Usuario_Function.getLoginUser() == null || Usuario_Function.getLoginUser().isEmpty()){
		     			          System.out.println("Não existem contas cadastradas!\n");
		     			          System.out.println("===> Cadastre uma conta na opção 2 <==="); 		     			          		     			          
		     			        } else if(Usuario_Function.acessoUser(login, senha) == false) {
		     			        	
		     			        	do {		    		        		
		     			        		MenuLogin_Saida();
		     			        		menu = entrada.nextLine();
		     			        				    		        				    		        		
		     			        		switch(menu) {		    		        		
		     			        		case "1":		     			        			
		     			        			vezes_loop = 2;
		     			        			
		     			        			break;
		     			        		case "2":
		     			        			vezes_loop = 1;
		     			        			
		     			        			break;
		     			        		default:
		     			        			System.out.println("Digite uma das opções escolhidas!");
		     			        		}
		     			        		
		     			        		
		     			        		
		     			        	} while(vezes_loop == 1);
		     			        	
	    				}
		    				
		    		if(vezes_loop == 1) {
		    		break;	
		    		}
		    		
	    			} while (Usuario_Function.acessoUser(login, senha) == false || vezes_loop == 1);
	    			
	    			break;	    			   			
	    		case "2":
	    			MenuCadastro();
	    			
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
	    			objUser = new Usuario_Function(nome_empresa,
	    					cnpj, email, celular, login, senha);
	    			 //Guarda no ArrayList
	    			Usuario_Function.criarUsuarios(objUser);
	    	        System.out.println(Usuario_Function.Perfil());
	    	        
	    	        break;
	    		case "3":
	    			System.out.println("Saindo ...");
	    	        
	    			break;
	    		}//Fim switch	    	
	    } while (menu != "3");
	    
	}//FIm main
	
	public static void MenuInicial() {
		System.out.println("===> Bem vindo ao Gerenciador de Lojas online <===");
		System.out.println("===> Escolha o que quer fazer para iniciar o programa <===");
		System.out.println("------------------------------------");
		System.out.println("1 - Login");
		System.out.println("2 - Cadastro");
		System.out.println("3 - Sair");
		System.out.println("------------------------------------");
	}
	
	public static void MenuLogin() {
		System.out.println("===> Tela de Login <===");
		System.out.println("===> Digite seu login e senha corretamente <===");
		System.out.println("------------------------------------");
	}
	
	public static void MenuLogin_Saida() {
		System.out.println("===> Tela de Login <===");
		System.out.println("===> Escolha o que quer fazer agora <===");
		System.out.println("------------------------------------");
		System.out.println("1 - Tentar novamente");
		System.out.println("2 - Voltar");
		System.out.println("------------------------------------");
	}
	
	public static void MenuCadastro() {
		System.out.println("===> Tela de Cadastro <===");
		System.out.println("===> Preencha os campos corretamente para realizar seu cadastro <===");
		System.out.println("------------------------------------");
	}
	
	public static void Menu() {
		System.out.println("===> Menu Principal <===");
		System.out.println("===> Escolha por onde deseja navegar <===");
		System.out.println("------------------------------------");
		System.out.println("1 - Tela Inicial");
		System.out.println("2 - Estoque");
		System.out.println("3 - Financeiro");
		System.out.println("4 - GRAC");
		System.out.println("5 - Publicidade");
		System.out.println("6 - Configurações");
		System.out.println("------------------------------------");
	}
}
