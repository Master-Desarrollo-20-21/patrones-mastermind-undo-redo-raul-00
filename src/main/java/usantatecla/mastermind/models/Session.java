package usantatecla.mastermind.models;

import java.util.List;

import usantatecla.mastermind.types.Color;

public class Session {

    private Game game;
    private GameRegistry gameRegistry;
    private State state;

    public Session() {
        this.state = new State();
        this.game = new Game();
        this.gameRegistry = new GameRegistry(this.game);
    }

    public boolean isUndoable() {
        return this.gameRegistry.isUndoable();
    }

    public void undo() {
        this.gameRegistry.undo();

    }

    public boolean isRedoable() {
        return this.gameRegistry.isRedoable();
    }

    public void redo() {
        this.gameRegistry.redo();

    }

    public int getWidth() {
        return this.game.getWidth();
    }

    public boolean isWinner() {
        return this.game.isWinner();
    }

    public void next() {
        this.state.next();
    }

    public Object getValueState() {
        return this.state.getValueState();
    }

    public boolean isLooser() {
        return this.game.isLooser();
    }

    public int getAttempts() {
        return this.game.getAttempts();
    }

    public List<Color> getColors(int position) {
        return this.game.getColors(position);
    }

    public int getBlacks(int position) {
        return this.game.getBlacks(position);
    }

    public int getWhites(int position) {
        return this.game.getWhites(position);
    }

    public void addProposedCombination(List<Color> colors) {
        this.game.addProposedCombination(colors);
        this.gameRegistry.register();
    }

    public void reset() {
        this.state.reset();
    }

    public void clear() {
        this.game.clear();
    }
}
