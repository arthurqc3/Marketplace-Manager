package Estoque;

public class CadastrodeItens {

	private String nome;
	private Integer quantity;
	private String fornecedor;
	private Double preco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public CadastrodeItens(String nome, Integer quantity, String fornecedor, Double preco) {
		super();
		this.nome = nome;
		this.quantity = quantity;
		this.fornecedor = fornecedor;
		this.preco = preco;
		
	}

	public double valorTotal() {
		double valorT =  preco * quantity;
		return valorT;
	}
	
	public String toString() {
		return nome
				+ ", Quantidade em estoque:"
				+ quantity
				+ ", Fornecedor:"
				+ fornecedor
				+ " unidades, preco: "
				+ preco
				+ ", Quantitade em estoque:"
				+ quantity;
	}	
		
}
	
