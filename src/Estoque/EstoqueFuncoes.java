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
		
		System.out.println("Coloque as Informações do produto: ");
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Fornecedor: ");
		String fornecedor = sc.nextLine();
		
		System.out.print("Quantitade: ");
		int quantity = sc.nextInt();
		
		System.out.print("Preço: ");
		double valordeCeV = sc.nextDouble();
		
		CadastrodeItens product = new CadastrodeItens(name, quantity, fornecedor, valordeCeV);
		c.add(product);
		
		System.out.println("Item Cadastrado: ");
		System.out.println(product);
		
		sc.close();
		
	}
	
	// Remoção de itens no estoque
	
	public static void Remocao(String nome) {
	
		for (CadastrodeItens x : c) {
			if(x.getNome().equalsIgnoreCase(nome)) {
				c.remove(x);
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
				System.out.printf("Valor Total: %.2f"+ x.valorTotal());
			}
		}
	}
	
	// Ver todos os Itens Cadastrados
	
	public static void Vizualizacao() {
		
		int temp = 0;
		for (CadastrodeItens x : c ) {
			
			temp++;
			System.out.println("item " + temp);
			System.out.println("Nome: " + x.getNome());
			System.out.println("Quantidade em estoque: " + x.getQuantity());
			System.out.println("Valor individual: " + x.getValordeCeV());
			System.out.println("Nome: " + x.getFornecedor());
			System.out.printf("Valor Total: %.2f"+ x.valorTotal());	
		}
		
	}
	
}

