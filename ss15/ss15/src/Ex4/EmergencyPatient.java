package Ex4;

public class EmergencyPatient {
    private String id;
    private String name;
    private int priority; // 1: cap cuu, 2: thuong
    private long arrivalOrder; // de giu FIFO

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public long getArrivalOrder() {
        return arrivalOrder;
    }

    public void setArrivalOrder(long arrivalOrder) {
        this.arrivalOrder = arrivalOrder;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Ten: " + name +
                " | Muc do: " + (priority == 1 ? "Cap cuu" : "Thong thuong");
    }
}