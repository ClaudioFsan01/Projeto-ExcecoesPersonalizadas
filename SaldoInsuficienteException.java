

public class SaldoInsuficienteException extends RuntimeException {
	/*RuntimeException � a exception m�e de todas as exceptions unchecked. 
	 Exemplo de exce��o unchecked pois o compilador n�o checa se voc� est� tratando essas exce��es porque 
	tais problemas poderiam ser evitados pelo programador */
	
	/* Podemos transformar essa Exception de unchecked para checked, obrigando a quem chamar o m�todo 
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
