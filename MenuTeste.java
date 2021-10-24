package Atividade;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MenuTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ContaBank> Contas = new ArrayList<ContaBank>();
		int opt = 0, TipoConta;
		
		String NomeAgencia, NomeCliente, cpfcliente;
		int NumeroAgencia;
		double valordeposito;
		
Random geradorContaBank = new Random ();
		
		do {
			System.out.println("1- Cadastro: ");
			System.out.println("2- Deposito: ");
			System.out.println("3- Render juros: ");
			System.out.println("4- Consultar numero da agência: ");
			System.out.println("5- Alterar nome e número da agência: ");
			System.out.println("0- Sair: ");
			opt = sc.nextInt();
			
		
		
		switch(opt) {
		
		case 1: System.out.println();
		System.out.println("Nome da Agência: ");
		NomeAgencia = sc.next();
		System.out.println("Numero da Agência: ");
		NumeroAgencia = sc.nextInt();
		System.out.println("Seu nome: ");
		NomeCliente = sc.next();
		System.out.println("CPF: ");
		cpfcliente = sc.next();
		int numConta = geradorContaBank.nextInt(100);
		System.out.println("O número da sua conta é: "+numConta);	
					
		System.out.println("1. Poupança");
		System.out.println("2. Outra");
		TipoConta = sc.nextInt(); 
		
		if(TipoConta == 1) 
		{
			Contas.add(new Poupanca(numConta, new Banco(NumeroAgencia, NomeAgencia), new ClienteBank(NomeCliente, cpfcliente), 0.0));
		}else
		{
			Contas.add(new ContaBank(numConta, new Banco(NumeroAgencia, NomeAgencia), new ClienteBank(NomeCliente, cpfcliente), 0.0));
		}	
		System.out.println("Seu cadastro foi finalizado!");
		System.out.println("Saldo Inicial : 0.0");		
	break;
		
		
		case 2:
			System.out.println("Informe seu CPF: ");
			cpfcliente = sc.next();
			
			for (int i = 0; i < Contas.size(); i++){	
				if(Contas.get(i).getCliente().getCpf().equals(cpfcliente))
				{
					System.out.println("Valor a ser depositado: ");
					valordeposito = sc.nextDouble();
					Contas.get(i).setSaldo(valordeposito);
				} 
			}
		break;
		
		case 3:
		
		System.out.println("Informe seu CPF: ");
		cpfcliente = sc.next();
	
		for (int i = 0; i < Contas.size(); i++) 
		{	
			if(Contas.get(i) instanceof Poupanca)
			{
			 if(((Poupanca) Contas.get(i)).getCliente().getCpf().equals(cpfcliente))
			{
				System.out.println("Rendimento: "+ ((Poupanca) Contas.get(i)).RenderJuros());
			} 
			}
	    }
		
		
			break;
		
		case 4:
			System.out.println("Numero da Agência: ");
			NumeroAgencia = sc.nextInt();
			System.out.println("Nome da Agência: ");
			NomeAgencia = sc.next();
			
			for (int i = 0; i < Contas.size(); i++) {
				if(Contas.get(i).getBanco().getNomeAgencia().equals(NomeAgencia) && Contas.get(i).getBanco().getNumeroAgencia() == NumeroAgencia) 
				{
					System.out.println("Nome do Cliente: "+Contas.get(i).getCliente().getNome());
					System.out.println("CPF do Cliente: "+Contas.get(i).getCliente().getCpf());
				}
			}
			System.out.println("Agência não cadastrada.");
			break;
			
			
		case 5:
			System.out.println("Informe seu nome: ");
			NomeCliente = sc.next();
			
			for (int i = 0; i < Contas.size(); i++) {
				if(Contas.get(i).getCliente().getNome().equals(NomeCliente)) 
				{
					System.out.println("Novo número da Agência: ");
					NumeroAgencia = sc.nextInt();
					System.out.println("Nova Agência: ");
					NomeAgencia = sc.next();			
					Contas.get(i).getBanco().setNumeroAgencia(NumeroAgencia);
					Contas.get(i).getBanco().setNomeAgencia(NomeAgencia);
					System.out.println("Seus dados foram alterados.");
				}
			}	
			break;
		}						
		}while(opt!=0);
	}
	}
