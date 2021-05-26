package model;

public class DonationModel {

    private String entityName;
    private Double sum;
    private String entityType;
    private String conditions;
    private String currency;
    private Double gate;
    private String goal;


    public DonationModel(String entityName, Double sum, String entityType, String conditions, String currency, Double gate, String goal) {
        this.entityName = entityName;
        this.sum = sum;
        this.entityType = entityType;
        this.conditions = conditions;
        this.currency = currency;
        this.gate = gate;
        this.goal = goal;
    }

    public String getEntityName() {
        return entityName;
    }

    public Double getSum() {
        return sum;
    }

    public String getEntityType() {
        return entityType;
    }

    public String getConditions() {
        return conditions;
    }

    public String getCurrency() {
        return currency;
    }

    public Double getGate() {
        return gate;
    }

    public String getGoal() {
        return goal;
    }

    public DonationModel setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }

    public DonationModel setSum(Double sum) {
        this.sum = sum;
        return this;
    }

    public DonationModel setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    public DonationModel setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }

    public DonationModel setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public DonationModel setGate(Double gate) {
        this.gate = gate;
        return this;
    }

    public DonationModel setGoal(String goal) {
        this.goal = goal;
        return this;
    }

}
