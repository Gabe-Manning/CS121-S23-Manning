import java.util.ArrayList;
public class CustomerRecord {
    ArrayList<Customer> customersList;
    public CustomerRecord() {
        customersList = new ArrayList<Customer>();
    }

    public void addCustomer(Customer customer) {
        customersList.add(customer);
    }

    public StringBuilder getAllInfo() {
        StringBuilder string = new StringBuilder();
        for (Customer customer : customersList) {
            string.append(customer.getCustomerInfo());
            System.out.println();
        }
        return string;
    }
}
