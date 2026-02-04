package Ex09.re.inherit;

public class Parent {
    private int a;
    private String b;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    protected void say() {
        System.out.println("Hello ");
    }
    public Parent(){}

    public Parent(int a, String b) {
        this.b = b;
        this.a = a;
    }
}
