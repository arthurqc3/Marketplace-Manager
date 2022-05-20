package Estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstoqueFuncoes extends CadastrodeItens {

	public EstoqueFuncoes(String nome, Integer quantity, String fornecedor, Double valordeCeV, Integer qntdEstoque) {
		super(nome, quantity, fornecedor, valordeCeV, qntdEstoque);
		
	}
	
	//Função para Cadastro dos itens
	
	public void Cadastro() {
		
		List<CadastrodeItens > c = new ArrayList<>(); //Array de armazenamento dos itens
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque as Informações do produto: ");
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Fornecedor: ");
		String fornecedor = sc.nextLine();
		
		System.out.print("Quantitade: ");
		int quantity = sc.nextInt();
		
		System.out.print("Preço: ");
		double valordeCeV = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		int qntdEstoque = sc.nextInt();
		
		CadastrodeItens product = new CadastrodeItens(name, quantity, fornecedor, valordeCeV, qntdEstoque);
		c.add(product);
		
		System.out.println("Item Cadastrado: ");
		System.out.println(product);
		
		sc.close();
		
	}
	
	
	
	// Remoção de itens no estoque
	
	public void Remocao() {
		
		
		
	}
	
	
	
	// Busca de itens no estoque

	public void Busca() {
		
		
	}
	
	
	
	// Ver todos os Itens Cadastrados
	
	public void Vizualizacao() {
		
		
		
	}
	
}

