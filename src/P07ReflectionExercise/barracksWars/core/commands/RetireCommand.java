package reflectionAndAnnotationsExercise.barracksWars.core.commands;

import reflectionAndAnnotationsExercise.barracksWars.annotations.Inject;
import reflectionAndAnnotationsExercise.barracksWars.interfaces.Repository;

public class RetireCommand extends Command {
    @Inject
    private Repository repository;

    public RetireCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        try {
            repository.removeUnit(getData()[1]);
            return String.format("%s retired!", unitType);
        } catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }

    }
}
