

public class SaldoInsuficienteException extends RuntimeException {
	/*RuntimeException é a exception mãe de todas as exceptions unchecked. 
	 Exemplo de exceção unchecked pois o compilador não checa se você está tratando essas exceções porque 
	tais problemas poderiam ser evitados pelo programador */
	
	/* Podemos transformar essa Exception de unchecked para checked, obrigando a quem chamar o método 
	  saca(double valor) na classe Conta a dar try-catch , ou throws ex:
	 
public class SaldoInsuficienteException extends Exception {
String mensagem;	
	SaldoInsuficienteException(String mensagem){
		this.mensagem = mensagem;
	}
	
}

*/
	
	
	String mensagem;
	
	SaldoInsuficienteException(String mensagem){
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return this.mensagem;
	}

}
