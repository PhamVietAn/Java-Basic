package Ex01;

import java.util.Stack;

public class MedicalRecordHistory {

    private Stack<EditAction> history;

    public MedicalRecordHistory() {
        history = new Stack<>();
    }

    // Push
    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Da them chinh sua.");
    }

    // Pop (Undo)
    public EditAction undoEdit() {
        if (isEmpty()) {
            System.out.println("Khong co chinh sua nao de undo.");
            return null;
        }
        EditAction removed = history.pop();
        System.out.println("Da undo: " + removed);
        return removed;
    }

    // Peek
    public EditAction getLatestEdit() {
        if (isEmpty()) {
            System.out.println("Stack dang rong.");
            return null;
        }
        return history.peek();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void displayHistory() {
        if (isEmpty()) {
            System.out.println("Khong co lich su chinh sua.");
            return;
        }

        System.out.println("===== Lich su chinh sua (Gan nhat o tren) =====");
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }
}
