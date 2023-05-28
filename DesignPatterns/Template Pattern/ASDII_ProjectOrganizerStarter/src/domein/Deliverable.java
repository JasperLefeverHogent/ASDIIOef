package domein;

public class Deliverable extends ProjectItem {

    private final double materialsCost;
    private final double productionTime;

    public Deliverable(String name, String description,
            double materialsCost, double productionTime, double rate) {
        super(name, description, rate);
        this.materialsCost = materialsCost;
        this.productionTime = productionTime;
    }

    public double getProductionTime() {
        return productionTime;
    }

    public double getMaterialsCost() {
        return materialsCost;
    }

    @Override
    public double getCostEstimate() {
        double cost = getProductionTime() * getRate() + getMaterialsCost();
        return cost;
    }
}
