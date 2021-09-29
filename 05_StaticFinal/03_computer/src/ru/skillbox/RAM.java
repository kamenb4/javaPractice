package ru.skillbox;

public class RAM {

    public final String type;
    public final int capacity;
    public final int weight;

    public RAM(String type, int capacity, int weight) {
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Тип: " + type + "\n"
                + "Объем: " + capacity + "\n"
                + "Вес: " + weight;
    }
}