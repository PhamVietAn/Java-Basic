package Ex09.re.inherit;

public class Child extends Parent {
    // lớp child thừa hưởng các thuộc tính và phương thức của lớp Parent
    // có thể định nghĩa thêm các thành phần khác

    private double c;

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public void say() {
        /*
        điều kiện để ghi đè:
        - phải kế thừa
        - tên phương thức và tham số phỉa giống ở lớp cha
        - kiểu trả về phải giống hoặc là super kiểu trả về của
        - phạm vi truy cập phải rộng hơn hoặc bằng
        * */

        System.out.println("Hi ");
    }

    public Child() {
    }

    public Child(int a, String b, double c) {
        super(a, b);
        this.c = c;
    }
}
