package Ex5.company;

public class Company {
    private String name;
    private int profit;
    private Employee owner;
    private Employee manager;

    public Company(String name, Employee owner) {
        this.name = name;
        this.owner = owner;
        this.manager = null;
        this.profit = 0;
    }

    public void hireManager(Employee manager) {
        this.manager = manager;
    }

    public void work() {
        owner.work();
        manager.work();
        profit += 100;
    }

    @Override
    public String toString() {
        return "Company name: " + name + "\n" +
                "Profit: " + profit + "\n" +
                "Owner: " + owner.toString() + "\n" +
                "Manager: " + manager.toString();
    }
}
