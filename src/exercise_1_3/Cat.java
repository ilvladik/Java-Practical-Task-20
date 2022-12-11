package exercise_1_3;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {

    private String name;
    private String color;

    public Cat(String name, String color) {
        super("Cat");
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
