package Estoque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueFuncoes extends CadastrodeItens {

	public EstoqueFuncoes(String nome, Integer quantity, String fornecedor, Double preco) {
		super(nome, quantity, fornecedor, preco);
		
	}
	
	public static ArrayList<CadastrodeItens> c = new ArrayList<CadastrodeItens>(); //Array de armazenamento dos itens
	Scanner sc = new Scanner(System.in);
	
	// Verificar item Cadastrado
	
	public boolean verificarCadastro(String name) {
		
		boolean temp = false;
		
		for(CadastrodeItens x : c) {
			// verificar se já existe um item igual ao que o usuario quer cadastrar
			if(x.getNome().equalsIgnoreCase(name)) { // se SIM, alerta e quebra a função cadastro
				System.out.println("Esse item ja esta cadastrado!, tente novamente");
				temp = true;
				}
			}
		return temp;
	}
	
	// Verificar String
	
	public static String readString() { // leitura de strings
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler do teclado");
        }
    }
	
	// Verificar Int
	
	public static int readInt() { // leitura de valores do tipo int (inteiros)
        String str = readString();
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new RuntimeException(str + " nao e um valor valido");
        }
    }
	
	// Verificar Double
	
	public static double readDouble() { // leitura de valores do tipo double (ponto flutuante)
        String str = readString();
        try {
            return Double.parseDouble(str);
        } catch (Exception e) {
            throw new RuntimeException(str + " nao e um valor valido, tente nao usar ponto '.' ");
        }
    }
	
	
	// Cadastro dos itens
	
	public void Cadastro() {
		
		System.out.println("Coloque as Informacoes do produto: ");
		
		System.out.print("Nome: ");
		String name = readString();
		
		boolean temp = verificarCadastro(name);
		
		if (temp == true) return;
		
		System.out.print("Fornecedor: ");
		String fornecedor = readString();
		
		System.out.print("Quantitade: ");
		int quantity = readInt();
		
		System.out.print("Preco: ");
		double preco = readDouble();
		
		CadastrodeItens product = new CadastrodeItens(name, quantity, fornecedor, preco);
		c.add(product);
		System.out.println("Item Cadastrado: ");
		Vizualizacao();
		
		}
	
	// Remocao de itens no estoque
	
	public static void Remocao(String nome) {
		for (int i = 0; i < c.size(); i++) {
	        String userListName = c.get(i).getNome();
	        if(userListName.equals(nome)){
	            c.remove(i);
	        }
	    }
	}
	
	// Busca de itens no estoque

	public static void Busca(String nome) {
		
		for (CadastrodeItens x : c) {
			if(x.getNome().equalsIgnoreCase(nome)) {
				System.out.println("Nome: " + x.getNome());
				System.out.println("Quantidade em estoque: " + x.getQuantity());
				System.out.println("Valor individual: " + x.getPreco());
				System.out.println("Nome: " + x.getFornecedor());
				System.out.printf("Valor Total: R$ %.2f%n", x.valorTotal());
			}
		}
	}
	
	// Ver todos os Itens Cadastrados
	
	public static void Vizualizacao() {
		int temp = 0;
		for (CadastrodeItens x : c ) {
			
			temp++;
			System.out.println("------------------------------------");
			System.out.println("ITEM " + temp);
			System.out.println("Nome: " + x.getNome());
			System.out.println("Quantidade em estoque: " + x.getQuantity());
			System.out.println("Valor individual: R$" + x.getPreco());
			System.out.printf("Valor total em estoque: %.2f%n", x.valorTotal());
			System.out.println("------------------------------------");
		}
		
	}
	
	// Switch para funcoes
	
	public void funcoes(int numero) {
		
		String nome = "";
		
		switch(numero){
		case 1:
			Cadastro();
			break;
		case 2:
			System.out.println("Digite o Nome do item para a remocao: :");
			nome = sc.nextLine();
			Remocao(nome);
			break;
		case 3:
			System.out.println("Digite o Nome do item para a busca: ");
			nome = sc.nextLine();
			Busca(nome);
			break;
		case 4:
			Vizualizacao();
			break;
		default:
			System.out.println("Essa opcao nao existe, digite novamento");
			numero = sc.nextInt();
			funcoes(numero);
			break;
		}
		
	}
	
}

