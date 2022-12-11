package exercise_1_3;

import java.io.Serializable;

public class GenericBox<T extends Comparable, V extends Animal & Serializable, K> {

    private T valueFirst;
    private V valueSecond;
    private K valueThird;

    public GenericBox(T valueFirst, V valueSecond, K valueThird) {
        this.valueFirst = valueFirst;
        this.valueSecond = valueSecond;
        this.valueThird = valueThird;
    }

    public T getValueFirst() {
        return valueFirst;
    }

    public V getValueSecond() {
        return valueSecond;
    }

    public K getValueThird() {
        return valueThird;
    }

    void printClass() {
        System.out.println(valueFirst.getClass());
        System.out.println(valueSecond.getClass());
        System.out.println(valueThird.getClass());
    }
}
