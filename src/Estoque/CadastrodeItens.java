package Estoque;

public class CadastrodeItens {

	private String nome;
	private Integer quantity;
	private String fornecedor;
	private Double ValordeCeV;
	
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
	public Double getValordeCeV() {
		return ValordeCeV;
	}
	public void setValordeCeV(Double valordeCeV) {
		ValordeCeV = valordeCeV;
	}
	
	
	public CadastrodeItens(String nome, Integer quantity, String fornecedor, Double valordeCeV) {
		this.nome = nome.toLowerCase();
		this.quantity = quantity;
		this.fornecedor = fornecedor;
		this.ValordeCeV = valordeCeV;
	}
	
	public double valorTotal() {
		double valorT = ValordeCeV * quantity;
		return valorT;
	}
	
	public String toString() {
		return nome
				+ ", Quantidade em estoque:"
				+ quantity
				+ ", Fornecedor:"
				+ fornecedor
				+ " unidades, preco: "
				+ ValordeCeV
				+ ", Quantitade em estoque:"
				+ quantity;
	}		
		
}
	
