package br.com.fiap.main;

import java.util.List;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ChatAction;
import com.pengrad.telegrambot.request.GetUpdates;
import com.pengrad.telegrambot.request.SendChatAction;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.response.GetUpdatesResponse;
import com.pengrad.telegrambot.response.SendResponse;

import br.com.fiap.util.Messages;
import br.com.fiap.util.ProcessMessage;

public class Main {

	public static void main(String[] args) {

		String responseMessage = "";

		// Creation of bot object with access information
		TelegramBot bot = new TelegramBot("1386512793:AAHFSzwVUe_CU9vPLXSYX-KZ3Dw-B2Yxnxk");

		// object responsible for receiving messages
		GetUpdatesResponse updatesResponse;

		// object responsible for managing the sending of responses
		SendResponse sendResponse;

		// object responsible for managing the sending of chat actions
		BaseResponse baseResponse;

		ProcessMessage pMessage = new ProcessMessage();

		// off-set control, that is, from this ID the pending messages in the queue will
		// be read
		int m = 0;

		// infinite loop can be changed by some short interval timer
		while (true) {

			// executes command in Telegram to get pending messages from an offset (initial
			// limit)
			updatesResponse = bot.execute(new GetUpdates().limit(100).offset(m));

			// message list
			List<Update> updates = updatesResponse.updates();

			// analysis of each message action
			for (Update update : updates) {

				// update of the offset
				m = update.updateId() + 1;

				System.out.println("Receive message: " + update.message().text());

				// sending "Writing" before sending the response
				baseResponse = bot.execute(new SendChatAction(update.message().chat().id(), ChatAction.typing.name()));

				// chat action verification was successfully sent
				System.out.println("Chat Action response sent? " + baseResponse.isOk());

				// sending the reply message
				if (update.message().text().equals("/start")) {
					responseMessage = "Ola, sou assistente virtual para compra de ingressos de cinema da CineGo!";
					sendResponse = bot.execute(new SendMessage(update.message().chat().id(), responseMessage));
					System.out.println("Chat Message response sent? " + sendResponse.isOk());

					baseResponse = bot
							.execute(new SendChatAction(update.message().chat().id(), ChatAction.typing.name()));
					System.out.println("Chat Action response sent? " + baseResponse.isOk());

					responseMessage = Messages.T1.getText();
					sendResponse = bot.execute(new SendMessage(update.message().chat().id(), responseMessage));
					System.out.println("Chat Message response sent? " + sendResponse.isOk());
				} else {
					String responseAux = pMessage.getMessage(responseMessage, update.message().text());

					if (responseAux.contains(Messages.T0.getText())) {
						sendResponse = bot
								.execute(new SendMessage(update.message().chat().id(), Messages.T0.getText()));
					} else {
						sendResponse = bot.execute(new SendMessage(update.message().chat().id(), responseAux));
						responseMessage = responseAux;
					}

					System.out.println("Chat Message response sent? " + sendResponse.isOk());
				}
			}
		}

	}
}
