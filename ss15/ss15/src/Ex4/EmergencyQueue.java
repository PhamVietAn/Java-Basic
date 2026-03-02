package Ex4;

import java.util.PriorityQueue;
import java.util.Comparator;

public class EmergencyQueue {

    private PriorityQueue<EmergencyPatient> queue;
    private long counter = 0; // dem thu tu den

    public EmergencyQueue() {
        queue = new PriorityQueue<>(new Comparator<EmergencyPatient>() {
            @Override
            public int compare(EmergencyPatient p1, EmergencyPatient p2) {

                // So sanh muc do truoc
                if (p1.getPriority() != p2.getPriority()) {
                    return Integer.compare(p1.getPriority(), p2.getPriority());
                }

                // Neu cung muc do -> FIFO
                return Long.compare(p1.getArrivalOrder(), p2.getArrivalOrder());
            }
        });
    }

    public void addPatient(EmergencyPatient p) {
        p.setArrivalOrder(counter++);
        queue.offer(p);
        System.out.println("Da them benh nhan: " + p);
    }

    public EmergencyPatient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Khong co benh nhan nao.");
            return null;
        }

        EmergencyPatient p = queue.poll();
        System.out.println("Dang kham: " + p);
        return p;
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Hang doi rong.");
            return;
        }

        System.out.println("===== Danh sach benh nhan =====");
        for (EmergencyPatient p : queue) {
            System.out.println(p);
        }
    }
}
