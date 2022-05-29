package Principal;

import Estoque.*;
import Cadastro_Login.*;
import Financeiro.*;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class Main extends Menus {
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);
		String menuLogin = "", menuTelaInicial = "", menuConfig = "", resposta = "";
		//VARIAVEL PARA LOOP
		int repete = 1;
			    
		//##### 1 - MENU LOGIN E CADASTRO
	    //REFERENCIA PARA O OBJETO
	    Usuario_Function objUser = null;
	    
	    String nome_empresa = "", cnpj = "", email = "", celular = "";
	    String login = "", senha = "";
	    
	    while (menuLogin != "3") {
	    	
	    		MenuInicial();
	    		menuLogin = entrada.nextLine();
	    		Usuario_Function.NumeroInteiroValido(menuLogin, menuTelaInicial, menuConfig);
	    		
	    		menuTelaInicial = "";	    		
	    		repete = 1;
	    	switch(menuLogin) {
	    		case "1":		    			     			 
	    			
	    			//REPETICAO DO MENULOGIN
	    			while (repete == 1) {	
	    				
	    					MenuLogin();
		    				
		    				System.out.println("Login: ");
		    				login = entradaString.nextLine();
		    				System.out.println("Senha: ");
		    				senha = entradaString.nextLine();
		    				
		    				if(Usuario_Function.getLoginUser() == null || Usuario_Function.getLoginUser().isEmpty()){
		     			          System.out.println("Nao existem contas cadastradas!\n");
		     			          System.out.println("===> Cadastre uma conta na opcao 2 <===");
		     			          
		     			         repete += 1;
		     			        } else if(Usuario_Function.acessoUser(login, senha) == false) {
		     			        	
		     			        	System.out.println("Usuario e/ou senha incorrreto(s)!");
		     			        	
		     			        	do {		    		        		
		     			        		MenuLogin_Saida();
		     			        		menuLogin = entrada.nextLine();
		     			        		Usuario_Function.NumeroInteiroValido(menuLogin, menuTelaInicial, menuConfig);
		     			        		
		     			        		repete = 0;
		     			        		switch(menuLogin) {		    		        		
		     			        		case "1":		     			        			
		     			        			repete = 1;
		     			        			
		     			        			break;
		     			        		case "2":
		     			        			repete = 2;
		     			        			
		     			        			break;
		     			        		default:
		     			        			System.out.println("Digite uma das opcoes indicadas!");
		     			        			
		     			        			repete = 0;
		     			        		}
		     			        					     			        		
		     			        	} while(repete == 0);		     			        	
	    				} else {
	    					
	    					while(menuTelaInicial != "7") {
	    				    	
	    				    	Main.Menu();	
	    				    	menuTelaInicial = entrada.nextLine();
	    						Usuario_Function.NumeroInteiroValido(menuLogin, menuTelaInicial, menuConfig);
	    				    	
	    						menuConfig = "";
	    						switch(menuTelaInicial) {
	    							//##### 1 - TELA INICIAL
	    							case "1":
	    								System.out.println("Será adicionado em breve!");
	    								break;
	    							//##### 2 - ESTOQUE
	    							case "2":				
	    								EstoqueFuncoes ef = new EstoqueFuncoes("", 0, "", 0.0);
	    								
	    								MenuEstoque();
	    								int temp = sc.nextInt();
	    								ef.funcoes(temp);
	    								
	    								break;
	    							//##### 3 - FINANCEIRO
	    							case "3":
	    								Caixa ff = new Caixa();
	    								MenuFinaceiro();
	    								ff.switchfinanceiro();
	    								break;
	    							//##### 4 - GRCA
	    							case "4":
	    								System.out.println("Sera adicionado futuramente!");
	    								break;
	    							//##### 5 - PUBLICIDADE
	    							case "5":
	    								System.out.println("Sera adicionado futuramente!");
	    								break;
	    							//##### 6 - CONFIG
	    							case "6":
	    								
	    								while(menuConfig != "4") {    									
	    									MenuConfig();
	    									menuConfig = entrada.nextLine();
	    									Usuario_Function.NumeroInteiroValido(menuLogin, menuTelaInicial, menuConfig);
	    									
	    									switch(menuConfig) {
	    										//VER PERFIL
	    										case "1":	    												    											
	    											
	    											System.out.println(Usuario_Function.imprimirDadosConta(login));	    												
	    											
	    											break;
	    										//VER LOGIN E SENHA
	    										case "2":
	    											MenuSeguranca();
	    											
	    											System.out.println("Login: ");
	    						    				login = entradaString.nextLine();
	    						    				System.out.println("Senha: ");
	    						    				senha = entradaString.nextLine();
	    												    											
	    											
	    											if(Usuario_Function.acessoUser(login, senha) == true) {
	    												System.out.println(Usuario_Function.imprimirLoginSenha(login, senha));	    												
	    											}
	    											
	    											break;
	    										//EXCLUI PERFIL
	    										case "3":
	    											MenuSeguranca();
	    											
	    											System.out.println("Login: ");
	    						    				login = entradaString.nextLine();
	    						    				System.out.println("Senha: ");
	    						    				senha = entradaString.nextLine();
	    												    											
	    											try {	    												
	    												if(Usuario_Function.acessoUser(login, senha) == true) {
		    												MenuExcluir();	    											
			    											resposta = entradaString.nextLine();
			    											
			    											if(resposta.equalsIgnoreCase("sim")) {		    												
			    												System.out.println("CONTA EXCLUIDA COM SUCESSO!");
			    												
			    												Usuario_Function.excluirConta();
			    												
			    												menuConfig = "4";
			    												menuTelaInicial = "7";
			    												repete = 0;
			    											} else {
			    												
			    												 break;
			    											}
	    												}	    												
	    											} catch(Exception c) {
	    												menuConfig = "4";
	    												menuTelaInicial = "7";
	    												repete = 0;
	    											}	    											    													    												    												    												    											
	    											break;
	    										//VOLTA PARA MENU
	    										case "4":	    											
	    											menuConfig = "4";
	    											
	    											break;
	    										default:
	    											System.out.println("Digite uma opcao valida!");
	    											
	    											break;
	    									}//FIM SWITCH	    									
	    								}//FIM WHILE	    									    							    									    								
	    								break;
	    							//##### 7 - VOLTAR
	    							case "7":	    								
	    								menuTelaInicial = "7";
	    								repete = 2;
	    								
	    								break;
	    							default:
	    								System.out.println("Digite uma opcao valida!");
	    								
	    								break;																
	    						}//FIM SWITCH
	    				    }//FIM WHILE	    					
	    				}		    				
	    			}//FIM REPETICAO MENULOGIN	    				    		
	    			
	    			break;	    			   			
	    		case "2":
	    			int confere = 0;
	    			MenuCadastro();
	    			
	    			while(confere == 0) {
	    				System.out.print("Nome da empresa: ");
	    				nome_empresa = entradaString.nextLine();	    				
	    				
	    				if(Usuario_Function.ComparaNome(nome_empresa) == true) {
	    					confere = 1;
	    				}
	    			}
	    			
	    			while(confere == 1) {
	    				System.out.print("CNPJ: ");
	    				cnpj = entradaString.nextLine();	    				
	    				
	    				if(Usuario_Function.ComparaCnpj(cnpj) == true) {
	    					confere = 2;
	    				}
	    			}
	    			
	    			while(confere == 2) {
	    				System.out.print("Email: ");
	    				email = entradaString.nextLine();	    				
	    				
	    				if(Usuario_Function.ComparaEmail(email) == true) {
	    					confere = 3;
	    				}
	    			}
	    			
	    			while(confere == 3) {
	    				System.out.print("Celular: ");
	    				celular = entradaString.nextLine();	    				
	    				
	    				if(Usuario_Function.ComparaCelular(celular) == true) {
	    					confere = 4;
	    				}
	    			}
	    			
	    			while(confere == 4) {
	    				System.out.print("Login: ");
	    				login = entradaString.nextLine();	    				
	    				
	    				if(Usuario_Function.ComparaLogin(login) == true) {
	    					confere = 5;
	    				}
	    			}
	    			
	    			if(confere == 5) {
	    				System.out.print("Senha: ");
	    				senha = entradaString.nextLine();
	    				
	    				confere = 6;
	    			}
	    					    				    			
	    			if(confere == 6) {
	    				//CRIANDO OBJETO
	    				objUser = new Usuario_Function(nome_empresa,
	    						cnpj, email, celular, login, senha);
	    				//GUARDANDO DADOS NO ARRAYLIST
	    				Usuario_Function.criarUsuarios(objUser);	    				
	    			}	    	        
	    	        break;
	    		case "3":
	    			System.out.println("Saindo ...");
	    	        
	    			System.exit(0);
	    		default:
	    			System.out.println("Digite uma das opcoes indicadas!");
	    			
	    		}//FIM SWITCH	    		    	
	    	
	    }//FIM WHILE									    	    
	    sc.close();
	    entrada.close();
	    entradaString.close();
	}//FIM MAIN	
}//FIM CLASSE MAIN