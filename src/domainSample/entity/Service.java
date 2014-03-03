/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domainSample.entity;

/**
 *
 * @author Andrey
 */
public class Service {
    protected double cost;
    protected String description;
    protected Ensuarense ensuarense;
    public void setEnsuarence(Ensuarense ensuarense){
        this.ensuarense = ensuarense;
    }
    
    public Ensuarense getEnsuarence(Ensuarense ensuarense){
        return this.ensuarense;
    }
    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
