package cap4;

public class Programa {
	public static void main(String args[]) {
		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.dono = "jesus";
		minhaConta.saldo = 5000;
		minhaConta.numero = 123;
		minhaConta.limite = 500000;
		minhaConta.cpf = "123.456.789-0";
		Conta conta2 = new Conta();
		conta2.dono ="jesus";
		conta2.depositar(minhaConta.saldo);
		System.out.println(conta2.saldo);
		minhaConta.transferir(conta2, 200);
		System.out.println(conta2.saldo);
		System.out.println(minhaConta.saldo);
		boolean conseguiu = minhaConta.sacar(3255);
		if (conseguiu) {
			System.out.printf("O seu saldo atual � R$ %.2f \n",minhaConta.saldo);
		}
		else {
			System.out.printf("N�o foi possivel realizar o saque, seu saldo atual � R$ %.2f \n",minhaConta.saldo);
		}
	}

}
