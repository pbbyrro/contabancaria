package conta;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Classe ContaCorrente
		ContaCorrente c2 = new ContaCorrente(34, 589, 1, "Júlia", 2000.0f, 500.0f);
		
		c2.visualizar();
		
		if (c2.sacar(100))
			System.out.println("Saque efetuado com sucesso. O novo saldo é de: " + c2.getSaldo());
		else
			System.out.println("O saldo é insuficiente!");
		
		c2.depositar(1000);
		System.out.println("Depósito efetuado com sucesso. O novo saldo é de: " + c2.getSaldo());
		
		//Classe ContaPoupanca
		ContaPoupanca c3 = new ContaPoupanca(21, 475, 2, "Kléber", 5000.0f, 20);
		c3.visualizar();
		
		if (c3.sacar(100))
			System.out.println("Saque efetuado com sucesso. O novo saldo é de: " + c3.getSaldo());
		else
			System.out.println("O saldo é insuficiente!");
		
		c3.depositar(1000);
		System.out.println("Depósito efetuado com sucesso. O novo saldo é de: " + c3.getSaldo());
	}

}