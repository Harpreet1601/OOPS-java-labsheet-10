import java.util.*;

class Department {
    protected String deptName;

    Department(String deptName) { this.deptName = deptName; }

    String getDeptName() { return deptName; }

    // Departments with the same name are treated as the same HashMap key
    @Override
    public boolean equals(Object o) {
        return o instanceof Department && deptName.equals(((Department) o).deptName);
    }

    @Override
    public int hashCode() { return deptName.hashCode(); }
}

class Teacher extends Department {
    private String teacherName;

    Teacher(String deptName, String teacherName) {
        super(deptName);
        this.teacherName = teacherName;
    }

    String getTeacherName() { return teacherName; }
}

class University {
    private ArrayList<Department> departments = new ArrayList<>();
    private HashMap<Department, ArrayList<Teacher>> teachers = new HashMap<>();

    void addDepartment(Department d) {
        departments.add(d);
        teachers.put(d, new ArrayList<>());
    }

    void addTeacher(String deptName, String teacherName) {
        Department key = new Department(deptName);
        if (!teachers.containsKey(key)) {
            System.out.println("Department '" + deptName + "' does not exist.");
            return;
        }
        teachers.get(key).add(new Teacher(deptName, teacherName));
    }

    void displayAll() {
        for (Department d : departments) {
            System.out.println("Department: " + d.getDeptName());
            for (Teacher t : teachers.get(d))
                System.out.println("   - " + t.getTeacherName());
        }
    }
}

public class DepartmentTeacherDemo {
    public static void main(String[] args) {
        University u = new University();
        u.addDepartment(new Department("Computer Applications"));
        u.addDepartment(new Department("Mathematics"));

        u.addTeacher("Computer Applications", "Dr. Sharma");
        u.addTeacher("Computer Applications", "Prof. Verma");
        u.addTeacher("Mathematics", "Dr. Gupta");
        u.addTeacher("Physics", "Dr. Singh");     // no such department

        u.displayAll();
    }
}
