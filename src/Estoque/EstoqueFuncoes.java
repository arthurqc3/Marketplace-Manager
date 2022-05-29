package Estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstoqueFuncoes extends CadastrodeItens {

	public EstoqueFuncoes(String nome, Integer quantity, String fornecedor, Double valordeCeV) {
		super(nome, quantity, fornecedor, valordeCeV);
		
	}
	
	public static List<CadastrodeItens > c = new ArrayList<>(); //Array de armazenamento dos itens
	Scanner sc = new Scanner(System.in);
	
	
	// Cadastro dos itens
	
	public void Cadastro() {
		
		System.out.println("Coloque as Informacoes do produto: ");
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Fornecedor: ");
		String fornecedor = sc.nextLine();
		
		System.out.print("Quantitade: ");
		int quantity = sc.nextInt();
		
		System.out.print("Preco: ");
		double valordeCeV = sc.nextDouble();
		
		CadastrodeItens product = new CadastrodeItens(name, quantity, fornecedor, valordeCeV);
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
				System.out.println("Valor individual: " + x.getValordeCeV());
				System.out.println("Nome: " + x.getFornecedor());
				System.out.printf("Valor Total: %.2f%n", x.valorTotal());
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
			System.out.println("Valor individual: R$" + x.getValordeCeV());
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

