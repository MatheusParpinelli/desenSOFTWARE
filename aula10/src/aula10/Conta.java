package aula10;


public class Conta {
		private String numero;
		private String numeroAgencia;
		private double saldo;
		private double limite;
		private String cliente;
		
		public void setNumero(String numero) {
			this.numero = numero;
		}
		
		public String getNumero() {
			return this.numero;
		}
		
		public void setNumeroAgencia(String numeroAgencia) {
			this.numeroAgencia = numeroAgencia;
		}
		
		public String getNumeroAgencia() {
			return this.numeroAgencia;
		}
		
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public double getSaldo() {
			return this.saldo;
		}
		
		public void setLimite(double limite) {
			this.limite = limite;
		}
		
		public double getLimite() {
			return this.limite;
		}
		
		public void setClinte(String cliente) {
			this.cliente = cliente;
		}
		
		public String getCliente() {
			return this.cliente;
		}
		
		
		
	}


