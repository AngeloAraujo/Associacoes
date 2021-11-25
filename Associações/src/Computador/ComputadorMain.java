package Computador;

public class ComputadorMain {

	public static void main(String[] args) {
		
		Hd hd= new Hd();
		hd.setCapacidade(512);
		hd.setMarca("Kingston");
		hd.setModelo("SSD");
		hd.setRpm(1500);
		
		System.out.println(hd);
		
		Memoria me = new Memoria();
		me.setMarca("SanDisk");
		me.setModelo("HTR-2315");
		me.setCapacidade(1);
		me.setVelocidade(240);
		
		System.out.println(me);
		
		Processador pr= new Processador();
		pr.setMarca("Intel");
		pr.setModelo("Core I5");
		pr.setClock(128);
		pr.setCache(512);
		System.out.println(pr);
		
		PlacaMae pm = new PlacaMae();
		pm.setMarca("Intel");
		pm.setModelo("PM-1542");
		pm.setHd(hd);
		pm.setMemoria(me);
		pm.setProcessador(pr);
		
		System.out.println(pm);
		
		Gabinete ga = new Gabinete();
		ga.setModelo("Apple");
		ga.setTipo("Torre");
		ga.setBaias(1);
		ga.setPlacamae(pm);
		
		System.out.println(ga);
		
		Monitor mo = new Monitor ();
		mo.setMarca("Philco");
		mo.setTipo("LCD");
		mo.setResolução("1240X720");
		
		System.out.println(mo);

		Teclado te= new Teclado();
		te.setMarca("Globo");
		te.setTipo("Sem fio");
		
		System.out.println(te);
		
		Mouse mou= new Mouse();
		mou.setMarca("Lego");
		mou.setTipo("Sem fio");
		
		System.out.println(mo);
		
		EquipamentoEletronico e=new EquipamentoEletronico();
		e.setConsumo(30);
		e.setTensao(220);
		System.out.println(e);
		
		
		Computador co=new Computador();
		
		co.setConsumo(50);
		co.setTensao(220);
		co.setMarca("Dell");
		co.setModelo("Clean");
		co.setGabinete(ga);
		co.setMonitor(mo);
		co.setMouse(mou);
		co.setTeclado(te);
		
		
		System.out.println(co);
		
	}

}
