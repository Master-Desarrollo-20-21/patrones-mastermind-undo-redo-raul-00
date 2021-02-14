package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;

public class View extends usantatecla.mastermind.views.View {

	private GameView gameView;

	public View() {
		this.gameView = new GameView();
	}

	public void visit(StartController startController) {
		this.gameView.interact(startController);
	}

	public void visit(ProposalController proposalController) {
		this.gameView.interact(proposalController);
	}

	public void visit(ResumeController resumeController) {
		ResumeDialog resumeDialog = new ResumeDialog();
		resumeController.resume(resumeDialog.isNewGame());
		if (resumeDialog.isNewGame()) {
			this.gameView = new GameView();
		} else {
			this.gameView.setVisible(false);
			System.exit(0);
		}
	}

}