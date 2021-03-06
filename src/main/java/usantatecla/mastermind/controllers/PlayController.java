package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;

public class PlayController extends Controller implements AcceptorController {

    private ProposalController proposalController;
    private UndoController undoController;
    private RedoController redoController;

    PlayController(Session session) {
        super(session);
        proposalController = new ProposalController(session);
        undoController = new UndoController(session);
        redoController = new RedoController(session);
    }

    public Error addProposedCombination(List<Color> colors) {
        return this.proposalController.addProposedCombination(colors);
    }

    public boolean isWinner() {
        return this.proposalController.isWinner();
    }

    public boolean isLooser() {
        return this.proposalController.isLooser();
    }

    public int getAttempts() {
        return this.proposalController.getAttempts();
    }

    public List<Color> getColors(int position) {
        return this.proposalController.getColors(position);
    }

    public int getBlacks(int position) {
        return this.proposalController.getBlacks(position);
    }

    public int getWhites(int position) {
        return this.proposalController.getWhites(position);
    }

    public ProposalController getProposalController() {
        return proposalController;
    }

    public boolean isRedoable() {
        return this.redoController.isRedoable();
    }

    public void redo() {
        this.redoController.redo();
    }

    public boolean isUndoable() {
        return this.undoController.isUndoable();
    }

    public void undo() {
        this.undoController.undo();
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
