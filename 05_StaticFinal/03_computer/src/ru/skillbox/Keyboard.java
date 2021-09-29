package ru.skillbox;

public class Keyboard {

    public final String type;
    public final String light;
    public final int weight;

    public Keyboard(String type, String light, int weight) {
        this.type = type;
        this.light = light;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Тип клавиатуры: " + type + "\n"
                + "Подсветка: " + light + "\n"
                + "Вес: " + weight;
    }
}
