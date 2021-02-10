package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.views.MessageView;

class ProposeCommand extends Command {

    public ProposeCommand(PlayController playController) {
        super(MessageView.PROPOSE_COMMAND.getMessage(), playController);
    }

    @Override
    protected void execute() {
        new ProposalView().interact(this.playController.getProposalController());
    }

    @Override
    protected boolean isActive() {
        return true;
    }
}
