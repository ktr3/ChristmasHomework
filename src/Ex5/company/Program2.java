package Ex5.company;


public class Program2 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("123-699-789", 90);
        Employee owner = new Employee("Gouba", "123-456-789", 180, 50, mobilePhone);
        Employee manager = new Employee("Luisa", "666-654-321", 170, 40, mobilePhone);

        Company company = new Company("Jose", owner);
        company.hireManager(manager);

        System.out.println(company.toString());
        company.work();
        company.work();
        System.out.println(company.toString());
    }
}
