package Ex5.company;

public class Program {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("123-456-789", 100);
        Employee employee = new Employee("John", "123-456-789", 180, 80, mobilePhone);

        System.out.println(employee.toString());
        employee.work();
        employee.work();
        System.out.println(employee.toString());
    }
}
