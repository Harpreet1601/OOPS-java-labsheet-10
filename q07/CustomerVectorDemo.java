import java.util.Vector;

class Customer {
    private int id;
    private String name;
    private String email;

    Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

public class CustomerVectorDemo {
    public static void main(String[] args) {
        Vector<Customer> customers = new Vector<>();
        customers.add(new Customer(1, "Aman", "aman@example.com"));
        customers.add(new Customer(2, "Riya", "riya@example.com"));
        customers.add(new Customer(3, "Karan", "karan@example.com"));

        // Update using a setter
        customers.get(1).setEmail("riya.new@example.com");

        for (Customer c : customers)
            System.out.println("ID: " + c.getId() + ", Name: " + c.getName() + ", Email: " + c.getEmail());
    }
}
