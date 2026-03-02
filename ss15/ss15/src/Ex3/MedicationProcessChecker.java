package Ex3;

import java.util.Stack;

public class MedicationProcessChecker {

    private Stack<String> stack;

    public MedicationProcessChecker() {
        stack = new Stack<>();
    }

    public boolean checkProcess(String[] actions) {
        reset();

        for (int i = 0; i < actions.length; i++) {
            String action = actions[i];

            if (action.equalsIgnoreCase("PUSH")) {
                stack.push("Medication");
            }
            else if (action.equalsIgnoreCase("POP")) {

                if (stack.isEmpty()) {
                    System.out.println("Sai tai buoc " + (i + 1) +
                            ": POP khi stack dang rong.");
                    return false;
                }

                stack.pop();
            }
            else {
                System.out.println("Hanh dong khong hop le tai buoc " + (i + 1));
                return false;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Sai: Ket thuc ca truc nhung van con "
                    + stack.size() + " thao tac chua hoan tat.");
            return false;
        }

        System.out.println("Quy trinh hop le.");
        return true;
    }

    public void reset() {
        stack.clear();
    }
}
