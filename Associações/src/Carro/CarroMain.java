package Carro;

public class CarroMain {

	public static void main(String[] args) {
		
		Carro ca= new Carro ();
		
		ca.setModelo("Gol");
		ca.setFabricante("Volkswagen");
		ca.setCor("branco");
		ca.setAno(2021);
		
		ca.motor.setMarca("Fiat");
		ca.motor.setPotencia(120);
		ca.motor.setCilindros(80);
		ca.motor.setCombustivel("Gasolina");
		
		ca.dono.setNome("Angelo");
		ca.dono.setEndereco("Rua Parana, 1000");
		
		
		
		System.out.println(ca);
		
	}

}
