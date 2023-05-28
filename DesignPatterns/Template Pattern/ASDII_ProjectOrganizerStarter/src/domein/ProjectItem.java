package domein;

public abstract class ProjectItem {

    private final String name;
    private final String description;
    private final double rate;

    public ProjectItem(String newName, String newDescription, double newRate) {
        name = newName;
        description = newDescription;
        rate = newRate;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getRate() {
        return rate;
    }

    public abstract double getCostEstimate();

    @Override
    public String toString() {
        return getName();
    }

}
