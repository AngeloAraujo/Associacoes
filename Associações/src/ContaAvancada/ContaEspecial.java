package ContaAvancada;

public class ContaEspecial extends ContaBancaria{

	private int diassemjuros;
	private double limite;
	protected CartaoDeCredito cartao;
	
	
	
		

	public int getDiassemjuros() {
		return diassemjuros;
	}

	public void setDiassemjuros(int diassemjuros) {
		if(diassemjuros>0)
		this.diassemjuros = diassemjuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public CartaoDeCredito getCartao() {
		return cartao;
	}

	public void setCartao(CartaoDeCredito cartao) {
		this.cartao = cartao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta Especial dias sem juros=");
		builder.append(diassemjuros);
		builder.append(", limite= ");
		builder.append(limite);
		builder.append(", cartao= ");
		builder.append(cartao);
		builder.append(", ");
		builder.append(banco);
		builder.append(", ");
		builder.append(correntista);
		builder.append(".");
		return builder.toString();
	}

	

	
	
}
