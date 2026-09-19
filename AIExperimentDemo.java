class AIExperimentDemo {

    static void addBonusProgress(AIExperiment experiment) {
        experiment.completedEpochs =
                experiment.completedEpochs + 5;
    }

    public static void main(String[] args) {

        AIExperiment experiment1 = new AIExperiment();
        AIExperiment experiment2 = new AIExperiment();

        experiment1.experimentName = "Image Classification";
        experiment1.completedEpochs = 20;
        experiment1.targetEpochs = 100;

        experiment2.experimentName = "Object Detection";
        experiment2.completedEpochs = 35;
        experiment2.targetEpochs = 120;

        System.out.println("Initial State:");

        System.out.println(experiment1.status());
        System.out.println(experiment2.status());

        experiment1.runEpochs(10);

        experiment2.runEpochs(15, 5);

        System.out.println("\nAfter Running Epochs:");

        System.out.println(experiment1.status());
        System.out.println(experiment2.status());

        System.out.println("\nRemaining Epochs:");

        System.out.println(
            experiment1.experimentName
            + ": "
            + experiment1.remainingEpochs()
        );

        System.out.println(
            experiment2.experimentName
            + ": "
            + experiment2.remainingEpochs()
        );

        addBonusProgress(experiment1);

        System.out.println("\nAfter Helper Method:");

        System.out.println(experiment1.status());
        System.out.println(experiment2.status());
    }
}