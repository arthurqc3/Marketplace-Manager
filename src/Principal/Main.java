package Principal;

import Estoque.*;
import Financeiro.*;
import Cadastro_Login.*;
import Config.Perfil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends Menus {
	
	public static void main(String[] args) {						
		Scanner entrada = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);
		String menuLogin = "", menuTelaInicial = "", resposta = "";
		//VARIAVEL PARA LOOP
		int repete = 1;
			    
		//##### 1 - MENU LOGIN E CADASTRO
	    //REFERENCIA PARA O OBJETO
	    Usuario_Function objUser;
	    
	    String nome_empresa = "", cnpj = "", email = "", celular = "";
	    String login = "", senha = "";
	    
	    while (menuLogin != "3") {
	    	
	    		MenuInicial();
	    		menuLogin = entrada.nextLine();
	    		Usuario_Function.NumeroInteiroValido(menuLogin, menuTelaInicial);
	    		
	    		menuTelaInicial = "";
	    		repete = 1;
	    	switch(menuLogin) {
	    		case "1":		    			    			 
	    			
	    			//REPETI��O DO MENULOGIN
	    			while (repete == 1) {	
	    				
	    					MenuLogin();
		    				
		    				System.out.println("Login: ");
		    				login = entradaString.nextLine();
		    				System.out.println("Senha: ");
		    				senha = entradaString.nextLine();
		    				
		    				if(Usuario_Function.getLoginUser() == null || Usuario_Function.getLoginUser().isEmpty()){
		     			          System.out.println("N�o existem contas cadastradas!\n");
		     			          System.out.println("===> Cadastre uma conta na op��o 2 <===");
		     			          
		     			         repete += 1;
		     			        } else if(Usuario_Function.acessoUser(login, senha) == false) {
		     			        	
		     			        	System.out.println("Usu�rio e/ou senha incorrreto(s)!");
		     			        	
		     			        	do {		    		        		
		     			        		MenuLogin_Saida();
		     			        		menuLogin = entrada.nextLine();
		     			        		Usuario_Function.NumeroInteiroValido(menuLogin, menuTelaInicial);
		     			        		
		     			        		repete = 0;
		     			        		switch(menuLogin) {		    		        		
		     			        		case "1":		     			        			
		     			        			repete = 1;
		     			        			
		     			        			break;
		     			        		case "2":
		     			        			repete = 2;
		     			        			
		     			        			break;
		     			        		default:
		     			        			System.out.println("Digite uma das op��es indicadas!");
		     			        			
		     			        			repete = 0;
		     			        		}
		     			        					     			        		
		     			        	} while(repete == 0);		     			        	
	    				} else {
	    					
	    					while(menuTelaInicial != "7") {
	    				    	
	    				    	Main.Menu();	
	    				    	menuTelaInicial = entrada.nextLine();
	    						Usuario_Function.NumeroInteiroValido(menuLogin, menuTelaInicial);
	    				    	
	    						switch(menuTelaInicial) {
	    							//##### 1 - TELA INICIAL
	    							case "1":
	    								
	    								break;
	    							//##### 2 - ESTOQUE
	    							case "2":				
	    								EstoqueFuncoes ef = new EstoqueFuncoes(null, null, null, null);
	    								
	    								ef.Cadastro();
	    								
	    								break;
	    							//##### 3 - FINANCEIRO
	    							case "3":
	    								
	    								break;
	    							//##### 4 - GRCA
	    							case "4":
	    								System.out.println("Ser� adicionado futuramente!");
	    								break;
	    							//##### 5 - PUBLICIDADE
	    							case "5":
	    								System.out.println("Ser� adicionado futuramente!");
	    								break;
	    							//##### 6 - CONFIG
	    							case "6":
	    								
	    								while(menuTelaInicial != "4") {
	    									
	    									MenuConfig();
	    									menuTelaInicial = entrada.nextLine();
	    									Usuario_Function.NumeroInteiroValido(menuLogin, menuTelaInicial);
	    									
	    									switch(menuTelaInicial) {
	    										//VER PERFIL
	    										case "1":
	    											System.out.println(Perfil.imprimirDadosConta());
	    											
	    											break;
	    										//VER LOGIN E SENHA
	    										case "2":
	    											MenuSeguranca();
	    											
	    											System.out.println("Login: ");
	    						    				login = entradaString.nextLine();
	    						    				System.out.println("Senha: ");
	    						    				senha = entradaString.nextLine();
	    												    											
	    											
	    											if(Usuario_Function.acessoUser(login, senha) == true) {
	    												System.out.println(Perfil.imprimirLoginSenha());	    												
	    											}
	    											
	    											break;
	    										//EXCLUI PERFIL
	    										case "3":
	    											MenuSeguranca();
	    											
	    											System.out.println("Login: ");
	    						    				login = entradaString.nextLine();
	    						    				System.out.println("Senha: ");
	    						    				senha = entradaString.nextLine();
	    												    											
	    											
	    											if(Usuario_Function.acessoUser(login, senha) == true) {
	    												MenuExcluir();	    											
		    											resposta = entradaString.nextLine();
		    											
		    											if(resposta.equalsIgnoreCase("sim")) {		    												
		    												System.out.println("CONTA EXCLUIDA COM SUCESSO!");
		    												
		    												Usuario_Function.excluirConta();
		    												
		    											} else {
		    												
		    												 break;
		    											}    												
	    											}	    												    											
	    											
	    											break;
	    										//VOLTA PARA MENU
	    										case "4":
	    											
	    											break;
	    										default:
	    											
	    									}
	    									
	    								}	    									    							    								
	    								
	    								break;
	    							//##### 7 - VOLTAR
	    							case "7":
	    								
	    								menuTelaInicial = "7";
	    								repete = 2;
	    								
	    								break;
	    							default:
	    								System.out.println("Digite uma op��o valida!");
	    								
	    								break;																
	    						}//FIM SWITCH
	    				    }//FIM WHILE
	    					
	    					//menuLogin = "3";
	    					//break;
	    				}		    				
	    			}//FIM REPETI��O MENULOGIN	    				    		
	    			
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
	    				//System.out.println(Usuario_Function.Perfil());	    				
	    			}
	    	        
	    	        break;
	    		case "3":
	    			System.out.println("Saindo ...");
	    	        
	    			System.exit(0);
	    		default:
	    			System.out.println("Digite uma das op��es indicadas!");
	    			
	    		}//FIM SWITCH	    		    	
	    	
	    }//FIM WHILE									    	    
	   
	    entrada.close();
	    entradaString.close();
	}//FIM MAIN	
}//FIM CLASSE MAIN