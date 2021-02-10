package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.views.View;

public class ConsoleView extends View {

	private StartView startView;

	private ProposalView proposalView;

	private ResumeView resumeView;
	private PlayView playView;

	public ConsoleView() {
		this.startView = new StartView();
		this.proposalView = new ProposalView();
		this.resumeView = new ResumeView();
		this.playView = new PlayView();
	}

	public void visit(StartController startController) {
		this.startView.interact(startController);
	}

	public void visit(ProposalController proposalController) {
		this.proposalView.interact(proposalController);
	}

	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
	}

	public void visit(PlayController playController) {
		this.playView.interact(playController);
	}
}
