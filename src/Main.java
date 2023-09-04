// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer("bob smith", 500000, "Bob@gmail.com" );
        VipCustomer person2 = new VipCustomer();
        VipCustomer person3 = new VipCustomer("unkown", 100000, "unknown@gmail.com");

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3 .getCreditLimit());

    }
}