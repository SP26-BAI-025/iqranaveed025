public class AIExperiment {
    String experimentName;
    int completedEpochs;
    int targetEpochs;

    // R3: Void method to increase completedEpochs
    void runEpochs(int epochs) {
        completedEpochs += epochs;
    }

    // R4: Overloaded runEpochs method
    void runEpochs(int epochs, int bonusEpochs) {
        completedEpochs += (epochs + bonusEpochs);
    }

    // R5 & R7: Returns remaining epochs using a local variable
    int remainingEpochs() {
        int remaining = targetEpochs - completedEpochs; // Local variable (R7)
        return remaining;
    }

    // R6: Returns readable one-line status summary
    String status() {
        return "Experiment: " + experimentName + " | Completed: " + completedEpochs + "/" + targetEpochs + " Epochs";
    }
}