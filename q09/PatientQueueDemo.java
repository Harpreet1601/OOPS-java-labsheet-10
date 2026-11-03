import java.util.LinkedList;
import java.util.Queue;

class Patient {
    private int id;
    private String name;

    Patient(int id, String name) { this.id = id; this.name = name; }

    @Override
    public String toString() { return "Patient[ID=" + id + ", Name=" + name + "]"; }
}

class Clinic {
    private Queue<Patient> queue = new LinkedList<>();

    void addPatient(Patient p) {
        queue.add(p);
        System.out.println("Registered: " + p);
    }

    void servePatient() {
        Patient p = queue.poll();                    // FIFO: first in, first out
        if (p == null) System.out.println("No patients waiting.");
        else System.out.println("Serving:    " + p);
    }
}

public class PatientQueueDemo {
    public static void main(String[] args) {
        Clinic c = new Clinic();
        c.addPatient(new Patient(1, "Aman"));
        c.addPatient(new Patient(2, "Riya"));
        c.addPatient(new Patient(3, "Karan"));

        c.servePatient();
        c.servePatient();
        c.servePatient();
        c.servePatient();    // queue empty
    }
}
