package Atividade;

public class Poupanca extends ContaBank{

	final double juros = 4.50; 
	
	public Poupanca(int numero, Banco Banco, ClienteBank cliente, double saldo) {
		super(numero, Banco, cliente, saldo);
	}
		
	public double getJuros() {
		return juros;
	}

	public double RenderJuros() {
		
		return super.getSaldo()+super.getSaldo()*(this.juros/100);
		
	}




}
