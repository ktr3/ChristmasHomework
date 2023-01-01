package Ex5.company;

public class MobilePhone {
    private String number;
    private int battery;

    public MobilePhone(String number, int battery) {
        this.number = number;
        this.battery = battery;
    }

    public void use() {
        battery--;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
