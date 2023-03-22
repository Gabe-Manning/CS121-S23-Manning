public class Quarterback {
    String name;
    double attempts;
    double completions;
    double compper;

    public Quarterback(String name, double attempts, double completions) {
        this.name = name;
        this.attempts = attempts;
        this.completions = completions;
    }
    void calculateCompPer() {
        compper = (completions / attempts) * 100;
    }
    void showQBStats() {
        System.out.printf("Name: %s\nAttempts: %.0f\nCompletions: %.0f\nCompletion Percentage: %.2f\n", name, attempts, completions, compper);
    }
}
