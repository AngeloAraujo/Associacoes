package ContaAvancada;

public class ContaSimples extends ContaBancaria {

	private double saldoPoupanca;
	
	

	public ContaSimples() {
		setSaldoPoupanca(saldoPoupanca);
	}



	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}



	public void setSaldoPoupanca(double saldoPoupanca) {
		if(saldoPoupanca>0)
		this.saldoPoupanca = saldoPoupanca;
	}


	public boolean depositopoupanca(double valor){
		if(valor > 0) {
			setSaldoPoupanca(getSaldoPoupanca()+valor);
			return true;
		}
		return false;
	}
	
	public boolean saquepoupanca (double valor) {
		if(valor <= getSaldoPoupanca() && valor > 0) {
			setSaldoPoupanca(getSaldoPoupanca() - valor);
			return true;
		}
		return false;
}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta Simples Saldo Poupanca= ");
		builder.append(saldoPoupanca);
		builder.append(", ");
		builder.append(banco);
		builder.append(" ");
		builder.append(correntista);
		builder.append(", ");
		builder.append(super.toString());
		builder.append(" ");
		return builder.toString();
	}

	


	



	
}
