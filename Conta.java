
public class Conta {
	
	
	int numero;
	String titular;
	double saldo;
	double salario;
	
	
	
	public double getSaldo() {
		return this.saldo;
	}

	void deposita(double quantidade)
	{
		this.saldo += quantidade;
	}
	
		
	/*  
	 A palavra chave throw, que est� no imperativo, lan�a uma Exception . Isto � bem diferente de
throws , que est� no presente do indicativo, e que apenas avisa da possibilidade daquele m�todo lan��la,
obrigando o outro m�todo que v� utilizar deste de se preocupar com essa exce��o em quest�o.
	*/
	
	/* Como a classe  SaldoInsuficienteException extends a classe RuntimeException e essa classe � a exception m�e de todas
	  as exceptions unchecked ,ou seja,  o compilador n�o checa se voc� est� tratando essas exce��es porque 
	tais problemas poderiam ser evitados pelo programador. 
	* Neste caso quem chama o m�todo  saca(double valor) n�o � obrigado a inserir o try catch*/
	public void saca(double valor)
	{
		if(valor > this.saldo)
		{	
			throw new SaldoInsuficienteException(" Saldo insuficiente tente um valor menor");		
		}
		else
		{
			this.saldo -= valor;
			
		}
		 
	}
	
	
	
	
	
	
}
