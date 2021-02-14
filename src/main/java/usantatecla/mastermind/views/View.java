package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.AcceptorController;
import usantatecla.mastermind.controllers.ControllerVisitor;

public abstract class View implements ControllerVisitor {

	public void interact(AcceptorController controller) {
		controller.accept(this);
	}

}
