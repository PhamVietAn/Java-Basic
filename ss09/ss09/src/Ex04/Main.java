package Ex04;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Dog(); // declared type: Animal | actual type: Dog

        // Gọi phương thức chung
        animal.sound();

        // Không gọi được phương thức riêng
//        animal.wagTail(); // lỗi compile-time

        // Downcasting an toàn
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.wagTail();
        }
    }
}

