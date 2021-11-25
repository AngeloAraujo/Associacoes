package ContaAvancada;

public class CartaoDeCredito {
	
	private int numero;
	private String operadora;
	private double limite;
	private String tipoDeCart�o;
	
	
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
	
	public String getTipoDeCart�o() {
		return tipoDeCart�o;
	}
	
	public void setTipoDeCart�o(String tipoDeCart�o) {
		if(tipoDeCart�o.length()>0)
		this.tipoDeCart�o = tipoDeCart�o;
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
		builder.append(", tipo de Cart�o=");
		builder.append(tipoDeCart�o);
		builder.append(" ");
		return builder.toString();
	}
	
	
	

}
