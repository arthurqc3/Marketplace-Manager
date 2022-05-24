package Config;

import Cadastro_Login.Usuario_Conta;;

public class Perfil {
	
	//IMPRIMI DADOS DO USUARIO CADASTRADO
	public static String imprimirDadosConta() {
		
		String saida = "---------------------------" +
				"\n===> Dados Usuario " + "(" + Usuario_Conta.getNome_empresa() + ")" + " <===" +
				"\nNome da empresa: " + Usuario_Conta.getNome_empresa() +
				"\nCNPJ: " + Usuario_Conta.getCnpj() +
				"\nEmail: " + Usuario_Conta.getEmail() +
				"\nCelular: " + Usuario_Conta.getCelular() +
				"\n--------------------------\n";
		
		return saida;
	}
	
	//IMPRIMI LOGIN E SENHA
	public static String imprimirLoginSenha() {
		
		String saida = "---------------------------" +
				"\n===> Dados da Conta " + " <===" +
				"\nLogin: " + Usuario_Conta.getLogin() +
				"\nSenha: : " + Usuario_Conta.getSenha() +
				"\n--------------------------\n";
		
		return saida;
	}	
	
	
	
}
