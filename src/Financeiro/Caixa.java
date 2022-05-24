package Financeiro;

import java.util.Scanner;

public class Caixa implements formasDePagamento {

	Scanner sc = new Scanner(System.in);
	private Double saldoDiario = 0.0;
	private Double faturamentoMensal = 0.0;
	
	public Double getSaldoDiario() {
		return saldoDiario;
	}
	public void setSaldoDiario(Double saldoDiario) {
		this.saldoDiario = saldoDiario;
	}
	public Double getFaturamentoMensal() {
		return faturamentoMensal;
	}
	public void setFaturamentoMensal(Double faturamentoMensal) {
		this.faturamentoMensal = faturamentoMensal;
	}
	
	@Override
	public Integer cartao(Integer num) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Integer pix(Integer num) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Integer dinheiro(Integer num) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void pagamento() {
		
		int temp = 0;
		int num = 0;
		
		System.out.println("Forma de Pagamento: ");
		System.out.println("1: Cartão\n2: Pix\n3: Á vista");
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			cartao(temp++);
			break;
		case 2:
			pix(temp++);
			break;
		case 3:
			dinheiro(temp++);
			break;
		default:
			System.out.println("Seleção errada");
			pagamento();
			break;
		}
	}
	
	public void faturamento(){
		
		int num = 0;
		
		System.out.println("===> Menu Financeiro <===");
		System.out.println("===> Escolha o que quer fazer <===");
		System.out.println("------------------------------------");
		System.out.println("1 - Saldo Diario");
		System.out.println("2 - Saldo Mensal");
		System.out.println("------------------------------------");
		
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println(saldoDiario);
			break;
		case 2:
			System.out.println(faturamentoMensal);
			break;
		default:
			System.out.println("Seleção não reconhecida");
			faturamento();
			break;
		}
	}
}
