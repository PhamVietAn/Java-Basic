package Ex05;

import Ex2.Patient;

import java.util.Stack;

public class EmergencyCase {

    private Patient patient;
    private Stack<TreatmentStep> steps;

    public EmergencyCase(Patient patient) {
        this.patient = patient;
        this.steps = new Stack<>();
    }

    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Da them buoc xu ly cho " + patient.getName());
    }

    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("Khong co buoc nao de undo.");
            return null;
        }
        TreatmentStep removed = steps.pop();
        System.out.println("Da undo: " + removed);
        return removed;
    }

    public void displaySteps() {
        if (steps.isEmpty()) {
            System.out.println("Chua co buoc xu ly.");
            return;
        }

        System.out.println("===== Lich su xu ly cua " + patient.getName() + " =====");
        for (int i = steps.size() - 1; i >= 0; i--) {
            System.out.println(steps.get(i));
        }
    }

    public Patient getPatient() {
        return patient;
    }
}