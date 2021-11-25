package Carro;

public class Carro {
	
	private String fabricante;
	private String modelo;
	private String cor;
	private int ano;
	protected Pessoa dono;
	protected Motor motor;
	
	public Carro() {
		dono= new Pessoa();
		motor= new Motor ();
	}
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		if (fabricante.length()>0)
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if (modelo.length()>0)
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		if (cor.length()>0)
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if (ano>0)
		this.ano = ano;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [fabricante=");
		builder.append(fabricante);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", ano=");
		builder.append(ano);
		builder.append(", dono=");
		builder.append(dono);
		builder.append(", motor=");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}



	
	
		
	

}
