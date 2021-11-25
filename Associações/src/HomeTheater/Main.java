public class Main {

	public static void main(String[] args) {
/*
		SistemaDeSom ss =  new SistemaDeSom();
		ss.setTensao(220);
		ss.setPotencia(1500);
		ss.setModelo("J-45");
		ss.setMarca("JBL");
		ss.setConsumo(550);
		
		SistemaDeVideo sv = new SistemaDeVideo();
		sv.setTipo("LED");
		sv.setTensao(110);
		sv.setResolucao("4K");
		sv.setModelo("L500");
		sv.setMarca("LG");
		sv.setConsumo(500);

		HomeTheater ht = new HomeTheater();
		ht.som = ss;
		ht.video = sv;
		System.out.println(ht);
		*/
		
		HomeTheater ht = new HomeTheater();
		
		ht.som.setTensao(110);
		ht.som.setConsumo(20);
		ht.som.setMarca("LG");
		ht.som.setModelo("SS12");
		ht.som.setPotencia(2000);
		
		ht.video.setTensao(220);
		ht.video.setConsumo(50);
		ht.video.setMarca("Samsung");
		ht.video.setModelo("LS45");
		ht.video.setResolucao("OLED");
		ht.video.setTipo("8K");
		
		System.out.println(ht);
	}
}