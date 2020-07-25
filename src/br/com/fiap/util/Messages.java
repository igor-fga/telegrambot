package br.com.fiap.util;

/** 
* Classe Enumeradora de mensagens padr�o que o Robo deve responder
*/

public enum Messages {

	
	/** 
	* Mensagem: N�o entendi...
	*/
	T0("N�o entendi..."),
	/** 
	* Mensagem: Posso ajudar na compra de ingressos? \n\n (1) SIM \n (2) NÃO
	*/
	T1("Posso ajudar na compra de ingressos? \n\n (1) SIM \n (2) N�O"),
	/** 
	* Mensagem: Qual das op��es de filmes abaixo deseja assistir?  (1) Star Wars: Os Ultimos Jedi (2) Batman: Begins (3) Xuxa e os Duendes \n (4) Bastardos Ingl�rios
	*/
	T2("Qual das op��es de filmes abaixo deseja assistir? \n\n (1) Star Wars: Os Ultimos Jedi  \n (2) Batman: Begins \n "
			+ "(3) Xuxa e os Duendes \n (4) Bastardos Ingl�rios"),
	/** 
	* Mensagem: {x} � uma otima escolha! Qual das op��es de hor�rios abaixo para hoje deseja comprar? (1) 15:30  (2) 17:20  (3) 21:40
	*/
	T3("{x} � uma otima escolha! Qual das op��es de hor�rios abaixo para hoje deseja comprar?"
			+ "\n\n (1) 15:30 \n (2) 17:20 \n (3) 21:40"),
	/** 
	* Mensagem: Posso confirmar a reserva para {x}? \n\n (1) SIM \n (2) NÃO
	*/
	T4("Posso confirmar a reserva para {x}? \n\n (1) SIM \n (2) NÃO"),
	/** 
	* Mensagem: Reserva confirmada! Ajudo com mais alguma coisa? \n\n (1) SIM \n (2) NÃO
	*/
	T5("Reserva confirmada! Ajudo com mais alguma coisa? \n\n (1) SIM \n (2) NÃO");

	private String text;

	/** 
	* Construtor de mensagens
	* @param messageText mensagem do texto
	*/
	Messages(String messageText) {
		this.text = messageText;
	}

	/** 
	* M�todo de retorno do texto da mensagem
	* @return texto da mensagem
	*/
	public String getText() {
		return text;
	}
}
