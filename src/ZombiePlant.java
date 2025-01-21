public class ZombiePlant {
    private int maxPotency;
    private int treatmentsNeeded;

    public ZombiePlant(int maxPotency, int initialTreatments) {
        this.maxPotency = maxPotency;
        this.treatmentsNeeded = initialTreatments;
    }

    public int getPotency() {
        return maxPotency;
    }

    public int treatmentsNeeded() {
        return treatmentsNeeded;
    }

    public boolean isDangerous() {
        return treatmentsNeeded > 0;
    }

    public void treat(int potency) {
        if (potency <= 0) {
            return;
        } else if (potency <= maxPotency) {
            if (treatmentsNeeded > 0) {
                treatmentsNeeded--;
            }
        } else {
            treatmentsNeeded++;
        }
    }
}
