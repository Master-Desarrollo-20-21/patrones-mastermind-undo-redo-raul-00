package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

class GameMemento {
    private List<ProposedCombination> proposedCombinations;
    private List<Result> results;

    public GameMemento(List<ProposedCombination> proposedCombinations, List<Result> results) {
        this.proposedCombinations = new ArrayList<>();
        this.results = new ArrayList<>();
        for (ProposedCombination proposedCombination : proposedCombinations) {
            this.proposedCombinations.add(proposedCombination.copy());
        }
        for (Result result : results) {
            this.results.add(result.copy());
        }
    }

    public List<ProposedCombination> getProposedCombinations() {
        return this.proposedCombinations;
    }

    public List<Result> getResults() {
        return this.results;
    }
}
