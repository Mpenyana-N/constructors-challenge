public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer() {
        this("Nick Mpenyana", 50000, "nickmpenyi@gmail.com");
    }

    public VipCustomer(double creditLimit, String emailAddress) {
        this("Josh Miro",60000, "nickmpenyana@gmail.com");

    }


    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

}
