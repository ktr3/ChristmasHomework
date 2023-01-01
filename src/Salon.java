import java.util.Date;

public class Salon {
    private Client[] clients;
    private Visit[] visits;
    private int numClients;
    private int numVisits;

    public Salon(int maxNumClients, int maxNumVisits) {
        this.clients = new Client[maxNumClients];
        this.visits = new Visit[maxNumVisits];
        this.numClients = 0;
        this.numVisits = 0;
    }

    public Client getClient(String identityCard) {
        for (Client c : this.clients) {
            if (c != null && c.getIdentityCard().equals(identityCard)) {
                return c;
            }
        }
        return null;
    }

    public void addClient(Client client) {
        if (this.numClients < this.clients.length) {
            this.clients[this.numClients] = client;
            this.numClients++;
        } else {
            System.out.println("Error: Salon is full.");
        }
    }

    public void unsuscribeClient(String identityCard) {
        Client c = this.getClient(identityCard);
        if (c != null) {
            c.setIsMember(false);
            c.setMembershipType("");
        }
    }

    public void setMembershipClient(String identityCard, String membershipType) {
        Client c = this.getClient(identityCard);
        if (c != null) {
            c.setIsMember(true);
            c.setMembershipType(membershipType);
        }
    }

    public void addVisit(String identityCard, Date date) {
        Client c = this.getClient(identityCard);
        if (c != null) {
            if (this.numVisits < this.visits.length) {
                Visit v = new Visit(c, date);
                this.visits[this.numVisits] = v;
                this.numVisits++;
            } else {
                System.out.println("Error: Salon has reached the maximum number of visits.");
            }
        }
    }

    public Visit[] getClientVisits(String identityCard) {
        Visit[] clientVisits = new Visit[this.numVisits];
        int numClientVisits = 0;
        for (Visit v : this.visits) {
            if (v != null && v.getClient().getIdentityCard().equals(identityCard)) {
                clientVisits[numClientVisits] = v;
                numClientVisits++;
            }
        }
        return clientVisits;
    }

    public void showClients() {
        for (Client c : this.clients) {
            if (c != null) {
                System.out.println(c.toString());
            }
        }
    }

    public void showVisits() {
        for (Visit v : this.visits) {
            if (v != null) {
                System.out.println(v.toString());
            }
        }
    }
}