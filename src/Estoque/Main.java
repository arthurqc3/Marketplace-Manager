package Estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> estoque = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque as Informações do produto: ");
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Fornecedor: ");
		String fornecedor = sc.nextLine();
		
		System.out.print("Quantitade: ");
		int quantity = sc.nextInt();
		
		System.out.print("Preço: ");
		double  valordeCeV = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		int qntdEstoque = sc.nextInt();
		
		CadastrodeItens product = new CadastrodeItens(name, quantity, fornecedor, valordeCeV, qntdEstoque);
		
		System.out.println(product);
		
		
		sc.close();
	}
	
}
