package Computador;

public class PlacaMae {
	
	private String marca;
	private String modelo;
	protected Processador processador;
	protected Hd hd;
	protected Memoria memoria;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		if(marca.length()>0)
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		if(modelo.length()>0)
		this.modelo = modelo;
	}
	
	public Processador getProcessador() {
		return processador;
	}
	
	public void setProcessador(Processador processador) {
		this.processador = processador;
	}
	
	public Hd getHd() {
		return hd;
	}
	
	public void setHd(Hd hd) {
		this.hd = hd;
	}
	
	public Memoria getMemoria() {
		return memoria;
	}
	
	public void setMemoria(Memoria memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Placa Mae Marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", ");
		builder.append(processador);
		builder.append(", ");
		builder.append(hd);
		builder.append(", ");
		builder.append(memoria);
		builder.append(". ");
		return builder.toString();
	}
	
	
	

}
