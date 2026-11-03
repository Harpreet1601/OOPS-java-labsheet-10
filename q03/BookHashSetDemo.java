import java.util.HashSet;
import java.util.Objects;

class Book {
    private int id;
    private String title;
    private String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Two books are equal if they have the same ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        return id == ((Book) o).id;
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author);
    }
}

public class BookHashSetDemo {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();

        System.out.println(books.add(new Book(1, "Java Complete Reference", "Herbert Schildt")));
        System.out.println(books.add(new Book(2, "Effective Java", "Joshua Bloch")));
        System.out.println(books.add(new Book(3, "Clean Code", "Robert Martin")));
        // Duplicate ID (1) -> rejected
        System.out.println(books.add(new Book(1, "Different Title", "Another Author")));

        System.out.println("Total unique books: " + books.size());
        for (Book b : books) b.display();
    }
}
