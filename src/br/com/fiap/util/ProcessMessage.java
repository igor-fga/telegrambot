package br.com.fiap.util;

import java.util.ArrayList;
import java.util.Arrays;

public class ProcessMessage {

	private Answers ans = new Answers();

	public String getMessage(String botMessage, String userMessage) {
		String message = Messages.T0.getText();

		if (botMessage.equals(Messages.T1.getText())) {
			return T1(userMessage);
		} else if (botMessage.equals(Messages.T2.getText()) || botMessage.contains("filme desejado")) {
			return T2(userMessage);
		} else if (botMessage.equals(Messages.T3.getText().replace("{x}", ans.getNameMovie()))) {
			return T3(userMessage);
		} else if (botMessage
				.equals(Messages.T4.getText().replace("{x}", ans.getNameMovie() + " - " + ans.getMovieTime()))) {
			return T4(userMessage);
		} else if (botMessage.equals(Messages.T5.getText())) {
			return T5(userMessage);
		}

		return message;
	}

	private String T5(String userMessage) {
		ArrayList<String> possibleAnswer = new ArrayList<String>(Arrays.asList("SIM", "NÃO", "NAO", "1", "2"));

		if (possibleAnswer.contains(userMessage.toUpperCase())) {
			if (userMessage.toUpperCase().equals("SIM") || userMessage.equals("1")) {
				return Messages.T2.getText();
			} else {
				return "Obrigado pela compra e volte sempre!";
			}
		} else {
			return Messages.T0.getText();
		}
	}

	private String T4(String userMessage) {

		ArrayList<String> possibleAnswer = new ArrayList<String>(Arrays.asList("SIM", "NÃO", "NAO", "1", "2"));

		if (possibleAnswer.contains(userMessage.toUpperCase())) {
			if (userMessage.toUpperCase().equals("SIM") || userMessage.equals("1")) {
				return Messages.T5.getText();
			} else {
				return "OK. Volte sempre!";
			}
		} else {
			return Messages.T0.getText();
		}
	}

	private String T3(String userMessage) {
		String message;

		switch (userMessage) {
		case "1":
			ans.setMovieTime("15:30");
			message = Messages.T4.getText().replace("{x}", ans.getNameMovie() + " - " + ans.getMovieTime());
			break;
		case "2":
			ans.setMovieTime("17:20");
			message = Messages.T4.getText().replace("{x}", ans.getNameMovie() + " - " + ans.getMovieTime());
			break;
		case "3":
			ans.setMovieTime("21:40");
			message = Messages.T4.getText().replace("{x}", ans.getNameMovie() + " - " + ans.getMovieTime());
			break;
		default:
			message = Messages.T0.getText() + "\nEscolha uma opção valida de horário, por exemplo caso (1), digite 1!";
		}

		return message;
	}

	private String T2(String userMessage) {
		String message;

		switch (userMessage) {
		case "1":
			ans.setNameMovie("Star Wars: Os Ultimos Jedi");
			message = Messages.T3.getText().replace("{x}", ans.getNameMovie());
			break;
		case "2":
			ans.setNameMovie("Batman: Begins");
			message = Messages.T3.getText().replace("{x}", ans.getNameMovie());
			break;
		case "3":
			ans.setNameMovie("Xuxa e os Duendes");
			message = Messages.T3.getText().replace("{x}", ans.getNameMovie());
			break;
		case "4":
			ans.setNameMovie("Bastardos Inglórios");
			message = Messages.T3.getText().replace("{x}", ans.getNameMovie());
			break;
		default:
			message = Messages.T0.getText()
					+ "\nEscolha uma opção valida para o filme desejado, por exemplo caso (1), digite 1!";
		}

		return message;

	}

	private String T1(String userMessage) {

		ArrayList<String> possibleAnswer = new ArrayList<String>(Arrays.asList("SIM", "NÃO", "NAO", "1", "2"));

		if (possibleAnswer.contains(userMessage.toUpperCase())) {
			if (userMessage.toUpperCase().equals("SIM") || userMessage.equals("1")) {
				return Messages.T2.getText();
			} else {
				return "OK. Volte sempre!";
			}
		} else {
			return Messages.T0.getText();
		}
	}

}
