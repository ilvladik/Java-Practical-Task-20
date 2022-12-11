package exercise_4;

public class Tester {

    public static void main(String[] args) {
        Integer[] array = {1, 2 ,3 ,4 , 5, 6};
        MinMax<Integer> tool = new MinMax<>(array);
        System.out.println(tool.min() + " " + tool.max());

        System.out.println(Calculator.sum(12, 7F));
    }
}
