package conta;

import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c1 = new Conta(23, 555, 1, "Patricia", 1000f);

		c1.visualizar();

		if (c1.sacar(100))
			System.out.println("Saque efetuado com sucesso. O novo saldo é de: " + c1.getSaldo());
		else
			System.out.println("O saldo é insuficiente!");
		
		
		c1.depositar(1000);
		System.out.println("Depósito efetuado com sucesso. O novo saldo é de: " + c1.getSaldo());
		

		
	}

}