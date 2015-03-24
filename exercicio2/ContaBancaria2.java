public class ContaBancaria2 {
	
	int agencia, contaCorrente;
	double saldo, limiteExtra;
	String titularConta;
	
	public void imprimirSaldo(){
		System.out.println ("Saldo: "+this.saldo);
	}
	
	public void imprimirSaldoTotal (){
		double soma=this.saldo + this.limiteExtra;
		System.out.println("Saldo: "+ soma);
	}
	
	public void imprimirAgencia (){
		System.out.println ("A agencia eh: "+this.agencia);
		
	}
	
	public void imprimirTitular(){
		System.out.println ("O titular da conta eh: "+this.titularConta);
	}

	public void imprimirContaCorrente(){
		System.out.println ("A conta-corrente eh: "+this.contaCorrente);
	}

	public static void main (String [] args){
		
		ContaBancaria2 cb = new ContaBancaria2();
		cb.agencia = 3610;
		cb.contaCorrente = 15766;
		cb.saldo = 35.54;
		cb.limiteExtra = 50;
		cb.titularConta = "Laura";
		
		cb.imprimirTitular();	
		cb.imprimirAgencia();
		cb.imprimirContaCorrente();	
		cb.imprimirSaldo();
		cb.imprimirSaldoTotal();
		
		
		
		
	}

}
