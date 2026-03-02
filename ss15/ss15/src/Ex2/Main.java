package Ex2;

public class Main {
    public static void main(String[] args) {

        PatientQueue queue = new PatientQueue();

        queue.addPatient(new Patient("BN01", "Nguyen Van A", 30));
        queue.addPatient(new Patient("BN02", "Tran Thi B", 25));
        queue.addPatient(new Patient("BN03", "Le Van C", 40));

        queue.displayQueue();

        System.out.println("\nBenh nhan tiep theo:");
        System.out.println(queue.peekNextPatient());

        System.out.println("\nGoi kham:");
        queue.callNextPatient();

        System.out.println("\nTrang thai sau khi goi:");
        queue.displayQueue();
    }
}
