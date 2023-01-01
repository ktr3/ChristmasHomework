import java.util.Date;

public class Visit {
    private Client client;
    private Date date;
    private double cost;

    public Visit(Client client, Date date) {
        this.client = client;
        this.date = date;
        this.cost = 0;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void applyDiscount(double amount) {
        this.cost = amount - (amount * this.client.getDiscount());
    }

    public String toString() {
        return this.client.getName() + " visited on " + this.date + " with a cost of $" + this.cost + ".";
    }
}