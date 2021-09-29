package ru.skillbox;

public class Keyboard {

    public final String type;
    public final Boolean light;
    public final int weight;

    public Keyboard(String type, Boolean light, int weight) {
        this.type = type;
        this.light = light;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public Boolean getLight() {
        return light;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Тип клавиатуры - " + type + "\n"
                + "Подсветка - " + (light ? "Подсветка в комплекте" : "Подсветки нет в комплекте") + "\n"
                + "Вес - " + weight + "грамм" + "\n";
    }
}
