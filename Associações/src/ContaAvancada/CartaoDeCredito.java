package ContaAvancada;

public class CartaoDeCredito {
	
	private int numero;
	private String operadora;
	private double limite;
	private String tipoDeCartão;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if(numero>0)
		this.numero = numero;
	}
	
	public String getOperadora() {
		return operadora;
	}
	
	public void setOperadora(String operadora) {
		if(operadora.length()>0)
		this.operadora = operadora;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		if(limite>0)
		this.limite = limite;
	}
	
	public String getTipoDeCartão() {
		return tipoDeCartão;
	}
	
	public void setTipoDeCartão(String tipoDeCartão) {
		if(tipoDeCartão.length()>0)
		this.tipoDeCartão = tipoDeCartão;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" numero=");
		builder.append(numero);
		builder.append(", operadora=");
		builder.append(operadora);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", tipo de Cartão=");
		builder.append(tipoDeCartão);
		builder.append(" ");
		return builder.toString();
	}
	
	
	

}
