package br.com.fiap.util;

public class ProcessMessage {

	public static String getMessage(String botMessage, String userMessage) {
		String message = "Não entendi...";

		if (botMessage.equals(Messages.T1.getText())) {
			return T1(userMessage);
		}
		return message;
	}

	private static String T1(String userMessage) {

		if (userMessage.equals("Sim")) {
			return "OK";
		} else {
			return "NOK";
		}
	}

}
