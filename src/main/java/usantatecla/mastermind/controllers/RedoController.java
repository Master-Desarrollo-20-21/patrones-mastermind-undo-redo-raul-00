package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class RedoController extends Controller {

    RedoController(Session session) {
        super(session);
    }

    public boolean isRedoable() {
        return this.session.isRedoable();
    }

    public void redo() {
        this.session.redo();
    }
}
