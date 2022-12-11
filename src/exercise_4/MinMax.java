package exercise_4;

public class MinMax<T extends Comparable> {

    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T min() {
        if (array != null) {
            T min = array[0];
            for (T element : array) {
                if (element.compareTo(min) < 0) {
                    min = element;
                }
            }
            return min;
        }
        return null;
    }

    public T max() {
        if (array != null) {
            T max = array[0];
            for (T element : array) {
                if (element.compareTo(max) > 0) {
                    max = element;
                }
            }
            return max;
        }
        return null;
    }
}
