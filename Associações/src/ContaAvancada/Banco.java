package ContaAvancada;

public class Banco {

	private int cod;
	private String nome;
	private int agencia;
	
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		if (cod>0)
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length()>0)
		this.nome = nome;
	}
	public int getAgencias() {
		return agencia;
	}
	public void setAgencias(int agencias) {
		if (agencias>0)
		this.agencia = agencias;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" Banco =");
		builder.append(cod);
		builder.append(", nome= ");
		builder.append(nome);
		builder.append(", agencia= ");
		builder.append(agencia);
		builder.append(" ");
		return builder.toString();
	}
	
	
	
}
