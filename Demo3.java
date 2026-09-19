public class Demo3 {
    void modifyEpochs(AIExperiment expo) {
        expo.completedEpochs = 9;
    }

    public static void main(String[] args) {
        Demo3 trial = new Demo3();
        AIExperiment exp1 = new AIExperiment();
        AIExperiment exp2 = new AIExperiment();

        exp1.experimentName = "Resume_Modifier";
        exp1.completedEpochs = 7;
        exp1.targetEpochs = 18;

        exp2.experimentName = "Spam_Detector";
        exp2.completedEpochs = 5;
        exp2.targetEpochs = 10;

        System.out.println(exp1.experimentName);
        System.out.println(exp1.targetEpochs);
        System.out.println(exp1.completedEpochs);

        System.out.println(exp2.experimentName);
        System.out.println(exp2.targetEpochs);
        System.out.println(exp2.completedEpochs);

        
        exp1.runEpochs(3);

        System.out.println(exp1.remainingEpochs());
        System.out.println(exp1.status());

        // Pass-by-value reference modification
        trial.modifyEpochs(exp2);

        System.out.println(exp1.experimentName);
        System.out.println(exp1.targetEpochs);
        System.out.println(exp1.completedEpochs);

        System.out.println(exp2.experimentName);
        System.out.println(exp2.targetEpochs);
        System.out.println(exp2.completedEpochs);
    }
}