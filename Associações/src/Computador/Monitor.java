package Computador;

public class Monitor {

	private String marca;
	private String tipo;
	private String resolucao;

	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		if(marca.length()>0)
		this.marca = marca;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		if(tipo.length()>0)
		this.tipo = tipo;
	}
	
	public String getResolução() {
		return resolucao;
	}
	
	public void setResolução(String resolucao) {
		if(resolucao.length()>0)
		this.resolucao = resolucao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Monitor Marca= ");
		builder.append(marca);
		builder.append(", tipo= ");
		builder.append(tipo);
		builder.append(", resolucao= ");
		builder.append(resolucao);
		builder.append(" ");
		return builder.toString();
	}
	
	
}
