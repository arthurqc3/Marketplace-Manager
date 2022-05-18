package Cadastro_Login;

public class TESTE {
	
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
	        			vezes_loop = 3;
	        					    		        			
	        			break;
	        		case "2":
	        			vezes_loop = 2;
	        			
	        			break;
	        		default:
	        			System.out.println("Digite uma das opções escolhidas!");
	        		}
	        		
	        	break;
	        	} while(vezes_loop == 1);
	        	
	        } else if(Usuario_Function.acessoUser(login, senha) == true) {
	        	Usuario_Function.acessoUser(login, senha);
	        }
		 
	} while(Usuario_Function.acessoUser(login, senha) == false);	    			
	
	break;
	
}
	