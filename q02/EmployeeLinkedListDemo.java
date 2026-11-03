import java.util.LinkedList;

class Person {
    protected String name;
    protected int age;

    Person(String name, int age) { this.name = name; this.age = age; }

    void display() { System.out.println("Name: " + name + ", Age: " + age); }
}

class Employee extends Person {
    private int empId;
    private double salary;

    Employee(String name, int age, int empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    String getName() { return name; }

    @Override
    void display() {
        super.display();
        System.out.println("   EmpId: " + empId + ", Salary: " + salary);
    }
}

class EmployeeManager {
    private LinkedList<Employee> employees = new LinkedList<>();

    void addEmployee(Employee e) { employees.add(e); }

    void displayAll() {
        for (Employee e : employees) e.display();
    }

    void searchByName(String name) {
        for (Employee e : employees) {
            if (e.getName().equalsIgnoreCase(name)) {
                System.out.println("Found:");
                e.display();
                return;
            }
        }
        System.out.println("Employee '" + name + "' not found.");
    }
}

public class EmployeeLinkedListDemo {
    public static void main(String[] args) {
        EmployeeManager m = new EmployeeManager();
        m.addEmployee(new Employee("Aman", 28, 101, 45000));
        m.addEmployee(new Employee("Riya", 32, 102, 60000));
        m.addEmployee(new Employee("Karan", 25, 103, 38000));

        System.out.println("--- All Employees ---");
        m.displayAll();

        System.out.println("--- Search ---");
        m.searchByName("Riya");
        m.searchByName("Zoya");
    }
}
