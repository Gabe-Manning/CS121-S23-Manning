public class Test {
    public static void main(String[] args) {
        CustomerRecord record = new CustomerRecord();
        record.addCustomer(new Customer("Jack", "Miller", "123-456-7890", "jmiller@bsu.edu", "135246", 21));
        System.out.println(record.getAllInfo());
    }
}
