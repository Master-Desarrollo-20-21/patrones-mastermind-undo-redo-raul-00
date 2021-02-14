package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.Menu;

class PlayMenu extends Menu {
    public PlayMenu(PlayController playController) {
        super(MessageView.CHOOSE_OPTION.getMessage());
        addCommand(new ProposeCommand(playController));
        addCommand(new UndoCommand(playController));
        addCommand(new RedoCommand(playController));
    }
}
