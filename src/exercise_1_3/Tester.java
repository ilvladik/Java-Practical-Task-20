package exercise_1_3;

public class Tester {

    public static void main(String[] args) {
        Cat cat = new Cat("Мурзя", "рыжий");
        GenericBox<Integer, Cat, String> genericBox = new GenericBox<>(12, cat, "Hello");
        genericBox.printClass();
    }
}
