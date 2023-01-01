package Ex5.company;

public class Employee extends Person {
    private int money;
    private MobilePhone mobilePhone;

    public Employee(String name, String dni, int height, int weight, MobilePhone mobilePhone) {
        super(name, dni, height, weight);
        this.money = 0;
        this.mobilePhone = mobilePhone;
    }

    public void earnMoney(int amount) {
        money += amount;
    }

    public void spendMoney(int amount) {
        money -= amount;
    }

    public void work() {
        mobilePhone.use();
        earnMoney(10);
    }

    @Override
    public String toString() {
        return super.toString() + " " + money + " " + mobilePhone.getBattery();
    }
}
