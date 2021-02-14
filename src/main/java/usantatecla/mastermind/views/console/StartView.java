package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class StartView extends WithConsoleView {

	void interact(StartController startController) {
		startController.start();
		this.console.writeln(MessageView.TITLE.getMessage());
		SecretCombinationView secretCombinationView = new SecretCombinationView(startController);
		secretCombinationView.writeln();
	}

}
