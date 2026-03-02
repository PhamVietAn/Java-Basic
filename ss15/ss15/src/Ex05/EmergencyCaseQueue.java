package Ex05;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {

    private Queue<EmergencyCase> cases;

    public EmergencyCaseQueue() {
        cases = new LinkedList<>();
    }

    public void addCase(EmergencyCase c) {
        cases.offer(c);
        System.out.println("Da tiep nhan: " + c.getPatient().getName());
    }

    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Khong con ca nao.");
            return null;
        }
        EmergencyCase next = cases.poll();
        System.out.println("Dang xu ly: " + next.getPatient().getName());
        return next;
    }
}
