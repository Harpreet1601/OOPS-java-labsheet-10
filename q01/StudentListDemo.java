import java.util.ArrayList;

class Student {
    private String name;

    Student(String name) { this.name = name; }

    String getName() { return name; }

    void display() { System.out.println("Student: " + name); }
}

public class StudentListDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        // Adding
        list.add(new Student("Aman"));
        list.add(new Student("Riya"));
        list.add(new Student("Karan"));
        list.add(new Student("Neha"));
        System.out.println("--- After adding ---");
        for (int i = 0; i < list.size(); i++)
            list.get(i).display();

        // Removing (by index)
        list.remove(1);
        System.out.println("--- After removing index 1 ---");
        for (Student s : list)
            s.display();
    }
}
