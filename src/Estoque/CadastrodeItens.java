package Estoque;

public class CadastrodeItens {

	private String nome;
	private Integer quantity;
	private String fornecedor;
	private Double ValordeCeV;
	private Integer QntdEstoque;
	
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
	public Integer getQntdEstoque() {
		return QntdEstoque;
	}
	public void setQntdEstoque(Integer qntdEstoque) {
		QntdEstoque = qntdEstoque;
	}
	
	
	public CadastrodeItens(String nome, Integer quantity, String fornecedor, Double valordeCeV, Integer qntdEstoque) {
		this.nome = nome;
		this.quantity = quantity;
		this.fornecedor = fornecedor;
		this.ValordeCeV = valordeCeV;
		this.QntdEstoque = qntdEstoque;
	}
	
	public String toString() {
		return nome
				+ ", Quantidade em estoque:"
				+ quantity
				+ ", Fornecedor:"
				+ fornecedor
				+ " unidades, preço: "
				+ ValordeCeV
				+ ", Quantitade em estoque:"
				+ QntdEstoque;
	}		
		
}
	
