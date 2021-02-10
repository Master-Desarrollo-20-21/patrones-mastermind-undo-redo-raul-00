package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class UndoController extends Controller {

    UndoController(Session session) {
        super(session);
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {

    }

    public boolean isUndoable() {
        return this.session.isUndoable();
    }

    public void undo() {
        this.session.undo();
    }

}
