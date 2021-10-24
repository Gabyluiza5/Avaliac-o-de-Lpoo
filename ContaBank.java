package Atividade;

public class ContaBank {

	private int Numero;
	private Banco banco;
	private ClienteBank cliente;
	private double saldo;
	
	
	public ContaBank(int numero, Banco banco, ClienteBank clienteBank, double saldo) {
		super();
		this.Numero = numero;
		this.banco = banco;
		this.cliente = clienteBank;
		this.saldo = saldo;
		

}


	public int getNumero() {
		return Numero;
	}


	public void setNumero(int numero) {
		Numero = numero;
	}


	public Banco getBanco() {
		return banco;
	}


	public void setBanco(Banco banco) {
		this.banco = banco;
	}


	public ClienteBank getCliente() {
		return cliente;
	}


	public void setCliente(ClienteBank clienteBank) {
		this.cliente = clienteBank;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
