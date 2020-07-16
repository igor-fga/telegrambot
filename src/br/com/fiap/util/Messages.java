package br.com.fiap.util;

public enum Messages {
	T1("Posso ajudar na compra de ingressos?"), 
	SIT("https://sit.domain.com:2019/"), 
	CIT("https://cit.domain.com:8080/"),
	DEV("https://dev.domain.com:21323/");

	private String text;

	Messages(String messageText) {
		this.text = messageText;
	}

	public String getText() {
		return text;
	}
}
