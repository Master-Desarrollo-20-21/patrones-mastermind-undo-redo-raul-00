package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.utils.WithConsoleView;

class PlayView extends WithConsoleView {

    public void interact(PlayController playcontroller) {
        new MainMenu(playcontroller).execute();
    }
}
