package Ex02;

public class Ex02 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;

        System.out.println("Primitive:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Student s1 = new Student("An");
        Student s2 = s1;
        s2.name = "Binh";

        System.out.println("\nReference:");
        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
    }
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}

