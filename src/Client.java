
public class Client {
    private String name;
    private String identityCard;
    private boolean isMember;
    private String membershipType;

    // Constructor for non-member clients
    public Client(String name, String identityCard) {
        this.name = name;
        this.identityCard = identityCard;
        this.isMember = false;
        this.membershipType = "";
    }

    // Constructor for member clients
    public Client(String name, String identityCard, String membershipType) {
        this.name = name;
        this.identityCard = identityCard;
        this.isMember = true;
        this.membershipType = membershipType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityCard() {
        return this.identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public boolean getIsMember() {
        return this.isMember;
    }

    public void setIsMember(boolean isMember) {
        this.isMember = isMember;
    }

    public String getMembershipType() {
        return this.membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public double getDiscount() {
        if (this.isMember) {
            if (this.membershipType.equals("Platinum")) {
                return 0.1;
            } else if (this.membershipType.equals("Gold")) {
                return 0.15;
            } else if (this.membershipType.equals("Premium")) {
                return 0.2;
            }
        }
        return 0;
    }

    public String toString() {
        if (this.isMember) {
            return this.name + " (" + this.identityCard + ") is a member with " + this.membershipType + " membership.";
        } else {
            return this.name + " (" + this.identityCard + ") is not a member.";
        }
    }
}
