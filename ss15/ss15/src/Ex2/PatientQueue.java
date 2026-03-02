package Ex2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {

    private Queue<Patient> queue;

    public PatientQueue() {
        queue = new LinkedList<>();
    }

    // Enqueue
    public void addPatient(Patient p) {
        queue.offer(p);
        System.out.println("Da them benh nhan vao hang doi.");
    }

    // Dequeue
    public Patient callNextPatient() {
        if (isEmpty()) {
            System.out.println("Khong co benh nhan nao trong hang doi.");
            return null;
        }
        Patient p = queue.poll();
        System.out.println("Dang kham: " + p);
        return p;
    }

    // Peek
    public Patient peekNextPatient() {
        if (isEmpty()) {
            System.out.println("Hang doi dang rong.");
            return null;
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Khong co benh nhan dang cho.");
            return;
        }

        System.out.println("===== Danh sach benh nhan dang cho =====");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}