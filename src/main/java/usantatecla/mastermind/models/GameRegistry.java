package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

class GameRegistry {

    private List<GameMemento> mementos;
    private Game game;
    private int firstPrevious;

    GameRegistry(Game game) {
        this.game = game;
        this.mementos = new ArrayList<>();
        this.firstPrevious = 0;
        this.mementos.add(this.firstPrevious, this.game.getMemento());
    }

    void register() {
        for (int i = 0; i < this.firstPrevious; i++) {
            this.mementos.remove(0);
            this.firstPrevious--;
        }
        this.mementos.add(this.firstPrevious, this.game.getMemento());
    }

    void undo() {
        this.firstPrevious++;
        this.game.setMemento(this.mementos.get(this.firstPrevious));
    }

    void redo() {
        this.firstPrevious--;
        this.game.setMemento(this.mementos.get(this.firstPrevious));
    }

    boolean isUndoable() {
        return this.firstPrevious < this.mementos.size() - 1;
    }

    boolean isRedoable() {
        return this.firstPrevious >= 1;
    }

}