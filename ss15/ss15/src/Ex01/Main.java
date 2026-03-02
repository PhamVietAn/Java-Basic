package Ex01;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Them trieu chung sot", LocalDateTime.now().toString()));
        history.addEdit(new EditAction("Cap nhat don thuoc", LocalDateTime.now().toString()));
        history.addEdit(new EditAction("Chinh sua chan doan", LocalDateTime.now().toString()));

        history.displayHistory();

        System.out.println("\nChinh sua gan nhat:");
        System.out.println(history.getLatestEdit());

        System.out.println("\nThuc hien Undo:");
        history.undoEdit();

        System.out.println("\nTrang thai sau Undo:");
        history.displayHistory();
    }
}
