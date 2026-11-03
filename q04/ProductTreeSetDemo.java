import java.util.TreeSet;

class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    int getId() { return id; }
    String getName() { return name; }
    double getPrice() { return price; }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);   // sort by price
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
    }
}

public class ProductTreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Product> products = new TreeSet<>();
        products.add(new Product(1, "Laptop", 55000));
        products.add(new Product(2, "Mouse", 500));
        products.add(new Product(3, "Keyboard", 1500));
        products.add(new Product(4, "Monitor", 12000));
        products.add(new Product(5, "Pen Drive", 700));

        System.out.println("--- Products sorted by price ---");
        for (Product p : products) p.display();
    }
}
