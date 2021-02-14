package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class ResumeController extends Controller implements AcceptorController {

	public ResumeController(Session session) {
		super(session);
	}

	public void resume(boolean newGame) {
		if (newGame) {
			this.session.clear();
			this.session.reset();
		} else {
			this.session.next();
		}
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}
}
