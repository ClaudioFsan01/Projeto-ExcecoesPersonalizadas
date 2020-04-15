import java.util.Scanner;

public class Principal {
	
	public static void main(String [] args) {
		try {
			 /* Neste contexto foi inserido o try catch mas o programa não obrigaria utilizar pois 
			   a classe SaldoInsuficienteException extends a classe RuntimeException e essa classe é a exception mãe de todas as exceptions unchecked.*/
			
			Scanner sc = new Scanner(System.in);
			
			 ContaCorrente cc1 = new ContaCorrente();
			 /*
			 System.out.println(" Entre com o valor do deposito ");
			 double valor = sc.nextDouble();*/
			 
			 cc1.deposita(100);			 
			// System.out.println(" Valor do deposito : "+ valor);
			 System.out.println(" Saldo antes do saque : "+ cc1.getSaldo());
			 
			 cc1.saca(150);
			 
			 System.out.println(" Saldo depois do saque : "+ cc1.getSaldo());
			
		}catch(SaldoInsuficienteException e) {
			System.out.println(e.getMensagem());
		}
	}

}
