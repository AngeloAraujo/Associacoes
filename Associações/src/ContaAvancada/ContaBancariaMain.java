package ContaAvancada;

public class ContaBancariaMain {

	public static void main(String[] args) {
		
		Pessoa p =  new  Pessoa ();
		p.setNome("Angelo");
		p.setEndereco("Rua Walter Depiné, 211");
		System.out.println(p);
		
		Banco b =  new  Banco ();
		b.setCod(1);;
		b.setNome ( " Bradesco " );
		b.setAgencias(1234);
		System.out.println(b);
		
		ContaBancaria cb= new ContaBancaria();
		
		cb.banco= b;	
		cb.correntista=p;
		cb.setAgencia(20123);
		cb.setNumeroconta(20123457);
		cb.setSaldo(500);
		cb.deposito(120);
		cb.saque(510);
		
		System.out.println(cb);
		
		ContaSimples cs= new ContaSimples();
		cs.setSaldoPoupanca(500);
		cs.depositopoupanca(100);
		cs.saquepoupanca(550);
		cs.setBanco(b);
		cs.setCorrentista(p);
		cs.setAgencia(237);
		cs.setNumeroconta(1234);
		cs.setSaldo(450);
		
		System.out.println(cs);
		
		CartaoDeCredito cc= new CartaoDeCredito();
		cc.setLimite(500);
		cc.setNumero(123456);
		cc.setOperadora("Visa");
		cc.setTipoDeCartão("Crédito");
		
		
		ContaEspecial ce=new ContaEspecial();
		ce.setDiassemjuros(10);
		ce.setLimite(500);
		ce.setBanco(b);
		ce.setCorrentista(p);
		ce.setCartao (cc);
		System.out.println(ce);

	}

}
