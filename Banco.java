package Atividade;

public class Banco {

	private int NumeroAgencia;
	private String NomeAgencia;
	
	public Banco(int NumeroAgencia, String NomeAgencia) {
		this.NumeroAgencia = NumeroAgencia;
		this.NomeAgencia = NomeAgencia;
		
		}


		public int getNumeroAgencia() {
			return NumeroAgencia;
		}


		public void setNumeroAgencia(int numeroAgencia) {
			this.NumeroAgencia = numeroAgencia;
		}


		public String getNomeAgencia() {
			return NomeAgencia;
		}


		public void setNomeAgencia(String NomeAgencia) {
			this.NomeAgencia = NomeAgencia;
	}

}
