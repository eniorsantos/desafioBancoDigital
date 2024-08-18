import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		Cliente enio = new Cliente();
		enio.setNome("Enio");
		
		Conta cc = new ContaCorrente(enio);
		Conta poupanca = new ContaPoupanca(enio);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.depositar(234);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
		List<Conta> contaBanco = new ArrayList<>();
		
		
		
		contaBanco.add(poupanca);
		contaBanco.add(cc);
		
		double total = 0;
		
		for (Conta conta : contaBanco) { 			
			total += conta.getSaldo();
			
		}
		System.out.println();
		System.out.println("Saldo da agencia R$ " + total);
		System.out.println("Total de contas da agencia " + contaBanco.size());
	}	

}
