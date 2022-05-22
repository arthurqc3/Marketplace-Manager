/*package Cadastro_Login;

import java.util.Scanner;

public class MainTesteLogin {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    Scanner entradaString = new Scanner(System.in);
	    
	    String menu = "";
	    //VARIAVEL PARA LOOP
	    int repete = 1;
	    
	    //REFERENCIA PARA O OBJETO
	    Usuario_Function objUser;
	    
	    String nome_empresa = "", cnpj = "", email = "", celular = "";
	    String login = "", senha = "";
	    
	    while (menu != "3") {
	    	
	    		MenuInicial();
	    		menu = entrada.nextLine();
	    		Usuario_Function.NumeroInteiroValido(menu);
	    		
	    		repete = 1;
	    	switch(menu) {
	    		case "1":		    			    			 
	    			
	    			//REPETIÇÃO DO MENULOGIN
	    			while (repete == 1) {	
	    				
	    					MenuLogin();
		    				
		    				System.out.println("Login: ");
		    				login = entradaString.nextLine();
		    				System.out.println("Senha: ");
		    				senha = entradaString.nextLine();
		    				
		    				if(Usuario_Function.getLoginUser() == null || Usuario_Function.getLoginUser().isEmpty()){
		     			          System.out.println("Não existem contas cadastradas!\n");
		     			          System.out.println("===> Cadastre uma conta na opção 2 <===");
		     			          
		     			         repete += 1;
		     			        } else if(Usuario_Function.acessoUser(login, senha) == false) {
		     			        	
		     			        	do {		    		        		
		     			        		MenuLogin_Saida();
		     			        		menu = entrada.nextLine();
		     			        		Usuario_Function.NumeroInteiroValido(menu);
		     			        		
		     			        		repete = 0;
		     			        		switch(menu) {		    		        		
		     			        		case "1":		     			        			
		     			        			repete = 1;
		     			        			
		     			        			break;
		     			        		case "2":
		     			        			repete = 2;
		     			        			
		     			        			break;
		     			        		default:
		     			        			System.out.println("Digite uma das opções indicadas!");
		     			        			
		     			        			repete = 0;
		     			        		}
		     			        					     			        		
		     			        	} while(repete == 0);		     			        	
	    				}		    						    		
	    			}//FIM REPETIÇÃO MENULOGIN
	    			
	    			break;	    			   			
	    		case "2":
	    			int confere = 0;
	    			MenuCadastro();
	    			
	    			while(confere == 0) {
	    				System.out.println("Nome da empresa: ");
	    				nome_empresa = entradaString.nextLine();	    				
	    				
	    				if(Usuario_Function.ComparaNome(nome_empresa) == true) {
	    					confere = 1;
	    				}
	    			}
	    			
	    			while(confere == 1) {
	    				System.out.println("CNPJ: ");
	    				cnpj = entradaString.nextLine();	    				
	    				
	    				if(Usuario_Function.ComparaCnpj(cnpj) == true) {
	    					confere = 2;
	    				}
	    			}
	    			
	    			while(confere == 2) {
	    				System.out.println("Email: ");
	    				email = entradaString.nextLine();	    				
	    				
	    				if(Usuario_Function.ComparaEmail(email) == true) {
	    					confere = 3;
	    				}
	    			}
	    			
	    			while(confere == 3) {
	    				System.out.println("Celular: ");
	    				celular = entradaString.nextLine();	    				
	    				
	    				if(Usuario_Function.ComparaCelular(celular) == true) {
	    					confere = 4;
	    				}
	    			}
	    			
	    			while(confere == 4) {
	    				System.out.println("Login: ");
	    				login = entradaString.nextLine();	    				
	    				
	    				if(Usuario_Function.ComparaLogin(login) == true) {
	    					confere = 5;
	    				}
	    			}
	    			
	    			if(confere == 5) {
	    				System.out.println("Senha: ");
	    				senha = entradaString.nextLine();
	    				
	    				confere = 6;
	    			}
	    					    				    			
	    			if(confere == 6) {
	    				//CRIANDO OBJETO
	    				objUser = new Usuario_Function(nome_empresa,
	    						cnpj, email, celular, login, senha);
	    				//GUARDANDO DADOS NO ARRAYLIST
	    				Usuario_Function.criarUsuarios(objUser);
	    				System.out.println(Usuario_Function.Perfil());	    				
	    			}
	    	        
	    	        break;
	    		case "3":
	    			System.out.println("Saindo ...");
	    	        
	    			System.exit(0);
	    		default:
	    			System.out.println("Digite uma das opções indicadas!");
	    			
	    		}//FIM SWITCH	    	
	    }//FIM WHILE
	    
	}//FIM MAIN
	
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
*/