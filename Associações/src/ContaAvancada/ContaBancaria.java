package ContaAvancada;

public class ContaBancaria {

	private int agencia;
	private int numeroconta;
	private double saldo;
	protected Banco banco;
	protected Pessoa correntista;
	
	
	
	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Pessoa getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}

	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia>0)
		this.agencia = agencia;
	}
	
	public int getNumeroconta() {
		return numeroconta;
	}
	
	public void setNumeroconta(int numeroconta) {
		if(numeroconta>0)
		this.numeroconta = numeroconta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		if(saldo>0)
		this.saldo = saldo;
	}
	
	
	

	public boolean deposito(double valor) {
		if(valor > 0) {
			setSaldo(getSaldo()+valor);
			return true;
		}
		return false;
	}
		
	public boolean saque(double valor) {
		if(valor <= getSaldo() && valor > 0) {
			setSaldo(getSaldo() - valor);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaBancaria agencia=");
		builder.append(agencia);
		builder.append(", numeroconta=");
		builder.append(numeroconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", banco=");
		builder.append(banco);
		builder.append(", correntista=");
		builder.append(correntista);
		builder.append(" ");
		return builder.toString();
	}

	
}
