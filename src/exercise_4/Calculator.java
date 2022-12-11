package exercise_4;

public class Calculator {

    static public <T extends Number, V extends Number> double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    static public <T extends Number, V extends Number> double subtraction(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }

    static public <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    static public <T extends Number, V extends Number> double divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }
}
