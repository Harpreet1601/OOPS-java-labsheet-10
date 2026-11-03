import java.util.HashMap;
import java.util.Map;

class Student {
    private int rollNo;
    private String name;

    Student(int rollNo, String name) { this.rollNo = rollNo; this.name = name; }

    int getRollNo() { return rollNo; }
    String getName() { return name; }

    void display() { System.out.println("Roll No: " + rollNo + ", Name: " + name); }
}

class StudentRegister {
    private HashMap<Integer, String> map = new HashMap<>();   // roll no -> name

    void addStudent(Student s) { map.put(s.getRollNo(), s.getName()); }

    void removeStudent(int rollNo) {
        if (map.remove(rollNo) != null) System.out.println("Removed roll no " + rollNo);
        else System.out.println("Roll no " + rollNo + " not found.");
    }

    void displayStudents() {
        for (Map.Entry<Integer, String> e : map.entrySet())
            new Student(e.getKey(), e.getValue()).display();
    }
}

public class StudentHashMapDemo {
    public static void main(String[] args) {
        StudentRegister reg = new StudentRegister();
        reg.addStudent(new Student(101, "Aman"));
        reg.addStudent(new Student(102, "Riya"));
        reg.addStudent(new Student(103, "Karan"));

        System.out.println("--- All students ---");
        reg.displayStudents();

        reg.removeStudent(102);
        reg.removeStudent(999);

        System.out.println("--- After removal ---");
        reg.displayStudents();
    }
}
