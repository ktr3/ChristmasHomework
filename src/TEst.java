
import java.util.Date;

public class TEst {
    public static void main(String[] args) {
        Salon salon = new Salon(10, 10);

        Client c1 = new Client("Miren", "123456");
        Client c2 = new Client("Anuel", "234567");
        Client c3 = new Client("Jordan", "345678");
        salon.addClient(c1);
        salon.addClient(c2);
        salon.addClient(c3);

        salon.setMembershipClient("123456", "Premium");
        salon.setMembershipClient("234567", "Gold");

        salon.addVisit("123456", new Date());
        salon.addVisit("234567", new Date());
        salon.addVisit("345678", new Date());

        Visit[] c1Visits = salon.getClientVisits("123456");
        for (Visit v : c1Visits) {
            if (v != null) {
                v.applyDiscount(100);
            }
        }

        salon.showClients();
        salon.showVisits();
    }
}

