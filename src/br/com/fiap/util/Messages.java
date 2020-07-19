package br.com.fiap.util;

public enum Messages {
	T0("Não entendi..."),
	T1("Posso ajudar na compra de ingressos? \n\n (1) SIM \n (2) NÃO"),
	T2("Qual das opções de filmes abaixo deseja assistir? \n\n (1) Star Wars: Os Ultimos Jedi  \n (2) Batman: Begins \n "
			+ "(3) Xuxa e os Duendes \n (4) Bastardos Inglórios"),
	T3("{x} é uma otima escolha! Qual das opções de horários abaixo para hoje deseja comprar?"
			+ "\n\n (1) 15:30 \n (2) 17:20 \n (3) 21:40"),
	T4("Posso confirmar a reserva para {x}? \n\n (1) SIM \n (2) NÃO"),
	T5("Reserva confirmada! Ajudo com mais alguma coisa? \n\n (1) SIM \n (2) NÃO");

	private String text;

	Messages(String messageText) {
		this.text = messageText;
	}

	public String getText() {
		return text;
	}
}
