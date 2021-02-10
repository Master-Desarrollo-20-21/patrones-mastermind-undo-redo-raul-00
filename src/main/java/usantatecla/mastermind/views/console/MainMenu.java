package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.views.MessageView;

class MainMenu extends usantatecla.utils.Menu {
    public MainMenu(PlayController playController) {
        super(MessageView.CHOOSE_OPTION.getMessage());
        addCommand(new ProposeCommand(playController));
        addCommand(new UndoCommand(playController));
        addCommand(new RedoCommand(playController));
    }
}
